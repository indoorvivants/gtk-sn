package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.{
  Accessible,
  Buildable,
  ColorDialog,
  ConstraintTarget,
  Widget
}
import sn.gnome.gtk4.internal.GtkColorDialogButton

/** The `GtkColorDialogButton` is a wrapped around a [class@Gtk.ColorDialog] and
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ColorDialogButton(raw: Ptr[GtkColorDialogButton])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Returns the `GtkColorDialog` of @self.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDialog(): ColorDialog /* None */ = new ColorDialog(
    gtk_color_dialog_button_get_dialog(
      this.raw.asInstanceOf[Ptr[GtkColorDialogButton]]
    ).asInstanceOf
  )

  /** Returns the color of the button.
    *
    * This function is what should be used to obtain the color that was chosen
    * by the user. To get informed about changes, listen to "notify::color".
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[get_rgba/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gdk.RGBA), @type -> DataRecord(const GdkRGBA*)))"
  )
  private def getRgba__ = ???

  /** Sets a `GtkColorDialog` object to use for creating the color chooser
    * dialog that is presented when the user clicks the button.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDialog(
      dialog: ColorDialog /* Some(Ptr[GtkColorDialog]) */
  ): Unit /* None */ = gtk_color_dialog_button_set_dialog(
    this.raw.asInstanceOf[Ptr[GtkColorDialogButton]],
    dialog.getUnsafeRawPointer().asInstanceOf
  )

  /** Sets the color of the button.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[set_rgba/<method parameters>/color]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gdk.RGBA), @type -> DataRecord(const GdkRGBA*)))"
  )
  private def setRgba__ = ???

end ColorDialogButton

object ColorDialogButton:
  /** Creates a new `GtkColorDialogButton` with the given `GtkColorDialog`.
    *
    * You can pass `NULL` to this function and set a `GtkColorDialog` later. The
    * button will be insensitive until that happens.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      dialog: Option[ColorDialog /* Some(Ptr[GtkColorDialog]) */ ]
  ): ColorDialogButton = new ColorDialogButton(
    gtk_color_dialog_button_new(
      dialog
        .map[Ptr[GtkColorDialog]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkColorDialog]])
    ).asInstanceOf
  )
end ColorDialogButton
