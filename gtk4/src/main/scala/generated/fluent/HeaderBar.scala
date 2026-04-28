package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkHeaderBar

class HeaderBar(raw: Ptr[GtkHeaderBar])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getDecorationLayout()(using Zone): String = fromCString(
    gtk_header_bar_get_decoration_layout(this.raw.asInstanceOf).asInstanceOf
  )

  def getShowTitleButtons(): Boolean =
    gtk_header_bar_get_show_title_buttons(this.raw.asInstanceOf).value.!=(0)

  def getTitleWidget(): Widget = new Widget(
    gtk_header_bar_get_title_widget(this.raw.asInstanceOf).asInstanceOf
  )

  def packEnd(child: Widget): Unit = gtk_header_bar_pack_end(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  def packStart(child: Widget): Unit = gtk_header_bar_pack_start(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  def remove(child: Widget): Unit = gtk_header_bar_remove(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  def setDecorationLayout(layout: String | CString)(using Zone): Unit =
    gtk_header_bar_set_decoration_layout(
      this.raw.asInstanceOf,
      __sn_extract_string(layout)
    )

  def setShowTitleButtons(setting: Boolean): Unit =
    gtk_header_bar_set_show_title_buttons(
      this.raw.asInstanceOf,
      gboolean(gint((if setting == true then 1 else 0)))
    )

  def setTitleWidget(title_widget: Widget): Unit =
    gtk_header_bar_set_title_widget(
      this.raw.asInstanceOf,
      title_widget.getUnsafeRawPointer().asInstanceOf
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end HeaderBar

object HeaderBar:
  def apply(): HeaderBar = new HeaderBar(gtk_header_bar_new().asInstanceOf)
end HeaderBar
