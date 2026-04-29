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

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The `GtkStackSwitcher` shows a row of buttons to switch between `GtkStack`
  * pages.
  *
  * ![An example GtkStackSwitcher](stackswitcher.png)
  *
  * It acts as a controller for the associated `GtkStack`.
  *
  * All the content for the buttons comes from the properties of the stacks
  * [class@Gtk.StackPage] objects; the button visibility in a `GtkStackSwitcher`
  * widget is controlled by the visibility of the child in the `GtkStack`.
  *
  * It is possible to associate multiple `GtkStackSwitcher` widgets with the
  * same `GtkStack` widget.
  *
  * # CSS nodes
  *
  * `GtkStackSwitcher` has a single CSS node named stackswitcher and style class
  * .stack-switcher.
  *
  * When circumstances require it, `GtkStackSwitcher` adds the .needs-attention
  * style class to the widgets representing the stack pages.
  *
  * # Accessibility
  *
  * `GtkStackSwitcher` uses the %GTK_ACCESSIBLE_ROLE_TAB_LIST role and uses the
  * %GTK_ACCESSIBLE_ROLE_TAB for its buttons.
  *
  * # Orientable
  *
  * Since GTK 4.4, `GtkStackSwitcher` implements `GtkOrientable` allowing the
  * stack switcher to be made vertical with `gtk_orientable_set_orientation()`.
  */
class StackSwitcher(raw: Ptr[GtkStackSwitcher])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Orientable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the stack.
    */
  def getStack(): Stack = new Stack(
    gtk_stack_switcher_get_stack(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the stack to control.
    */
  def setStack(stack: Stack): Unit = gtk_stack_switcher_set_stack(
    this.raw.asInstanceOf,
    stack.getUnsafeRawPointer().asInstanceOf
  )

end StackSwitcher

object StackSwitcher:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Create a new `GtkStackSwitcher`.
    */
  def apply(): StackSwitcher = new StackSwitcher(
    gtk_stack_switcher_new().asInstanceOf
  )
end StackSwitcher
