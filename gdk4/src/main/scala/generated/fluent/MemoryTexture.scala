package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.fluent.Paintable
import sn.gnome.gdk4.fluent.Texture
import sn.gnome.gdk4.internal.GdkMemoryFormat
import sn.gnome.gdk4.internal.GdkMemoryTexture
import sn.gnome.gio.fluent.Icon
import sn.gnome.gio.fluent.LoadableIcon
import sn.gnome.glib.internal.GBytes
import sn.gnome.glib.internal.gsize

class MemoryTexture(raw: Ptr[GdkMemoryTexture])
    extends Texture(raw.asInstanceOf),
      Paintable,
      Icon,
      LoadableIcon:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end MemoryTexture

object MemoryTexture:
  def apply(
      width: Int,
      height: Int,
      format: GdkMemoryFormat,
      bytes: Ptr[GBytes],
      stride: CUnsignedLongInt
  ): MemoryTexture = new MemoryTexture(
    gdk_memory_texture_new(
      width,
      height,
      format,
      bytes,
      gsize(stride)
    ).asInstanceOf
  )
end MemoryTexture
