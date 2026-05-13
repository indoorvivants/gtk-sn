package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.AsyncResult
import sn.gnome.glib.GResult
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.Filter
import sn.gnome.gtk4.internal.GtkFontDialog
import sn.gnome.pango.{FontFace, FontFamily, FontMap}

/** A `GtkFontDialog` object collects the arguments that are needed to present a
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FontDialog private[gnome] (raw: Ptr[GtkFontDialog])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** This function initiates a font selection operation by presenting a dialog
    * to the user for selecting a font face (i.e. a font family and style, but
    * not a specific font size).
    *
    * The @callback will be called when the dialog is dismissed. It should call
    * [method@Gtk.FontDialog.choose_face_finish] to obtain the result.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method choose_face/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def chooseFace__ = ???

  /** Finishes the [method@Gtk.FontDialog.choose_face] call and returns the
    * resulting font face.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def chooseFaceFinish(
      result: AsyncResult /* Some(Ptr[_root_.sn.gnome.gio.internal.GAsyncResult]) */
  )(using Runtime): GResult[sn.gnome.pango.FontFace /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.pango.FontFace.applyUnsafe(
        gtk_font_dialog_choose_face_finish(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFontDialog]],
          result.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )
  end chooseFaceFinish

  /** This function initiates a font selection operation by presenting a dialog
    * to the user for selecting a font family.
    *
    * The @callback will be called when the dialog is dismissed. It should call
    * [method@Gtk.FontDialog.choose_family_finish] to obtain the result.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method choose_family/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def chooseFamily__ = ???

  /** Finishes the [method@Gtk.FontDialog.choose_family] call and returns the
    * resulting family.
    *
    * This function never returns an error. If the operation is not finished
    * successfully, the value passed as @initial_value to
    * [method@Gtk.FontDialog.choose_family] is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def chooseFamilyFinish(
      result: AsyncResult /* Some(Ptr[_root_.sn.gnome.gio.internal.GAsyncResult]) */
  )(using Runtime): GResult[sn.gnome.pango.FontFamily /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.pango.FontFamily.applyUnsafe(
        gtk_font_dialog_choose_family_finish(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFontDialog]],
          result.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )
  end chooseFamilyFinish

  /** This function initiates a font selection operation by presenting a dialog
    * to the user for selecting a font.
    *
    * The @callback will be called when the dialog is dismissed. It should call
    * [method@Gtk.FontDialog.choose_font_finish] to obtain the result.
    *
    * If you want to let the user select font features as well, use
    * [method@Gtk.FontDialog.choose_font_and_features] instead.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method choose_font/<method parameters>/initial_value]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Pango.FontDescription), @type -> DataRecord(PangoFontDescription*)))"
  )
  private def chooseFont__ = ???

  /** This function initiates a font selection operation by presenting a dialog
    * to the user for selecting a font and font features.
    *
    * Font features affect how the font is rendered, for example enabling glyph
    * variants or ligatures.
    *
    * The @callback will be called when the dialog is dismissed. It should call
    * [method@Gtk.FontDialog.choose_font_and_features_finish] to obtain the
    * result.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method choose_font_and_features/<method parameters>/initial_value]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Pango.FontDescription), @type -> DataRecord(PangoFontDescription*)))"
  )
  private def chooseFontAndFeatures__ = ???

  /** Finishes the [method@Gtk.FontDialog.choose_font_and_features] call and
    * returns the resulting font description and font features.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method choose_font_and_features_finish]: Method choose_font_and_features_finish contains an OUT parameter, which is not supported yet"
  )
  private def chooseFontAndFeaturesFinish__ = ???

  /** Finishes the [method@Gtk.FontDialog.choose_font] call and returns the
    * resulting font description.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method choose_font_finish/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Pango.FontDescription), @type -> DataRecord(PangoFontDescription*)))"
  )
  private def chooseFontFinish__ = ???

  /** Returns the filter that decides which fonts to display in the font chooser
    * dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFilter()(using Runtime): sn.gnome.gtk4.Filter /* None */ =
    sn.gnome.gtk4.Filter.applyUnsafe(
      gtk_font_dialog_get_filter(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFontDialog]]
      ).asInstanceOf
    )
  end getFilter

  /** Returns the fontmap from which fonts are selected, or `NULL` for the
    * default fontmap.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFontMap()(using Runtime): sn.gnome.pango.FontMap /* None */ =
    sn.gnome.pango.FontMap.applyUnsafe(
      gtk_font_dialog_get_font_map(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFontDialog]]
      ).asInstanceOf
    )
  end getFontMap

  /** Returns the language for which font features are applied.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_language/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Pango.Language), @type -> DataRecord(PangoLanguage*)))"
  )
  private def getLanguage__ = ???

  /** Returns whether the font chooser dialog blocks interaction with the parent
    * window while it is presented.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getModal(): Boolean /* None */ =
    gtk_font_dialog_get_modal(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFontDialog]]
    ).value.!=(0)
  end getModal

  /** Returns the title that will be shown on the font chooser dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTitle()(using Zone): String /* None */ =
    fromCString(
      gtk_font_dialog_get_title(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFontDialog]]
      ).asInstanceOf
    )
  end getTitle

  /** Adds a filter that decides which fonts to display in the font chooser
    * dialog.
    *
    * The `GtkFilter` must be able to handle both `PangoFontFamily` and
    * `PangoFontFace` objects.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFilter(
      filter: Option[sn.gnome.gtk4.Filter /* Some(Ptr[GtkFilter]) */ ]
  )(using Runtime): Unit /* None */ =
    gtk_font_dialog_set_filter(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFontDialog]],
      filter
        .map[Ptr[GtkFilter]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkFilter]])
    )
  end setFilter

  /** Sets the fontmap from which fonts are selected.
    *
    * If @fontmap is `NULL`, the default fontmap is used.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFontMap(
      fontmap: Option[
        sn.gnome.pango.FontMap /* Some(Ptr[_root_.sn.gnome.pango.internal.PangoFontMap]) */
      ]
  )(using Runtime): Unit /* None */ =
    gtk_font_dialog_set_font_map(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFontDialog]],
      fontmap
        .map[Ptr[_root_.sn.gnome.pango.internal.PangoFontMap]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.pango.internal.PangoFontMap]]
        )
    )
  end setFontMap

  /** Sets the language for which font features are applied.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_language/<method parameters>/language]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Pango.Language), @type -> DataRecord(PangoLanguage*)))"
  )
  private def setLanguage__ = ???

  /** Sets whether the font chooser dialog blocks interaction with the parent
    * window while it is presented.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setModal(
      modal: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_font_dialog_set_modal(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFontDialog]],
      gboolean(gint((if modal == true then 1 else 0)))
    )
  end setModal

  /** Sets the title that will be shown on the font chooser dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTitle(
      title: String /* Some(CString) */
  )(using Zone): Unit /* None */ =
    gtk_font_dialog_set_title(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFontDialog]],
      toCString(title)
    )
  end setTitle

end FontDialog

object FontDialog:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkFontDialog])(using Runtime) =
    summon[Runtime].getOrCreate[FontDialog](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new FontDialog(ptr)
    )

  /** Creates a new `GtkFontDialog` object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): FontDialog =
    val raw: Ptr[Byte] = gtk_font_dialog_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[FontDialog](raw, r => FontDialog.applyUnsafe(r.asInstanceOf))
  end apply
end FontDialog
