package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.GdkKeyMatch

/** Describes how well an event matches a given keyval and modifiers.
  *
  * `GdkKeyMatch` values are returned by [method@Gdk.KeyEvent.matches].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum KeyMatch(val raw: GdkKeyMatch):
  /** The key event does not match
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NONE extends KeyMatch(GdkKeyMatch.GDK_KEY_MATCH_NONE)

  /** The key event matches if keyboard state (specifically, the currently
    * active group) is ignored
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PARTIAL extends KeyMatch(GdkKeyMatch.GDK_KEY_MATCH_PARTIAL)

  /** The key event matches
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case EXACT extends KeyMatch(GdkKeyMatch.GDK_KEY_MATCH_EXACT)
end KeyMatch

object KeyMatch:
  def fromRaw(raw: GdkKeyMatch): KeyMatch =
    raw match
      case GdkKeyMatch.GDK_KEY_MATCH_NONE    => KeyMatch.NONE
      case GdkKeyMatch.GDK_KEY_MATCH_PARTIAL => KeyMatch.PARTIAL
      case GdkKeyMatch.GDK_KEY_MATCH_EXACT   => KeyMatch.EXACT
  end fromRaw
end KeyMatch
