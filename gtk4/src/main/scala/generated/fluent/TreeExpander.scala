package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint, gpointer}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.{
  Accessible,
  Buildable,
  ConstraintTarget,
  TreeListRow,
  Widget
}
import sn.gnome.gtk4.internal.GtkTreeExpander

/** `GtkTreeExpander` is a widget that provides an expander for a list.
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TreeExpander(raw: Ptr[GtkTreeExpander])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the child widget displayed by @self.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChild(): Widget /* None */ = new Widget(
    gtk_tree_expander_get_child(
      this.raw.asInstanceOf[Ptr[GtkTreeExpander]]
    ).asInstanceOf
  )

  /** Gets whether the TreeExpander should be hidden in a GtkTreeListRow.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHideExpander(): Boolean /* None */ =
    gtk_tree_expander_get_hide_expander(
      this.raw.asInstanceOf[Ptr[GtkTreeExpander]]
    ).value.!=(0)

  /** TreeExpander indents each level of depth with an additional indent.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIndentForDepth(): Boolean /* None */ =
    gtk_tree_expander_get_indent_for_depth(
      this.raw.asInstanceOf[Ptr[GtkTreeExpander]]
    ).value.!=(0)

  /** TreeExpander indents the child by the width of an expander-icon if it is
    * not expandable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIndentForIcon(): Boolean /* None */ =
    gtk_tree_expander_get_indent_for_icon(
      this.raw.asInstanceOf[Ptr[GtkTreeExpander]]
    ).value.!=(0)

  /** Forwards the item set on the `GtkTreeListRow` that @self is managing.
    *
    * This call is essentially equivalent to calling:
    *
    * ```c
    * gtk_tree_list_row_get_item (gtk_tree_expander_get_list_row (@self));
    * ```
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getItem(): Object /* None */ = new Object(
    gtk_tree_expander_get_item(
      this.raw.asInstanceOf[Ptr[GtkTreeExpander]]
    ).asInstanceOf
  )

  /** Gets the list row managed by @self.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getListRow(): TreeListRow /* None */ = new TreeListRow(
    gtk_tree_expander_get_list_row(
      this.raw.asInstanceOf[Ptr[GtkTreeExpander]]
    ).asInstanceOf
  )

  /** Sets the content widget to display.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setChild(
      child: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Unit /* None */ = gtk_tree_expander_set_child(
    this.raw.asInstanceOf[Ptr[GtkTreeExpander]],
    child
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

  /** Sets whether the expander icon should be visible in a GtkTreeListRow.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setHideExpander(
      hide_expander: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_tree_expander_set_hide_expander(
    this.raw.asInstanceOf[Ptr[GtkTreeExpander]],
    gboolean(gint((if hide_expander == true then 1 else 0)))
  )

  /** Sets if the TreeExpander should indent the child according to its depth.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setIndentForDepth(
      indent_for_depth: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_tree_expander_set_indent_for_depth(
    this.raw.asInstanceOf[Ptr[GtkTreeExpander]],
    gboolean(gint((if indent_for_depth == true then 1 else 0)))
  )

  /** Sets if the TreeExpander should indent the child by the width of an
    * expander-icon when it is not expandable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setIndentForIcon(
      indent_for_icon: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_tree_expander_set_indent_for_icon(
    this.raw.asInstanceOf[Ptr[GtkTreeExpander]],
    gboolean(gint((if indent_for_icon == true then 1 else 0)))
  )

  /** Sets the tree list row that this expander should manage.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setListRow(
      list_row: Option[TreeListRow /* Some(Ptr[GtkTreeListRow]) */ ]
  ): Unit /* None */ = gtk_tree_expander_set_list_row(
    this.raw.asInstanceOf[Ptr[GtkTreeExpander]],
    list_row
      .map[Ptr[GtkTreeListRow]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkTreeListRow]])
  )

end TreeExpander

object TreeExpander:
  /** Creates a new `GtkTreeExpander`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(): TreeExpander = new TreeExpander(
    gtk_tree_expander_new().asInstanceOf
  )
end TreeExpander
