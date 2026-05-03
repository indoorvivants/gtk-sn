package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkLevelBarMode

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Describes how [class@LevelBar] contents should be rendered.
  *
  * Note that this enumeration could be extended with additional modes in the
  * future.
  */
enum LevelBarMode(val raw: GtkLevelBarMode):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the bar has a continuous mode
    */
  case CONTINUOUS
      extends LevelBarMode(GtkLevelBarMode.GTK_LEVEL_BAR_MODE_CONTINUOUS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the bar has a discrete mode
    */
  case DISCRETE
      extends LevelBarMode(GtkLevelBarMode.GTK_LEVEL_BAR_MODE_DISCRETE)
end LevelBarMode

object LevelBarMode:
  def fromRaw(raw: GtkLevelBarMode): LevelBarMode =
    raw match
      case GtkLevelBarMode.GTK_LEVEL_BAR_MODE_CONTINUOUS =>
        LevelBarMode.CONTINUOUS
      case GtkLevelBarMode.GTK_LEVEL_BAR_MODE_DISCRETE => LevelBarMode.DISCRETE
  end fromRaw
end LevelBarMode
