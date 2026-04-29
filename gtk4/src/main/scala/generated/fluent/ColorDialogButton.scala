package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.internal.GdkRGBA
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ColorDialog
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkColorDialogButton

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The `GtkColorDialogButton` is a wrapped around a [class@Gtk.ColorDialog] and
  * allows to open a color chooser dialog to change the color.
  *
  * ![An example GtkColorDialogButton](color-button.png)
  *
  * It is suitable widget for selecting a color in a preference dialog.
  *
  * # CSS nodes
  *
  * ```
  * colorbutton
  * ╰── button.color
  *     ╰── [content]
  * ```
  *
  * `GtkColorDialogButton` has a single CSS node with name colorbutton which
  * contains a button node. To differentiate it from a plain `GtkButton`, it
  * gets the .color style class.
  */
class ColorDialogButton(raw: Ptr[GtkColorDialogButton])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the `GtkColorDialog` of @self.
    */
  def getDialog(): ColorDialog = new ColorDialog(
    gtk_color_dialog_button_get_dialog(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the color of the button.
    *
    * This function is what should be used to obtain the color that was chosen
    * by the user. To get informed about changes, listen to "notify::color".
    */
  def getRgba(): Ptr[GdkRGBA] = gtk_color_dialog_button_get_rgba(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets a `GtkColorDialog` object to use for creating the color chooser
    * dialog that is presented when the user clicks the button.
    */
  def setDialog(dialog: ColorDialog): Unit = gtk_color_dialog_button_set_dialog(
    this.raw.asInstanceOf,
    dialog.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the color of the button.
    */
  def setRgba(color: Ptr[GdkRGBA]): Unit =
    gtk_color_dialog_button_set_rgba(this.raw.asInstanceOf, color)

end ColorDialogButton

object ColorDialogButton:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkColorDialogButton` with the given `GtkColorDialog`.
    *
    * You can pass `NULL` to this function and set a `GtkColorDialog` later. The
    * button will be insensitive until that happens.
    */
  def apply(dialog: ColorDialog): ColorDialogButton = new ColorDialogButton(
    gtk_color_dialog_button_new(
      dialog.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end ColorDialogButton
