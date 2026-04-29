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

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkPasswordEntry` is an entry that has been tailored for entering secrets.
  *
  * ![An example GtkPasswordEntry](password-entry.png)
  *
  * It does not show its contents in clear text, does not allow to copy it to
  * the clipboard, and it shows a warning when Caps Lock is engaged. If the
  * underlying platform allows it, `GtkPasswordEntry` will also place the text
  * in a non-pageable memory area, to avoid it being written out to disk by the
  * operating system.
  *
  * Optionally, it can offer a way to reveal the contents in clear text.
  *
  * `GtkPasswordEntry` provides only minimal API and should be used with the
  * [iface@Gtk.Editable] API.
  *
  * # CSS Nodes
  *
  * ```
  * entry.password
  * ╰── text
  *     ├── image.caps-lock-indicator
  *     ┊
  * ```
  *
  * `GtkPasswordEntry` has a single CSS node with name entry that carries a
  * .passwordstyle class. The text Css node below it has a child with name image
  * and style class .caps-lock-indicator for the Caps Lock icon, and possibly
  * other children.
  *
  * # Accessibility
  *
  * `GtkPasswordEntry` uses the %GTK_ACCESSIBLE_ROLE_TEXT_BOX role.
  */
class PasswordEntry(raw: Ptr[GtkPasswordEntry])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Editable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the menu model set with gtk_password_entry_set_extra_menu().
    */
  def getExtraMenu(): MenuModel = new MenuModel(
    gtk_password_entry_get_extra_menu(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the entry is showing an icon to reveal the contents.
    */
  def getShowPeekIcon(): Boolean =
    gtk_password_entry_get_show_peek_icon(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets a menu model to add when constructing the context menu for @entry.
    */
  def setExtraMenu(model: MenuModel): Unit = gtk_password_entry_set_extra_menu(
    this.raw.asInstanceOf,
    model.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the entry should have a clickable icon to reveal the
    * contents.
    *
    * Setting this to %FALSE also hides the text again.
    */
  def setShowPeekIcon(show_peek_icon: Boolean): Unit =
    gtk_password_entry_set_show_peek_icon(
      this.raw.asInstanceOf,
      gboolean(gint((if show_peek_icon == true then 1 else 0)))
    )

end PasswordEntry

object PasswordEntry:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a `GtkPasswordEntry`.
    */
  def apply(): PasswordEntry = new PasswordEntry(
    gtk_password_entry_new().asInstanceOf
  )
end PasswordEntry
