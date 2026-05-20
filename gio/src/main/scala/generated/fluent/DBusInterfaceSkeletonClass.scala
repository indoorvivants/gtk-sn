package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GDBusInterfaceSkeletonClass
import sn.gnome.gobject.ObjectClass

/** Class structure for #GDBusInterfaceSkeleton.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DBusInterfaceSkeletonClass private[gnome] (
    raw: Ptr[GDBusInterfaceSkeletonClass]
):

  def getUnsafeRawPointer(): Ptr[GDBusInterfaceSkeletonClass] = this.raw

  /** The parent class.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
  @annotation.compileTimeOnly("[field get_info]: Field is missing <type>")
  private def getInfo__ = ???
  @annotation.compileTimeOnly("[field get_vtable]: Field is missing <type>")
  private def getVtable__ = ???
  @annotation.compileTimeOnly("[field get_properties]: Field is missing <type>")
  private def getProperties__ = ???
  @annotation.compileTimeOnly("[field flush]: Field is missing <type>")
  private def flush__ = ???

  @annotation.compileTimeOnly(
    "[field g_authorize_method]: Field is missing <type>"
  )
  private def gAuthorizeMethod__ = ???

end DBusInterfaceSkeletonClass

object DBusInterfaceSkeletonClass:
  def fromRaw(
      ptr: Ptr[GDBusInterfaceSkeletonClass]
  ): DBusInterfaceSkeletonClass = new DBusInterfaceSkeletonClass(ptr)
end DBusInterfaceSkeletonClass
