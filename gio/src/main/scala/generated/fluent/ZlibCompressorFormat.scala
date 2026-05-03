package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GZlibCompressorFormat

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Used to select the type of data format to use for #GZlibDecompressor and
  * #GZlibCompressor.
  */
enum ZlibCompressorFormat(val raw: GZlibCompressorFormat):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * deflate compression with zlib header
    */
  case ZLIB
      extends ZlibCompressorFormat(
        GZlibCompressorFormat.G_ZLIB_COMPRESSOR_FORMAT_ZLIB
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * gzip file format
    */
  case GZIP
      extends ZlibCompressorFormat(
        GZlibCompressorFormat.G_ZLIB_COMPRESSOR_FORMAT_GZIP
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * deflate compression with no header
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
