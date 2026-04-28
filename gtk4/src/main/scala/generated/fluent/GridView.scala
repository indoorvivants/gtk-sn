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

class GridView(raw: Ptr[GtkGridView])
    extends ListBase(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Orientable,
      Scrollable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getEnableRubberband(): Boolean =
    gtk_grid_view_get_enable_rubberband(this.raw.asInstanceOf).value.!=(0)

  def getFactory(): ListItemFactory = new ListItemFactory(
    gtk_grid_view_get_factory(this.raw.asInstanceOf).asInstanceOf
  )

  def getMaxColumns(): UInt = gtk_grid_view_get_max_columns(
    this.raw.asInstanceOf
  ).value

  def getMinColumns(): UInt = gtk_grid_view_get_min_columns(
    this.raw.asInstanceOf
  ).value

  def getModel(): SelectionModel = new SelectionModel.Abstract(
    gtk_grid_view_get_model(this.raw.asInstanceOf).asInstanceOf
  )

  def getSingleClickActivate(): Boolean =
    gtk_grid_view_get_single_click_activate(this.raw.asInstanceOf).value.!=(0)

  def getTabBehavior(): GtkListTabBehavior = gtk_grid_view_get_tab_behavior(
    this.raw.asInstanceOf
  )

  def scrollTo(
      pos: UInt,
      flags: GtkListScrollFlags,
      scroll: Ptr[GtkScrollInfo]
  ): Unit =
    gtk_grid_view_scroll_to(this.raw.asInstanceOf, guint(pos), flags, scroll)

  def setEnableRubberband(enable_rubberband: Boolean): Unit =
    gtk_grid_view_set_enable_rubberband(
      this.raw.asInstanceOf,
      gboolean(gint((if enable_rubberband == true then 1 else 0)))
    )

  def setFactory(factory: ListItemFactory): Unit = gtk_grid_view_set_factory(
    this.raw.asInstanceOf,
    factory.getUnsafeRawPointer().asInstanceOf
  )

  def setMaxColumns(max_columns: UInt): Unit =
    gtk_grid_view_set_max_columns(this.raw.asInstanceOf, guint(max_columns))

  def setMinColumns(min_columns: UInt): Unit =
    gtk_grid_view_set_min_columns(this.raw.asInstanceOf, guint(min_columns))

  def setModel(model: SelectionModel): Unit = gtk_grid_view_set_model(
    this.raw.asInstanceOf,
    model.getUnsafeRawPointer().asInstanceOf
  )

  def setSingleClickActivate(single_click_activate: Boolean): Unit =
    gtk_grid_view_set_single_click_activate(
      this.raw.asInstanceOf,
      gboolean(gint((if single_click_activate == true then 1 else 0)))
    )

  def setTabBehavior(tab_behavior: GtkListTabBehavior): Unit =
    gtk_grid_view_set_tab_behavior(this.raw.asInstanceOf, tab_behavior)

end GridView

object GridView:
  def apply(model: SelectionModel, factory: ListItemFactory): GridView =
    new GridView(
      gtk_grid_view_new(
        model.getUnsafeRawPointer().asInstanceOf,
        factory.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )
end GridView
