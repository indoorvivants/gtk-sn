package sn.gnome.gobject.runtime

import scalanative.unsafe.*
import sn.gnome.gobject.internal.GCallback

import sn.gnome.runtime.*

import Captures.*

opaque type SignalHandleID <: CUnsignedLongInt = CUnsignedLongInt
object SignalHandleID:
  inline def apply(inline value: CUnsignedLongInt): SignalHandleID = value

trait Runtime:

  def getOrCreate[T](
      ptr: Ptr[Byte],
      compute: Ptr[Byte] => T
  ): T

  def get[T](ptr: Ptr[Byte]): T

  def close(): Unit

end Runtime

object Runtime:

  abstract class App:
    def run(args: List[String])(using Runtime, Zone): Unit

    final def main(args: Array[String]): Unit =
      Zone:
        Runtime.use:
          run(args.toList)

  def use(f: Runtime ?=> Unit)(using Zone): Unit =
    val runtime = new Impl
    try
      f(using runtime)
    finally
      runtime.close()

  private class Impl extends Runtime:

    private val liveObject =
      new java.util.IdentityHashMap[Ptr[Byte], Any]

    override def close(): Unit =
      liveObject.clear()

    override def getOrCreate[T](
        ptr: Ptr[Byte],
        compute: Ptr[Byte] => T
    ) =
      this.synchronized:
        liveObject
          .computeIfAbsent(
            ptr,
            compute(_).asInstanceOf[T]
          )
          .asInstanceOf[T]

    override def get[T](ptr: Ptr[Byte]) =
      this.synchronized:
        liveObject.get(ptr).asInstanceOf[T]

  end Impl
end Runtime

extension [T <: CFuncPtr](inline ptr: T)
  inline def asGCallback: GCallback =
    GCallback(
      CFuncPtr.fromPtr[CFuncPtr0[Unit]](CFuncPtr.toPtr(ptr))
    )

case class SignalRegistration[T, I, R](
    ref: T,
    handler: I => R
)(using r: Runtime):
  def runtime: Runtime = r

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
