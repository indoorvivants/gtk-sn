package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.TreeListRow
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkTreeExpander

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkTreeExpander` is a widget that provides an expander for a list.
  *
  * It is typically placed as a bottommost child into a `GtkListView` to allow
  * users to expand and collapse children in a list with a
  * [class@Gtk.TreeListModel]. `GtkTreeExpander` provides the common UI
  * elements, gestures and keybindings for this purpose.
  *
  * On top of this, the "listitem.expand", "listitem.collapse" and
  * "listitem.toggle-expand" actions are provided to allow adding custom UI for
  * managing expanded state.
  *
  * It is important to mention that you want to set the
  * [property@Gtk.ListItem:focusable] property to FALSE when using this widget,
  * as you want the keyboard focus to be in the treexpander, and not inside the
  * list to make use of the keybindings.
  *
  * The `GtkTreeListModel` must be set to not be passthrough. Then it will
  * provide [class@Gtk.TreeListRow] items which can be set via
  * [method@Gtk.TreeExpander.set_list_row] on the expander. The expander will
  * then watch that row item automatically. [method@Gtk.TreeExpander.set_child]
  * sets the widget that displays the actual row contents.
  *
  * `GtkTreeExpander` can be modified with properties such as
  * [property@Gtk.TreeExpander:indent-for-icon],
  * [property@Gtk.TreeExpander:indent-for-depth], and
  * [property@Gtk.TreeExpander:hide-expander] to achieve a different appearance.
  * This can even be done to influence individual rows, for example by binding
  * the [property@Gtk.TreeExpander:hide-expander] property to the item count of
  * the model of the treelistrow, to hide the expander for rows without
  * children, even if the row is expandable.
  *
  * ## CSS nodes
  *
  * ```
  * treeexpander
  * ├── [indent]*
  * ├── [expander]
  * ╰── <child>
  * ```
  *
  * `GtkTreeExpander` has zero or one CSS nodes with the name "expander" that
  * should display the expander icon. The node will be `:checked` when it is
  * expanded. If the node is not expandable, an "indent" node will be displayed
  * instead.
  *
  * For every level of depth, another "indent" node is prepended.
  *
  * ## Accessibility
  *
  * Until GTK 4.10, `GtkTreeExpander` used the `GTK_ACCESSIBLE_ROLE_GROUP` role.
  *
  * Since GTK 4.12, `GtkTreeExpander` uses the `GTK_ACCESSIBLE_ROLE_BUTTON`
  * role. Toggling it will change the `GTK_ACCESSIBLE_STATE_EXPANDED` state.
  */
class TreeExpander(raw: Ptr[GtkTreeExpander])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the child widget displayed by @self.
    */
  def getChild(): Widget = new Widget(
    gtk_tree_expander_get_child(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether the TreeExpander should be hidden in a GtkTreeListRow.
    */
  def getHideExpander(): Boolean =
    gtk_tree_expander_get_hide_expander(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * TreeExpander indents each level of depth with an additional indent.
    */
  def getIndentForDepth(): Boolean =
    gtk_tree_expander_get_indent_for_depth(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * TreeExpander indents the child by the width of an expander-icon if it is
    * not expandable.
    */
  def getIndentForIcon(): Boolean =
    gtk_tree_expander_get_indent_for_icon(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Forwards the item set on the `GtkTreeListRow` that @self is managing.
    *
    * This call is essentially equivalent to calling:
    *
    * ```c
    * gtk_tree_list_row_get_item (gtk_tree_expander_get_list_row (@self));
    * ```
    */
  def getItem(): Object = new Object(
    gtk_tree_expander_get_item(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the list row managed by @self.
    */
  def getListRow(): TreeListRow = new TreeListRow(
    gtk_tree_expander_get_list_row(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the content widget to display.
    */
  def setChild(child: Widget): Unit = gtk_tree_expander_set_child(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the expander icon should be visible in a GtkTreeListRow.
    */
  def setHideExpander(hide_expander: Boolean): Unit =
    gtk_tree_expander_set_hide_expander(
      this.raw.asInstanceOf,
      gboolean(gint((if hide_expander == true then 1 else 0)))
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets if the TreeExpander should indent the child according to its depth.
    */
  def setIndentForDepth(indent_for_depth: Boolean): Unit =
    gtk_tree_expander_set_indent_for_depth(
      this.raw.asInstanceOf,
      gboolean(gint((if indent_for_depth == true then 1 else 0)))
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets if the TreeExpander should indent the child by the width of an
    * expander-icon when it is not expandable.
    */
  def setIndentForIcon(indent_for_icon: Boolean): Unit =
    gtk_tree_expander_set_indent_for_icon(
      this.raw.asInstanceOf,
      gboolean(gint((if indent_for_icon == true then 1 else 0)))
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the tree list row that this expander should manage.
    */
  def setListRow(list_row: TreeListRow): Unit = gtk_tree_expander_set_list_row(
    this.raw.asInstanceOf,
    list_row.getUnsafeRawPointer().asInstanceOf
  )

end TreeExpander

object TreeExpander:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkTreeExpander`
    */
  def apply(): TreeExpander = new TreeExpander(
    gtk_tree_expander_new().asInstanceOf
  )
end TreeExpander
