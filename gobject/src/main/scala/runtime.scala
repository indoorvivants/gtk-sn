package sn.gnome.gobject.runtime

import sn.gnome.glib.internal.*
import sn.gnome.gobject.internal.*
import scalanative.unsafe.*

import Captures.*

opaque type SignalHandleID <: CUnsignedLongInt = CUnsignedLongInt
object SignalHandleID:
  inline def apply(inline value: CUnsignedLongInt): SignalHandleID = value

trait Runtime:
  def connectSignal[T <: sn.gnome.gobject.fluent.Object](
      obj: T,
      signal: String,
      flags: GConnectFlags = GConnectFlags.G_CONNECT_DEFAULT
  )(f: T => Unit)(using Zone): SignalHandleID

object Runtime:
  def use(f: Runtime ?=> Unit)(using Zone): Unit =
    val runtime = new Impl
    f(using runtime)

  private class Impl extends Runtime:
    override def connectSignal[T <: sn.gnome.gobject.fluent.Object](
        obj: T,
        signal: String,
        flags: GConnectFlags = GConnectFlags.G_CONNECT_DEFAULT
    )(f: T => Unit)(using Zone): SignalHandleID =
      val c_handler = CFuncPtr2.fromScalaFunction {
        (ptr: Ptr[Byte], data: Ptr[SignalRegistration[T]]) =>
          val sr = !data

          sr.handler(sr.ref)
      }

      val sr = SignalRegistration(obj, f)

      // TODO: mem is leaked
      val (ptr, mem) = Captured.unsafe(sr)

      import scalanative.runtime.*

      val destroy_data = CFuncPtr2.fromScalaFunction {
        (data: gpointer, closure: Ptr[GClosure]) =>
          val sr = !data.asInstanceOf[Ptr[SignalRegistration[T]]]
          GCRoots.removeRoot(sr.ref)
      }

      SignalHandleID(g_signal_connect_data(
        gpointer(obj.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        toCString(signal).asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value)
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
  private[runtime] inline def asGCallback: GCallback =
    GCallback(
      CFuncPtr.fromPtr[CFuncPtr0[Unit]](CFuncPtr.toPtr(ptr))
    )

private[runtime] object Captures:
  case class SignalRegistration[T](
      ref: T,
      handler: T => Unit
  )
  val signalRegistrations =
    collection.mutable.Map.empty[Int, SignalRegistration[?]]

  val signalZone = Zone.open()

  def registerSignal[T](sr: SignalRegistration[T]) =
    signalRegistrations.synchronized:
      val id = signalRegistrations.size
      signalRegistrations(id) = sr
      id
end Captures

private[runtime] object GCRoots:
  private val references = new java.util.IdentityHashMap[Object, Unit]
  def addRoot(o: Object): Unit = references.put(o, ())
  def removeRoot(o: Object): Unit = references.remove(o)

private[runtime] object Captured:
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
