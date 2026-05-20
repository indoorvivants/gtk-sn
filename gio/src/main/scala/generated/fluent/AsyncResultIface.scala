package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GAsyncResultIface
import sn.gnome.gobject.TypeInterface

/** Interface definition for #GAsyncResult.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class AsyncResultIface private[gnome] (raw: Ptr[GAsyncResultIface]):

  def getUnsafeRawPointer(): Ptr[GAsyncResultIface] = this.raw

  /** The parent interface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def gIface: sn.gnome.gobject.TypeInterface /* None */ =
    (!raw).g_iface.asInstanceOf[_root_.sn.gnome.gobject.internal.GTypeInterface]
  @annotation.compileTimeOnly("[field get_user_data]: Field is missing <type>")
  private def getUserData__ = ???
  @annotation.compileTimeOnly(
    "[field get_source_object]: Field is missing <type>"
  )
  private def getSourceObject__ = ???
  @annotation.compileTimeOnly("[field is_tagged]: Field is missing <type>")
  private def isTagged__ = ???
end AsyncResultIface

object AsyncResultIface:
  def fromRaw(ptr: Ptr[GAsyncResultIface]): AsyncResultIface =
    new AsyncResultIface(ptr)
end AsyncResultIface
