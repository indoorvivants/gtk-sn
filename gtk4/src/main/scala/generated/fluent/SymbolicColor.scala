package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkSymbolicColor

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The indexes of colors passed to symbolic color rendering, such as
  * [vfunc@Gtk.SymbolicPaintable.snapshot_symbolic].
  *
  * More values may be added over time.
  */
enum SymbolicColor(val raw: GtkSymbolicColor):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The default foreground color
    */
  case FOREGROUND
      extends SymbolicColor(GtkSymbolicColor.GTK_SYMBOLIC_COLOR_FOREGROUND)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Indication color for errors
    */
  case ERROR extends SymbolicColor(GtkSymbolicColor.GTK_SYMBOLIC_COLOR_ERROR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Indication color for warnings
    */
  case WARNING
      extends SymbolicColor(GtkSymbolicColor.GTK_SYMBOLIC_COLOR_WARNING)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Indication color for success
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
