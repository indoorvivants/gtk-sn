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

class ColorButton(raw: Ptr[GtkColorButton])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ColorChooser,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getModal(): Boolean =
    gtk_color_button_get_modal(this.raw.asInstanceOf).value.!=(0)

  def getTitle()(using Zone): String = fromCString(
    gtk_color_button_get_title(this.raw.asInstanceOf).asInstanceOf
  )

  def setModal(modal: Boolean): Unit = gtk_color_button_set_modal(
    this.raw.asInstanceOf,
    gboolean(gint((if modal == true then 1 else 0)))
  )

  def setTitle(title: String | CString)(using Zone): Unit =
    gtk_color_button_set_title(
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
  def apply(): ColorButton = new ColorButton(
    gtk_color_button_new().asInstanceOf
  )
  def withRgba(rgba: Ptr[GdkRGBA]): ColorButton = new ColorButton(
    gtk_color_button_new_with_rgba(rgba).asInstanceOf
  )
end ColorButton
