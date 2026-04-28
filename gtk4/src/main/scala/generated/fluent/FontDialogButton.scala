package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.FontDialog
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkFontDialogButton
import sn.gnome.gtk4.internal.GtkFontLevel
import sn.gnome.pango.internal.PangoFontDescription
import sn.gnome.pango.internal.PangoLanguage

class FontDialogButton(raw: Ptr[GtkFontDialogButton])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getDialog(): FontDialog = new FontDialog(
    gtk_font_dialog_button_get_dialog(this.raw.asInstanceOf).asInstanceOf
  )

  def getFontDesc(): Ptr[PangoFontDescription] =
    gtk_font_dialog_button_get_font_desc(this.raw.asInstanceOf)

  def getFontFeatures()(using Zone): String = fromCString(
    gtk_font_dialog_button_get_font_features(this.raw.asInstanceOf).asInstanceOf
  )

  def getLanguage(): Ptr[PangoLanguage] = gtk_font_dialog_button_get_language(
    this.raw.asInstanceOf
  )

  def getLevel(): GtkFontLevel = gtk_font_dialog_button_get_level(
    this.raw.asInstanceOf
  )

  def getUseFont(): Boolean =
    gtk_font_dialog_button_get_use_font(this.raw.asInstanceOf).value.!=(0)

  def getUseSize(): Boolean =
    gtk_font_dialog_button_get_use_size(this.raw.asInstanceOf).value.!=(0)

  def setDialog(dialog: FontDialog): Unit = gtk_font_dialog_button_set_dialog(
    this.raw.asInstanceOf,
    dialog.getUnsafeRawPointer().asInstanceOf
  )

  def setFontDesc(font_desc: Ptr[PangoFontDescription]): Unit =
    gtk_font_dialog_button_set_font_desc(this.raw.asInstanceOf, font_desc)

  def setFontFeatures(font_features: String | CString)(using Zone): Unit =
    gtk_font_dialog_button_set_font_features(
      this.raw.asInstanceOf,
      __sn_extract_string(font_features)
    )

  def setLanguage(language: Ptr[PangoLanguage]): Unit =
    gtk_font_dialog_button_set_language(this.raw.asInstanceOf, language)

  def setLevel(level: GtkFontLevel): Unit =
    gtk_font_dialog_button_set_level(this.raw.asInstanceOf, level)

  def setUseFont(use_font: Boolean): Unit = gtk_font_dialog_button_set_use_font(
    this.raw.asInstanceOf,
    gboolean(gint((if use_font == true then 1 else 0)))
  )

  def setUseSize(use_size: Boolean): Unit = gtk_font_dialog_button_set_use_size(
    this.raw.asInstanceOf,
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
  def apply(dialog: FontDialog): FontDialogButton = new FontDialogButton(
    gtk_font_dialog_button_new(
      dialog.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end FontDialogButton
