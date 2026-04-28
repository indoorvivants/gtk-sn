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

class FontDialog(raw: Ptr[GtkFontDialog]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

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

  // Method choose_font_and_features_finish contains an OUT parameter, which is not supported yet

  def chooseFontFinish(
      result: AsyncResult
  ): GResult[Ptr[PangoFontDescription]] = GResult.wrap(__errorPtr =>
    gtk_font_dialog_choose_font_finish(
      this.raw.asInstanceOf,
      result.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    )
  )

  def getFilter(): Filter = new Filter(
    gtk_font_dialog_get_filter(this.raw.asInstanceOf).asInstanceOf
  )

  def getFontMap(): FontMap = new FontMap(
    gtk_font_dialog_get_font_map(this.raw.asInstanceOf).asInstanceOf
  )

  def getLanguage(): Ptr[PangoLanguage] = gtk_font_dialog_get_language(
    this.raw.asInstanceOf
  )

  def getModal(): Boolean =
    gtk_font_dialog_get_modal(this.raw.asInstanceOf).value.!=(0)

  def getTitle()(using Zone): String = fromCString(
    gtk_font_dialog_get_title(this.raw.asInstanceOf).asInstanceOf
  )

  def setFilter(filter: Filter): Unit = gtk_font_dialog_set_filter(
    this.raw.asInstanceOf,
    filter.getUnsafeRawPointer().asInstanceOf
  )

  def setFontMap(fontmap: FontMap): Unit = gtk_font_dialog_set_font_map(
    this.raw.asInstanceOf,
    fontmap.getUnsafeRawPointer().asInstanceOf
  )

  def setLanguage(language: Ptr[PangoLanguage]): Unit =
    gtk_font_dialog_set_language(this.raw.asInstanceOf, language)

  def setModal(modal: Boolean): Unit = gtk_font_dialog_set_modal(
    this.raw.asInstanceOf,
    gboolean(gint((if modal == true then 1 else 0)))
  )

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
  def apply(): FontDialog = new FontDialog(gtk_font_dialog_new().asInstanceOf)
end FontDialog
