package sn.gnome.gtk4.fluent
import sn.gnome.gtk4.fluent.*
import sn.gnome.gtk4.internal.*
import sn.gnome.gio.internal.*
import sn.gnome.gio.fluent.Application as GioApplication
import sn.gnome.glib.internal.*
import sn.gnome.gobject.internal.*
import scalanative.unsafe.*

import Captures.*

extension [T <: sn.gnome.gobject.fluent.Object](app: T)
  def connectSignal(
      signal: String,
      flags: GConnectFlags = GConnectFlags.G_CONNECT_DEFAULT
  )(f: T => Unit)(using Zone) =
    val c_handler = CFuncPtr2.fromScalaFunction {
      (ptr: Ptr[Byte], data: Ptr[SignalRegistration[T]]) =>
        val sr = !data

        sr.handler(sr.ref)
    }

    val sr = SignalRegistration(app, f)
    val (ptr, mem) = Captured.unsafe(sr)

    import scalanative.runtime.*

    g_signal_connect_data(
      gpointer(app.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
      toCString(signal).asInstanceOf[Ptr[gchar]],
      c_handler.asGCallback,
      gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
      null.asInstanceOf[GClosureNotify],
      flags
    )
end extension

extension [T <: CFuncPtr](inline ptr: T)
  private[fluent] inline def asGCallback: GCallback =
    GCallback(
      CFuncPtr.fromPtr[CFuncPtr0[Unit]](CFuncPtr.toPtr(ptr))
    )

private[fluent] object Captures:
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

private[fluent] object GCRoots:
  private val references = new java.util.IdentityHashMap[Object, Unit]
  def addRoot(o: Object): Unit = references.put(o, ())
  def removeRoot(o: Object): Unit = references.remove(o)

private[fluent] object Captured:
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
