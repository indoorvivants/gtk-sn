package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.MenuModel
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Editable
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkPasswordEntry

class PasswordEntry(raw: Ptr[GtkPasswordEntry])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Editable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getExtraMenu(): MenuModel = new MenuModel(
    gtk_password_entry_get_extra_menu(this.raw.asInstanceOf).asInstanceOf
  )

  def getShowPeekIcon(): Boolean =
    gtk_password_entry_get_show_peek_icon(this.raw.asInstanceOf).value.!=(0)

  def setExtraMenu(model: MenuModel): Unit = gtk_password_entry_set_extra_menu(
    this.raw.asInstanceOf,
    model.getUnsafeRawPointer().asInstanceOf
  )

  def setShowPeekIcon(show_peek_icon: Boolean): Unit =
    gtk_password_entry_set_show_peek_icon(
      this.raw.asInstanceOf,
      gboolean(gint((if show_peek_icon == true then 1 else 0)))
    )

end PasswordEntry

object PasswordEntry:
  def apply(): PasswordEntry = new PasswordEntry(
    gtk_password_entry_new().asInstanceOf
  )
end PasswordEntry
