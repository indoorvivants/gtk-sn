package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.Converter
import sn.gnome.gio.fluent.FileInfo
import sn.gnome.gio.internal.GZlibCompressor
import sn.gnome.gio.internal.GZlibCompressorFormat
import sn.gnome.gobject.fluent.Object

class ZlibCompressor(raw: Ptr[GZlibCompressor])
    extends Object(raw.asInstanceOf),
      Converter:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getFileInfo(): FileInfo = new FileInfo(
    g_zlib_compressor_get_file_info(this.raw.asInstanceOf).asInstanceOf
  )

  def setFileInfo(file_info: FileInfo): Unit = g_zlib_compressor_set_file_info(
    this.raw.asInstanceOf,
    file_info.getUnsafeRawPointer().asInstanceOf
  )

end ZlibCompressor

object ZlibCompressor:
  def apply(format: GZlibCompressorFormat, level: Int): ZlibCompressor =
    new ZlibCompressor(g_zlib_compressor_new(format, level).asInstanceOf)
end ZlibCompressor
