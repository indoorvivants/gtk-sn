package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.AccessibleRange
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Orientable
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkOrientation
import sn.gnome.gtk4.internal.GtkPaned

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A widget with two panes, arranged either horizontally or vertically.
  *
  * ![An example GtkPaned](panes.png)
  *
  * The division between the two panes is adjustable by the user by dragging a
  * handle.
  *
  * Child widgets are added to the panes of the widget with
  * [method@Gtk.Paned.set_start_child] and [method@Gtk.Paned.set_end_child]. The
  * division between the two children is set by default from the size requests
  * of the children, but it can be adjusted by the user.
  *
  * A paned widget draws a separator between the two child widgets and a small
  * handle that the user can drag to adjust the division. It does not draw any
  * relief around the children or around the separator. (The space in which the
  * separator is called the gutter.) Often, it is useful to put each child
  * inside a [class@Gtk.Frame] so that the gutter appears as a ridge. No
  * separator is drawn if one of the children is missing.
  *
  * Each child has two options that can be set, "resize" and "shrink". If
  * "resize" is true then, when the `GtkPaned` is resized, that child will
  * expand or shrink along with the paned widget. If "shrink" is true, then that
  * child can be made smaller than its requisition by the user. Setting "shrink"
  * to false allows the application to set a minimum size. If "resize" is false
  * for both children, then this is treated as if "resize" is true for both
  * children.
  *
  * The application can set the position of the slider as if it were set by the
  * user, by calling [method@Gtk.Paned.set_position].
  *
  * # CSS nodes
  *
  * ```
  * paned
  * ├── <child>
  * ├── separator[.wide]
  * ╰── <child>
  * ```
  *
  * `GtkPaned` has a main CSS node with name paned, and a subnode for the
  * separator with name separator. The subnode gets a .wide style class when the
  * paned is supposed to be wide.
  *
  * In horizontal orientation, the nodes are arranged based on the text
  * direction, so in left-to-right mode, :first-child will select the leftmost
  * child, while it will select the rightmost child in RTL layouts.
  *
  * ## Creating a paned widget with minimum sizes.
  *
  * ```c
  * GtkWidget *hpaned = gtk_paned_new (GTK_ORIENTATION_HORIZONTAL);
  * GtkWidget *frame1 = gtk_frame_new (NULL);
  * GtkWidget *frame2 = gtk_frame_new (NULL);
  *
  * gtk_widget_set_size_request (hpaned, 200, -1);
  *
  * gtk_paned_set_start_child (GTK_PANED (hpaned), frame1);
  * gtk_paned_set_resize_start_child (GTK_PANED (hpaned), TRUE);
  * gtk_paned_set_shrink_start_child (GTK_PANED (hpaned), FALSE);
  * gtk_widget_set_size_request (frame1, 50, -1);
  *
  * gtk_paned_set_end_child (GTK_PANED (hpaned), frame2);
  * gtk_paned_set_resize_end_child (GTK_PANED (hpaned), FALSE);
  * gtk_paned_set_shrink_end_child (GTK_PANED (hpaned), FALSE);
  * gtk_widget_set_size_request (frame2, 50, -1);
  * ```
  */
class Paned(raw: Ptr[GtkPaned])
    extends Widget(raw.asInstanceOf),
      Accessible,
      AccessibleRange,
      Buildable,
      ConstraintTarget,
      Orientable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the end child of the given `GtkPaned`.
    */
  def getEndChild(): Widget /* None */ = new Widget(
    gtk_paned_get_end_child(this.raw.asInstanceOf[Ptr[GtkPaned]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Obtains the position of the divider between the two panes.
    */
  def getPosition(): Int /* None */ = gtk_paned_get_position(
    this.raw.asInstanceOf[Ptr[GtkPaned]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the [property@Gtk.Paned:end-child] can be resized.
    */
  def getResizeEndChild(): Boolean /* None */ = gtk_paned_get_resize_end_child(
    this.raw.asInstanceOf[Ptr[GtkPaned]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the [property@Gtk.Paned:start-child] can be resized.
    */
  def getResizeStartChild(): Boolean /* None */ =
    gtk_paned_get_resize_start_child(this.raw.asInstanceOf[Ptr[GtkPaned]]).value
      .!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the [property@Gtk.Paned:end-child] can shrink.
    */
  def getShrinkEndChild(): Boolean /* None */ = gtk_paned_get_shrink_end_child(
    this.raw.asInstanceOf[Ptr[GtkPaned]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the [property@Gtk.Paned:start-child] can shrink.
    */
  def getShrinkStartChild(): Boolean /* None */ =
    gtk_paned_get_shrink_start_child(this.raw.asInstanceOf[Ptr[GtkPaned]]).value
      .!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the start child of the given `GtkPaned`.
    */
  def getStartChild(): Widget /* None */ = new Widget(
    gtk_paned_get_start_child(this.raw.asInstanceOf[Ptr[GtkPaned]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether the separator should be wide.
    */
  def getWideHandle(): Boolean /* None */ =
    gtk_paned_get_wide_handle(this.raw.asInstanceOf[Ptr[GtkPaned]]).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the end child of @paned to @child.
    *
    * If @child is `NULL`, the existing child will be removed.
    */
  def setEndChild(
      child: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Unit /* None */ = gtk_paned_set_end_child(
    this.raw.asInstanceOf[Ptr[GtkPaned]],
    child
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the position of the divider between the two panes.
    */
  def setPosition(position: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_paned_set_position(this.raw.asInstanceOf[Ptr[GtkPaned]], position)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the [property@Gtk.Paned:end-child] can be resized.
    */
  def setResizeEndChild(
      resize: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_paned_set_resize_end_child(
    this.raw.asInstanceOf[Ptr[GtkPaned]],
    gboolean(gint((if resize == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the [property@Gtk.Paned:start-child] can be resized.
    */
  def setResizeStartChild(
      resize: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_paned_set_resize_start_child(
    this.raw.asInstanceOf[Ptr[GtkPaned]],
    gboolean(gint((if resize == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the [property@Gtk.Paned:end-child] can shrink.
    */
  def setShrinkEndChild(
      resize: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_paned_set_shrink_end_child(
    this.raw.asInstanceOf[Ptr[GtkPaned]],
    gboolean(gint((if resize == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the [property@Gtk.Paned:start-child] can shrink.
    */
  def setShrinkStartChild(
      resize: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_paned_set_shrink_start_child(
    this.raw.asInstanceOf[Ptr[GtkPaned]],
    gboolean(gint((if resize == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the start child of @paned to @child.
    *
    * If @child is `NULL`, the existing child will be removed.
    */
  def setStartChild(
      child: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Unit /* None */ = gtk_paned_set_start_child(
    this.raw.asInstanceOf[Ptr[GtkPaned]],
    child
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the separator should be wide.
    */
  def setWideHandle(
      wide: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_paned_set_wide_handle(
    this.raw.asInstanceOf[Ptr[GtkPaned]],
    gboolean(gint((if wide == true then 1 else 0)))
  )

end Paned

object Paned:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkPaned` widget.
    */
  def apply(orientation: GtkOrientation /* Some(GtkOrientation) */ ): Paned =
    new Paned(gtk_paned_new(orientation).asInstanceOf)
end Paned
