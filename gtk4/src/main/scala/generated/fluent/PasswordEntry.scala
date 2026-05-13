package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.MenuModel
import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer}
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{Accessible, Buildable, ConstraintTarget, Editable, Widget}
import sn.gnome.gtk4.internal.GtkPasswordEntry
import sn.gnome.runtime.*

/** `GtkPasswordEntry` is an entry that has been tailored for entering secrets.
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class PasswordEntry private[gnome] (raw: Ptr[GtkPasswordEntry])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Editable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the menu model set with gtk_password_entry_set_extra_menu().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getExtraMenu()(using Runtime): sn.gnome.gio.MenuModel /* None */ =
    sn.gnome.gio.MenuModel.applyUnsafe(
      gtk_password_entry_get_extra_menu(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPasswordEntry]]
      ).asInstanceOf
    )
  end getExtraMenu

  /** Returns whether the entry is showing an icon to reveal the contents.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getShowPeekIcon(): Boolean /* None */ =
    gtk_password_entry_get_show_peek_icon(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPasswordEntry]]
    ).value.!=(0)
  end getShowPeekIcon

  /** Sets a menu model to add when constructing the context menu for @entry.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setExtraMenu(
      model: Option[
        sn.gnome.gio.MenuModel /* Some(Ptr[_root_.sn.gnome.gio.internal.GMenuModel]) */
      ]
  )(using Runtime): Unit /* None */ =
    gtk_password_entry_set_extra_menu(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPasswordEntry]],
      model
        .map[Ptr[_root_.sn.gnome.gio.internal.GMenuModel]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GMenuModel]]
        )
    )
  end setExtraMenu

  /** Sets whether the entry should have a clickable icon to reveal the
    * contents.
    *
    * Setting this to %FALSE also hides the text again.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setShowPeekIcon(
      show_peek_icon: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_password_entry_set_show_peek_icon(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPasswordEntry]],
      gboolean(gint((if show_peek_icon == true then 1 else 0)))
    )
  end setShowPeekIcon

  /** Emitted when the entry is activated.
    *
    * The keybindings for this signal are all forms of the Enter key.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onActivate(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkPasswordEntry],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"activate"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onActivate
end PasswordEntry

object PasswordEntry:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkPasswordEntry])(using Runtime) =
    summon[Runtime].getOrCreate[PasswordEntry](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new PasswordEntry(ptr)
    )

  /** Creates a `GtkPasswordEntry`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): PasswordEntry =
    val raw: Ptr[Byte] = gtk_password_entry_new().asInstanceOf
    summon[Runtime].getOrCreate[PasswordEntry](
      raw,
      r => PasswordEntry.applyUnsafe(r.asInstanceOf)
    )
  end apply
end PasswordEntry
