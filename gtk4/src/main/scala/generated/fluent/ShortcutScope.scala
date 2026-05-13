package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkShortcutScope

/** Describes where [class@Shortcut]s added to a [class@ShortcutController] get
  * handled.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum ShortcutScope(val raw: GtkShortcutScope):
  /** Shortcuts are handled inside the widget the controller belongs to.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LOCAL extends ShortcutScope(GtkShortcutScope.GTK_SHORTCUT_SCOPE_LOCAL)

  /** Shortcuts are handled by the first ancestor that is a
    * [iface@ShortcutManager]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MANAGED
      extends ShortcutScope(GtkShortcutScope.GTK_SHORTCUT_SCOPE_MANAGED)

  /** Shortcuts are handled by the root widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case GLOBAL extends ShortcutScope(GtkShortcutScope.GTK_SHORTCUT_SCOPE_GLOBAL)
end ShortcutScope

object ShortcutScope:
  def fromRaw(raw: GtkShortcutScope): ShortcutScope =
    raw match
      case GtkShortcutScope.GTK_SHORTCUT_SCOPE_LOCAL   => ShortcutScope.LOCAL
      case GtkShortcutScope.GTK_SHORTCUT_SCOPE_MANAGED => ShortcutScope.MANAGED
      case GtkShortcutScope.GTK_SHORTCUT_SCOPE_GLOBAL  => ShortcutScope.GLOBAL
  end fromRaw
end ShortcutScope
