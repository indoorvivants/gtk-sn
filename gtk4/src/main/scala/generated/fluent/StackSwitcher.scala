package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{
  Accessible,
  Buildable,
  ConstraintTarget,
  Orientable,
  Stack,
  Widget
}
import sn.gnome.gtk4.internal.GtkStackSwitcher

/** The `GtkStackSwitcher` shows a row of buttons to switch between `GtkStack`
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class StackSwitcher(raw: Ptr[GtkStackSwitcher])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Orientable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Retrieves the stack.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getStack(): Stack /* None */ = new Stack(
    gtk_stack_switcher_get_stack(
      this.raw.asInstanceOf[Ptr[GtkStackSwitcher]]
    ).asInstanceOf
  )

  /** Sets the stack to control.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setStack(
      stack: Option[Stack /* Some(Ptr[GtkStack]) */ ]
  ): Unit /* None */ = gtk_stack_switcher_set_stack(
    this.raw.asInstanceOf[Ptr[GtkStackSwitcher]],
    stack
      .map[Ptr[GtkStack]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkStack]])
  )

end StackSwitcher

object StackSwitcher:
  /** Create a new `GtkStackSwitcher`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): StackSwitcher =
    val raw: Ptr[Byte] = gtk_stack_switcher_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[StackSwitcher](raw, r => new StackSwitcher(r.asInstanceOf))
  end apply
end StackSwitcher
