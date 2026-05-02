package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.ListModel
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.guint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ColumnViewColumn
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.ListItemFactory
import sn.gnome.gtk4.fluent.Scrollable
import sn.gnome.gtk4.fluent.SelectionModel
import sn.gnome.gtk4.fluent.Sorter
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkColumnView
import sn.gnome.gtk4.internal.GtkListScrollFlags
import sn.gnome.gtk4.internal.GtkListTabBehavior
import sn.gnome.gtk4.internal.GtkScrollInfo
import sn.gnome.gtk4.internal.GtkSortType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkColumnView` presents a large dynamic list of items using multiple
  * columns with headers.
  *
  * `GtkColumnView` uses the factories of its columns to generate a cell widget
  * for each column, for each visible item and displays them together as the row
  * for this item.
  *
  * The [property@Gtk.ColumnView:show-row-separators] and
  * [property@Gtk.ColumnView:show-column-separators] properties offer a simple
  * way to display separators between the rows or columns.
  *
  * `GtkColumnView` allows the user to select items according to the selection
  * characteristics of the model. For models that allow multiple selected items,
  * it is possible to turn on *rubberband selection*, using
  * [property@Gtk.ColumnView:enable-rubberband].
  *
  * The column view supports sorting that can be customized by the user by
  * clicking on column headers. To set this up, the `GtkSorter` returned by
  * [method@Gtk.ColumnView.get_sorter] must be attached to a sort model for the
  * data that the view is showing, and the columns must have sorters attached to
  * them by calling [method@Gtk.ColumnViewColumn.set_sorter]. The initial sort
  * order can be set with [method@Gtk.ColumnView.sort_by_column].
  *
  * The column view also supports interactive resizing and reordering of
  * columns, via Drag-and-Drop of the column headers. This can be enabled or
  * disabled with the [property@Gtk.ColumnView:reorderable] and
  * [property@Gtk.ColumnViewColumn:resizable] properties.
  *
  * To learn more about the list widget framework, see the
  * [overview](section-list-widget.html).
  *
  * # CSS nodes
  *
  * ```
  * columnview[.column-separators][.rich-list][.navigation-sidebar][.data-table]
  * ├── header
  * │   ├── <column header>
  * ┊   ┊
  * │   ╰── <column header>
  * │
  * ├── listview
  * │
  * ┊
  * ╰── [rubberband]
  * ```
  *
  * `GtkColumnView` uses a single CSS node named columnview. It may carry the
  * .column-separators style class, when
  * [property@Gtk.ColumnView:show-column-separators] property is set. Header
  * widgets appear below a node with name header. The rows are contained in a
  * `GtkListView` widget, so there is a listview node with the same structure as
  * for a standalone `GtkListView` widget. If
  * [property@Gtk.ColumnView:show-row-separators] is set, it will be passed on
  * to the list view, causing its CSS node to carry the .separators style class.
  * For rubberband selection, a node with name rubberband is used.
  *
  * The main columnview node may also carry style classes to select the style of
  * [list presentation](section-list-widget.html#list-styles): .rich-list,
  * .navigation-sidebar or .data-table.
  *
  * # Accessibility
  *
  * `GtkColumnView` uses the %GTK_ACCESSIBLE_ROLE_TREE_GRID role, header title
  * widgets are using the %GTK_ACCESSIBLE_ROLE_COLUMN_HEADER role. The row
  * widgets are using the %GTK_ACCESSIBLE_ROLE_ROW role, and individual cells
  * are using the %GTK_ACCESSIBLE_ROLE_GRID_CELL role
  */
class ColumnView(raw: Ptr[GtkColumnView])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Scrollable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Appends the @column to the end of the columns in @self.
    */
  def appendColumn(
      column: ColumnViewColumn /* Some(Ptr[GtkColumnViewColumn]) */
  ): Unit /* None */ = gtk_column_view_append_column(
    this.raw.asInstanceOf,
    column.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the list of columns in this column view.
    *
    * This list is constant over the lifetime of @self and can be used to
    * monitor changes to the columns of @self by connecting to the
    * ::items-changed signal.
    */
  def getColumns(): ListModel /* None */ = new ListModel.Abstract(
    gtk_column_view_get_columns(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether rows can be selected by dragging with the mouse.
    */
  def getEnableRubberband(): Boolean /* None */ =
    gtk_column_view_get_enable_rubberband(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the factory that's currently used to populate section headers.
    */
  def getHeaderFactory(): ListItemFactory /* None */ = new ListItemFactory(
    gtk_column_view_get_header_factory(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the model that's currently used to read the items displayed.
    */
  def getModel(): SelectionModel /* None */ = new SelectionModel.Abstract(
    gtk_column_view_get_model(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether columns are reorderable.
    */
  def getReorderable(): Boolean /* None */ =
    gtk_column_view_get_reorderable(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the factory set via [method@Gtk.ColumnView.set_row_factory].
    */
  def getRowFactory(): ListItemFactory /* None */ = new ListItemFactory(
    gtk_column_view_get_row_factory(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the list should show separators between columns.
    */
  def getShowColumnSeparators(): Boolean /* None */ =
    gtk_column_view_get_show_column_separators(this.raw.asInstanceOf).value
      .!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the list should show separators between rows.
    */
  def getShowRowSeparators(): Boolean /* None */ =
    gtk_column_view_get_show_row_separators(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether rows will be activated on single click and selected on
    * hover.
    */
  def getSingleClickActivate(): Boolean /* None */ =
    gtk_column_view_get_single_click_activate(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns a special sorter that reflects the users sorting choices in the
    * column view.
    *
    * To allow users to customizable sorting by clicking on column headers, this
    * sorter needs to be set on the sort model underneath the model that is
    * displayed by the view.
    *
    * See [method@Gtk.ColumnViewColumn.set_sorter] for setting up per-column
    * sorting.
    *
    * Here is an example:
    * ```c
    * gtk_column_view_column_set_sorter (column, sorter);
    * gtk_column_view_append_column (view, column);
    * sorter = g_object_ref (gtk_column_view_get_sorter (view)));
    * model = gtk_sort_list_model_new (store, sorter);
    * selection = gtk_no_selection_new (model);
    * gtk_column_view_set_model (view, selection);
    * ```
    */
  def getSorter(): Sorter /* None */ = new Sorter(
    gtk_column_view_get_sorter(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the behavior set for the <kbd>Tab</kbd> key.
    */
  def getTabBehavior(): GtkListTabBehavior /* None */ =
    gtk_column_view_get_tab_behavior(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Inserts a column at the given position in the columns of @self.
    *
    * If @column is already a column of @self, it will be repositioned.
    */
  def insertColumn(
      position: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      column: ColumnViewColumn /* Some(Ptr[GtkColumnViewColumn]) */
  ): Unit /* None */ = gtk_column_view_insert_column(
    this.raw.asInstanceOf,
    guint(position),
    column.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes the @column from the list of columns of @self.
    */
  def removeColumn(
      column: ColumnViewColumn /* Some(Ptr[GtkColumnViewColumn]) */
  ): Unit /* None */ = gtk_column_view_remove_column(
    this.raw.asInstanceOf,
    column.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Scroll to the row at the given position - or cell if a column is given -
    * and performs the actions specified in @flags.
    *
    * This function works no matter if the listview is shown or focused. If it
    * isn't, then the changes will take effect once that happens.
    */
  def scrollTo(
      pos: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      column: Option[ColumnViewColumn /* Some(Ptr[GtkColumnViewColumn]) */ ],
      flags: GtkListScrollFlags /* Some(GtkListScrollFlags) */,
      scroll: Option[Ptr[GtkScrollInfo] /* Some(Ptr[GtkScrollInfo]) */ ]
  ): Unit /* None */ = gtk_column_view_scroll_to(
    this.raw.asInstanceOf,
    guint(pos),
    column
      .map[Ptr[GtkColumnViewColumn]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkColumnViewColumn]]),
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
  ): Unit /* None */ = gtk_column_view_set_enable_rubberband(
    this.raw.asInstanceOf,
    gboolean(gint((if enable_rubberband == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the `GtkListItemFactory` to use for populating the
    * [class@Gtk.ListHeader] objects used in section headers.
    *
    * If this factory is set to %NULL, the list will not show section headers.
    */
  def setHeaderFactory(
      factory: Option[ListItemFactory /* Some(Ptr[GtkListItemFactory]) */ ]
  ): Unit /* None */ = gtk_column_view_set_header_factory(
    this.raw.asInstanceOf,
    factory
      .map[Ptr[GtkListItemFactory]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkListItemFactory]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the model to use.
    *
    * This must be a [iface@Gtk.SelectionModel].
    */
  def setModel(
      model: Option[SelectionModel /* Some(Ptr[GtkSelectionModel]) */ ]
  ): Unit /* None */ = gtk_column_view_set_model(
    this.raw.asInstanceOf,
    model
      .map[Ptr[GtkSelectionModel]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkSelectionModel]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether columns should be reorderable by dragging.
    */
  def setReorderable(
      reorderable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_column_view_set_reorderable(
    this.raw.asInstanceOf,
    gboolean(gint((if reorderable == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the factory used for configuring rows. The factory must be for
    * configuring [class@Gtk.ColumnViewRow] objects.
    *
    * If this factory is not set - which is the default - then the defaults will
    * be used.
    *
    * This factory is not used to set the widgets displayed in the individual
    * cells. For that see [method@GtkColumnViewColumn.set_factory] and
    * [class@GtkColumnViewCell].
    */
  def setRowFactory(
      factory: Option[ListItemFactory /* Some(Ptr[GtkListItemFactory]) */ ]
  ): Unit /* None */ = gtk_column_view_set_row_factory(
    this.raw.asInstanceOf,
    factory
      .map[Ptr[GtkListItemFactory]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkListItemFactory]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the list should show separators between columns.
    */
  def setShowColumnSeparators(
      show_column_separators: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_column_view_set_show_column_separators(
    this.raw.asInstanceOf,
    gboolean(gint((if show_column_separators == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the list should show separators between rows.
    */
  def setShowRowSeparators(
      show_row_separators: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_column_view_set_show_row_separators(
    this.raw.asInstanceOf,
    gboolean(gint((if show_row_separators == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether rows should be activated on single click and selected on
    * hover.
    */
  def setSingleClickActivate(
      single_click_activate: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_column_view_set_single_click_activate(
    this.raw.asInstanceOf,
    gboolean(gint((if single_click_activate == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the behavior of the <kbd>Tab</kbd> and
    * <kbd>Shift</kbd>+<kbd>Tab</kbd> keys.
    */
  def setTabBehavior(
      tab_behavior: GtkListTabBehavior /* Some(GtkListTabBehavior) */
  ): Unit /* None */ =
    gtk_column_view_set_tab_behavior(this.raw.asInstanceOf, tab_behavior)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the sorting of the view.
    *
    * This function should be used to set up the initial sorting. At runtime,
    * users can change the sorting of a column view by clicking on the list
    * headers.
    *
    * This call only has an effect if the sorter returned by
    * [method@Gtk.ColumnView.get_sorter] is set on a sort model, and
    * [method@Gtk.ColumnViewColumn.set_sorter] has been called on @column to
    * associate a sorter with the column.
    *
    * If @column is %NULL, the view will be unsorted.
    */
  def sortByColumn(
      column: Option[ColumnViewColumn /* Some(Ptr[GtkColumnViewColumn]) */ ],
      direction: GtkSortType /* Some(GtkSortType) */
  ): Unit /* None */ = gtk_column_view_sort_by_column(
    this.raw.asInstanceOf,
    column
      .map[Ptr[GtkColumnViewColumn]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkColumnViewColumn]]),
    direction
  )

end ColumnView

object ColumnView:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkColumnView`.
    *
    * You most likely want to call [method@Gtk.ColumnView.append_column] to add
    * columns next.
    */
  def apply(
      model: Option[SelectionModel /* Some(Ptr[GtkSelectionModel]) */ ]
  ): ColumnView = new ColumnView(
    gtk_column_view_new(
      model
        .map[Ptr[GtkSelectionModel]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkSelectionModel]])
    ).asInstanceOf
  )
end ColumnView
