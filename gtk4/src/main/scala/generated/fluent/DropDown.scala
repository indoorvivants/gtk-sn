package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.ListModel
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Expression
import sn.gnome.gtk4.fluent.ListItemFactory
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkDropDown
import sn.gnome.gtk4.internal.GtkStringFilterMatchMode

class DropDown(raw: Ptr[GtkDropDown])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getEnableSearch(): Boolean =
    gtk_drop_down_get_enable_search(this.raw.asInstanceOf).value.!=(0)

  def getExpression(): Expression = new Expression(
    gtk_drop_down_get_expression(this.raw.asInstanceOf).asInstanceOf
  )

  def getFactory(): ListItemFactory = new ListItemFactory(
    gtk_drop_down_get_factory(this.raw.asInstanceOf).asInstanceOf
  )

  def getHeaderFactory(): ListItemFactory = new ListItemFactory(
    gtk_drop_down_get_header_factory(this.raw.asInstanceOf).asInstanceOf
  )

  def getListFactory(): ListItemFactory = new ListItemFactory(
    gtk_drop_down_get_list_factory(this.raw.asInstanceOf).asInstanceOf
  )

  def getModel(): ListModel = new ListModel.Abstract(
    gtk_drop_down_get_model(this.raw.asInstanceOf).asInstanceOf
  )

  def getSearchMatchMode(): GtkStringFilterMatchMode =
    gtk_drop_down_get_search_match_mode(this.raw.asInstanceOf)

  def getSelected(): UInt = gtk_drop_down_get_selected(
    this.raw.asInstanceOf
  ).value

  def getSelectedItem(): Object = new Object(
    gtk_drop_down_get_selected_item(this.raw.asInstanceOf).asInstanceOf
  )

  def getShowArrow(): Boolean =
    gtk_drop_down_get_show_arrow(this.raw.asInstanceOf).value.!=(0)

  def setEnableSearch(enable_search: Boolean): Unit =
    gtk_drop_down_set_enable_search(
      this.raw.asInstanceOf,
      gboolean(gint((if enable_search == true then 1 else 0)))
    )

  def setExpression(expression: Expression): Unit =
    gtk_drop_down_set_expression(
      this.raw.asInstanceOf,
      expression.getUnsafeRawPointer().asInstanceOf
    )

  def setFactory(factory: ListItemFactory): Unit = gtk_drop_down_set_factory(
    this.raw.asInstanceOf,
    factory.getUnsafeRawPointer().asInstanceOf
  )

  def setHeaderFactory(factory: ListItemFactory): Unit =
    gtk_drop_down_set_header_factory(
      this.raw.asInstanceOf,
      factory.getUnsafeRawPointer().asInstanceOf
    )

  def setListFactory(factory: ListItemFactory): Unit =
    gtk_drop_down_set_list_factory(
      this.raw.asInstanceOf,
      factory.getUnsafeRawPointer().asInstanceOf
    )

  def setModel(model: ListModel): Unit = gtk_drop_down_set_model(
    this.raw.asInstanceOf,
    model.getUnsafeRawPointer().asInstanceOf
  )

  def setSearchMatchMode(search_match_mode: GtkStringFilterMatchMode): Unit =
    gtk_drop_down_set_search_match_mode(
      this.raw.asInstanceOf,
      search_match_mode
    )

  def setSelected(position: UInt): Unit =
    gtk_drop_down_set_selected(this.raw.asInstanceOf, guint(position))

  def setShowArrow(show_arrow: Boolean): Unit = gtk_drop_down_set_show_arrow(
    this.raw.asInstanceOf,
    gboolean(gint((if show_arrow == true then 1 else 0)))
  )

end DropDown

object DropDown:
  def apply(model: ListModel, expression: Expression): DropDown = new DropDown(
    gtk_drop_down_new(
      model.getUnsafeRawPointer().asInstanceOf,
      expression.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
  // constructor new_from_strings contains an array parameter, which is not supported yet

end DropDown
