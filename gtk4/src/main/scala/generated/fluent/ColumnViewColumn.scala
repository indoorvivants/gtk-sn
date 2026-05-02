package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.MenuModel
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.ColumnView
import sn.gnome.gtk4.fluent.ListItemFactory
import sn.gnome.gtk4.fluent.Sorter
import sn.gnome.gtk4.internal.GtkColumnViewColumn

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkColumnViewColumn` represents the columns being added to a
  * `GtkColumnView`.
  *
  * The main ingredient for a `GtkColumnViewColumn` is the `GtkListItemFactory`
  * that tells the columnview how to create cells for this column from items in
  * the model.
  *
  * Columns have a title, and can optionally have a header menu set with
  * [method@Gtk.ColumnViewColumn.set_header_menu].
  *
  * A sorter can be associated with a column using
  * [method@Gtk.ColumnViewColumn.set_sorter], to let users influence sorting by
  * clicking on the column header.
  */
class ColumnViewColumn(raw: Ptr[GtkColumnViewColumn])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the column view that's currently displaying this column.
    *
    * If @self has not been added to a column view yet, %NULL is returned.
    */
  def getColumnView(): ColumnView /* None */ = new ColumnView(
    gtk_column_view_column_get_column_view(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether this column should expand.
    */
  def getExpand(): Boolean /* None */ =
    gtk_column_view_column_get_expand(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the factory that's currently used to populate list items for this
    * column.
    */
  def getFactory(): ListItemFactory /* None */ = new ListItemFactory(
    gtk_column_view_column_get_factory(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the fixed width of the column.
    */
  def getFixedWidth(): Int /* None */ = gtk_column_view_column_get_fixed_width(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the menu model that is used to create the context menu for the column
    * header.
    */
  def getHeaderMenu(): MenuModel /* None */ = new MenuModel(
    gtk_column_view_column_get_header_menu(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the ID set with gtk_column_view_column_set_id().
    */
  def getId()(using Zone): String /* None */ = fromCString(
    gtk_column_view_column_get_id(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether this column is resizable.
    */
  def getResizable(): Boolean /* None */ =
    gtk_column_view_column_get_resizable(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the sorter that is associated with the column.
    */
  def getSorter(): Sorter /* None */ = new Sorter(
    gtk_column_view_column_get_sorter(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the title set with gtk_column_view_column_set_title().
    */
  def getTitle()(using Zone): String /* None */ = fromCString(
    gtk_column_view_column_get_title(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether this column is visible.
    */
  def getVisible(): Boolean /* None */ =
    gtk_column_view_column_get_visible(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the column to take available extra space.
    *
    * The extra space is shared equally amongst all columns that have the expand
    * set to %TRUE.
    */
  def setExpand(
      expand: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_column_view_column_set_expand(
    this.raw.asInstanceOf,
    gboolean(gint((if expand == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the `GtkListItemFactory` to use for populating list items for this
    * column.
    */
  def setFactory(
      factory: Option[ListItemFactory /* Some(Ptr[GtkListItemFactory]) */ ]
  ): Unit /* None */ = gtk_column_view_column_set_factory(
    this.raw.asInstanceOf,
    factory
      .map[Ptr[GtkListItemFactory]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkListItemFactory]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * If @fixed_width is not -1, sets the fixed width of @column; otherwise
    * unsets it.
    *
    * Setting a fixed width overrides the automatically calculated width.
    * Interactive resizing also sets the “fixed-width” property.
    */
  def setFixedWidth(fixed_width: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_column_view_column_set_fixed_width(this.raw.asInstanceOf, fixed_width)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the menu model that is used to create the context menu for the column
    * header.
    */
  def setHeaderMenu(
      menu: Option[
        MenuModel /* Some(Ptr[_root_.sn.gnome.gio.internal.GMenuModel]) */
      ]
  ): Unit /* None */ = gtk_column_view_column_set_header_menu(
    this.raw.asInstanceOf,
    menu
      .map[Ptr[_root_.sn.gnome.gio.internal.GMenuModel]](o =>
        o.getUnsafeRawPointer().asInstanceOf
      )
      .getOrElse(
        null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GMenuModel]]
      )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the id of this column.
    *
    * GTK makes no use of this, but applications can use it when storing column
    * view configuration.
    *
    * It is up to callers to ensure uniqueness of IDs.
    */
  def setId(
      id: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_column_view_column_set_id(
    this.raw.asInstanceOf,
    id.map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether this column should be resizable by dragging.
    */
  def setResizable(
      resizable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_column_view_column_set_resizable(
    this.raw.asInstanceOf,
    gboolean(gint((if resizable == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Associates a sorter with the column.
    *
    * If @sorter is %NULL, the column will not let users change the sorting by
    * clicking on its header.
    *
    * This sorter can be made active by clicking on the column header, or by
    * calling [method@Gtk.ColumnView.sort_by_column].
    *
    * See [method@Gtk.ColumnView.get_sorter] for the necessary steps for setting
    * up customizable sorting for [class@Gtk.ColumnView].
    */
  def setSorter(
      sorter: Option[Sorter /* Some(Ptr[GtkSorter]) */ ]
  ): Unit /* None */ = gtk_column_view_column_set_sorter(
    this.raw.asInstanceOf,
    sorter
      .map[Ptr[GtkSorter]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkSorter]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the title of this column.
    *
    * The title is displayed in the header of a `GtkColumnView` for this column
    * and is therefore user-facing text that should be translated.
    */
  def setTitle(
      title: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_column_view_column_set_title(
    this.raw.asInstanceOf,
    title
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether this column should be visible in views.
    */
  def setVisible(
      visible: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_column_view_column_set_visible(
    this.raw.asInstanceOf,
    gboolean(gint((if visible == true then 1 else 0)))
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end ColumnViewColumn

object ColumnViewColumn:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkColumnViewColumn` that uses the given @factory for
    * mapping items to widgets.
    *
    * You most likely want to call [method@Gtk.ColumnView.append_column] next.
    *
    * The function takes ownership of the argument, so you can write code like:
    *
    * ```c
    * column = gtk_column_view_column_new (_("Name"),
    *   gtk_builder_list_item_factory_new_from_resource ("/name.ui"));
    * ```
    */
  def apply(
      title: Option[String | CString /* Some(CString) */ ],
      factory: Option[ListItemFactory /* Some(Ptr[GtkListItemFactory]) */ ]
  )(using Zone): ColumnViewColumn = new ColumnViewColumn(
    gtk_column_view_column_new(
      title
        .map[CString](o => __sn_extract_string(o))
        .getOrElse(null.asInstanceOf[CString]),
      factory
        .map[Ptr[GtkListItemFactory]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkListItemFactory]])
    ).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end ColumnViewColumn
