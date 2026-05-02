package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.Converter
import sn.gnome.gio.fluent.FileInfo
import sn.gnome.gio.internal.GZlibCompressorFormat
import sn.gnome.gio.internal.GZlibDecompressor
import sn.gnome.gobject.fluent.Object

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * #GZlibDecompressor is an implementation of #GConverter that decompresses
  * data compressed with zlib.
  */
class ZlibDecompressor(raw: Ptr[GZlibDecompressor])
    extends Object(raw.asInstanceOf),
      Converter:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the #GFileInfo constructed from the GZIP header data of
    * compressed data processed by @compressor, or %NULL if @decompressor's
    * #GZlibDecompressor:format property is not %G_ZLIB_COMPRESSOR_FORMAT_GZIP,
    * or the header data was not fully processed yet, or it not present in the
    * data stream at all.
    */
  def getFileInfo(): FileInfo /* None */ = new FileInfo(
    g_zlib_decompressor_get_file_info(this.raw.asInstanceOf).asInstanceOf
  )

end ZlibDecompressor

object ZlibDecompressor:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GZlibDecompressor.
    */
  def apply(
      format: GZlibCompressorFormat /* Some(GZlibCompressorFormat) */
  ): ZlibDecompressor = new ZlibDecompressor(
    g_zlib_decompressor_new(format).asInstanceOf
  )
end ZlibDecompressor
