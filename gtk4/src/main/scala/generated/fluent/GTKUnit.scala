package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkUnit

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * See also gtk_print_settings_set_paper_width().
  */
enum GTKUnit(val raw: GtkUnit):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * No units.
    */
  case NONE extends GTKUnit(GtkUnit.GTK_UNIT_NONE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Dimensions in points.
    */
  case POINTS extends GTKUnit(GtkUnit.GTK_UNIT_POINTS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Dimensions in inches.
    */
  case INCH extends GTKUnit(GtkUnit.GTK_UNIT_INCH)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Dimensions in millimeters
    */
  case MM extends GTKUnit(GtkUnit.GTK_UNIT_MM)
end GTKUnit

object GTKUnit:
  def fromRaw(raw: GtkUnit): GTKUnit =
    raw match
      case GtkUnit.GTK_UNIT_NONE   => GTKUnit.NONE
      case GtkUnit.GTK_UNIT_POINTS => GTKUnit.POINTS
      case GtkUnit.GTK_UNIT_INCH   => GTKUnit.INCH
      case GtkUnit.GTK_UNIT_MM     => GTKUnit.MM
  end fromRaw
end GTKUnit
