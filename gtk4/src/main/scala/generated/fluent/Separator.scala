package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{
  Accessible,
  Buildable,
  ConstraintTarget,
  Orientable,
  Orientation,
  Widget
}
import sn.gnome.gtk4.internal.GtkSeparator

/** `GtkSeparator` is a horizontal or vertical separator widget.
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Separator private[gnome] (raw: Ptr[GtkSeparator])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Orientable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end Separator

object Separator:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkSeparator])(using Runtime) =
    summon[Runtime].getOrCreate[Separator](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new Separator(ptr)
    )

  /** Creates a new `GtkSeparator` with the given orientation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(orientation: Orientation /* Some(GtkOrientation) */ )(using
      Runtime
  ): Separator =
    val raw: Ptr[Byte] = gtk_separator_new(orientation.raw).asInstanceOf
    summon[Runtime]
      .getOrCreate[Separator](raw, r => Separator.applyUnsafe(r.asInstanceOf))
  end apply
end Separator
