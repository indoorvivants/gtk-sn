package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.guint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.ListBase
import sn.gnome.gtk4.fluent.ListItemFactory
import sn.gnome.gtk4.fluent.Orientable
import sn.gnome.gtk4.fluent.Scrollable
import sn.gnome.gtk4.fluent.SelectionModel
import sn.gnome.gtk4.internal.GtkGridView
import sn.gnome.gtk4.internal.GtkListScrollFlags
import sn.gnome.gtk4.internal.GtkListTabBehavior
import sn.gnome.gtk4.internal.GtkScrollInfo

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkGridView` presents a large dynamic grid of items.
  *
  * `GtkGridView` uses its factory to generate one child widget for each visible
  * item and shows them in a grid. The orientation of the grid view determines
  * if the grid reflows vertically or horizontally.
  *
  * `GtkGridView` allows the user to select items according to the selection
  * characteristics of the model. For models that allow multiple selected items,
  * it is possible to turn on _rubberband selection_, using
  * [property@Gtk.GridView:enable-rubberband].
  *
  * To learn more about the list widget framework, see the
  * [overview](section-list-widget.html).
  *
  * # CSS nodes
  *
  * ```
  * gridview
  * ├── child[.activatable]
  * │
  * ├── child[.activatable]
  * │
  * ┊
  * ╰── [rubberband]
  * ```
  *
  * `GtkGridView` uses a single CSS node with name `gridview`. Each child uses a
  * single CSS node with name `child`. If the
  * [property@Gtk.ListItem:activatable] property is set, the corresponding row
  * will have the `.activatable` style class. For rubberband selection, a
  * subnode with name `rubberband` is used.
  *
  * # Accessibility
  *
  * `GtkGridView` uses the %GTK_ACCESSIBLE_ROLE_GRID role, and the items use the
  * %GTK_ACCESSIBLE_ROLE_GRID_CELL role.
  */
class GridView(raw: Ptr[GtkGridView])
    extends ListBase(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Orientable,
      Scrollable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether rows can be selected by dragging with the mouse.
    */
  def getEnableRubberband(): Boolean /* None */ =
    gtk_grid_view_get_enable_rubberband(
      this.raw.asInstanceOf[Ptr[GtkGridView]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the factory that's currently used to populate list items.
    */
  def getFactory(): ListItemFactory /* None */ = new ListItemFactory(
    gtk_grid_view_get_factory(
      this.raw.asInstanceOf[Ptr[GtkGridView]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the maximum number of columns that the grid will use.
    */
  def getMaxColumns(): UInt /* None */ = gtk_grid_view_get_max_columns(
    this.raw.asInstanceOf[Ptr[GtkGridView]]
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the minimum number of columns that the grid will use.
    */
  def getMinColumns(): UInt /* None */ = gtk_grid_view_get_min_columns(
    this.raw.asInstanceOf[Ptr[GtkGridView]]
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the model that's currently used to read the items displayed.
    */
  def getModel(): SelectionModel /* None */ = new SelectionModel.Abstract(
    gtk_grid_view_get_model(
      this.raw.asInstanceOf[Ptr[GtkGridView]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether items will be activated on single click and selected on
    * hover.
    */
  def getSingleClickActivate(): Boolean /* None */ =
    gtk_grid_view_get_single_click_activate(
      this.raw.asInstanceOf[Ptr[GtkGridView]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the behavior set for the <kbd>Tab</kbd> key.
    */
  def getTabBehavior(): GtkListTabBehavior /* None */ =
    gtk_grid_view_get_tab_behavior(this.raw.asInstanceOf[Ptr[GtkGridView]])

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Scrolls to the item at the given position and performs the actions
    * specified in @flags.
    *
    * This function works no matter if the gridview is shown or focused. If it
    * isn't, then the changes will take effect once that happens.
    */
  def scrollTo(
      pos: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      flags: GtkListScrollFlags /* Some(GtkListScrollFlags) */,
      scroll: Option[Ptr[GtkScrollInfo] /* Some(Ptr[GtkScrollInfo]) */ ]
  ): Unit /* None */ = gtk_grid_view_scroll_to(
    this.raw.asInstanceOf[Ptr[GtkGridView]],
    guint(pos),
    flags,
    scroll
      .map[Ptr[GtkScrollInfo]](o => o)
      .getOrElse(null.asInstanceOf[Ptr[GtkScrollInfo]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether selections can be changed by dragging with the mouse.
    */
  def setEnableRubberband(
      enable_rubberband: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_grid_view_set_enable_rubberband(
    this.raw.asInstanceOf[Ptr[GtkGridView]],
    gboolean(gint((if enable_rubberband == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the `GtkListItemFactory` to use for populating list items.
    */
  def setFactory(
      factory: Option[ListItemFactory /* Some(Ptr[GtkListItemFactory]) */ ]
  ): Unit /* None */ = gtk_grid_view_set_factory(
    this.raw.asInstanceOf[Ptr[GtkGridView]],
    factory
      .map[Ptr[GtkListItemFactory]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkListItemFactory]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the maximum number of columns to use.
    *
    * This number must be at least 1.
    *
    * If @max_columns is smaller than the minimum set via
    * [method@Gtk.GridView.set_min_columns], that value is used instead.
    */
  def setMaxColumns(
      max_columns: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ = gtk_grid_view_set_max_columns(
    this.raw.asInstanceOf[Ptr[GtkGridView]],
    guint(max_columns)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the minimum number of columns to use.
    *
    * This number must be at least 1.
    *
    * If @min_columns is smaller than the minimum set via
    * [method@Gtk.GridView.set_max_columns], that value is ignored.
    */
  def setMinColumns(
      min_columns: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ = gtk_grid_view_set_min_columns(
    this.raw.asInstanceOf[Ptr[GtkGridView]],
    guint(min_columns)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the model to use.
    *
    * This must be a [iface@Gtk.SelectionModel].
    */
  def setModel(
      model: Option[SelectionModel /* Some(Ptr[GtkSelectionModel]) */ ]
  ): Unit /* None */ = gtk_grid_view_set_model(
    this.raw.asInstanceOf[Ptr[GtkGridView]],
    model
      .map[Ptr[GtkSelectionModel]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkSelectionModel]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether items should be activated on single click and selected on
    * hover.
    */
  def setSingleClickActivate(
      single_click_activate: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_grid_view_set_single_click_activate(
    this.raw.asInstanceOf[Ptr[GtkGridView]],
    gboolean(gint((if single_click_activate == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the behavior of the <kbd>Tab</kbd> and
    * <kbd>Shift</kbd>+<kbd>Tab</kbd> keys.
    */
  def setTabBehavior(
      tab_behavior: GtkListTabBehavior /* Some(GtkListTabBehavior) */
  ): Unit /* None */ = gtk_grid_view_set_tab_behavior(
    this.raw.asInstanceOf[Ptr[GtkGridView]],
    tab_behavior
  )

end GridView

object GridView:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkGridView` that uses the given @factory for mapping items
    * to widgets.
    *
    * The function takes ownership of the arguments, so you can write code like
    * ```c
    * grid_view = gtk_grid_view_new (create_model (),
    *   gtk_builder_list_item_factory_new_from_resource ("/resource.ui"));
    * ```
    */
  def apply(
      model: Option[SelectionModel /* Some(Ptr[GtkSelectionModel]) */ ],
      factory: Option[ListItemFactory /* Some(Ptr[GtkListItemFactory]) */ ]
  ): GridView = new GridView(
    gtk_grid_view_new(
      model
        .map[Ptr[GtkSelectionModel]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkSelectionModel]]),
      factory
        .map[Ptr[GtkListItemFactory]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkListItemFactory]])
    ).asInstanceOf
  )
end GridView
