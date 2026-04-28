package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkFrame

class Frame(raw: Ptr[GtkFrame])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getChild(): Widget = new Widget(
    gtk_frame_get_child(this.raw.asInstanceOf).asInstanceOf
  )

  def getLabel()(using Zone): String = fromCString(
    gtk_frame_get_label(this.raw.asInstanceOf).asInstanceOf
  )

  def getLabelAlign(): Float = gtk_frame_get_label_align(this.raw.asInstanceOf)

  def getLabelWidget(): Widget = new Widget(
    gtk_frame_get_label_widget(this.raw.asInstanceOf).asInstanceOf
  )

  def setChild(child: Widget): Unit = gtk_frame_set_child(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  def setLabel(label: String | CString)(using Zone): Unit =
    gtk_frame_set_label(this.raw.asInstanceOf, __sn_extract_string(label))

  def setLabelAlign(xalign: Float): Unit =
    gtk_frame_set_label_align(this.raw.asInstanceOf, xalign.asInstanceOf)

  def setLabelWidget(label_widget: Widget): Unit = gtk_frame_set_label_widget(
    this.raw.asInstanceOf,
    label_widget.getUnsafeRawPointer().asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Frame

object Frame:
  def apply(label: String | CString)(using Zone): Frame = new Frame(
    gtk_frame_new(__sn_extract_string(label)).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Frame
