package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.{Icon, LoadableIcon}
import sn.gnome.gio.internal.GBytesIcon
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
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))"
  )
  def getBytes__ = ???

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
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))"
  )
  def `new`() = ???

end BytesIcon
