package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.internal.GdkModifierType
import sn.gnome.gio.fluent.ListModel
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.EventController
import sn.gnome.gtk4.fluent.Shortcut
import sn.gnome.gtk4.internal.GtkShortcutController
import sn.gnome.gtk4.internal.GtkShortcutScope

class ShortcutController(raw: Ptr[GtkShortcutController])
    extends EventController(raw.asInstanceOf),
      ListModel,
      Buildable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def addShortcut(shortcut: Shortcut): Unit =
    gtk_shortcut_controller_add_shortcut(
      this.raw.asInstanceOf,
      shortcut.getUnsafeRawPointer().asInstanceOf
    )

  def getMnemonicsModifiers(): GdkModifierType =
    gtk_shortcut_controller_get_mnemonics_modifiers(this.raw.asInstanceOf)

  def getScope(): GtkShortcutScope = gtk_shortcut_controller_get_scope(
    this.raw.asInstanceOf
  )

  def removeShortcut(shortcut: Shortcut): Unit =
    gtk_shortcut_controller_remove_shortcut(
      this.raw.asInstanceOf,
      shortcut.getUnsafeRawPointer().asInstanceOf
    )

  def setMnemonicsModifiers(modifiers: GdkModifierType): Unit =
    gtk_shortcut_controller_set_mnemonics_modifiers(
      this.raw.asInstanceOf,
      modifiers
    )

  def setScope(scope: GtkShortcutScope): Unit =
    gtk_shortcut_controller_set_scope(this.raw.asInstanceOf, scope)

end ShortcutController

object ShortcutController:
  def apply(): ShortcutController = new ShortcutController(
    gtk_shortcut_controller_new().asInstanceOf
  )
  def forModel(model: ListModel): ShortcutController = new ShortcutController(
    gtk_shortcut_controller_new_for_model(
      model.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end ShortcutController
