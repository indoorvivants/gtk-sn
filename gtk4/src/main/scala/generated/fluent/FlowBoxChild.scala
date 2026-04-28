package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkFlowBoxChild

class FlowBoxChild(raw: Ptr[GtkFlowBoxChild])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def changed(): Unit = gtk_flow_box_child_changed(this.raw.asInstanceOf)

  def getChild(): Widget = new Widget(
    gtk_flow_box_child_get_child(this.raw.asInstanceOf).asInstanceOf
  )

  def getIndex(): Int = gtk_flow_box_child_get_index(this.raw.asInstanceOf)

  def isSelected(): Boolean =
    gtk_flow_box_child_is_selected(this.raw.asInstanceOf).value.!=(0)

  def setChild(child: Widget): Unit = gtk_flow_box_child_set_child(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

end FlowBoxChild

object FlowBoxChild:
  def apply(): FlowBoxChild = new FlowBoxChild(
    gtk_flow_box_child_new().asInstanceOf
  )
end FlowBoxChild
