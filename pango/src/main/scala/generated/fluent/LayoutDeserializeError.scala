package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.PangoLayoutDeserializeError

/** Errors that can be returned by [func@Pango.Layout.deserialize].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum LayoutDeserializeError(val raw: PangoLayoutDeserializeError):
  /** Unspecified error
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INVALID
      extends LayoutDeserializeError(
        PangoLayoutDeserializeError.PANGO_LAYOUT_DESERIALIZE_INVALID
      )

  /** A JSon value could not be interpreted
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INVALID_VALUE
      extends LayoutDeserializeError(
        PangoLayoutDeserializeError.PANGO_LAYOUT_DESERIALIZE_INVALID_VALUE
      )

  /** A required JSon member was not found
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MISSING_VALUE
      extends LayoutDeserializeError(
        PangoLayoutDeserializeError.PANGO_LAYOUT_DESERIALIZE_MISSING_VALUE
      )
end LayoutDeserializeError

object LayoutDeserializeError:
  def fromRaw(raw: PangoLayoutDeserializeError): LayoutDeserializeError =
    raw match
      case PangoLayoutDeserializeError.PANGO_LAYOUT_DESERIALIZE_INVALID =>
        LayoutDeserializeError.INVALID
      case PangoLayoutDeserializeError.PANGO_LAYOUT_DESERIALIZE_INVALID_VALUE =>
        LayoutDeserializeError.INVALID_VALUE
      case PangoLayoutDeserializeError.PANGO_LAYOUT_DESERIALIZE_MISSING_VALUE =>
        LayoutDeserializeError.MISSING_VALUE
  end fromRaw
end LayoutDeserializeError
