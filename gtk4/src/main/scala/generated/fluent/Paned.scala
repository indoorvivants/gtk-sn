package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.AccessibleRange
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Orientable
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkOrientation
import sn.gnome.gtk4.internal.GtkPaned

class Paned(raw: Ptr[GtkPaned])
    extends Widget(raw.asInstanceOf),
      Accessible,
      AccessibleRange,
      Buildable,
      ConstraintTarget,
      Orientable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getEndChild(): Widget = new Widget(
    gtk_paned_get_end_child(this.raw.asInstanceOf).asInstanceOf
  )

  def getPosition(): Int = gtk_paned_get_position(this.raw.asInstanceOf)

  def getResizeEndChild(): Boolean =
    gtk_paned_get_resize_end_child(this.raw.asInstanceOf).value.!=(0)

  def getResizeStartChild(): Boolean =
    gtk_paned_get_resize_start_child(this.raw.asInstanceOf).value.!=(0)

  def getShrinkEndChild(): Boolean =
    gtk_paned_get_shrink_end_child(this.raw.asInstanceOf).value.!=(0)

  def getShrinkStartChild(): Boolean =
    gtk_paned_get_shrink_start_child(this.raw.asInstanceOf).value.!=(0)

  def getStartChild(): Widget = new Widget(
    gtk_paned_get_start_child(this.raw.asInstanceOf).asInstanceOf
  )

  def getWideHandle(): Boolean =
    gtk_paned_get_wide_handle(this.raw.asInstanceOf).value.!=(0)

  def setEndChild(child: Widget): Unit = gtk_paned_set_end_child(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  def setPosition(position: Int): Unit =
    gtk_paned_set_position(this.raw.asInstanceOf, position)

  def setResizeEndChild(resize: Boolean): Unit = gtk_paned_set_resize_end_child(
    this.raw.asInstanceOf,
    gboolean(gint((if resize == true then 1 else 0)))
  )

  def setResizeStartChild(resize: Boolean): Unit =
    gtk_paned_set_resize_start_child(
      this.raw.asInstanceOf,
      gboolean(gint((if resize == true then 1 else 0)))
    )

  def setShrinkEndChild(resize: Boolean): Unit = gtk_paned_set_shrink_end_child(
    this.raw.asInstanceOf,
    gboolean(gint((if resize == true then 1 else 0)))
  )

  def setShrinkStartChild(resize: Boolean): Unit =
    gtk_paned_set_shrink_start_child(
      this.raw.asInstanceOf,
      gboolean(gint((if resize == true then 1 else 0)))
    )

  def setStartChild(child: Widget): Unit = gtk_paned_set_start_child(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  def setWideHandle(wide: Boolean): Unit = gtk_paned_set_wide_handle(
    this.raw.asInstanceOf,
    gboolean(gint((if wide == true then 1 else 0)))
  )

end Paned

object Paned:
  def apply(orientation: GtkOrientation): Paned = new Paned(
    gtk_paned_new(orientation).asInstanceOf
  )
end Paned
