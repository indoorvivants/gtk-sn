package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.GdkKeyMatch

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Describes how well an event matches a given keyval and modifiers.
  *
  * `GdkKeyMatch` values are returned by [method@Gdk.KeyEvent.matches].
  */
enum KeyMatch(val raw: GdkKeyMatch):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The key event does not match
    */
  case NONE extends KeyMatch(GdkKeyMatch.GDK_KEY_MATCH_NONE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The key event matches if keyboard state (specifically, the currently
    * active group) is ignored
    */
  case PARTIAL extends KeyMatch(GdkKeyMatch.GDK_KEY_MATCH_PARTIAL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The key event matches
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
