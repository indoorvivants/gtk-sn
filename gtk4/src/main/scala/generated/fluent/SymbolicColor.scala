package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkSymbolicColor

/** The indexes of colors passed to symbolic color rendering, such as
  * [vfunc@Gtk.SymbolicPaintable.snapshot_symbolic].
  *
  * More values may be added over time.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum SymbolicColor(val raw: GtkSymbolicColor):
  /** The default foreground color
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FOREGROUND
      extends SymbolicColor(GtkSymbolicColor.GTK_SYMBOLIC_COLOR_FOREGROUND)

  /** Indication color for errors
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ERROR extends SymbolicColor(GtkSymbolicColor.GTK_SYMBOLIC_COLOR_ERROR)

  /** Indication color for warnings
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case WARNING
      extends SymbolicColor(GtkSymbolicColor.GTK_SYMBOLIC_COLOR_WARNING)

  /** Indication color for success
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SUCCESS
      extends SymbolicColor(GtkSymbolicColor.GTK_SYMBOLIC_COLOR_SUCCESS)
end SymbolicColor

object SymbolicColor:
  def fromRaw(raw: GtkSymbolicColor): SymbolicColor =
    raw match
      case GtkSymbolicColor.GTK_SYMBOLIC_COLOR_FOREGROUND =>
        SymbolicColor.FOREGROUND
      case GtkSymbolicColor.GTK_SYMBOLIC_COLOR_ERROR   => SymbolicColor.ERROR
      case GtkSymbolicColor.GTK_SYMBOLIC_COLOR_WARNING => SymbolicColor.WARNING
      case GtkSymbolicColor.GTK_SYMBOLIC_COLOR_SUCCESS => SymbolicColor.SUCCESS
  end fromRaw
end SymbolicColor
