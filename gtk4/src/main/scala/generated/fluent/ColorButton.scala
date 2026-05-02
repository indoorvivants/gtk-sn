package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.internal.GdkRGBA
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ColorChooser
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkColorButton

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The `GtkColorButton` allows to open a color chooser dialog to change the
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
  */
class ColorButton(raw: Ptr[GtkColorButton])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ColorChooser,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether the dialog is modal.
    */
  def getModal(): Boolean /* None */ =
    gtk_color_button_get_modal(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the title of the color chooser dialog.
    */
  def getTitle()(using Zone): String /* None */ = fromCString(
    gtk_color_button_get_title(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the dialog should be modal.
    */
  def setModal(
      modal: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_color_button_set_modal(
    this.raw.asInstanceOf,
    gboolean(gint((if modal == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the title for the color chooser dialog.
    */
  def setTitle(
      title: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_color_button_set_title(
    this.raw.asInstanceOf,
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
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new color button.
    *
    * This returns a widget in the form of a small button containing a swatch
    * representing the current selected color. When the button is clicked, a
    * color chooser dialog will open, allowing the user to select a color. The
    * swatch will be updated to reflect the new color when the user finishes.
    */
  def apply(): ColorButton = new ColorButton(
    gtk_color_button_new().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new color button showing the given color.
    */
  def withRgba(
      rgba: Ptr[GdkRGBA] /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkRGBA]) */
  ): ColorButton = new ColorButton(
    gtk_color_button_new_with_rgba(rgba).asInstanceOf
  )
end ColorButton
