package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkPrintDuplex

/** See also gtk_print_settings_set_duplex().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum PrintDuplex(val raw: GtkPrintDuplex):
  /** No duplex.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SIMPLEX extends PrintDuplex(GtkPrintDuplex.GTK_PRINT_DUPLEX_SIMPLEX)

  /** Horizontal duplex.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HORIZONTAL
      extends PrintDuplex(GtkPrintDuplex.GTK_PRINT_DUPLEX_HORIZONTAL)

  /** Vertical duplex.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case VERTICAL extends PrintDuplex(GtkPrintDuplex.GTK_PRINT_DUPLEX_VERTICAL)
end PrintDuplex

object PrintDuplex:
  def fromRaw(raw: GtkPrintDuplex): PrintDuplex =
    raw match
      case GtkPrintDuplex.GTK_PRINT_DUPLEX_SIMPLEX    => PrintDuplex.SIMPLEX
      case GtkPrintDuplex.GTK_PRINT_DUPLEX_HORIZONTAL => PrintDuplex.HORIZONTAL
      case GtkPrintDuplex.GTK_PRINT_DUPLEX_VERTICAL   => PrintDuplex.VERTICAL
  end fromRaw
end PrintDuplex
