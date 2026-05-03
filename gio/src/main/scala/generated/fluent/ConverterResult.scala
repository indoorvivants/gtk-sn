package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GConverterResult

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Results returned from g_converter_convert().
  */
enum ConverterResult(val raw: GConverterResult):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * There was an error during conversion.
    */
  case ERROR extends ConverterResult(GConverterResult.G_CONVERTER_ERROR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Some data was consumed or produced
    */
  case CONVERTED extends ConverterResult(GConverterResult.G_CONVERTER_CONVERTED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The conversion is finished
    */
  case FINISHED extends ConverterResult(GConverterResult.G_CONVERTER_FINISHED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flushing is finished
    */
  case FLUSHED extends ConverterResult(GConverterResult.G_CONVERTER_FLUSHED)
end ConverterResult

object ConverterResult:
  def fromRaw(raw: GConverterResult): ConverterResult =
    raw match
      case GConverterResult.G_CONVERTER_ERROR     => ConverterResult.ERROR
      case GConverterResult.G_CONVERTER_CONVERTED => ConverterResult.CONVERTED
      case GConverterResult.G_CONVERTER_FINISHED  => ConverterResult.FINISHED
      case GConverterResult.G_CONVERTER_FLUSHED   => ConverterResult.FLUSHED
  end fromRaw
end ConverterResult
