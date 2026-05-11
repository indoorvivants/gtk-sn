package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{
  Accessible,
  BaselinePosition,
  Buildable,
  ConstraintTarget,
  Orientable,
  Orientation,
  Widget
}
import sn.gnome.gtk4.internal.GtkBox

/** The `GtkBox` widget arranges child widgets into a single row or column.
  *
  * ![An example GtkBox](box.png)
  *
  * Whether it is a row or column depends on the value of its
  * [property@Gtk.Orientable:orientation] property. Within the other dimension,
  * all children are allocated the same size. Of course, the
  * [property@Gtk.Widget:halign] and [property@Gtk.Widget:valign] properties can
  * be used on the children to influence their allocation.
  *
  * Use repeated calls to [method@Gtk.Box.append] to pack widgets into a
  * `GtkBox` from start to end. Use [method@Gtk.Box.remove] to remove widgets
  * from the `GtkBox`. [method@Gtk.Box.insert_child_after] can be used to add a
  * child at a particular position.
  *
  * Use [method@Gtk.Box.set_homogeneous] to specify whether or not all children
  * of the `GtkBox` are forced to get the same amount of space.
  *
  * Use [method@Gtk.Box.set_spacing] to determine how much space will be
  * minimally placed between all children in the `GtkBox`. Note that spacing is
  * added *between* the children.
  *
  * Use [method@Gtk.Box.reorder_child_after] to move a child to a different
  * place in the box.
  *
  * # CSS nodes
  *
  * `GtkBox` uses a single CSS node with name box.
  *
  * # Accessibility
  *
  * Until GTK 4.10, `GtkBox` used the `GTK_ACCESSIBLE_ROLE_GROUP` role.
  *
  * Starting from GTK 4.12, `GtkBox` uses the `GTK_ACCESSIBLE_ROLE_GENERIC`
  * role.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Box private[gnome] (raw: Ptr[GtkBox])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Orientable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Adds @child as the last child to @box.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def append(
      child: sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */
  )(using Runtime): Unit /* None */ =
    gtk_box_append(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBox]],
      child.getUnsafeRawPointer().asInstanceOf
    )
  end append

  /** Gets the value set by gtk_box_set_baseline_child().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getBaselineChild(): Int /* None */ =
    gtk_box_get_baseline_child(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBox]]
    )
  end getBaselineChild

  /** Gets the value set by gtk_box_set_baseline_position().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getBaselinePosition(): BaselinePosition /* None */ =
    BaselinePosition.fromRaw(
      gtk_box_get_baseline_position(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBox]]
      )
    )
  end getBaselinePosition

  /** Returns whether the box is homogeneous (all children are the same size).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHomogeneous(): Boolean /* None */ =
    gtk_box_get_homogeneous(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBox]]
    ).value.!=(0)
  end getHomogeneous

  /** Gets the value set by gtk_box_set_spacing().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSpacing(): Int /* None */ =
    gtk_box_get_spacing(this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBox]])
  end getSpacing

  /** Inserts @child in the position after @sibling in the list of @box
    * children.
    *
    * If @sibling is %NULL, insert @child at the first position.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insertChildAfter(
      child: sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */,
      sibling: Option[sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */ ]
  )(using Runtime): Unit /* None */ =
    gtk_box_insert_child_after(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBox]],
      child.getUnsafeRawPointer().asInstanceOf,
      sibling
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
    )
  end insertChildAfter

  /** Adds @child as the first child to @box.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def prepend(
      child: sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */
  )(using Runtime): Unit /* None */ =
    gtk_box_prepend(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBox]],
      child.getUnsafeRawPointer().asInstanceOf
    )
  end prepend

  /** Removes a child widget from @box.
    *
    * The child must have been added before with [method@Gtk.Box.append],
    * [method@Gtk.Box.prepend], or [method@Gtk.Box.insert_child_after].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def remove(
      child: sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */
  )(using Runtime): Unit /* None */ =
    gtk_box_remove(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBox]],
      child.getUnsafeRawPointer().asInstanceOf
    )
  end remove

  /** Moves @child to the position after @sibling in the list of @box children.
    *
    * If @sibling is %NULL, move @child to the first position.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def reorderChildAfter(
      child: sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */,
      sibling: Option[sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */ ]
  )(using Runtime): Unit /* None */ =
    gtk_box_reorder_child_after(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBox]],
      child.getUnsafeRawPointer().asInstanceOf,
      sibling
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
    )
  end reorderChildAfter

  /** Sets the baseline child of a box.
    *
    * This affects only vertical boxes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setBaselineChild(child: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_box_set_baseline_child(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBox]],
      child
    )
  end setBaselineChild

  /** Sets the baseline position of a box.
    *
    * This affects only horizontal boxes with at least one baseline aligned
    * child. If there is more vertical space available than requested, and the
    * baseline is not allocated by the parent then
    * @position
    *   is used to allocate the baseline with respect to the extra space
    *   available.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setBaselinePosition(
      position: BaselinePosition /* Some(GtkBaselinePosition) */
  ): Unit /* None */ =
    gtk_box_set_baseline_position(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBox]],
      position.raw
    )
  end setBaselinePosition

  /** Sets whether or not all children of @box are given equal space in the box.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setHomogeneous(
      homogeneous: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_box_set_homogeneous(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBox]],
      gboolean(gint((if homogeneous == true then 1 else 0)))
    )
  end setHomogeneous

  /** Sets the number of pixels to place between children of @box.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSpacing(spacing: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_box_set_spacing(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBox]],
      spacing
    )
  end setSpacing

end Box

object Box:
  def applyUnsafe(ptr: Ptr[GtkBox])(using Runtime) = summon[Runtime]
    .getOrCreate[Box](ptr.asInstanceOf[Ptr[Byte]], p => new Box(ptr))

  /** Creates a new `GtkBox`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      orientation: Orientation /* Some(GtkOrientation) */,
      spacing: Int /* Some(CInt) */
  )(using Runtime): Box =
    val raw: Ptr[Byte] = gtk_box_new(orientation.raw, spacing).asInstanceOf
    summon[Runtime].getOrCreate[Box](raw, r => Box.applyUnsafe(r.asInstanceOf))
  end apply
end Box
