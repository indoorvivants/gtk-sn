package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.{
  Accessible,
  Buildable,
  ConstraintTarget,
  Stack,
  Widget
}
import sn.gnome.gtk4.internal.GtkStackSidebar

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A `GtkStackSidebar` uses a sidebar to switch between `GtkStack` pages.
  *
  * In order to use a `GtkStackSidebar`, you simply use a `GtkStack` to organize
  * your UI flow, and add the sidebar to your sidebar area. You can use
  * [method@Gtk.StackSidebar.set_stack] to connect the `GtkStackSidebar` to the
  * `GtkStack`.
  *
  * # CSS nodes
  *
  * `GtkStackSidebar` has a single CSS node with name stacksidebar and style
  * class .sidebar.
  *
  * When circumstances require it, `GtkStackSidebar` adds the .needs-attention
  * style class to the widgets representing the stack pages.
  */
class StackSidebar(raw: Ptr[GtkStackSidebar])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the stack.
    */
  def getStack(): Stack /* None */ = new Stack(
    gtk_stack_sidebar_get_stack(
      this.raw.asInstanceOf[Ptr[GtkStackSidebar]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Set the `GtkStack` associated with this `GtkStackSidebar`.
    *
    * The sidebar widget will automatically update according to the order and
    * items within the given `GtkStack`.
    */
  def setStack(stack: Stack /* Some(Ptr[GtkStack]) */ ): Unit /* None */ =
    gtk_stack_sidebar_set_stack(
      this.raw.asInstanceOf[Ptr[GtkStackSidebar]],
      stack.getUnsafeRawPointer().asInstanceOf
    )

end StackSidebar

object StackSidebar:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkStackSidebar`.
    */
  def apply(): StackSidebar = new StackSidebar(
    gtk_stack_sidebar_new().asInstanceOf
  )
end StackSidebar
