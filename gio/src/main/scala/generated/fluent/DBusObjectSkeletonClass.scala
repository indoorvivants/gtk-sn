package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GDBusObjectSkeletonClass
import sn.gnome.gobject.ObjectClass

/** Class structure for #GDBusObjectSkeleton.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DBusObjectSkeletonClass private[gnome] (
    raw: Ptr[GDBusObjectSkeletonClass]
):

  def getUnsafeRawPointer(): Ptr[GDBusObjectSkeletonClass] = this.raw

  /** The parent class.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
  @annotation.compileTimeOnly(
    "[field authorize_method]: Field is missing <type>"
  )
  private def authorizeMethod__ = ???

end DBusObjectSkeletonClass

object DBusObjectSkeletonClass:
  def fromRaw(ptr: Ptr[GDBusObjectSkeletonClass]): DBusObjectSkeletonClass =
    new DBusObjectSkeletonClass(ptr)
end DBusObjectSkeletonClass
