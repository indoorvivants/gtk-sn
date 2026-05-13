package sn.gnome.pango

import _root_.sn.gnome.pango.internal.PangoVariant

/** An enumeration specifying capitalization variant of the font.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum Variant(val raw: PangoVariant):
  /** A normal font.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NORMAL extends Variant(PangoVariant.PANGO_VARIANT_NORMAL)

  /** A font with the lower case characters replaced by smaller variants of the
    * capital characters.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SMALL_CAPS extends Variant(PangoVariant.PANGO_VARIANT_SMALL_CAPS)

  /** A font with all characters replaced by smaller variants of the capital
    * characters. Since: 1.50
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ALL_SMALL_CAPS extends Variant(PangoVariant.PANGO_VARIANT_ALL_SMALL_CAPS)

  /** A font with the lower case characters replaced by smaller variants of the
    * capital characters. Petite Caps can be even smaller than Small Caps.
    * Since: 1.50
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PETITE_CAPS extends Variant(PangoVariant.PANGO_VARIANT_PETITE_CAPS)

  /** A font with all characters replaced by smaller variants of the capital
    * characters. Petite Caps can be even smaller than Small Caps. Since: 1.50
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ALL_PETITE_CAPS
      extends Variant(PangoVariant.PANGO_VARIANT_ALL_PETITE_CAPS)

  /** A font with the upper case characters replaced by smaller variants of the
    * capital letters. Since: 1.50
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNICASE extends Variant(PangoVariant.PANGO_VARIANT_UNICASE)

  /** A font with capital letters that are more suitable for all-uppercase
    * titles. Since: 1.50
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
