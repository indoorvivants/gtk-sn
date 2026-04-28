package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkActionBar

class ActionBar(raw: Ptr[GtkActionBar])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getCenterWidget(): Widget = new Widget(
    gtk_action_bar_get_center_widget(this.raw.asInstanceOf).asInstanceOf
  )

  def getRevealed(): Boolean =
    gtk_action_bar_get_revealed(this.raw.asInstanceOf).value.!=(0)

  def packEnd(child: Widget): Unit = gtk_action_bar_pack_end(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  def packStart(child: Widget): Unit = gtk_action_bar_pack_start(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  def remove(child: Widget): Unit = gtk_action_bar_remove(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  def setCenterWidget(center_widget: Widget): Unit =
    gtk_action_bar_set_center_widget(
      this.raw.asInstanceOf,
      center_widget.getUnsafeRawPointer().asInstanceOf
    )

  def setRevealed(revealed: Boolean): Unit = gtk_action_bar_set_revealed(
    this.raw.asInstanceOf,
    gboolean(gint((if revealed == true then 1 else 0)))
  )

end ActionBar

object ActionBar:
  def apply(): ActionBar = new ActionBar(gtk_action_bar_new().asInstanceOf)
end ActionBar
