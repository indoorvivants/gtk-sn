package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.fluent.MemoryFormat
import sn.gnome.gdk4.fluent.Paintable
import sn.gnome.gdk4.fluent.Texture
import sn.gnome.gdk4.internal.GdkMemoryTexture
import sn.gnome.gio.fluent.Icon
import sn.gnome.gio.fluent.LoadableIcon
import sn.gnome.glib.internal.GBytes
import sn.gnome.glib.internal.gsize

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A `GdkTexture` representing image data in memory.
  */
class MemoryTexture(raw: Ptr[GdkMemoryTexture])
    extends Texture(raw.asInstanceOf),
      Paintable,
      Icon,
      LoadableIcon:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end MemoryTexture

object MemoryTexture:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new texture for a blob of image data.
    *
    * The `GBytes` must contain @stride × @height pixels in the given format.
    */
  def apply(
      width: Int /* Some(CInt) */,
      height: Int /* Some(CInt) */,
      format: MemoryFormat /* Some(GdkMemoryFormat) */,
      bytes: Ptr[GBytes] /* Some(Ptr[_root_.sn.gnome.glib.internal.GBytes]) */,
      stride: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.gsize) */
  ): MemoryTexture = new MemoryTexture(
    gdk_memory_texture_new(
      width,
      height,
      format.raw,
      bytes,
      gsize(stride)
    ).asInstanceOf
  )
end MemoryTexture
