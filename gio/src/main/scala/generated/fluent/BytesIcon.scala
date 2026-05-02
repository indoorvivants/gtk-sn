package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.Icon
import sn.gnome.gio.fluent.LoadableIcon
import sn.gnome.gio.internal.GBytesIcon
import sn.gnome.glib.internal.GBytes
import sn.gnome.gobject.fluent.Object

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * #GBytesIcon specifies an image held in memory in a common format (usually
  * png) to be used as icon.
  */
class BytesIcon(raw: Ptr[GBytesIcon])
    extends Object(raw.asInstanceOf),
      Icon,
      LoadableIcon:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the #GBytes associated with the given @icon.
    */
  def getBytes(): Ptr[GBytes] /* None */ = g_bytes_icon_get_bytes(
    this.raw.asInstanceOf
  )

end BytesIcon

object BytesIcon:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new icon for a bytes.
    *
    * This cannot fail, but loading and interpreting the bytes may fail later on
    * (for example, if g_loadable_icon_load() is called) if the image is
    * invalid.
    */
  def apply(
      bytes: Ptr[GBytes] /* Some(Ptr[_root_.sn.gnome.glib.internal.GBytes]) */
  ): BytesIcon = new BytesIcon(g_bytes_icon_new(bytes).asInstanceOf)
end BytesIcon
