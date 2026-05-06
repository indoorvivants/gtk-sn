package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.{Icon, LoadableIcon}
import sn.gnome.gio.internal.GBytesIcon
import sn.gnome.gobject.fluent.Object

/** #GBytesIcon specifies an image held in memory in a common format (usually
  * png) to be used as icon.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class BytesIcon(raw: Ptr[GBytesIcon])
    extends Object(raw.asInstanceOf),
      Icon,
      LoadableIcon:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the #GBytes associated with the given @icon.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_bytes/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))"
  )
  private def getBytes__ = ???

end BytesIcon

object BytesIcon:
  /** Creates a new icon for a bytes.
    *
    * This cannot fail, but loading and interpreting the bytes may fail later on
    * (for example, if g_loadable_icon_load() is called) if the image is
    * invalid.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[bytes]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))"
  )
  private def `new`() = ???

end BytesIcon
