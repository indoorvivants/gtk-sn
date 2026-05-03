package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkPrintDuplex

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * See also gtk_print_settings_set_duplex().
  */
enum PrintDuplex(val raw: GtkPrintDuplex):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * No duplex.
    */
  case SIMPLEX extends PrintDuplex(GtkPrintDuplex.GTK_PRINT_DUPLEX_SIMPLEX)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Horizontal duplex.
    */
  case HORIZONTAL
      extends PrintDuplex(GtkPrintDuplex.GTK_PRINT_DUPLEX_HORIZONTAL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Vertical duplex.
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
