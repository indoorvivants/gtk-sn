package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkPrintQuality

/** See also gtk_print_settings_set_quality().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum PrintQuality(val raw: GtkPrintQuality):
  /** Low quality.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LOW extends PrintQuality(GtkPrintQuality.GTK_PRINT_QUALITY_LOW)

  /** Normal quality.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NORMAL extends PrintQuality(GtkPrintQuality.GTK_PRINT_QUALITY_NORMAL)

  /** High quality.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HIGH extends PrintQuality(GtkPrintQuality.GTK_PRINT_QUALITY_HIGH)

  /** Draft quality.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DRAFT extends PrintQuality(GtkPrintQuality.GTK_PRINT_QUALITY_DRAFT)
end PrintQuality

object PrintQuality:
  def fromRaw(raw: GtkPrintQuality): PrintQuality =
    raw match
      case GtkPrintQuality.GTK_PRINT_QUALITY_LOW    => PrintQuality.LOW
      case GtkPrintQuality.GTK_PRINT_QUALITY_NORMAL => PrintQuality.NORMAL
      case GtkPrintQuality.GTK_PRINT_QUALITY_HIGH   => PrintQuality.HIGH
      case GtkPrintQuality.GTK_PRINT_QUALITY_DRAFT  => PrintQuality.DRAFT
  end fromRaw
end PrintQuality
