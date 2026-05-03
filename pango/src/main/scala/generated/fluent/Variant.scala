package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.PangoVariant

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * An enumeration specifying capitalization variant of the font.
  */
enum Variant(val raw: PangoVariant):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A normal font.
    */
  case NORMAL extends Variant(PangoVariant.PANGO_VARIANT_NORMAL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A font with the lower case characters replaced by smaller variants of the
    * capital characters.
    */
  case SMALL_CAPS extends Variant(PangoVariant.PANGO_VARIANT_SMALL_CAPS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A font with all characters replaced by smaller variants of the capital
    * characters. Since: 1.50
    */
  case ALL_SMALL_CAPS extends Variant(PangoVariant.PANGO_VARIANT_ALL_SMALL_CAPS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A font with the lower case characters replaced by smaller variants of the
    * capital characters. Petite Caps can be even smaller than Small Caps.
    * Since: 1.50
    */
  case PETITE_CAPS extends Variant(PangoVariant.PANGO_VARIANT_PETITE_CAPS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A font with all characters replaced by smaller variants of the capital
    * characters. Petite Caps can be even smaller than Small Caps. Since: 1.50
    */
  case ALL_PETITE_CAPS
      extends Variant(PangoVariant.PANGO_VARIANT_ALL_PETITE_CAPS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A font with the upper case characters replaced by smaller variants of the
    * capital letters. Since: 1.50
    */
  case UNICASE extends Variant(PangoVariant.PANGO_VARIANT_UNICASE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A font with capital letters that are more suitable for all-uppercase
    * titles. Since: 1.50
    */
  case TITLE_CAPS extends Variant(PangoVariant.PANGO_VARIANT_TITLE_CAPS)
end Variant

object Variant:
  def fromRaw(raw: PangoVariant): Variant =
    raw match
      case PangoVariant.PANGO_VARIANT_NORMAL          => Variant.NORMAL
      case PangoVariant.PANGO_VARIANT_SMALL_CAPS      => Variant.SMALL_CAPS
      case PangoVariant.PANGO_VARIANT_ALL_SMALL_CAPS  => Variant.ALL_SMALL_CAPS
      case PangoVariant.PANGO_VARIANT_PETITE_CAPS     => Variant.PETITE_CAPS
      case PangoVariant.PANGO_VARIANT_ALL_PETITE_CAPS => Variant.ALL_PETITE_CAPS
      case PangoVariant.PANGO_VARIANT_UNICASE         => Variant.UNICASE
      case PangoVariant.PANGO_VARIANT_TITLE_CAPS      => Variant.TITLE_CAPS
  end fromRaw
end Variant
