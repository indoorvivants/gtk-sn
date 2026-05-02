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
import sn.gnome.gtk4.internal.GtkListScrollFlags
import sn.gnome.gtk4.internal.GtkListTabBehavior
import sn.gnome.gtk4.internal.GtkListView
import sn.gnome.gtk4.internal.GtkScrollInfo

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkListView` presents a large dynamic list of items.
  *
  * `GtkListView` uses its factory to generate one row widget for each visible
  * item and shows them in a linear display, either vertically or horizontally.
  *
  * The [property@Gtk.ListView:show-separators] property offers a simple way to
  * display separators between the rows.
  *
  * `GtkListView` allows the user to select items according to the selection
  * characteristics of the model. For models that allow multiple selected items,
  * it is possible to turn on _rubberband selection_, using
  * [property@Gtk.ListView:enable-rubberband].
  *
  * If you need multiple columns with headers, see [class@Gtk.ColumnView].
  *
  * To learn more about the list widget framework, see the
  * [overview](section-list-widget.html).
  *
  * An example of using `GtkListView`:
  * ```c
  * static void
  * setup_listitem_cb (GtkListItemFactory *factory,
  *                    GtkListItem        *list_item)
  * {
  *   GtkWidget *image;
  *
  *   image = gtk_image_new ();
  *   gtk_image_set_icon_size (GTK_IMAGE (image), GTK_ICON_SIZE_LARGE);
  *   gtk_list_item_set_child (list_item, image);
  * }
  *
  * static void
  * bind_listitem_cb (GtkListItemFactory *factory,
  *                   GtkListItem        *list_item)
  * {
  *   GtkWidget *image;
  *   GAppInfo *app_info;
  *
  *   image = gtk_list_item_get_child (list_item);
  *   app_info = gtk_list_item_get_item (list_item);
  *   gtk_image_set_from_gicon (GTK_IMAGE (image), g_app_info_get_icon (app_info));
  * }
  *
  * static void
  * activate_cb (GtkListView  *list,
  *              guint         position,
  *              gpointer      unused)
  * {
  *   GAppInfo *app_info;
  *
  *   app_info = g_list_model_get_item (G_LIST_MODEL (gtk_list_view_get_model (list)), position);
  *   g_app_info_launch (app_info, NULL, NULL, NULL);
  *   g_object_unref (app_info);
  * }
  *
  * ...
  *
  *   model = create_application_list ();
  *
  *   factory = gtk_signal_list_item_factory_new ();
  *   g_signal_connect (factory, "setup", G_CALLBACK (setup_listitem_cb), NULL);
  *   g_signal_connect (factory, "bind", G_CALLBACK (bind_listitem_cb), NULL);
  *
  *   list = gtk_list_view_new (GTK_SELECTION_MODEL (gtk_single_selection_new (model)), factory);
  *
  *   g_signal_connect (list, "activate", G_CALLBACK (activate_cb), NULL);
  *
  *   gtk_scrolled_window_set_child (GTK_SCROLLED_WINDOW (sw), list);
  * ```
  *
  * # CSS nodes
  *
  * ```
  * listview[.separators][.rich-list][.navigation-sidebar][.data-table]
  * ├── row[.activatable]
  * │
  * ├── row[.activatable]
  * │
  * ┊
  * ╰── [rubberband]
  * ```
  *
  * `GtkListView` uses a single CSS node named `listview`. It may carry the
  * `.separators` style class, when [property@Gtk.ListView:show-separators]
  * property is set. Each child widget uses a single CSS node named `row`. If
  * the [property@Gtk.ListItem:activatable] property is set, the corresponding
  * row will have the `.activatable` style class. For rubberband selection, a
  * node with name `rubberband` is used.
  *
  * The main listview node may also carry style classes to select the style of
  * [list presentation](ListContainers.html#list-styles): .rich-list,
  * .navigation-sidebar or .data-table.
  *
  * # Accessibility
  *
  * `GtkListView` uses the %GTK_ACCESSIBLE_ROLE_LIST role, and the list items
  * use the %GTK_ACCESSIBLE_ROLE_LIST_ITEM role.
  */
class ListView(raw: Ptr[GtkListView])
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
    gtk_list_view_get_enable_rubberband(
      this.raw.asInstanceOf[Ptr[GtkListView]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the factory that's currently used to populate list items.
    */
  def getFactory(): ListItemFactory /* None */ = new ListItemFactory(
    gtk_list_view_get_factory(
      this.raw.asInstanceOf[Ptr[GtkListView]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the factory that's currently used to populate section headers.
    */
  def getHeaderFactory(): ListItemFactory /* None */ = new ListItemFactory(
    gtk_list_view_get_header_factory(
      this.raw.asInstanceOf[Ptr[GtkListView]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the model that's currently used to read the items displayed.
    */
  def getModel(): SelectionModel /* None */ = new SelectionModel.Abstract(
    gtk_list_view_get_model(
      this.raw.asInstanceOf[Ptr[GtkListView]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the list box should show separators between rows.
    */
  def getShowSeparators(): Boolean /* None */ =
    gtk_list_view_get_show_separators(
      this.raw.asInstanceOf[Ptr[GtkListView]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether rows will be activated on single click and selected on
    * hover.
    */
  def getSingleClickActivate(): Boolean /* None */ =
    gtk_list_view_get_single_click_activate(
      this.raw.asInstanceOf[Ptr[GtkListView]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the behavior set for the <kbd>Tab</kbd> key.
    */
  def getTabBehavior(): GtkListTabBehavior /* None */ =
    gtk_list_view_get_tab_behavior(this.raw.asInstanceOf[Ptr[GtkListView]])

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Scrolls to the item at the given position and performs the actions
    * specified in @flags.
    *
    * This function works no matter if the listview is shown or focused. If it
    * isn't, then the changes will take effect once that happens.
    */
  def scrollTo(
      pos: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      flags: GtkListScrollFlags /* Some(GtkListScrollFlags) */,
      scroll: Option[Ptr[GtkScrollInfo] /* Some(Ptr[GtkScrollInfo]) */ ]
  ): Unit /* None */ = gtk_list_view_scroll_to(
    this.raw.asInstanceOf[Ptr[GtkListView]],
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
  ): Unit /* None */ = gtk_list_view_set_enable_rubberband(
    this.raw.asInstanceOf[Ptr[GtkListView]],
    gboolean(gint((if enable_rubberband == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the `GtkListItemFactory` to use for populating list items.
    */
  def setFactory(
      factory: Option[ListItemFactory /* Some(Ptr[GtkListItemFactory]) */ ]
  ): Unit /* None */ = gtk_list_view_set_factory(
    this.raw.asInstanceOf[Ptr[GtkListView]],
    factory
      .map[Ptr[GtkListItemFactory]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkListItemFactory]])
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
  ): Unit /* None */ = gtk_list_view_set_header_factory(
    this.raw.asInstanceOf[Ptr[GtkListView]],
    factory
      .map[Ptr[GtkListItemFactory]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkListItemFactory]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the model to use.
    *
    * This must be a [iface@Gtk.SelectionModel] to use.
    */
  def setModel(
      model: Option[SelectionModel /* Some(Ptr[GtkSelectionModel]) */ ]
  ): Unit /* None */ = gtk_list_view_set_model(
    this.raw.asInstanceOf[Ptr[GtkListView]],
    model
      .map[Ptr[GtkSelectionModel]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkSelectionModel]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the list box should show separators between rows.
    */
  def setShowSeparators(
      show_separators: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_list_view_set_show_separators(
    this.raw.asInstanceOf[Ptr[GtkListView]],
    gboolean(gint((if show_separators == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether rows should be activated on single click and selected on
    * hover.
    */
  def setSingleClickActivate(
      single_click_activate: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_list_view_set_single_click_activate(
    this.raw.asInstanceOf[Ptr[GtkListView]],
    gboolean(gint((if single_click_activate == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the behavior of the <kbd>Tab</kbd> and
    * <kbd>Shift</kbd>+<kbd>Tab</kbd> keys.
    */
  def setTabBehavior(
      tab_behavior: GtkListTabBehavior /* Some(GtkListTabBehavior) */
  ): Unit /* None */ = gtk_list_view_set_tab_behavior(
    this.raw.asInstanceOf[Ptr[GtkListView]],
    tab_behavior
  )

end ListView

object ListView:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkListView` that uses the given @factory for mapping items
    * to widgets.
    *
    * The function takes ownership of the arguments, so you can write code like
    * ```c
    * list_view = gtk_list_view_new (create_model (),
    *   gtk_builder_list_item_factory_new_from_resource ("/resource.ui"));
    * ```
    */
  def apply(
      model: Option[SelectionModel /* Some(Ptr[GtkSelectionModel]) */ ],
      factory: Option[ListItemFactory /* Some(Ptr[GtkListItemFactory]) */ ]
  ): ListView = new ListView(
    gtk_list_view_new(
      model
        .map[Ptr[GtkSelectionModel]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkSelectionModel]]),
      factory
        .map[Ptr[GtkListItemFactory]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkListItemFactory]])
    ).asInstanceOf
  )
end ListView
