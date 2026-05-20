package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.{Converter, FileInfo, ZlibCompressorFormat}
import sn.gnome.gio.internal.GZlibDecompressor
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*

/** #GZlibDecompressor is an implementation of #GConverter that decompresses
  * data compressed with zlib.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ZlibDecompressor private[gnome] (raw: Ptr[GZlibDecompressor])
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
  def getFileInfo()(using Runtime): sn.gnome.gio.FileInfo /* None */ =
    sn.gnome.gio.FileInfo.applyUnsafe(
      g_zlib_decompressor_get_file_info(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GZlibDecompressor]]
      ).asInstanceOf
    )
  end getFileInfo

end ZlibDecompressor

object ZlibDecompressor:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GZlibDecompressor])(using Runtime) =
    summon[Runtime].getOrCreate[ZlibDecompressor](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ZlibDecompressor(ptr)
    )

  /** Creates a new #GZlibDecompressor.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      format: sn.gnome.gio.ZlibCompressorFormat /* Some(GZlibCompressorFormat) */
  )(using Runtime): ZlibDecompressor =
    val raw: Ptr[Byte] = g_zlib_decompressor_new(format.raw).asInstanceOf
    summon[Runtime].getOrCreate[ZlibDecompressor](
      raw,
      r => ZlibDecompressor.applyUnsafe(r.asInstanceOf)
    )
  end apply
end ZlibDecompressor
