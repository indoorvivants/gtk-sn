package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkPackType
import sn.gnome.gtk4.internal.GtkWindowControls

class WindowControls(raw: Ptr[GtkWindowControls])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getDecorationLayout()(using Zone): String = fromCString(
    gtk_window_controls_get_decoration_layout(
      this.raw.asInstanceOf
    ).asInstanceOf
  )

  def getEmpty(): Boolean =
    gtk_window_controls_get_empty(this.raw.asInstanceOf).value.!=(0)

  def getSide(): GtkPackType = gtk_window_controls_get_side(
    this.raw.asInstanceOf
  )

  def setDecorationLayout(layout: String | CString)(using Zone): Unit =
    gtk_window_controls_set_decoration_layout(
      this.raw.asInstanceOf,
      __sn_extract_string(layout)
    )

  def setSide(side: GtkPackType): Unit =
    gtk_window_controls_set_side(this.raw.asInstanceOf, side)

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end WindowControls

object WindowControls:
  def apply(side: GtkPackType): WindowControls = new WindowControls(
    gtk_window_controls_new(side).asInstanceOf
  )
end WindowControls
