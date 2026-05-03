package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkPrintQuality

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * See also gtk_print_settings_set_quality().
  */
enum PrintQuality(val raw: GtkPrintQuality):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Low quality.
    */
  case LOW extends PrintQuality(GtkPrintQuality.GTK_PRINT_QUALITY_LOW)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Normal quality.
    */
  case NORMAL extends PrintQuality(GtkPrintQuality.GTK_PRINT_QUALITY_NORMAL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * High quality.
    */
  case HIGH extends PrintQuality(GtkPrintQuality.GTK_PRINT_QUALITY_HIGH)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Draft quality.
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
