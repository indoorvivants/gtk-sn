package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.GString
import sn.gnome.glib.internal.GVariant
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkShortcutAction
import sn.gnome.gtk4.internal.GtkShortcutActionFlags

class ShortcutAction(raw: Ptr[GtkShortcutAction])
    extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def activate(
      flags: GtkShortcutActionFlags,
      widget: Widget,
      args: Ptr[GVariant]
  ): Boolean = gtk_shortcut_action_activate(
    this.raw.asInstanceOf,
    flags,
    widget.getUnsafeRawPointer().asInstanceOf,
    args
  ).value.!=(0)

  def print(string: Ptr[GString]): Unit =
    gtk_shortcut_action_print(this.raw.asInstanceOf, string)

  def toString()(using Zone): String = fromCString(
    gtk_shortcut_action_to_string(this.raw.asInstanceOf).asInstanceOf
  )

end ShortcutAction

object ShortcutAction:
  def parseString(string: String | CString)(using Zone): ShortcutAction =
    new ShortcutAction(
      gtk_shortcut_action_parse_string(__sn_extract_string(string)).asInstanceOf
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end ShortcutAction
