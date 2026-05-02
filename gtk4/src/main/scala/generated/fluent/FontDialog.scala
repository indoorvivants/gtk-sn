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
      parent: Option[Window /* Some(Ptr[GtkWindow]) */ ],
      initial_value: Option[
        FontFace /* Some(Ptr[_root_.sn.gnome.pango.internal.PangoFontFace]) */
      ],
      cancellable: Option[
        Cancellable /* Some(Ptr[_root_.sn.gnome.gio.internal.GCancellable]) */
      ],
      callback: Option[
        GAsyncReadyCallback /* Some(_root_.sn.gnome.gio.internal.GAsyncReadyCallback) */
      ],
      user_data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ]
  ): Unit /* None */ = gtk_font_dialog_choose_face(
    this.raw.asInstanceOf[Ptr[GtkFontDialog]],
    parent
      .map[Ptr[GtkWindow]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWindow]]),
    initial_value
      .map[Ptr[_root_.sn.gnome.pango.internal.PangoFontFace]](o =>
        o.getUnsafeRawPointer().asInstanceOf
      )
      .getOrElse(
        null.asInstanceOf[Ptr[_root_.sn.gnome.pango.internal.PangoFontFace]]
      ),
    cancellable
      .map[Ptr[_root_.sn.gnome.gio.internal.GCancellable]](o =>
        o.getUnsafeRawPointer().asInstanceOf
      )
      .getOrElse(
        null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GCancellable]]
      ),
    callback
      .map[_root_.sn.gnome.gio.internal.GAsyncReadyCallback](o => o)
      .getOrElse(
        null.asInstanceOf[_root_.sn.gnome.gio.internal.GAsyncReadyCallback]
      ),
    user_data
      .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
      .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes the [method@Gtk.FontDialog.choose_face] call and returns the
    * resulting font face.
    */
  def chooseFaceFinish(
      result: AsyncResult /* Some(Ptr[_root_.sn.gnome.gio.internal.GAsyncResult]) */
  ): GResult[FontFace /* None */ ] = GResult.wrap(__errorPtr =>
    new FontFace(
      gtk_font_dialog_choose_face_finish(
        this.raw.asInstanceOf[Ptr[GtkFontDialog]],
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
      parent: Option[Window /* Some(Ptr[GtkWindow]) */ ],
      initial_value: Option[
        FontFamily /* Some(Ptr[_root_.sn.gnome.pango.internal.PangoFontFamily]) */
      ],
      cancellable: Option[
        Cancellable /* Some(Ptr[_root_.sn.gnome.gio.internal.GCancellable]) */
      ],
      callback: Option[
        GAsyncReadyCallback /* Some(_root_.sn.gnome.gio.internal.GAsyncReadyCallback) */
      ],
      user_data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ]
  ): Unit /* None */ = gtk_font_dialog_choose_family(
    this.raw.asInstanceOf[Ptr[GtkFontDialog]],
    parent
      .map[Ptr[GtkWindow]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWindow]]),
    initial_value
      .map[Ptr[_root_.sn.gnome.pango.internal.PangoFontFamily]](o =>
        o.getUnsafeRawPointer().asInstanceOf
      )
      .getOrElse(
        null.asInstanceOf[Ptr[_root_.sn.gnome.pango.internal.PangoFontFamily]]
      ),
    cancellable
      .map[Ptr[_root_.sn.gnome.gio.internal.GCancellable]](o =>
        o.getUnsafeRawPointer().asInstanceOf
      )
      .getOrElse(
        null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GCancellable]]
      ),
    callback
      .map[_root_.sn.gnome.gio.internal.GAsyncReadyCallback](o => o)
      .getOrElse(
        null.asInstanceOf[_root_.sn.gnome.gio.internal.GAsyncReadyCallback]
      ),
    user_data
      .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
      .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer])
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
  def chooseFamilyFinish(
      result: AsyncResult /* Some(Ptr[_root_.sn.gnome.gio.internal.GAsyncResult]) */
  ): GResult[FontFamily /* None */ ] = GResult.wrap(__errorPtr =>
    new FontFamily(
      gtk_font_dialog_choose_family_finish(
        this.raw.asInstanceOf[Ptr[GtkFontDialog]],
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
      parent: Option[Window /* Some(Ptr[GtkWindow]) */ ],
      initial_value: Option[Ptr[
        PangoFontDescription
      ] /* Some(Ptr[_root_.sn.gnome.pango.internal.PangoFontDescription]) */ ],
      cancellable: Option[
        Cancellable /* Some(Ptr[_root_.sn.gnome.gio.internal.GCancellable]) */
      ],
      callback: Option[
        GAsyncReadyCallback /* Some(_root_.sn.gnome.gio.internal.GAsyncReadyCallback) */
      ],
      user_data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ]
  ): Unit /* None */ = gtk_font_dialog_choose_font(
    this.raw.asInstanceOf[Ptr[GtkFontDialog]],
    parent
      .map[Ptr[GtkWindow]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWindow]]),
    initial_value
      .map[Ptr[_root_.sn.gnome.pango.internal.PangoFontDescription]](o => o)
      .getOrElse(
        null.asInstanceOf[Ptr[
          _root_.sn.gnome.pango.internal.PangoFontDescription
        ]]
      ),
    cancellable
      .map[Ptr[_root_.sn.gnome.gio.internal.GCancellable]](o =>
        o.getUnsafeRawPointer().asInstanceOf
      )
      .getOrElse(
        null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GCancellable]]
      ),
    callback
      .map[_root_.sn.gnome.gio.internal.GAsyncReadyCallback](o => o)
      .getOrElse(
        null.asInstanceOf[_root_.sn.gnome.gio.internal.GAsyncReadyCallback]
      ),
    user_data
      .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
      .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer])
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
      parent: Option[Window /* Some(Ptr[GtkWindow]) */ ],
      initial_value: Option[Ptr[
        PangoFontDescription
      ] /* Some(Ptr[_root_.sn.gnome.pango.internal.PangoFontDescription]) */ ],
      cancellable: Option[
        Cancellable /* Some(Ptr[_root_.sn.gnome.gio.internal.GCancellable]) */
      ],
      callback: Option[
        GAsyncReadyCallback /* Some(_root_.sn.gnome.gio.internal.GAsyncReadyCallback) */
      ],
      user_data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ]
  ): Unit /* None */ = gtk_font_dialog_choose_font_and_features(
    this.raw.asInstanceOf[Ptr[GtkFontDialog]],
    parent
      .map[Ptr[GtkWindow]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWindow]]),
    initial_value
      .map[Ptr[_root_.sn.gnome.pango.internal.PangoFontDescription]](o => o)
      .getOrElse(
        null.asInstanceOf[Ptr[
          _root_.sn.gnome.pango.internal.PangoFontDescription
        ]]
      ),
    cancellable
      .map[Ptr[_root_.sn.gnome.gio.internal.GCancellable]](o =>
        o.getUnsafeRawPointer().asInstanceOf
      )
      .getOrElse(
        null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GCancellable]]
      ),
    callback
      .map[_root_.sn.gnome.gio.internal.GAsyncReadyCallback](o => o)
      .getOrElse(
        null.asInstanceOf[_root_.sn.gnome.gio.internal.GAsyncReadyCallback]
      ),
    user_data
      .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
      .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes the [method@Gtk.FontDialog.choose_font_and_features] call and
    * returns the resulting font description and font features.
    */
  @annotation.compileTimeOnly(
    "Method choose_font_and_features_finish contains an OUT parameter, which is not supported yet"
  )
  private def chooseFontAndFeaturesFinish__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes the [method@Gtk.FontDialog.choose_font] call and returns the
    * resulting font description.
    */
  def chooseFontFinish(
      result: AsyncResult /* Some(Ptr[_root_.sn.gnome.gio.internal.GAsyncResult]) */
  ): GResult[Ptr[PangoFontDescription] /* None */ ] = GResult.wrap(__errorPtr =>
    gtk_font_dialog_choose_font_finish(
      this.raw.asInstanceOf[Ptr[GtkFontDialog]],
      result.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the filter that decides which fonts to display in the font chooser
    * dialog.
    */
  def getFilter(): Filter /* None */ = new Filter(
    gtk_font_dialog_get_filter(
      this.raw.asInstanceOf[Ptr[GtkFontDialog]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the fontmap from which fonts are selected, or `NULL` for the
    * default fontmap.
    */
  def getFontMap(): FontMap /* None */ = new FontMap(
    gtk_font_dialog_get_font_map(
      this.raw.asInstanceOf[Ptr[GtkFontDialog]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the language for which font features are applied.
    */
  def getLanguage(): Ptr[PangoLanguage] /* None */ =
    gtk_font_dialog_get_language(this.raw.asInstanceOf[Ptr[GtkFontDialog]])

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the font chooser dialog blocks interaction with the parent
    * window while it is presented.
    */
  def getModal(): Boolean /* None */ = gtk_font_dialog_get_modal(
    this.raw.asInstanceOf[Ptr[GtkFontDialog]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the title that will be shown on the font chooser dialog.
    */
  def getTitle()(using Zone): String /* None */ = fromCString(
    gtk_font_dialog_get_title(
      this.raw.asInstanceOf[Ptr[GtkFontDialog]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds a filter that decides which fonts to display in the font chooser
    * dialog.
    *
    * The `GtkFilter` must be able to handle both `PangoFontFamily` and
    * `PangoFontFace` objects.
    */
  def setFilter(
      filter: Option[Filter /* Some(Ptr[GtkFilter]) */ ]
  ): Unit /* None */ = gtk_font_dialog_set_filter(
    this.raw.asInstanceOf[Ptr[GtkFontDialog]],
    filter
      .map[Ptr[GtkFilter]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkFilter]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the fontmap from which fonts are selected.
    *
    * If @fontmap is `NULL`, the default fontmap is used.
    */
  def setFontMap(
      fontmap: Option[
        FontMap /* Some(Ptr[_root_.sn.gnome.pango.internal.PangoFontMap]) */
      ]
  ): Unit /* None */ = gtk_font_dialog_set_font_map(
    this.raw.asInstanceOf[Ptr[GtkFontDialog]],
    fontmap
      .map[Ptr[_root_.sn.gnome.pango.internal.PangoFontMap]](o =>
        o.getUnsafeRawPointer().asInstanceOf
      )
      .getOrElse(
        null.asInstanceOf[Ptr[_root_.sn.gnome.pango.internal.PangoFontMap]]
      )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the language for which font features are applied.
    */
  def setLanguage(
      language: Ptr[
        PangoLanguage
      ] /* Some(Ptr[_root_.sn.gnome.pango.internal.PangoLanguage]) */
  ): Unit /* None */ = gtk_font_dialog_set_language(
    this.raw.asInstanceOf[Ptr[GtkFontDialog]],
    language
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the font chooser dialog blocks interaction with the parent
    * window while it is presented.
    */
  def setModal(
      modal: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_font_dialog_set_modal(
    this.raw.asInstanceOf[Ptr[GtkFontDialog]],
    gboolean(gint((if modal == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the title that will be shown on the font chooser dialog.
    */
  def setTitle(
      title: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_font_dialog_set_title(
    this.raw.asInstanceOf[Ptr[GtkFontDialog]],
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
end FontDialog

object FontDialog:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkFontDialog` object.
    */
  def apply(): FontDialog = new FontDialog(gtk_font_dialog_new().asInstanceOf)
end FontDialog
