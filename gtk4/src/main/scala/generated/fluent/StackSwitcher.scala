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
class StackSwitcher private[gnome] (raw: Ptr[GtkStackSwitcher])
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
  def getStack()(using Runtime): sn.gnome.gtk4.fluent.Stack /* None */ =
    sn.gnome.gtk4.fluent.Stack.applyUnsafe(
      gtk_stack_switcher_get_stack(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStackSwitcher]]
      ).asInstanceOf
    )
  end getStack

  /** Sets the stack to control.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setStack(
      stack: Option[sn.gnome.gtk4.fluent.Stack /* Some(Ptr[GtkStack]) */ ]
  )(using Runtime): Unit /* None */ =
    gtk_stack_switcher_set_stack(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStackSwitcher]],
      stack
        .map[Ptr[GtkStack]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkStack]])
    )
  end setStack

end StackSwitcher

object StackSwitcher:
  def applyUnsafe(ptr: Ptr[GtkStackSwitcher])(using Runtime) =
    summon[Runtime].getOrCreate[StackSwitcher](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new StackSwitcher(ptr)
    )

  /** Create a new `GtkStackSwitcher`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): StackSwitcher =
    val raw: Ptr[Byte] = gtk_stack_switcher_new().asInstanceOf
    summon[Runtime].getOrCreate[StackSwitcher](
      raw,
      r => StackSwitcher.applyUnsafe(r.asInstanceOf)
    )
  end apply
end StackSwitcher
