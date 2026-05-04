package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gtk4.fluent.{
  Accessible,
  Buildable,
  ConstraintTarget,
  FontChooser,
  Widget
}
import sn.gnome.gtk4.internal.GtkFontButton

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The `GtkFontButton` allows to open a font chooser dialog to change the font.
  *
  * ![An example GtkFontButton](font-button.png)
  *
  * It is suitable widget for selecting a font in a preference dialog.
  *
  * # CSS nodes
  *
  * ```
  * fontbutton
  * ╰── button.font
  *     ╰── [content]
  * ```
  *
  * `GtkFontButton` has a single CSS node with name fontbutton which contains a
  * button node with the .font style class.
  */
class FontButton(raw: Ptr[GtkFontButton])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      FontChooser:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether the dialog is modal.
    */
  def getModal(): Boolean /* None */ = gtk_font_button_get_modal(
    this.raw.asInstanceOf[Ptr[GtkFontButton]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the title of the font chooser dialog.
    */
  def getTitle()(using Zone): String /* None */ = fromCString(
    gtk_font_button_get_title(
      this.raw.asInstanceOf[Ptr[GtkFontButton]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the selected font is used in the label.
    */
  def getUseFont(): Boolean /* None */ = gtk_font_button_get_use_font(
    this.raw.asInstanceOf[Ptr[GtkFontButton]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the selected size is used in the label.
    */
  def getUseSize(): Boolean /* None */ = gtk_font_button_get_use_size(
    this.raw.asInstanceOf[Ptr[GtkFontButton]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the dialog should be modal.
    */
  def setModal(
      modal: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_font_button_set_modal(
    this.raw.asInstanceOf[Ptr[GtkFontButton]],
    gboolean(gint((if modal == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the title for the font chooser dialog.
    */
  def setTitle(
      title: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_font_button_set_title(
    this.raw.asInstanceOf[Ptr[GtkFontButton]],
    __sn_extract_string(title)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * If @use_font is %TRUE, the font name will be written using the selected
    * font.
    */
  def setUseFont(
      use_font: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_font_button_set_use_font(
    this.raw.asInstanceOf[Ptr[GtkFontButton]],
    gboolean(gint((if use_font == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * If @use_size is %TRUE, the font name will be written using the selected
    * size.
    */
  def setUseSize(
      use_size: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_font_button_set_use_size(
    this.raw.asInstanceOf[Ptr[GtkFontButton]],
    gboolean(gint((if use_size == true then 1 else 0)))
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end FontButton

object FontButton:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new font picker widget.
    */
  def apply(): FontButton = new FontButton(gtk_font_button_new().asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new font picker widget showing the given font.
    */
  def withFont(
      fontname: String | CString /* Some(CString) */
  )(using Zone): FontButton = new FontButton(
    gtk_font_button_new_with_font(__sn_extract_string(fontname)).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end FontButton
