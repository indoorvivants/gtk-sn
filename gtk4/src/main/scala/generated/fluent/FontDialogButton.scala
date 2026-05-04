package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gtk4.fluent.{
  Accessible,
  Buildable,
  ConstraintTarget,
  FontDialog,
  FontLevel,
  Widget
}
import sn.gnome.gtk4.internal.GtkFontDialogButton

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The `GtkFontDialogButton` is wrapped around a [class@Gtk.FontDialog] and
  * allows to open a font chooser dialog to change the font.
  *
  * ![An example GtkFontDialogButton](font-button.png)
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
  * `GtkFontDialogButton` has a single CSS node with name fontbutton which
  * contains a button node with the .font style class.
  */
class FontDialogButton(raw: Ptr[GtkFontDialogButton])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the `GtkFontDialog` of @self.
    */
  def getDialog(): FontDialog /* None */ = new FontDialog(
    gtk_font_dialog_button_get_dialog(
      this.raw.asInstanceOf[Ptr[GtkFontDialogButton]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the font of the button.
    *
    * This function is what should be used to obtain the font that was chosen by
    * the user. To get informed about changes, listen to "notify::font-desc".
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Pango.FontDescription), @type -> DataRecord(PangoFontDescription*)))"
  )
  def getFontDesc__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the font features of the button.
    *
    * This function is what should be used to obtain the font features that were
    * chosen by the user. To get informed about changes, listen to
    * "notify::font-features".
    *
    * Note that the button will only let users choose font features if
    * [property@Gtk.FontDialogButton:level] is set to `GTK_FONT_LEVEL_FEATURES`.
    */
  def getFontFeatures()(using Zone): String /* None */ = fromCString(
    gtk_font_dialog_button_get_font_features(
      this.raw.asInstanceOf[Ptr[GtkFontDialogButton]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the language that is used for font features.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Pango.Language), @type -> DataRecord(PangoLanguage*)))"
  )
  def getLanguage__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the level of detail at which this dialog lets the user select
    * fonts.
    */
  def getLevel(): FontLevel /* None */ = FontLevel.fromRaw(
    gtk_font_dialog_button_get_level(
      this.raw.asInstanceOf[Ptr[GtkFontDialogButton]]
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the selected font is used in the label.
    */
  def getUseFont(): Boolean /* None */ = gtk_font_dialog_button_get_use_font(
    this.raw.asInstanceOf[Ptr[GtkFontDialogButton]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the selected font size is used in the label.
    */
  def getUseSize(): Boolean /* None */ = gtk_font_dialog_button_get_use_size(
    this.raw.asInstanceOf[Ptr[GtkFontDialogButton]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets a `GtkFontDialog` object to use for creating the font chooser dialog
    * that is presented when the user clicks the button.
    */
  def setDialog(
      dialog: FontDialog /* Some(Ptr[GtkFontDialog]) */
  ): Unit /* None */ = gtk_font_dialog_button_set_dialog(
    this.raw.asInstanceOf[Ptr[GtkFontDialogButton]],
    dialog.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the font of the button.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Pango.FontDescription), @type -> DataRecord(const PangoFontDescription*)))"
  )
  def setFontDesc__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the font features of the button.
    */
  def setFontFeatures(
      font_features: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_font_dialog_button_set_font_features(
    this.raw.asInstanceOf[Ptr[GtkFontDialogButton]],
    font_features
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the language to use for font features.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Pango.Language), @type -> DataRecord(PangoLanguage*)))"
  )
  def setLanguage__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the level of detail at which this dialog lets the user select fonts.
    */
  def setLevel(level: FontLevel /* Some(GtkFontLevel) */ ): Unit /* None */ =
    gtk_font_dialog_button_set_level(
      this.raw.asInstanceOf[Ptr[GtkFontDialogButton]],
      level.raw
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * If @use_font is `TRUE`, the font name will be written using the selected
    * font.
    */
  def setUseFont(
      use_font: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_font_dialog_button_set_use_font(
    this.raw.asInstanceOf[Ptr[GtkFontDialogButton]],
    gboolean(gint((if use_font == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * If @use_size is `TRUE`, the font name will be written using the selected
    * font size.
    */
  def setUseSize(
      use_size: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_font_dialog_button_set_use_size(
    this.raw.asInstanceOf[Ptr[GtkFontDialogButton]],
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
end FontDialogButton

object FontDialogButton:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkFontDialogButton` with the given `GtkFontDialog`.
    *
    * You can pass `NULL` to this function and set a `GtkFontDialog` later. The
    * button will be insensitive until that happens.
    */
  def apply(
      dialog: Option[FontDialog /* Some(Ptr[GtkFontDialog]) */ ]
  ): FontDialogButton = new FontDialogButton(
    gtk_font_dialog_button_new(
      dialog
        .map[Ptr[GtkFontDialog]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkFontDialog]])
    ).asInstanceOf
  )
end FontDialogButton
