package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Stack
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkStackSidebar

class StackSidebar(raw: Ptr[GtkStackSidebar])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getStack(): Stack = new Stack(
    gtk_stack_sidebar_get_stack(this.raw.asInstanceOf).asInstanceOf
  )

  def setStack(stack: Stack): Unit = gtk_stack_sidebar_set_stack(
    this.raw.asInstanceOf,
    stack.getUnsafeRawPointer().asInstanceOf
  )

end StackSidebar

object StackSidebar:
  def apply(): StackSidebar = new StackSidebar(
    gtk_stack_sidebar_new().asInstanceOf
  )
end StackSidebar
