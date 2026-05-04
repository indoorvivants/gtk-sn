package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GZlibCompressorFormat

/** Used to select the type of data format to use for #GZlibDecompressor and
  * #GZlibCompressor.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum ZlibCompressorFormat(val raw: GZlibCompressorFormat):
  /** deflate compression with zlib header
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ZLIB
      extends ZlibCompressorFormat(
        GZlibCompressorFormat.G_ZLIB_COMPRESSOR_FORMAT_ZLIB
      )

  /** gzip file format
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case GZIP
      extends ZlibCompressorFormat(
        GZlibCompressorFormat.G_ZLIB_COMPRESSOR_FORMAT_GZIP
      )

  /** deflate compression with no header
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case RAW
      extends ZlibCompressorFormat(
        GZlibCompressorFormat.G_ZLIB_COMPRESSOR_FORMAT_RAW
      )
end ZlibCompressorFormat

object ZlibCompressorFormat:
  def fromRaw(raw: GZlibCompressorFormat): ZlibCompressorFormat =
    raw match
      case GZlibCompressorFormat.G_ZLIB_COMPRESSOR_FORMAT_ZLIB =>
        ZlibCompressorFormat.ZLIB
      case GZlibCompressorFormat.G_ZLIB_COMPRESSOR_FORMAT_GZIP =>
        ZlibCompressorFormat.GZIP
      case GZlibCompressorFormat.G_ZLIB_COMPRESSOR_FORMAT_RAW =>
        ZlibCompressorFormat.RAW
  end fromRaw
end ZlibCompressorFormat
