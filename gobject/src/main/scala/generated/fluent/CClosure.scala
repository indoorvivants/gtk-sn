package sn.gnome.gobject

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.Closure
import sn.gnome.gobject.internal.GCClosure

/** A #GCClosure is a specialization of #GClosure for C function callbacks.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class CClosure private[gnome] (raw: Ptr[GCClosure]):

  def getUnsafeRawPointer(): Ptr[GCClosure] = this.raw

  /** the #GClosure
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def closure: sn.gnome.gobject.Closure /* None */ =
    (!raw).closure.asInstanceOf[GClosure]

  /** the #GClosure
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def closure_=(value: sn.gnome.gobject.Closure /* None */ ): Unit =
    (!raw).closure_=(
      value.getUnsafeRawPointer().asInstanceOf.asInstanceOf[GClosure]
    )

  /** the callback function
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def callback: Ptr[Byte] /* None */ =
    (!raw).callback.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]

  /** the callback function
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def callback_=(value: Ptr[Byte] /* None */ ): Unit = (!raw).callback_=(
    gpointer(value).asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]
  )
end CClosure

object CClosure:
  def fromRaw(ptr: Ptr[GCClosure]): CClosure = new CClosure(ptr)
end CClosure
