package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.Display
import sn.gnome.gio.File
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{
  Accessible,
  AppChooser,
  Buildable,
  ConstraintTarget,
  Dialog,
  DialogFlags,
  Native,
  Root,
  ShortcutManager,
  Widget,
  Window
}
import sn.gnome.gtk4.internal.{GtkAppChooserDialog, GtkNative, GtkRoot}

/** `GtkAppChooserDialog` shows a `GtkAppChooserWidget` inside a `GtkDialog`.
  *
  * ![An example GtkAppChooserDialog](appchooserdialog.png)
  *
  * Note that `GtkAppChooserDialog` does not have any interesting methods of its
  * own. Instead, you should get the embedded `GtkAppChooserWidget` using
  * [method@Gtk.AppChooserDialog.get_widget] and call its methods if the generic
  * [iface@Gtk.AppChooser] interface is not sufficient for your needs.
  *
  * To set the heading that is shown above the `GtkAppChooserWidget`, use
  * [method@Gtk.AppChooserDialog.set_heading].
  *
  * ## CSS nodes
  *
  * `GtkAppChooserDialog` has a single CSS node with the name `window` and style
  * class `.appchooser`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class AppChooserDialog private[gnome] (raw: Ptr[GtkAppChooserDialog])
    extends Dialog(raw.asInstanceOf),
      Accessible,
      AppChooser,
      Buildable,
      ConstraintTarget,
      Native,
      Root,
      ShortcutManager:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Returns the display that this `GtkRoot` is on.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def getDisplay()(using Runtime): sn.gnome.gdk4.Display /* None */ =
    sn.gnome.gdk4.Display.applyUnsafe(
      gtk_root_get_display(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkRoot]]
      ).asInstanceOf
    )
  end getDisplay

  /** Retrieves the current focused widget within the root.
    *
    * Note that this is the widget that would have the focus if the root is
    * active; if the root is not focused then `gtk_widget_has_focus (widget)`
    * will be %FALSE for the widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def getFocus()(using Runtime): sn.gnome.gtk4.Widget /* None */ =
    sn.gnome.gtk4.Widget.applyUnsafe(
      gtk_root_get_focus(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkRoot]]
      ).asInstanceOf
    )
  end getFocus

  /** Returns the text to display at the top of the dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHeading(): scala.Predef.String /* None */ =
    fromCString(
      gtk_app_chooser_dialog_get_heading(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAppChooserDialog]]
      ).asInstanceOf
    )
  end getHeading

  /** Returns the `GtkAppChooserWidget` of this dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getWidget()(using Runtime): sn.gnome.gtk4.Widget /* None */ =
    sn.gnome.gtk4.Widget.applyUnsafe(
      gtk_app_chooser_dialog_get_widget(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAppChooserDialog]]
      ).asInstanceOf
    )
  end getWidget

  /** Realizes a `GtkNative`.
    *
    * This should only be used by subclasses.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def realize(): Unit /* None */ =
    gtk_native_realize(this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNative]])
  end realize

  /** If @focus is not the current focus widget, and is focusable, sets it as
    * the focus widget for the root.
    *
    * If @focus is %NULL, unsets the focus widget for the root.
    *
    * To set the focus to a particular widget in the root, it is usually more
    * convenient to use [method@Gtk.Widget.grab_focus] instead of this function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def setFocus(
      focus: Option[sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */ ]
  )(using Runtime): Unit /* None */ =
    gtk_root_set_focus(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkRoot]],
      focus
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
    )
  end setFocus

  /** Sets the text to display at the top of the dialog.
    *
    * If the heading is not set, the dialog displays a default text.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setHeading(
      heading: scala.Predef.String /* Some(CString) */
  )(using Runtime): Unit /* None */ =
    gtk_app_chooser_dialog_set_heading(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAppChooserDialog]],
      summon[Runtime].inZone(toCString(heading))
    )
  end setHeading

  /** Unrealizes a `GtkNative`.
    *
    * This should only be used by subclasses.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def unrealize(): Unit /* None */ =
    gtk_native_unrealize(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNative]]
    )
  end unrealize

end AppChooserDialog

object AppChooserDialog:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkAppChooserDialog])(using Runtime) =
    summon[Runtime].getOrCreate[AppChooserDialog](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new AppChooserDialog(ptr)
    )

  /** Creates a new `GtkAppChooserDialog` for the provided `GFile`.
    *
    * The dialog will show applications that can open the file.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      parent: Option[sn.gnome.gtk4.Window /* Some(Ptr[GtkWindow]) */ ],
      flags: sn.gnome.gtk4.DialogFlags /* Some(GtkDialogFlags) */,
      file: sn.gnome.gio.File /* Some(Ptr[_root_.sn.gnome.gio.internal.GFile]) */
  )(using Runtime): AppChooserDialog =
    val raw: Ptr[Byte] = gtk_app_chooser_dialog_new(
      parent
        .map[Ptr[GtkWindow]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWindow]]),
      flags.raw,
      file.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
    summon[Runtime].getOrCreate[AppChooserDialog](
      raw,
      r => AppChooserDialog.applyUnsafe(r.asInstanceOf)
    )
  end apply

  /** Creates a new `GtkAppChooserDialog` for the provided content type.
    *
    * The dialog will show applications that can open the content type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def forContentType(
      parent: Option[sn.gnome.gtk4.Window /* Some(Ptr[GtkWindow]) */ ],
      flags: sn.gnome.gtk4.DialogFlags /* Some(GtkDialogFlags) */,
      content_type: scala.Predef.String /* Some(CString) */
  )(using Runtime): AppChooserDialog =
    val raw: Ptr[Byte] = gtk_app_chooser_dialog_new_for_content_type(
      parent
        .map[Ptr[GtkWindow]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWindow]]),
      flags.raw,
      summon[Runtime].inZone(toCString(content_type))
    ).asInstanceOf
    summon[Runtime].getOrCreate[AppChooserDialog](
      raw,
      r => AppChooserDialog.applyUnsafe(r.asInstanceOf)
    )
  end forContentType
end AppChooserDialog
