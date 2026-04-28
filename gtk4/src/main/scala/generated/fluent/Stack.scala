package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.guint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.SelectionModel
import sn.gnome.gtk4.fluent.StackPage
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkStack
import sn.gnome.gtk4.internal.GtkStackTransitionType

class Stack(raw: Ptr[GtkStack])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def addChild(child: Widget): StackPage = new StackPage(
    gtk_stack_add_child(
      this.raw.asInstanceOf,
      child.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  def addNamed(child: Widget, name: String | CString)(using Zone): StackPage =
    new StackPage(
      gtk_stack_add_named(
        this.raw.asInstanceOf,
        child.getUnsafeRawPointer().asInstanceOf,
        __sn_extract_string(name)
      ).asInstanceOf
    )

  def addTitled(child: Widget, name: String | CString, title: String | CString)(
      using Zone
  ): StackPage = new StackPage(
    gtk_stack_add_titled(
      this.raw.asInstanceOf,
      child.getUnsafeRawPointer().asInstanceOf,
      __sn_extract_string(name),
      __sn_extract_string(title)
    ).asInstanceOf
  )

  def getChildByName(name: String | CString)(using Zone): Widget = new Widget(
    gtk_stack_get_child_by_name(
      this.raw.asInstanceOf,
      __sn_extract_string(name)
    ).asInstanceOf
  )

  def getHhomogeneous(): Boolean =
    gtk_stack_get_hhomogeneous(this.raw.asInstanceOf).value.!=(0)

  def getInterpolateSize(): Boolean =
    gtk_stack_get_interpolate_size(this.raw.asInstanceOf).value.!=(0)

  def getPage(child: Widget): StackPage = new StackPage(
    gtk_stack_get_page(
      this.raw.asInstanceOf,
      child.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  def getPages(): SelectionModel = new SelectionModel.Abstract(
    gtk_stack_get_pages(this.raw.asInstanceOf).asInstanceOf
  )

  def getTransitionDuration(): UInt = gtk_stack_get_transition_duration(
    this.raw.asInstanceOf
  ).value

  def getTransitionRunning(): Boolean =
    gtk_stack_get_transition_running(this.raw.asInstanceOf).value.!=(0)

  def getTransitionType(): GtkStackTransitionType =
    gtk_stack_get_transition_type(this.raw.asInstanceOf)

  def getVhomogeneous(): Boolean =
    gtk_stack_get_vhomogeneous(this.raw.asInstanceOf).value.!=(0)

  def getVisibleChild(): Widget = new Widget(
    gtk_stack_get_visible_child(this.raw.asInstanceOf).asInstanceOf
  )

  def getVisibleChildName()(using Zone): String = fromCString(
    gtk_stack_get_visible_child_name(this.raw.asInstanceOf).asInstanceOf
  )

  def remove(child: Widget): Unit = gtk_stack_remove(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  def setHhomogeneous(hhomogeneous: Boolean): Unit = gtk_stack_set_hhomogeneous(
    this.raw.asInstanceOf,
    gboolean(gint((if hhomogeneous == true then 1 else 0)))
  )

  def setInterpolateSize(interpolate_size: Boolean): Unit =
    gtk_stack_set_interpolate_size(
      this.raw.asInstanceOf,
      gboolean(gint((if interpolate_size == true then 1 else 0)))
    )

  def setTransitionDuration(duration: UInt): Unit =
    gtk_stack_set_transition_duration(this.raw.asInstanceOf, guint(duration))

  def setTransitionType(transition: GtkStackTransitionType): Unit =
    gtk_stack_set_transition_type(this.raw.asInstanceOf, transition)

  def setVhomogeneous(vhomogeneous: Boolean): Unit = gtk_stack_set_vhomogeneous(
    this.raw.asInstanceOf,
    gboolean(gint((if vhomogeneous == true then 1 else 0)))
  )

  def setVisibleChild(child: Widget): Unit = gtk_stack_set_visible_child(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  def setVisibleChildFull(
      name: String | CString,
      transition: GtkStackTransitionType
  )(using Zone): Unit = gtk_stack_set_visible_child_full(
    this.raw.asInstanceOf,
    __sn_extract_string(name),
    transition
  )

  def setVisibleChildName(name: String | CString)(using Zone): Unit =
    gtk_stack_set_visible_child_name(
      this.raw.asInstanceOf,
      __sn_extract_string(name)
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Stack

object Stack:
  def apply(): Stack = new Stack(gtk_stack_new().asInstanceOf)
end Stack
