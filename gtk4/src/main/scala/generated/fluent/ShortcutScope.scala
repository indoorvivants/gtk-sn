package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkShortcutScope

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Describes where [class@Shortcut]s added to a [class@ShortcutController] get
  * handled.
  */
enum ShortcutScope(val raw: GtkShortcutScope):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Shortcuts are handled inside the widget the controller belongs to.
    */
  case LOCAL extends ShortcutScope(GtkShortcutScope.GTK_SHORTCUT_SCOPE_LOCAL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Shortcuts are handled by the first ancestor that is a
    * [iface@ShortcutManager]
    */
  case MANAGED
      extends ShortcutScope(GtkShortcutScope.GTK_SHORTCUT_SCOPE_MANAGED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Shortcuts are handled by the root widget.
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
