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

  def inZone[T](f: Zone ?=> T): T

  def close(): Unit

end Runtime

object Runtime:

  abstract class App:
    def run(args: List[String])(using Runtime): Unit

    final def main(args: Array[String]): Unit =
      Runtime.use:
        run(args.toList)

  def use(f: Runtime ?=> Unit): Unit =
    val z = Zone.open()
    val runtime = new Impl(z)
    try f(using runtime)
    finally
      runtime.close()
      z.close()

  private class Impl(z: Zone) extends Runtime:

    private val liveObject =
      collection.mutable.Map.empty[Long, Any]

    override def close(): Unit =
      liveObject.clear()

    override def inZone[T](f: Zone ?=> T): T =
      f(using z)

    override def getOrCreate[T](
        ptr: Ptr[Byte],
        compute: Ptr[Byte] => T
    ) =
      this.synchronized:
        liveObject
          .getOrElseUpdate(
            ptr.toLong,
            compute(ptr).asInstanceOf[T]
          )
          .asInstanceOf[T]

    override def get[T](ptr: Ptr[Byte]) =
      this.synchronized:
        liveObject(ptr.toLong).asInstanceOf[T]

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
