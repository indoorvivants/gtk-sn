package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gtk4.fluent.{
  Accessible,
  Buildable,
  ColorChooser,
  ConstraintTarget,
  Widget
}
import sn.gnome.gtk4.internal.GtkColorButton

/** The `GtkColorButton` allows to open a color chooser dialog to change the
  * color.
  *
  * ![An example GtkColorButton](color-button.png)
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
  * `GtkColorButton` has a single CSS node with name colorbutton which contains
  * a button node. To differentiate it from a plain `GtkButton`, it gets the
  * .color style class.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ColorButton(raw: Ptr[GtkColorButton])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ColorChooser,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets whether the dialog is modal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getModal(): Boolean /* None */ = gtk_color_button_get_modal(
    this.raw.asInstanceOf[Ptr[GtkColorButton]]
  ).value.!=(0)

  /** Gets the title of the color chooser dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTitle()(using Zone): String /* None */ = fromCString(
    gtk_color_button_get_title(
      this.raw.asInstanceOf[Ptr[GtkColorButton]]
    ).asInstanceOf
  )

  /** Sets whether the dialog should be modal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setModal(
      modal: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_color_button_set_modal(
    this.raw.asInstanceOf[Ptr[GtkColorButton]],
    gboolean(gint((if modal == true then 1 else 0)))
  )

  /** Sets the title for the color chooser dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTitle(
      title: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_color_button_set_title(
    this.raw.asInstanceOf[Ptr[GtkColorButton]],
    __sn_extract_string(title)
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end ColorButton

object ColorButton:
  /** Creates a new color button.
    *
    * This returns a widget in the form of a small button containing a swatch
    * representing the current selected color. When the button is clicked, a
    * color chooser dialog will open, allowing the user to select a color. The
    * swatch will be updated to reflect the new color when the user finishes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(): ColorButton = new ColorButton(
    gtk_color_button_new().asInstanceOf
  )

  /** Creates a new color button showing the given color.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[rgba]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gdk.RGBA), @type -> DataRecord(const GdkRGBA*)))"
  )
  private def new_with_rgba() = ???

end ColorButton
