package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.Converter
import sn.gnome.gio.fluent.FileInfo
import sn.gnome.gio.internal.GZlibCompressor
import sn.gnome.gio.internal.GZlibCompressorFormat
import sn.gnome.gobject.fluent.Object

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * #GZlibCompressor is an implementation of #GConverter that compresses data
  * using zlib.
  */
class ZlibCompressor(raw: Ptr[GZlibCompressor])
    extends Object(raw.asInstanceOf),
      Converter:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the #GZlibCompressor:file-info property.
    */
  def getFileInfo(): FileInfo = new FileInfo(
    g_zlib_compressor_get_file_info(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets @file_info in @compressor. If non-%NULL, and @compressor's
    * #GZlibCompressor:format property is %G_ZLIB_COMPRESSOR_FORMAT_GZIP, it
    * will be used to set the file name and modification time in the GZIP header
    * of the compressed data.
    *
    * Note: it is an error to call this function while a compression is in
    * progress; it may only be called immediately after creation of @compressor,
    * or after resetting it with g_converter_reset().
    */
  def setFileInfo(file_info: FileInfo): Unit = g_zlib_compressor_set_file_info(
    this.raw.asInstanceOf,
    file_info.getUnsafeRawPointer().asInstanceOf
  )

end ZlibCompressor

object ZlibCompressor:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GZlibCompressor.
    */
  def apply(format: GZlibCompressorFormat, level: Int): ZlibCompressor =
    new ZlibCompressor(g_zlib_compressor_new(format, level).asInstanceOf)
end ZlibCompressor
