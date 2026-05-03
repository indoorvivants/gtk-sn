package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.PangoLayoutDeserializeError

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Errors that can be returned by [func@Pango.Layout.deserialize].
  */
enum LayoutDeserializeError(val raw: PangoLayoutDeserializeError):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unspecified error
    */
  case INVALID
      extends LayoutDeserializeError(
        PangoLayoutDeserializeError.PANGO_LAYOUT_DESERIALIZE_INVALID
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A JSon value could not be interpreted
    */
  case INVALID_VALUE
      extends LayoutDeserializeError(
        PangoLayoutDeserializeError.PANGO_LAYOUT_DESERIALIZE_INVALID_VALUE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A required JSon member was not found
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
