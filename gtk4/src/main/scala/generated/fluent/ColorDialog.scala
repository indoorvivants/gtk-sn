package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.internal.GdkRGBA
import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.Window
import sn.gnome.gtk4.internal.GtkColorDialog

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A `GtkColorDialog` object collects the arguments that are needed to present
  * a color chooser dialog to the user, such as a title for the dialog and
  * whether it should be modal.
  *
  * The dialog is shown with the [method@Gtk.ColorDialog.choose_rgba] function.
  * This API follows the GIO async pattern, and the result can be obtained by
  * calling [method@Gtk.ColorDialog.choose_rgba_finish].
  *
  * See [class@Gtk.ColorDialogButton] for a convenient control that uses
  * `GtkColorDialog` and presents the results.
  */
class ColorDialog(raw: Ptr[GtkColorDialog]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This function initiates a color choice operation by presenting a color
    * chooser dialog to the user.
    *
    * The @callback will be called when the dialog is dismissed. It should call
    * [method@Gtk.ColorDialog.choose_rgba_finish] to obtain the result.
    */
  def chooseRgba(
      parent: Window,
      initial_color: Ptr[GdkRGBA],
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = gtk_color_dialog_choose_rgba(
    this.raw.asInstanceOf,
    parent.getUnsafeRawPointer().asInstanceOf,
    initial_color,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes the [method@Gtk.ColorDialog.choose_rgba] call and returns the
    * resulting color.
    */
  def chooseRgbaFinish(result: AsyncResult): GResult[Ptr[GdkRGBA]] =
    GResult.wrap(__errorPtr =>
      gtk_color_dialog_choose_rgba_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      )
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the color chooser dialog blocks interaction with the
    * parent window while it is presented.
    */
  def getModal(): Boolean =
    gtk_color_dialog_get_modal(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the title that will be shown on the color chooser dialog.
    */
  def getTitle()(using Zone): String = fromCString(
    gtk_color_dialog_get_title(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether colors may have alpha.
    */
  def getWithAlpha(): Boolean =
    gtk_color_dialog_get_with_alpha(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the color chooser dialog blocks interaction with the parent
    * window while it is presented.
    */
  def setModal(modal: Boolean): Unit = gtk_color_dialog_set_modal(
    this.raw.asInstanceOf,
    gboolean(gint((if modal == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the title that will be shown on the color chooser dialog.
    */
  def setTitle(title: String | CString)(using Zone): Unit =
    gtk_color_dialog_set_title(
      this.raw.asInstanceOf,
      __sn_extract_string(title)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether colors may have alpha.
    */
  def setWithAlpha(with_alpha: Boolean): Unit = gtk_color_dialog_set_with_alpha(
    this.raw.asInstanceOf,
    gboolean(gint((if with_alpha == true then 1 else 0)))
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end ColorDialog

object ColorDialog:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkColorDialog` object.
    */
  def apply(): ColorDialog = new ColorDialog(
    gtk_color_dialog_new().asInstanceOf
  )
end ColorDialog
