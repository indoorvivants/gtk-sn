package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{
  Accessible,
  Buildable,
  ConstraintTarget,
  Stack,
  Widget
}
import sn.gnome.gtk4.internal.GtkStackSidebar

/** A `GtkStackSidebar` uses a sidebar to switch between `GtkStack` pages.
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class StackSidebar(raw: Ptr[GtkStackSidebar])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Retrieves the stack.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getStack(): Stack /* None */ = new Stack(
    gtk_stack_sidebar_get_stack(
      this.raw.asInstanceOf[Ptr[GtkStackSidebar]]
    ).asInstanceOf
  )

  /** Set the `GtkStack` associated with this `GtkStackSidebar`.
    *
    * The sidebar widget will automatically update according to the order and
    * items within the given `GtkStack`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setStack(stack: Stack /* Some(Ptr[GtkStack]) */ ): Unit /* None */ =
    gtk_stack_sidebar_set_stack(
      this.raw.asInstanceOf[Ptr[GtkStackSidebar]],
      stack.getUnsafeRawPointer().asInstanceOf
    )

end StackSidebar

object StackSidebar:
  /** Creates a new `GtkStackSidebar`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): StackSidebar =
    val raw: Ptr[Byte] = gtk_stack_sidebar_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[StackSidebar](raw, r => new StackSidebar(r.asInstanceOf))
  end apply
end StackSidebar
