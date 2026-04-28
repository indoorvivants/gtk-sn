package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Paintable
import sn.gnome.gdk4.internal.GdkRectangle
import sn.gnome.gio.fluent.Icon
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkTooltip

class Tooltip(raw: Ptr[GtkTooltip]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def setCustom(custom_widget: Widget): Unit = gtk_tooltip_set_custom(
    this.raw.asInstanceOf,
    custom_widget.getUnsafeRawPointer().asInstanceOf
  )

  def setIcon(paintable: Paintable): Unit = gtk_tooltip_set_icon(
    this.raw.asInstanceOf,
    paintable.getUnsafeRawPointer().asInstanceOf
  )

  def setIconFromGicon(gicon: Icon): Unit = gtk_tooltip_set_icon_from_gicon(
    this.raw.asInstanceOf,
    gicon.getUnsafeRawPointer().asInstanceOf
  )

  def setIconFromIconName(icon_name: String | CString)(using Zone): Unit =
    gtk_tooltip_set_icon_from_icon_name(
      this.raw.asInstanceOf,
      __sn_extract_string(icon_name)
    )

  def setMarkup(markup: String | CString)(using Zone): Unit =
    gtk_tooltip_set_markup(this.raw.asInstanceOf, __sn_extract_string(markup))

  def setText(text: String | CString)(using Zone): Unit =
    gtk_tooltip_set_text(this.raw.asInstanceOf, __sn_extract_string(text))

  def setTipArea(rect: Ptr[GdkRectangle]): Unit =
    gtk_tooltip_set_tip_area(this.raw.asInstanceOf, rect)

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Tooltip
