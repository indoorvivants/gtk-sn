package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.{Converter, FileInfo, ZlibCompressorFormat}
import sn.gnome.gio.internal.GZlibCompressor
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*

/** #GZlibCompressor is an implementation of #GConverter that compresses data
  * using zlib.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ZlibCompressor private[gnome] (raw: Ptr[GZlibCompressor])
    extends Object(raw.asInstanceOf),
      Converter:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Returns the #GZlibCompressor:file-info property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFileInfo()(using Runtime): sn.gnome.gio.FileInfo /* None */ =
    sn.gnome.gio.FileInfo.applyUnsafe(
      g_zlib_compressor_get_file_info(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GZlibCompressor]]
      ).asInstanceOf
    )
  end getFileInfo

  /** Sets @file_info in @compressor. If non-%NULL, and @compressor's
    * #GZlibCompressor:format property is %G_ZLIB_COMPRESSOR_FORMAT_GZIP, it
    * will be used to set the file name and modification time in the GZIP header
    * of the compressed data.
    *
    * Note: it is an error to call this function while a compression is in
    * progress; it may only be called immediately after creation of @compressor,
    * or after resetting it with g_converter_reset().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFileInfo(
      file_info: Option[sn.gnome.gio.FileInfo /* Some(Ptr[GFileInfo]) */ ]
  )(using Runtime): Unit /* None */ =
    g_zlib_compressor_set_file_info(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GZlibCompressor]],
      file_info
        .map[Ptr[GFileInfo]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GFileInfo]])
    )
  end setFileInfo

end ZlibCompressor

object ZlibCompressor:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GZlibCompressor])(using Runtime) =
    summon[Runtime].getOrCreate[ZlibCompressor](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ZlibCompressor(ptr)
    )

  /** Creates a new #GZlibCompressor.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      format: ZlibCompressorFormat /* Some(GZlibCompressorFormat) */,
      level: Int /* Some(CInt) */
  )(using Runtime): ZlibCompressor =
    val raw: Ptr[Byte] = g_zlib_compressor_new(format.raw, level).asInstanceOf
    summon[Runtime].getOrCreate[ZlibCompressor](
      raw,
      r => ZlibCompressor.applyUnsafe(r.asInstanceOf)
    )
  end apply
end ZlibCompressor
