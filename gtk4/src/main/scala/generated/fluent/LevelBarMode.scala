package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkLevelBarMode

/** Describes how [class@LevelBar] contents should be rendered.
  *
  * Note that this enumeration could be extended with additional modes in the
  * future.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum LevelBarMode(val raw: GtkLevelBarMode):
  /** the bar has a continuous mode
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CONTINUOUS
      extends LevelBarMode(GtkLevelBarMode.GTK_LEVEL_BAR_MODE_CONTINUOUS)

  /** the bar has a discrete mode
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
