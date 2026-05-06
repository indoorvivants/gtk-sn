package sn.gnome.gobject.runtime

import sn.gnome.glib.internal.*
import sn.gnome.gobject.internal.*
import scalanative.unsafe.*

import Captures.*

opaque type SignalHandleID <: CUnsignedLongInt = CUnsignedLongInt
object SignalHandleID:
  inline def apply(inline value: CUnsignedLongInt): SignalHandleID = value

trait Runtime:
  
  def getOrCreate[T <: sn.gnome.gobject.fluent.Object](
      ptr: Ptr[Byte],
      compute: Ptr[Byte] => T
  ): T
  def get[T <: sn.gnome.gobject.fluent.Object](ptr: Ptr[Byte]): T

  def connectSignal[T <: sn.gnome.gobject.fluent.Object](
      obj: T,
      signal: String,
      flags: GConnectFlags = GConnectFlags.G_CONNECT_DEFAULT
  )(f: T => Unit)(using Zone): SignalHandleID
end Runtime

object Runtime:

  def use(f: Runtime ?=> Unit)(using Zone): Unit =
    val runtime = new Impl
    f(using runtime)

  private class Impl extends Runtime:

    private val liveObject =
      new java.util.IdentityHashMap[Ptr[Byte], sn.gnome.gobject.fluent.Object]

    override def getOrCreate[T <: sn.gnome.gobject.fluent.Object](
        ptr: Ptr[Byte],
        compute: Ptr[Byte] => T
    ) =
      this.synchronized:
        liveObject
          .computeIfAbsent(
            ptr,
            compute(_).asInstanceOf[sn.gnome.gobject.fluent.Object]
          )
          .asInstanceOf[T]

    override def get[T <: sn.gnome.gobject.fluent.Object](ptr: Ptr[Byte]) =
      this.synchronized:
        liveObject.get(ptr).asInstanceOf[T]

    override def connectSignal[T <: sn.gnome.gobject.fluent.Object](
        obj: T,
        signal: String,
        flags: GConnectFlags = GConnectFlags.G_CONNECT_DEFAULT
    )(f: T => Unit)(using Zone): SignalHandleID =
      val c_handler = CFuncPtr2.fromScalaFunction {
        (ptr: Ptr[Byte], data: Ptr[SignalRegistration[T, T, Unit]]) =>
          val sr = !data

          sr.handler(sr.ref)
      }

      val sr = SignalRegistration(obj, f)

      // TODO: mem is leaked
      val (ptr, mem) = Captured.unsafe(sr)

      import scalanative.runtime.*

      val destroy_data = CFuncPtr2.fromScalaFunction {
        (data: gpointer, closure: Ptr[GClosure]) =>
          val sr = !data.asInstanceOf[Ptr[SignalRegistration[T, T, Unit]]]
          GCRoots.removeRoot(sr.ref)
      }

      SignalHandleID(
        g_signal_connect_data(
          gpointer(obj.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
          toCString(signal).asInstanceOf[Ptr[gchar]],
          c_handler.asGCallback,
          gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
          GClosureNotify(destroy_data), // destroy_data
          flags
        ).value
      )
    end connectSignal
  end Impl
end Runtime

extension [T <: sn.gnome.gobject.fluent.Object](app: T)
  def onSignal(
      signal: String,
      flags: GConnectFlags = GConnectFlags.G_CONNECT_DEFAULT
  )(f: => Unit)(using Zone, Runtime): SignalHandleID =
    summon[Runtime].connectSignal(app, signal, flags)(t => f)

extension [T <: CFuncPtr](inline ptr: T)
  inline def asGCallback: GCallback =
    GCallback(
      CFuncPtr.fromPtr[CFuncPtr0[Unit]](CFuncPtr.toPtr(ptr))
    )

case class SignalRegistration[T, I, R](
    ref: T,
    handler: I => R
)

object Captures:
  val signalRegistrations =
    collection.mutable.Map.empty[Int, SignalRegistration[?, ?, ?]]

  val signalZone = Zone.open()

  def registerSignal[T, I, R](sr: SignalRegistration[T, I, R]) =
    signalRegistrations.synchronized:
      val id = signalRegistrations.size
      signalRegistrations(id) = sr
      id
end Captures

object GCRoots:
  private val references = new java.util.IdentityHashMap[Object, Unit]
  def addRoot(o: Object): Unit = references.put(o, ())
  def removeRoot(o: Object): Unit = references.remove(o)

object Captured:
  def unsafe[D <: AnyRef: Tag](value: D): (Ptr[D], Memory) =
    import scalanative.runtime.*, ffi.*

    val rawptr = malloc(sizeof[D])
    val mem = fromRawPtr[D](rawptr)
    val deallocate: Memory =
      () =>
        GCRoots.removeRoot(value.asInstanceOf[Object])
        free(toRawPtr[D](mem))

    val originalAddress = Intrinsics.castObjectToRawPtr(value)

    Intrinsics.storeObject(rawptr, value)

    GCRoots.addRoot(value)

    (mem, deallocate)
  end unsafe

  opaque type Memory = () => Unit
  object Memory:
    extension (f: Memory)
      def deallocate() =
        f()

end Captured
