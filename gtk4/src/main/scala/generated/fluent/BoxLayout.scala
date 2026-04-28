package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.guint
import sn.gnome.gtk4.fluent.LayoutManager
import sn.gnome.gtk4.fluent.Orientable
import sn.gnome.gtk4.internal.GtkBaselinePosition
import sn.gnome.gtk4.internal.GtkBoxLayout
import sn.gnome.gtk4.internal.GtkOrientation

class BoxLayout(raw: Ptr[GtkBoxLayout])
    extends LayoutManager(raw.asInstanceOf),
      Orientable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getBaselineChild(): Int = gtk_box_layout_get_baseline_child(
    this.raw.asInstanceOf
  )

  def getBaselinePosition(): GtkBaselinePosition =
    gtk_box_layout_get_baseline_position(this.raw.asInstanceOf)

  def getHomogeneous(): Boolean =
    gtk_box_layout_get_homogeneous(this.raw.asInstanceOf).value.!=(0)

  def getSpacing(): UInt = gtk_box_layout_get_spacing(
    this.raw.asInstanceOf
  ).value

  def setBaselineChild(child: Int): Unit =
    gtk_box_layout_set_baseline_child(this.raw.asInstanceOf, child)

  def setBaselinePosition(position: GtkBaselinePosition): Unit =
    gtk_box_layout_set_baseline_position(this.raw.asInstanceOf, position)

  def setHomogeneous(homogeneous: Boolean): Unit =
    gtk_box_layout_set_homogeneous(
      this.raw.asInstanceOf,
      gboolean(gint((if homogeneous == true then 1 else 0)))
    )

  def setSpacing(spacing: UInt): Unit =
    gtk_box_layout_set_spacing(this.raw.asInstanceOf, guint(spacing))

end BoxLayout

object BoxLayout:
  def apply(orientation: GtkOrientation): BoxLayout = new BoxLayout(
    gtk_box_layout_new(orientation).asInstanceOf
  )
end BoxLayout
