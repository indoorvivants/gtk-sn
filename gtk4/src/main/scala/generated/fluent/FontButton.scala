package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.FontChooser
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkFontButton

class FontButton(raw: Ptr[GtkFontButton])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      FontChooser:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getModal(): Boolean =
    gtk_font_button_get_modal(this.raw.asInstanceOf).value.!=(0)

  def getTitle()(using Zone): String = fromCString(
    gtk_font_button_get_title(this.raw.asInstanceOf).asInstanceOf
  )

  def getUseFont(): Boolean =
    gtk_font_button_get_use_font(this.raw.asInstanceOf).value.!=(0)

  def getUseSize(): Boolean =
    gtk_font_button_get_use_size(this.raw.asInstanceOf).value.!=(0)

  def setModal(modal: Boolean): Unit = gtk_font_button_set_modal(
    this.raw.asInstanceOf,
    gboolean(gint((if modal == true then 1 else 0)))
  )

  def setTitle(title: String | CString)(using Zone): Unit =
    gtk_font_button_set_title(this.raw.asInstanceOf, __sn_extract_string(title))

  def setUseFont(use_font: Boolean): Unit = gtk_font_button_set_use_font(
    this.raw.asInstanceOf,
    gboolean(gint((if use_font == true then 1 else 0)))
  )

  def setUseSize(use_size: Boolean): Unit = gtk_font_button_set_use_size(
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
end FontButton

object FontButton:
  def apply(): FontButton = new FontButton(gtk_font_button_new().asInstanceOf)
  def withFont(fontname: String | CString)(using Zone): FontButton =
    new FontButton(
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
