package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GDebugControllerDBusClass
import sn.gnome.gobject.ObjectClass

/** The virtual function table for #GDebugControllerDBus.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DebugControllerDBusClass private[gnome] (
    raw: Ptr[GDebugControllerDBusClass]
):

  def getUnsafeRawPointer(): Ptr[GDebugControllerDBusClass] = this.raw

  /** The parent class.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
  @annotation.compileTimeOnly("[field authorize]: Field is missing <type>")
  private def authorize__ = ???
  @annotation.compileTimeOnly("[field padding]: key not found: @type")
  private def padding__ = ???
end DebugControllerDBusClass

object DebugControllerDBusClass:
  def fromRaw(ptr: Ptr[GDebugControllerDBusClass]): DebugControllerDBusClass =
    new DebugControllerDBusClass(ptr)
end DebugControllerDBusClass
