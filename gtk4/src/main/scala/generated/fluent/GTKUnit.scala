package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkUnit

/** See also gtk_print_settings_set_paper_width().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum GTKUnit(val raw: GtkUnit):
  /** No units.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NONE extends GTKUnit(GtkUnit.GTK_UNIT_NONE)

  /** Dimensions in points.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case POINTS extends GTKUnit(GtkUnit.GTK_UNIT_POINTS)

  /** Dimensions in inches.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INCH extends GTKUnit(GtkUnit.GTK_UNIT_INCH)

  /** Dimensions in millimeters
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
