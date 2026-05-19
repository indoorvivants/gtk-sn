package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.ListModel
import sn.gnome.glib.internal.{gboolean, gint, guint}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{
  Accessible,
  Buildable,
  ColumnViewColumn,
  ConstraintTarget,
  ListItemFactory,
  ListTabBehavior,
  Scrollable,
  SelectionModel,
  SortType,
  Sorter,
  Widget
}
import sn.gnome.gtk4.internal.GtkColumnView

/** `GtkColumnView` presents a large dynamic list of items using multiple
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ColumnView private[gnome] (raw: Ptr[GtkColumnView])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Scrollable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Appends the @column to the end of the columns in @self.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def appendColumn(
      column: sn.gnome.gtk4.ColumnViewColumn /* Some(Ptr[GtkColumnViewColumn]) */
  )(using Runtime): Unit /* None */ =
    gtk_column_view_append_column(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnView]],
      column.getUnsafeRawPointer().asInstanceOf
    )
  end appendColumn

  /** Gets the list of columns in this column view.
    *
    * This list is constant over the lifetime of @self and can be used to
    * monitor changes to the columns of @self by connecting to the
    * ::items-changed signal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getColumns(): ListModel /* None */ =
    new ListModel.Abstract(
      gtk_column_view_get_columns(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnView]]
      ).asInstanceOf
    )
  end getColumns

  /** Returns whether rows can be selected by dragging with the mouse.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getEnableRubberband(): Boolean /* None */ =
    gtk_column_view_get_enable_rubberband(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnView]]
    ).value.!=(0)
  end getEnableRubberband

  /** Gets the factory that's currently used to populate section headers.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHeaderFactory()(using
      Runtime
  ): sn.gnome.gtk4.ListItemFactory /* None */ =
    sn.gnome.gtk4.ListItemFactory.applyUnsafe(
      gtk_column_view_get_header_factory(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnView]]
      ).asInstanceOf
    )
  end getHeaderFactory

  /** Gets the model that's currently used to read the items displayed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getModel(): SelectionModel /* None */ =
    new SelectionModel.Abstract(
      gtk_column_view_get_model(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnView]]
      ).asInstanceOf
    )
  end getModel

  /** Returns whether columns are reorderable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getReorderable(): Boolean /* None */ =
    gtk_column_view_get_reorderable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnView]]
    ).value.!=(0)
  end getReorderable

  /** Gets the factory set via [method@Gtk.ColumnView.set_row_factory].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRowFactory()(using Runtime): sn.gnome.gtk4.ListItemFactory /* None */ =
    sn.gnome.gtk4.ListItemFactory.applyUnsafe(
      gtk_column_view_get_row_factory(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnView]]
      ).asInstanceOf
    )
  end getRowFactory

  /** Returns whether the list should show separators between columns.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getShowColumnSeparators(): Boolean /* None */ =
    gtk_column_view_get_show_column_separators(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnView]]
    ).value.!=(0)
  end getShowColumnSeparators

  /** Returns whether the list should show separators between rows.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getShowRowSeparators(): Boolean /* None */ =
    gtk_column_view_get_show_row_separators(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnView]]
    ).value.!=(0)
  end getShowRowSeparators

  /** Returns whether rows will be activated on single click and selected on
    * hover.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSingleClickActivate(): Boolean /* None */ =
    gtk_column_view_get_single_click_activate(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnView]]
    ).value.!=(0)
  end getSingleClickActivate

  /** Returns a special sorter that reflects the users sorting choices in the
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSorter()(using Runtime): sn.gnome.gtk4.Sorter /* None */ =
    sn.gnome.gtk4.Sorter.applyUnsafe(
      gtk_column_view_get_sorter(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnView]]
      ).asInstanceOf
    )
  end getSorter

  /** Gets the behavior set for the <kbd>Tab</kbd> key.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTabBehavior(): ListTabBehavior /* None */ =
    ListTabBehavior.fromRaw(
      gtk_column_view_get_tab_behavior(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnView]]
      )
    )
  end getTabBehavior

  /** Inserts a column at the given position in the columns of @self.
    *
    * If @column is already a column of @self, it will be repositioned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insertColumn(
      position: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      column: sn.gnome.gtk4.ColumnViewColumn /* Some(Ptr[GtkColumnViewColumn]) */
  )(using Runtime): Unit /* None */ =
    gtk_column_view_insert_column(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnView]],
      guint(position),
      column.getUnsafeRawPointer().asInstanceOf
    )
  end insertColumn

  /** Removes the @column from the list of columns of @self.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeColumn(
      column: sn.gnome.gtk4.ColumnViewColumn /* Some(Ptr[GtkColumnViewColumn]) */
  )(using Runtime): Unit /* None */ =
    gtk_column_view_remove_column(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnView]],
      column.getUnsafeRawPointer().asInstanceOf
    )
  end removeColumn

  /** Scroll to the row at the given position - or cell if a column is given -
    * and performs the actions specified in @flags.
    *
    * This function works no matter if the listview is shown or focused. If it
    * isn't, then the changes will take effect once that happens.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method scroll_to/<method parameters>/scroll]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(ScrollInfo), @type -> DataRecord(GtkScrollInfo*)))"
  )
  private def scrollTo__ = ???

  /** Sets whether selections can be changed by dragging with the mouse.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setEnableRubberband(
      enable_rubberband: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_column_view_set_enable_rubberband(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnView]],
      gboolean(gint((if enable_rubberband == true then 1 else 0)))
    )
  end setEnableRubberband

  /** Sets the `GtkListItemFactory` to use for populating the
    * [class@Gtk.ListHeader] objects used in section headers.
    *
    * If this factory is set to %NULL, the list will not show section headers.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setHeaderFactory(
      factory: Option[
        sn.gnome.gtk4.ListItemFactory /* Some(Ptr[GtkListItemFactory]) */
      ]
  )(using Runtime): Unit /* None */ =
    gtk_column_view_set_header_factory(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnView]],
      factory
        .map[Ptr[GtkListItemFactory]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkListItemFactory]])
    )
  end setHeaderFactory

  /** Sets the model to use.
    *
    * This must be a [iface@Gtk.SelectionModel].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setModel(
      model: Option[SelectionModel /* Some(Ptr[GtkSelectionModel]) */ ]
  ): Unit /* None */ =
    gtk_column_view_set_model(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnView]],
      model
        .map[Ptr[GtkSelectionModel]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkSelectionModel]])
    )
  end setModel

  /** Sets whether columns should be reorderable by dragging.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setReorderable(
      reorderable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_column_view_set_reorderable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnView]],
      gboolean(gint((if reorderable == true then 1 else 0)))
    )
  end setReorderable

  /** Sets the factory used for configuring rows. The factory must be for
    * configuring [class@Gtk.ColumnViewRow] objects.
    *
    * If this factory is not set - which is the default - then the defaults will
    * be used.
    *
    * This factory is not used to set the widgets displayed in the individual
    * cells. For that see [method@GtkColumnViewColumn.set_factory] and
    * [class@GtkColumnViewCell].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setRowFactory(
      factory: Option[
        sn.gnome.gtk4.ListItemFactory /* Some(Ptr[GtkListItemFactory]) */
      ]
  )(using Runtime): Unit /* None */ =
    gtk_column_view_set_row_factory(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnView]],
      factory
        .map[Ptr[GtkListItemFactory]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkListItemFactory]])
    )
  end setRowFactory

  /** Sets whether the list should show separators between columns.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setShowColumnSeparators(
      show_column_separators: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_column_view_set_show_column_separators(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnView]],
      gboolean(gint((if show_column_separators == true then 1 else 0)))
    )
  end setShowColumnSeparators

  /** Sets whether the list should show separators between rows.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setShowRowSeparators(
      show_row_separators: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_column_view_set_show_row_separators(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnView]],
      gboolean(gint((if show_row_separators == true then 1 else 0)))
    )
  end setShowRowSeparators

  /** Sets whether rows should be activated on single click and selected on
    * hover.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSingleClickActivate(
      single_click_activate: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_column_view_set_single_click_activate(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnView]],
      gboolean(gint((if single_click_activate == true then 1 else 0)))
    )
  end setSingleClickActivate

  /** Sets the behavior of the <kbd>Tab</kbd> and
    * <kbd>Shift</kbd>+<kbd>Tab</kbd> keys.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTabBehavior(
      tab_behavior: ListTabBehavior /* Some(GtkListTabBehavior) */
  ): Unit /* None */ =
    gtk_column_view_set_tab_behavior(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnView]],
      tab_behavior.raw
    )
  end setTabBehavior

  /** Sets the sorting of the view.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def sortByColumn(
      column: Option[
        sn.gnome.gtk4.ColumnViewColumn /* Some(Ptr[GtkColumnViewColumn]) */
      ],
      direction: SortType /* Some(GtkSortType) */
  )(using Runtime): Unit /* None */ =
    gtk_column_view_sort_by_column(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnView]],
      column
        .map[Ptr[GtkColumnViewColumn]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(null.asInstanceOf[Ptr[GtkColumnViewColumn]]),
      direction.raw
    )
  end sortByColumn

  /** Emitted when a row has been activated by the user, usually via activating
    * the GtkListBase|list.activate-item action.
    *
    * This allows for a convenient way to handle activation in a columnview. See
    * [method@Gtk.ListItem.set_activatable] for details on how to use this
    * signal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal activate]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(guint), @type -> DataRecord(guint)))"
  )
  private def onActivate = ???

end ColumnView

object ColumnView:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkColumnView])(using Runtime) =
    summon[Runtime].getOrCreate[ColumnView](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ColumnView(ptr)
    )

  /** Creates a new `GtkColumnView`.
    *
    * You most likely want to call [method@Gtk.ColumnView.append_column] to add
    * columns next.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(model: Option[SelectionModel /* Some(Ptr[GtkSelectionModel]) */ ])(
      using Runtime
  ): ColumnView =
    val raw: Ptr[Byte] = gtk_column_view_new(
      model
        .map[Ptr[GtkSelectionModel]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkSelectionModel]])
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[ColumnView](raw, r => ColumnView.applyUnsafe(r.asInstanceOf))
  end apply
end ColumnView
