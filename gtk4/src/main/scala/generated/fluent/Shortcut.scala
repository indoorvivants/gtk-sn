package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.GVariant
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.ShortcutAction
import sn.gnome.gtk4.fluent.ShortcutTrigger
import sn.gnome.gtk4.internal.GtkShortcut

class Shortcut(raw: Ptr[GtkShortcut]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getAction(): ShortcutAction = new ShortcutAction(
    gtk_shortcut_get_action(this.raw.asInstanceOf).asInstanceOf
  )

  def getArguments(): Ptr[GVariant] = gtk_shortcut_get_arguments(
    this.raw.asInstanceOf
  )

  def getTrigger(): ShortcutTrigger = new ShortcutTrigger(
    gtk_shortcut_get_trigger(this.raw.asInstanceOf).asInstanceOf
  )

  def setAction(action: ShortcutAction): Unit = gtk_shortcut_set_action(
    this.raw.asInstanceOf,
    action.getUnsafeRawPointer().asInstanceOf
  )

  def setArguments(args: Ptr[GVariant]): Unit =
    gtk_shortcut_set_arguments(this.raw.asInstanceOf, args)

  def setTrigger(trigger: ShortcutTrigger): Unit = gtk_shortcut_set_trigger(
    this.raw.asInstanceOf,
    trigger.getUnsafeRawPointer().asInstanceOf
  )

end Shortcut

object Shortcut:
  def apply(trigger: ShortcutTrigger, action: ShortcutAction): Shortcut =
    new Shortcut(
      gtk_shortcut_new(
        trigger.getUnsafeRawPointer().asInstanceOf,
        action.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )
  inline def withArguments(
      trigger: ShortcutTrigger,
      action: ShortcutAction,
      format_string: String | CString,
      args: Any*
  )(using Zone): Shortcut = new Shortcut(
    gtk_shortcut_new_with_arguments(
      trigger.getUnsafeRawPointer().asInstanceOf,
      action.getUnsafeRawPointer().asInstanceOf,
      __sn_extract_string(format_string),
      args*
    ).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Shortcut
