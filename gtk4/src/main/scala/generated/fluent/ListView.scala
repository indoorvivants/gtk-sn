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

class ListView(raw: Ptr[GtkListView])
    extends ListBase(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Orientable,
      Scrollable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getEnableRubberband(): Boolean =
    gtk_list_view_get_enable_rubberband(this.raw.asInstanceOf).value.!=(0)

  def getFactory(): ListItemFactory = new ListItemFactory(
    gtk_list_view_get_factory(this.raw.asInstanceOf).asInstanceOf
  )

  def getHeaderFactory(): ListItemFactory = new ListItemFactory(
    gtk_list_view_get_header_factory(this.raw.asInstanceOf).asInstanceOf
  )

  def getModel(): SelectionModel = new SelectionModel.Abstract(
    gtk_list_view_get_model(this.raw.asInstanceOf).asInstanceOf
  )

  def getShowSeparators(): Boolean =
    gtk_list_view_get_show_separators(this.raw.asInstanceOf).value.!=(0)

  def getSingleClickActivate(): Boolean =
    gtk_list_view_get_single_click_activate(this.raw.asInstanceOf).value.!=(0)

  def getTabBehavior(): GtkListTabBehavior = gtk_list_view_get_tab_behavior(
    this.raw.asInstanceOf
  )

  def scrollTo(
      pos: UInt,
      flags: GtkListScrollFlags,
      scroll: Ptr[GtkScrollInfo]
  ): Unit =
    gtk_list_view_scroll_to(this.raw.asInstanceOf, guint(pos), flags, scroll)

  def setEnableRubberband(enable_rubberband: Boolean): Unit =
    gtk_list_view_set_enable_rubberband(
      this.raw.asInstanceOf,
      gboolean(gint((if enable_rubberband == true then 1 else 0)))
    )

  def setFactory(factory: ListItemFactory): Unit = gtk_list_view_set_factory(
    this.raw.asInstanceOf,
    factory.getUnsafeRawPointer().asInstanceOf
  )

  def setHeaderFactory(factory: ListItemFactory): Unit =
    gtk_list_view_set_header_factory(
      this.raw.asInstanceOf,
      factory.getUnsafeRawPointer().asInstanceOf
    )

  def setModel(model: SelectionModel): Unit = gtk_list_view_set_model(
    this.raw.asInstanceOf,
    model.getUnsafeRawPointer().asInstanceOf
  )

  def setShowSeparators(show_separators: Boolean): Unit =
    gtk_list_view_set_show_separators(
      this.raw.asInstanceOf,
      gboolean(gint((if show_separators == true then 1 else 0)))
    )

  def setSingleClickActivate(single_click_activate: Boolean): Unit =
    gtk_list_view_set_single_click_activate(
      this.raw.asInstanceOf,
      gboolean(gint((if single_click_activate == true then 1 else 0)))
    )

  def setTabBehavior(tab_behavior: GtkListTabBehavior): Unit =
    gtk_list_view_set_tab_behavior(this.raw.asInstanceOf, tab_behavior)

end ListView

object ListView:
  def apply(model: SelectionModel, factory: ListItemFactory): ListView =
    new ListView(
      gtk_list_view_new(
        model.getUnsafeRawPointer().asInstanceOf,
        factory.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )
end ListView
