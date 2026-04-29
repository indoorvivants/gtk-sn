package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.Filter
import sn.gnome.gtk4.fluent.Window
import sn.gnome.gtk4.internal.GtkFontDialog
import sn.gnome.pango.fluent.FontFace
import sn.gnome.pango.fluent.FontFamily
import sn.gnome.pango.fluent.FontMap
import sn.gnome.pango.internal.PangoFontDescription
import sn.gnome.pango.internal.PangoLanguage

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A `GtkFontDialog` object collects the arguments that are needed to present a
  * font chooser dialog to the user, such as a title for the dialog and whether
  * it should be modal.
  *
  * The dialog is shown with the [method@Gtk.FontDialog.choose_font] function or
  * its variants. This API follows the GIO async pattern, and the result can be
  * obtained by calling the corresponding finish function, such as
  * [method@Gtk.FontDialog.choose_font_finish].
  *
  * See [class@Gtk.FontDialogButton] for a convenient control that uses
  * `GtkFontDialog` and presents the results.
  */
class FontDialog(raw: Ptr[GtkFontDialog]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This function initiates a font selection operation by presenting a dialog
    * to the user for selecting a font face (i.e. a font family and style, but
    * not a specific font size).
    *
    * The @callback will be called when the dialog is dismissed. It should call
    * [method@Gtk.FontDialog.choose_face_finish] to obtain the result.
    */
  def chooseFace(
      parent: Window,
      initial_value: FontFace,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = gtk_font_dialog_choose_face(
    this.raw.asInstanceOf,
    parent.getUnsafeRawPointer().asInstanceOf,
    initial_value.getUnsafeRawPointer().asInstanceOf,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes the [method@Gtk.FontDialog.choose_face] call and returns the
    * resulting font face.
    */
  def chooseFaceFinish(result: AsyncResult): GResult[FontFace] =
    GResult.wrap(__errorPtr =>
      new FontFace(
        gtk_font_dialog_choose_face_finish(
          this.raw.asInstanceOf,
          result.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This function initiates a font selection operation by presenting a dialog
    * to the user for selecting a font family.
    *
    * The @callback will be called when the dialog is dismissed. It should call
    * [method@Gtk.FontDialog.choose_family_finish] to obtain the result.
    */
  def chooseFamily(
      parent: Window,
      initial_value: FontFamily,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = gtk_font_dialog_choose_family(
    this.raw.asInstanceOf,
    parent.getUnsafeRawPointer().asInstanceOf,
    initial_value.getUnsafeRawPointer().asInstanceOf,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes the [method@Gtk.FontDialog.choose_family] call and returns the
    * resulting family.
    *
    * This function never returns an error. If the operation is not finished
    * successfully, the value passed as @initial_value to
    * [method@Gtk.FontDialog.choose_family] is returned.
    */
  def chooseFamilyFinish(result: AsyncResult): GResult[FontFamily] =
    GResult.wrap(__errorPtr =>
      new FontFamily(
        gtk_font_dialog_choose_family_finish(
          this.raw.asInstanceOf,
          result.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This function initiates a font selection operation by presenting a dialog
    * to the user for selecting a font.
    *
    * The @callback will be called when the dialog is dismissed. It should call
    * [method@Gtk.FontDialog.choose_font_finish] to obtain the result.
    *
    * If you want to let the user select font features as well, use
    * [method@Gtk.FontDialog.choose_font_and_features] instead.
    */
  def chooseFont(
      parent: Window,
      initial_value: Ptr[PangoFontDescription],
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = gtk_font_dialog_choose_font(
    this.raw.asInstanceOf,
    parent.getUnsafeRawPointer().asInstanceOf,
    initial_value,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This function initiates a font selection operation by presenting a dialog
    * to the user for selecting a font and font features.
    *
    * Font features affect how the font is rendered, for example enabling glyph
    * variants or ligatures.
    *
    * The @callback will be called when the dialog is dismissed. It should call
    * [method@Gtk.FontDialog.choose_font_and_features_finish] to obtain the
    * result.
    */
  def chooseFontAndFeatures(
      parent: Window,
      initial_value: Ptr[PangoFontDescription],
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = gtk_font_dialog_choose_font_and_features(
    this.raw.asInstanceOf,
    parent.getUnsafeRawPointer().asInstanceOf,
    initial_value,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  @annotation.compileTimeOnly(
    "Method choose_font_and_features_finish contains an OUT parameter, which is not supported yet"
  )
  def chooseFontAndFeaturesFinish() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes the [method@Gtk.FontDialog.choose_font] call and returns the
    * resulting font description.
    */
  def chooseFontFinish(
      result: AsyncResult
  ): GResult[Ptr[PangoFontDescription]] = GResult.wrap(__errorPtr =>
    gtk_font_dialog_choose_font_finish(
      this.raw.asInstanceOf,
      result.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the filter that decides which fonts to display in the font chooser
    * dialog.
    */
  def getFilter(): Filter = new Filter(
    gtk_font_dialog_get_filter(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the fontmap from which fonts are selected, or `NULL` for the
    * default fontmap.
    */
  def getFontMap(): FontMap = new FontMap(
    gtk_font_dialog_get_font_map(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the language for which font features are applied.
    */
  def getLanguage(): Ptr[PangoLanguage] = gtk_font_dialog_get_language(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the font chooser dialog blocks interaction with the parent
    * window while it is presented.
    */
  def getModal(): Boolean =
    gtk_font_dialog_get_modal(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the title that will be shown on the font chooser dialog.
    */
  def getTitle()(using Zone): String = fromCString(
    gtk_font_dialog_get_title(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds a filter that decides which fonts to display in the font chooser
    * dialog.
    *
    * The `GtkFilter` must be able to handle both `PangoFontFamily` and
    * `PangoFontFace` objects.
    */
  def setFilter(filter: Filter): Unit = gtk_font_dialog_set_filter(
    this.raw.asInstanceOf,
    filter.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the fontmap from which fonts are selected.
    *
    * If @fontmap is `NULL`, the default fontmap is used.
    */
  def setFontMap(fontmap: FontMap): Unit = gtk_font_dialog_set_font_map(
    this.raw.asInstanceOf,
    fontmap.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the language for which font features are applied.
    */
  def setLanguage(language: Ptr[PangoLanguage]): Unit =
    gtk_font_dialog_set_language(this.raw.asInstanceOf, language)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the font chooser dialog blocks interaction with the parent
    * window while it is presented.
    */
  def setModal(modal: Boolean): Unit = gtk_font_dialog_set_modal(
    this.raw.asInstanceOf,
    gboolean(gint((if modal == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the title that will be shown on the font chooser dialog.
    */
  def setTitle(title: String | CString)(using Zone): Unit =
    gtk_font_dialog_set_title(this.raw.asInstanceOf, __sn_extract_string(title))

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end FontDialog

object FontDialog:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkFontDialog` object.
    */
  def apply(): FontDialog = new FontDialog(gtk_font_dialog_new().asInstanceOf)
end FontDialog
