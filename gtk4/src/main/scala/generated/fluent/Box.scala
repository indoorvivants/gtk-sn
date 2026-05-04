package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
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

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The `GtkBox` widget arranges child widgets into a single row or column.
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
  */
class Box(raw: Ptr[GtkBox])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Orientable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds @child as the last child to @box.
    */
  def append(child: Widget /* Some(Ptr[GtkWidget]) */ ): Unit /* None */ =
    gtk_box_append(
      this.raw.asInstanceOf[Ptr[GtkBox]],
      child.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value set by gtk_box_set_baseline_child().
    */
  def getBaselineChild(): Int /* None */ = gtk_box_get_baseline_child(
    this.raw.asInstanceOf[Ptr[GtkBox]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value set by gtk_box_set_baseline_position().
    */
  def getBaselinePosition(): BaselinePosition /* None */ =
    BaselinePosition.fromRaw(
      gtk_box_get_baseline_position(this.raw.asInstanceOf[Ptr[GtkBox]])
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the box is homogeneous (all children are the same size).
    */
  def getHomogeneous(): Boolean /* None */ =
    gtk_box_get_homogeneous(this.raw.asInstanceOf[Ptr[GtkBox]]).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value set by gtk_box_set_spacing().
    */
  def getSpacing(): Int /* None */ = gtk_box_get_spacing(
    this.raw.asInstanceOf[Ptr[GtkBox]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Inserts @child in the position after @sibling in the list of @box
    * children.
    *
    * If @sibling is %NULL, insert @child at the first position.
    */
  def insertChildAfter(
      child: Widget /* Some(Ptr[GtkWidget]) */,
      sibling: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Unit /* None */ = gtk_box_insert_child_after(
    this.raw.asInstanceOf[Ptr[GtkBox]],
    child.getUnsafeRawPointer().asInstanceOf,
    sibling
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds @child as the first child to @box.
    */
  def prepend(child: Widget /* Some(Ptr[GtkWidget]) */ ): Unit /* None */ =
    gtk_box_prepend(
      this.raw.asInstanceOf[Ptr[GtkBox]],
      child.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes a child widget from @box.
    *
    * The child must have been added before with [method@Gtk.Box.append],
    * [method@Gtk.Box.prepend], or [method@Gtk.Box.insert_child_after].
    */
  def remove(child: Widget /* Some(Ptr[GtkWidget]) */ ): Unit /* None */ =
    gtk_box_remove(
      this.raw.asInstanceOf[Ptr[GtkBox]],
      child.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Moves @child to the position after @sibling in the list of @box children.
    *
    * If @sibling is %NULL, move @child to the first position.
    */
  def reorderChildAfter(
      child: Widget /* Some(Ptr[GtkWidget]) */,
      sibling: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Unit /* None */ = gtk_box_reorder_child_after(
    this.raw.asInstanceOf[Ptr[GtkBox]],
    child.getUnsafeRawPointer().asInstanceOf,
    sibling
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the baseline child of a box.
    *
    * This affects only vertical boxes.
    */
  def setBaselineChild(child: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_box_set_baseline_child(this.raw.asInstanceOf[Ptr[GtkBox]], child)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the baseline position of a box.
    *
    * This affects only horizontal boxes with at least one baseline aligned
    * child. If there is more vertical space available than requested, and the
    * baseline is not allocated by the parent then
    * @position
    *   is used to allocate the baseline with respect to the extra space
    *   available.
    */
  def setBaselinePosition(
      position: BaselinePosition /* Some(GtkBaselinePosition) */
  ): Unit /* None */ = gtk_box_set_baseline_position(
    this.raw.asInstanceOf[Ptr[GtkBox]],
    position.raw
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether or not all children of @box are given equal space in the box.
    */
  def setHomogeneous(
      homogeneous: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_box_set_homogeneous(
    this.raw.asInstanceOf[Ptr[GtkBox]],
    gboolean(gint((if homogeneous == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the number of pixels to place between children of @box.
    */
  def setSpacing(spacing: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_box_set_spacing(this.raw.asInstanceOf[Ptr[GtkBox]], spacing)

end Box

object Box:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkBox`.
    */
  def apply(
      orientation: Orientation /* Some(GtkOrientation) */,
      spacing: Int /* Some(CInt) */
  ): Box = new Box(gtk_box_new(orientation.raw, spacing).asInstanceOf)
end Box
