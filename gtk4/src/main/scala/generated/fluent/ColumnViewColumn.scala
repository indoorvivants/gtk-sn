package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.MenuModel
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{ColumnView, ListItemFactory, Sorter}
import sn.gnome.gtk4.internal.GtkColumnViewColumn

/** `GtkColumnViewColumn` represents the columns being added to a
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ColumnViewColumn private[gnome] (raw: Ptr[GtkColumnViewColumn])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the column view that's currently displaying this column.
    *
    * If @self has not been added to a column view yet, %NULL is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getColumnView()(using Runtime): sn.gnome.gtk4.ColumnView /* None */ =
    sn.gnome.gtk4.ColumnView.applyUnsafe(
      gtk_column_view_column_get_column_view(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnViewColumn]]
      ).asInstanceOf
    )
  end getColumnView

  /** Returns whether this column should expand.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getExpand(): Boolean /* None */ =
    gtk_column_view_column_get_expand(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnViewColumn]]
    ).value.!=(0)
  end getExpand

  /** Gets the factory that's currently used to populate list items for this
    * column.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFactory()(using Runtime): sn.gnome.gtk4.ListItemFactory /* None */ =
    sn.gnome.gtk4.ListItemFactory.applyUnsafe(
      gtk_column_view_column_get_factory(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnViewColumn]]
      ).asInstanceOf
    )
  end getFactory

  /** Gets the fixed width of the column.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFixedWidth(): Int /* None */ =
    gtk_column_view_column_get_fixed_width(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnViewColumn]]
    )
  end getFixedWidth

  /** Gets the menu model that is used to create the context menu for the column
    * header.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHeaderMenu()(using Runtime): sn.gnome.gio.MenuModel /* None */ =
    sn.gnome.gio.MenuModel.applyUnsafe(
      gtk_column_view_column_get_header_menu(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnViewColumn]]
      ).asInstanceOf
    )
  end getHeaderMenu

  /** Returns the ID set with gtk_column_view_column_set_id().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getId(): String /* None */ =
    fromCString(
      gtk_column_view_column_get_id(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnViewColumn]]
      ).asInstanceOf
    )
  end getId

  /** Returns whether this column is resizable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getResizable(): Boolean /* None */ =
    gtk_column_view_column_get_resizable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnViewColumn]]
    ).value.!=(0)
  end getResizable

  /** Returns the sorter that is associated with the column.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSorter()(using Runtime): sn.gnome.gtk4.Sorter /* None */ =
    sn.gnome.gtk4.Sorter.applyUnsafe(
      gtk_column_view_column_get_sorter(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnViewColumn]]
      ).asInstanceOf
    )
  end getSorter

  /** Returns the title set with gtk_column_view_column_set_title().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTitle(): String /* None */ =
    fromCString(
      gtk_column_view_column_get_title(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnViewColumn]]
      ).asInstanceOf
    )
  end getTitle

  /** Returns whether this column is visible.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getVisible(): Boolean /* None */ =
    gtk_column_view_column_get_visible(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnViewColumn]]
    ).value.!=(0)
  end getVisible

  /** Sets the column to take available extra space.
    *
    * The extra space is shared equally amongst all columns that have the expand
    * set to %TRUE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setExpand(
      expand: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_column_view_column_set_expand(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnViewColumn]],
      gboolean(gint((if expand == true then 1 else 0)))
    )
  end setExpand

  /** Sets the `GtkListItemFactory` to use for populating list items for this
    * column.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFactory(
      factory: Option[
        sn.gnome.gtk4.ListItemFactory /* Some(Ptr[GtkListItemFactory]) */
      ]
  )(using Runtime): Unit /* None */ =
    gtk_column_view_column_set_factory(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnViewColumn]],
      factory
        .map[Ptr[GtkListItemFactory]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkListItemFactory]])
    )
  end setFactory

  /** If @fixed_width is not -1, sets the fixed width of @column; otherwise
    * unsets it.
    *
    * Setting a fixed width overrides the automatically calculated width.
    * Interactive resizing also sets the “fixed-width” property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFixedWidth(fixed_width: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_column_view_column_set_fixed_width(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnViewColumn]],
      fixed_width
    )
  end setFixedWidth

  /** Sets the menu model that is used to create the context menu for the column
    * header.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setHeaderMenu(
      menu: Option[
        sn.gnome.gio.MenuModel /* Some(Ptr[_root_.sn.gnome.gio.internal.GMenuModel]) */
      ]
  )(using Runtime): Unit /* None */ =
    gtk_column_view_column_set_header_menu(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnViewColumn]],
      menu
        .map[Ptr[_root_.sn.gnome.gio.internal.GMenuModel]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GMenuModel]]
        )
    )
  end setHeaderMenu

  /** Sets the id of this column.
    *
    * GTK makes no use of this, but applications can use it when storing column
    * view configuration.
    *
    * It is up to callers to ensure uniqueness of IDs.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setId(id: Option[String /* Some(CString) */ ])(using
      Runtime
  ): Unit /* None */ =
    gtk_column_view_column_set_id(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnViewColumn]],
      id.map[CString](o => summon[Runtime].inZone(toCString(o)))
        .getOrElse(null.asInstanceOf[CString])
    )
  end setId

  /** Sets whether this column should be resizable by dragging.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setResizable(
      resizable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_column_view_column_set_resizable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnViewColumn]],
      gboolean(gint((if resizable == true then 1 else 0)))
    )
  end setResizable

  /** Associates a sorter with the column.
    *
    * If @sorter is %NULL, the column will not let users change the sorting by
    * clicking on its header.
    *
    * This sorter can be made active by clicking on the column header, or by
    * calling [method@Gtk.ColumnView.sort_by_column].
    *
    * See [method@Gtk.ColumnView.get_sorter] for the necessary steps for setting
    * up customizable sorting for [class@Gtk.ColumnView].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSorter(
      sorter: Option[sn.gnome.gtk4.Sorter /* Some(Ptr[GtkSorter]) */ ]
  )(using Runtime): Unit /* None */ =
    gtk_column_view_column_set_sorter(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnViewColumn]],
      sorter
        .map[Ptr[GtkSorter]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkSorter]])
    )
  end setSorter

  /** Sets the title of this column.
    *
    * The title is displayed in the header of a `GtkColumnView` for this column
    * and is therefore user-facing text that should be translated.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTitle(title: Option[String /* Some(CString) */ ])(using
      Runtime
  ): Unit /* None */ =
    gtk_column_view_column_set_title(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnViewColumn]],
      title
        .map[CString](o => summon[Runtime].inZone(toCString(o)))
        .getOrElse(null.asInstanceOf[CString])
    )
  end setTitle

  /** Sets whether this column should be visible in views.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setVisible(
      visible: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_column_view_column_set_visible(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnViewColumn]],
      gboolean(gint((if visible == true then 1 else 0)))
    )
  end setVisible

end ColumnViewColumn

object ColumnViewColumn:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkColumnViewColumn])(using Runtime) =
    summon[Runtime].getOrCreate[ColumnViewColumn](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ColumnViewColumn(ptr)
    )

  /** Creates a new `GtkColumnViewColumn` that uses the given @factory for
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      title: Option[String /* Some(CString) */ ],
      factory: Option[
        sn.gnome.gtk4.ListItemFactory /* Some(Ptr[GtkListItemFactory]) */
      ]
  )(using Runtime): ColumnViewColumn =
    val raw: Ptr[Byte] = gtk_column_view_column_new(
      title
        .map[CString](o => summon[Runtime].inZone(toCString(o)))
        .getOrElse(null.asInstanceOf[CString]),
      factory
        .map[Ptr[GtkListItemFactory]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkListItemFactory]])
    ).asInstanceOf
    summon[Runtime].getOrCreate[ColumnViewColumn](
      raw,
      r => ColumnViewColumn.applyUnsafe(r.asInstanceOf)
    )
  end apply
end ColumnViewColumn
