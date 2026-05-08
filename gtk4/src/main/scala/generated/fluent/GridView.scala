package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.{gboolean, gint, guint}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{
  Accessible,
  Buildable,
  ConstraintTarget,
  ListBase,
  ListItemFactory,
  ListTabBehavior,
  Orientable,
  Scrollable,
  SelectionModel
}
import sn.gnome.gtk4.internal.GtkGridView

/** `GtkGridView` presents a large dynamic grid of items.
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class GridView(raw: Ptr[GtkGridView])
    extends ListBase(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Orientable,
      Scrollable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Returns whether rows can be selected by dragging with the mouse.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getEnableRubberband(): Boolean /* None */ =
    gtk_grid_view_get_enable_rubberband(
      this.raw.asInstanceOf[Ptr[GtkGridView]]
    ).value.!=(0)

  /** Gets the factory that's currently used to populate list items.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFactory(): ListItemFactory /* None */ = new ListItemFactory(
    gtk_grid_view_get_factory(
      this.raw.asInstanceOf[Ptr[GtkGridView]]
    ).asInstanceOf
  )

  /** Gets the maximum number of columns that the grid will use.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMaxColumns(): UInt /* None */ = gtk_grid_view_get_max_columns(
    this.raw.asInstanceOf[Ptr[GtkGridView]]
  ).value

  /** Gets the minimum number of columns that the grid will use.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMinColumns(): UInt /* None */ = gtk_grid_view_get_min_columns(
    this.raw.asInstanceOf[Ptr[GtkGridView]]
  ).value

  /** Gets the model that's currently used to read the items displayed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getModel(): SelectionModel /* None */ = new SelectionModel.Abstract(
    gtk_grid_view_get_model(
      this.raw.asInstanceOf[Ptr[GtkGridView]]
    ).asInstanceOf
  )

  /** Returns whether items will be activated on single click and selected on
    * hover.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSingleClickActivate(): Boolean /* None */ =
    gtk_grid_view_get_single_click_activate(
      this.raw.asInstanceOf[Ptr[GtkGridView]]
    ).value.!=(0)

  /** Gets the behavior set for the <kbd>Tab</kbd> key.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTabBehavior(): ListTabBehavior /* None */ = ListTabBehavior.fromRaw(
    gtk_grid_view_get_tab_behavior(this.raw.asInstanceOf[Ptr[GtkGridView]])
  )

  /** Scrolls to the item at the given position and performs the actions
    * specified in @flags.
    *
    * This function works no matter if the gridview is shown or focused. If it
    * isn't, then the changes will take effect once that happens.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method scroll_to/<method parameters>/scroll]: Cannot render type Type(List(),ListMap(@name -> DataRecord(ScrollInfo), @type -> DataRecord(GtkScrollInfo*)))"
  )
  private def scrollTo__ = ???

  /** Sets whether selections can be changed by dragging with the mouse.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setEnableRubberband(
      enable_rubberband: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_grid_view_set_enable_rubberband(
    this.raw.asInstanceOf[Ptr[GtkGridView]],
    gboolean(gint((if enable_rubberband == true then 1 else 0)))
  )

  /** Sets the `GtkListItemFactory` to use for populating list items.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFactory(
      factory: Option[ListItemFactory /* Some(Ptr[GtkListItemFactory]) */ ]
  ): Unit /* None */ = gtk_grid_view_set_factory(
    this.raw.asInstanceOf[Ptr[GtkGridView]],
    factory
      .map[Ptr[GtkListItemFactory]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkListItemFactory]])
  )

  /** Sets the maximum number of columns to use.
    *
    * This number must be at least 1.
    *
    * If @max_columns is smaller than the minimum set via
    * [method@Gtk.GridView.set_min_columns], that value is used instead.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMaxColumns(
      max_columns: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ = gtk_grid_view_set_max_columns(
    this.raw.asInstanceOf[Ptr[GtkGridView]],
    guint(max_columns)
  )

  /** Sets the minimum number of columns to use.
    *
    * This number must be at least 1.
    *
    * If @min_columns is smaller than the minimum set via
    * [method@Gtk.GridView.set_max_columns], that value is ignored.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMinColumns(
      min_columns: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ = gtk_grid_view_set_min_columns(
    this.raw.asInstanceOf[Ptr[GtkGridView]],
    guint(min_columns)
  )

  /** Sets the model to use.
    *
    * This must be a [iface@Gtk.SelectionModel].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setModel(
      model: Option[SelectionModel /* Some(Ptr[GtkSelectionModel]) */ ]
  ): Unit /* None */ = gtk_grid_view_set_model(
    this.raw.asInstanceOf[Ptr[GtkGridView]],
    model
      .map[Ptr[GtkSelectionModel]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkSelectionModel]])
  )

  /** Sets whether items should be activated on single click and selected on
    * hover.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSingleClickActivate(
      single_click_activate: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_grid_view_set_single_click_activate(
    this.raw.asInstanceOf[Ptr[GtkGridView]],
    gboolean(gint((if single_click_activate == true then 1 else 0)))
  )

  /** Sets the behavior of the <kbd>Tab</kbd> and
    * <kbd>Shift</kbd>+<kbd>Tab</kbd> keys.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTabBehavior(
      tab_behavior: ListTabBehavior /* Some(GtkListTabBehavior) */
  ): Unit /* None */ = gtk_grid_view_set_tab_behavior(
    this.raw.asInstanceOf[Ptr[GtkGridView]],
    tab_behavior.raw
  )

  /** Emitted when a cell has been activated by the user, usually via activating
    * the GtkGridView|list.activate-item action.
    *
    * This allows for a convenient way to handle activation in a gridview. See
    * [property@Gtk.ListItem:activatable] for details on how to use this signal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal activate]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(guint), @type -> DataRecord(guint)))"
  )
  private def onActivate = ???

end GridView

object GridView:
  /** Creates a new `GtkGridView` that uses the given @factory for mapping items
    * to widgets.
    *
    * The function takes ownership of the arguments, so you can write code like
    * ```c
    * grid_view = gtk_grid_view_new (create_model (),
    *   gtk_builder_list_item_factory_new_from_resource ("/resource.ui"));
    * ```
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      model: Option[SelectionModel /* Some(Ptr[GtkSelectionModel]) */ ],
      factory: Option[ListItemFactory /* Some(Ptr[GtkListItemFactory]) */ ]
  )(using Runtime): GridView =
    val raw: Ptr[Byte] = gtk_grid_view_new(
      model
        .map[Ptr[GtkSelectionModel]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkSelectionModel]]),
      factory
        .map[Ptr[GtkListItemFactory]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkListItemFactory]])
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[GridView](raw, r => new GridView(r.asInstanceOf))
  end apply
end GridView
