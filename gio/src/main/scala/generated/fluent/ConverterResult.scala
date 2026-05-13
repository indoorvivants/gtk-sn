package sn.gnome.gio

import _root_.sn.gnome.gio.internal.GConverterResult

/** Results returned from g_converter_convert().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum ConverterResult(val raw: GConverterResult):
  /** There was an error during conversion.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ERROR extends ConverterResult(GConverterResult.G_CONVERTER_ERROR)

  /** Some data was consumed or produced
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CONVERTED extends ConverterResult(GConverterResult.G_CONVERTER_CONVERTED)

  /** The conversion is finished
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FINISHED extends ConverterResult(GConverterResult.G_CONVERTER_FINISHED)

  /** Flushing is finished
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
