package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Orientable
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkOrientation
import sn.gnome.gtk4.internal.GtkSeparator

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkSeparator` is a horizontal or vertical separator widget.
  *
  * ![An example GtkSeparator](separator.png)
  *
  * A `GtkSeparator` can be used to group the widgets within a window. It
  * displays a line with a shadow to make it appear sunken into the interface.
  *
  * # CSS nodes
  *
  * `GtkSeparator` has a single CSS node with name separator. The node gets one
  * of the .horizontal or .vertical style classes.
  *
  * # Accessibility
  *
  * `GtkSeparator` uses the %GTK_ACCESSIBLE_ROLE_SEPARATOR role.
  */
class Separator(raw: Ptr[GtkSeparator])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Orientable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end Separator

object Separator:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkSeparator` with the given orientation.
    */
  def apply(orientation: GtkOrientation): Separator = new Separator(
    gtk_separator_new(orientation).asInstanceOf
  )
end Separator
