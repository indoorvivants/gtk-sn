package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GIconIface
import sn.gnome.gobject.TypeInterface

/** GIconIface is used to implement GIcon types for various different systems.
  * See #GThemedIcon and #GLoadableIcon for examples of how to implement this
  * interface.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class IconIface private[gnome] (raw: Ptr[GIconIface]):

  def getUnsafeRawPointer(): Ptr[GIconIface] = this.raw

  /** The parent interface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def gIface: sn.gnome.gobject.TypeInterface /* None */ =
    (!raw).g_iface.asInstanceOf[_root_.sn.gnome.gobject.internal.GTypeInterface]
  @annotation.compileTimeOnly("[field hash]: Field is missing <type>")
  private def hash__ = ???
  @annotation.compileTimeOnly("[field equal]: Field is missing <type>")
  private def equal__ = ???
  @annotation.compileTimeOnly("[field to_tokens]: Field is missing <type>")
  private def toTokens__ = ???
  @annotation.compileTimeOnly("[field from_tokens]: Field is missing <type>")
  private def fromTokens__ = ???
  @annotation.compileTimeOnly("[field serialize]: Field is missing <type>")
  private def serialize__ = ???
end IconIface

object IconIface:
  def fromRaw(ptr: Ptr[GIconIface]): IconIface = new IconIface(ptr)
end IconIface
