package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Orientable
import sn.gnome.gtk4.fluent.Stack
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkStackSwitcher

class StackSwitcher(raw: Ptr[GtkStackSwitcher])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Orientable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getStack(): Stack = new Stack(
    gtk_stack_switcher_get_stack(this.raw.asInstanceOf).asInstanceOf
  )

  def setStack(stack: Stack): Unit = gtk_stack_switcher_set_stack(
    this.raw.asInstanceOf,
    stack.getUnsafeRawPointer().asInstanceOf
  )

end StackSwitcher

object StackSwitcher:
  def apply(): StackSwitcher = new StackSwitcher(
    gtk_stack_switcher_new().asInstanceOf
  )
end StackSwitcher
