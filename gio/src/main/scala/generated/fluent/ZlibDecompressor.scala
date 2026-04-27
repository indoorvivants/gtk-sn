package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.Converter
import sn.gnome.gio.fluent.FileInfo
import sn.gnome.gio.internal.GZlibCompressorFormat
import sn.gnome.gio.internal.GZlibDecompressor
import sn.gnome.gobject.fluent.Object

class ZlibDecompressor(raw: Ptr[GZlibDecompressor])
    extends Object(raw.asInstanceOf),
      Converter:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getFileInfo(): FileInfo = new FileInfo(
    g_zlib_decompressor_get_file_info(this.raw.asInstanceOf).asInstanceOf
  )

end ZlibDecompressor

object ZlibDecompressor:
  def apply(format: GZlibCompressorFormat): ZlibDecompressor =
    new ZlibDecompressor(g_zlib_decompressor_new(format).asInstanceOf)
end ZlibDecompressor
