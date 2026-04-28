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

class ColumnViewColumn(raw: Ptr[GtkColumnViewColumn])
    extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getColumnView(): ColumnView = new ColumnView(
    gtk_column_view_column_get_column_view(this.raw.asInstanceOf).asInstanceOf
  )

  def getExpand(): Boolean =
    gtk_column_view_column_get_expand(this.raw.asInstanceOf).value.!=(0)

  def getFactory(): ListItemFactory = new ListItemFactory(
    gtk_column_view_column_get_factory(this.raw.asInstanceOf).asInstanceOf
  )

  def getFixedWidth(): Int = gtk_column_view_column_get_fixed_width(
    this.raw.asInstanceOf
  )

  def getHeaderMenu(): MenuModel = new MenuModel(
    gtk_column_view_column_get_header_menu(this.raw.asInstanceOf).asInstanceOf
  )

  def getId()(using Zone): String = fromCString(
    gtk_column_view_column_get_id(this.raw.asInstanceOf).asInstanceOf
  )

  def getResizable(): Boolean =
    gtk_column_view_column_get_resizable(this.raw.asInstanceOf).value.!=(0)

  def getSorter(): Sorter = new Sorter(
    gtk_column_view_column_get_sorter(this.raw.asInstanceOf).asInstanceOf
  )

  def getTitle()(using Zone): String = fromCString(
    gtk_column_view_column_get_title(this.raw.asInstanceOf).asInstanceOf
  )

  def getVisible(): Boolean =
    gtk_column_view_column_get_visible(this.raw.asInstanceOf).value.!=(0)

  def setExpand(expand: Boolean): Unit = gtk_column_view_column_set_expand(
    this.raw.asInstanceOf,
    gboolean(gint((if expand == true then 1 else 0)))
  )

  def setFactory(factory: ListItemFactory): Unit =
    gtk_column_view_column_set_factory(
      this.raw.asInstanceOf,
      factory.getUnsafeRawPointer().asInstanceOf
    )

  def setFixedWidth(fixed_width: Int): Unit =
    gtk_column_view_column_set_fixed_width(this.raw.asInstanceOf, fixed_width)

  def setHeaderMenu(menu: MenuModel): Unit =
    gtk_column_view_column_set_header_menu(
      this.raw.asInstanceOf,
      menu.getUnsafeRawPointer().asInstanceOf
    )

  def setId(id: String | CString)(using Zone): Unit =
    gtk_column_view_column_set_id(
      this.raw.asInstanceOf,
      __sn_extract_string(id)
    )

  def setResizable(resizable: Boolean): Unit =
    gtk_column_view_column_set_resizable(
      this.raw.asInstanceOf,
      gboolean(gint((if resizable == true then 1 else 0)))
    )

  def setSorter(sorter: Sorter): Unit = gtk_column_view_column_set_sorter(
    this.raw.asInstanceOf,
    sorter.getUnsafeRawPointer().asInstanceOf
  )

  def setTitle(title: String | CString)(using Zone): Unit =
    gtk_column_view_column_set_title(
      this.raw.asInstanceOf,
      __sn_extract_string(title)
    )

  def setVisible(visible: Boolean): Unit = gtk_column_view_column_set_visible(
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
  def apply(title: String | CString, factory: ListItemFactory)(using
      Zone
  ): ColumnViewColumn = new ColumnViewColumn(
    gtk_column_view_column_new(
      __sn_extract_string(title),
      factory.getUnsafeRawPointer().asInstanceOf
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
