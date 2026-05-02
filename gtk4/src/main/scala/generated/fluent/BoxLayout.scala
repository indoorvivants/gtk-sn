package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.guint
import sn.gnome.gtk4.fluent.LayoutManager
import sn.gnome.gtk4.fluent.Orientable
import sn.gnome.gtk4.internal.GtkBaselinePosition
import sn.gnome.gtk4.internal.GtkBoxLayout
import sn.gnome.gtk4.internal.GtkOrientation

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkBoxLayout` is a layout manager that arranges children in a single row or
  * column.
  *
  * Whether it is a row or column depends on the value of its
  * [property@Gtk.Orientable:orientation] property. Within the other dimension
  * all children all allocated the same size. The `GtkBoxLayout` will respect
  * the [property@Gtk.Widget:halign] and [property@Gtk.Widget:valign] properties
  * of each child widget.
  *
  * If you want all children to be assigned the same size, you can use the
  * [property@Gtk.BoxLayout:homogeneous] property.
  *
  * If you want to specify the amount of space placed between each child, you
  * can use the [property@Gtk.BoxLayout:spacing] property.
  */
class BoxLayout(raw: Ptr[GtkBoxLayout])
    extends LayoutManager(raw.asInstanceOf),
      Orientable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value set by gtk_box_layout_set_baseline_child().
    */
  def getBaselineChild(): Int /* None */ = gtk_box_layout_get_baseline_child(
    this.raw.asInstanceOf[Ptr[GtkBoxLayout]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value set by gtk_box_layout_set_baseline_position().
    */
  def getBaselinePosition(): GtkBaselinePosition /* None */ =
    gtk_box_layout_get_baseline_position(
      this.raw.asInstanceOf[Ptr[GtkBoxLayout]]
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the layout is set to be homogeneous.
    */
  def getHomogeneous(): Boolean /* None */ = gtk_box_layout_get_homogeneous(
    this.raw.asInstanceOf[Ptr[GtkBoxLayout]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the space that @box_layout puts between children.
    */
  def getSpacing(): UInt /* None */ = gtk_box_layout_get_spacing(
    this.raw.asInstanceOf[Ptr[GtkBoxLayout]]
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the index of the child that determines the baseline in vertical
    * layout.
    */
  def setBaselineChild(child: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_box_layout_set_baseline_child(
      this.raw.asInstanceOf[Ptr[GtkBoxLayout]],
      child
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the baseline position of a box layout.
    *
    * The baseline position affects only horizontal boxes with at least one
    * baseline aligned child. If there is more vertical space available than
    * requested, and the baseline is not allocated by the parent then the given @position
    * is used to allocate the baseline within the extra space available.
    */
  def setBaselinePosition(
      position: GtkBaselinePosition /* Some(GtkBaselinePosition) */
  ): Unit /* None */ = gtk_box_layout_set_baseline_position(
    this.raw.asInstanceOf[Ptr[GtkBoxLayout]],
    position
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the box layout will allocate the same size to all children.
    */
  def setHomogeneous(
      homogeneous: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_box_layout_set_homogeneous(
    this.raw.asInstanceOf[Ptr[GtkBoxLayout]],
    gboolean(gint((if homogeneous == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets how much spacing to put between children.
    */
  def setSpacing(
      spacing: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ = gtk_box_layout_set_spacing(
    this.raw.asInstanceOf[Ptr[GtkBoxLayout]],
    guint(spacing)
  )

end BoxLayout

object BoxLayout:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkBoxLayout`.
    */
  def apply(
      orientation: GtkOrientation /* Some(GtkOrientation) */
  ): BoxLayout = new BoxLayout(gtk_box_layout_new(orientation).asInstanceOf)
end BoxLayout
