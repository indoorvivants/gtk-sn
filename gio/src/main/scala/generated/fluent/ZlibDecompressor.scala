package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.{Converter, FileInfo, ZlibCompressorFormat}
import sn.gnome.gio.internal.GZlibDecompressor
import sn.gnome.gobject.fluent.Object

/** #GZlibDecompressor is an implementation of #GConverter that decompresses
  * data compressed with zlib.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ZlibDecompressor(raw: Ptr[GZlibDecompressor])
    extends Object(raw.asInstanceOf),
      Converter:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Retrieves the #GFileInfo constructed from the GZIP header data of
    * compressed data processed by @compressor, or %NULL if @decompressor's
    * #GZlibDecompressor:format property is not %G_ZLIB_COMPRESSOR_FORMAT_GZIP,
    * or the header data was not fully processed yet, or it not present in the
    * data stream at all.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFileInfo(): FileInfo /* None */ = new FileInfo(
    g_zlib_decompressor_get_file_info(
      this.raw.asInstanceOf[Ptr[GZlibDecompressor]]
    ).asInstanceOf
  )

end ZlibDecompressor

object ZlibDecompressor:
  /** Creates a new #GZlibDecompressor.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      format: ZlibCompressorFormat /* Some(GZlibCompressorFormat) */
  ): ZlibDecompressor = new ZlibDecompressor(
    g_zlib_decompressor_new(format.raw).asInstanceOf
  )
end ZlibDecompressor
