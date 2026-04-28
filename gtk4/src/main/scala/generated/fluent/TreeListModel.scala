package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.ListModel
import sn.gnome.glib.internal.GDestroyNotify
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.TreeListRow
import sn.gnome.gtk4.internal.GtkTreeListModel
import sn.gnome.gtk4.internal.GtkTreeListModelCreateModelFunc

class TreeListModel(raw: Ptr[GtkTreeListModel])
    extends Object(raw.asInstanceOf),
      ListModel:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getAutoexpand(): Boolean =
    gtk_tree_list_model_get_autoexpand(this.raw.asInstanceOf).value.!=(0)

  def getChildRow(position: UInt): TreeListRow = new TreeListRow(
    gtk_tree_list_model_get_child_row(
      this.raw.asInstanceOf,
      guint(position)
    ).asInstanceOf
  )

  def getModel(): ListModel = new ListModel.Abstract(
    gtk_tree_list_model_get_model(this.raw.asInstanceOf).asInstanceOf
  )

  def getPassthrough(): Boolean =
    gtk_tree_list_model_get_passthrough(this.raw.asInstanceOf).value.!=(0)

  def getRow(position: UInt): TreeListRow = new TreeListRow(
    gtk_tree_list_model_get_row(
      this.raw.asInstanceOf,
      guint(position)
    ).asInstanceOf
  )

  def setAutoexpand(autoexpand: Boolean): Unit =
    gtk_tree_list_model_set_autoexpand(
      this.raw.asInstanceOf,
      gboolean(gint((if autoexpand == true then 1 else 0)))
    )

end TreeListModel

object TreeListModel:
  def apply(
      root: ListModel,
      passthrough: Boolean,
      autoexpand: Boolean,
      create_func: GtkTreeListModelCreateModelFunc,
      user_data: Ptr[Byte],
      user_destroy: GDestroyNotify
  ): TreeListModel = new TreeListModel(
    gtk_tree_list_model_new(
      root.getUnsafeRawPointer().asInstanceOf,
      gboolean(gint((if passthrough == true then 1 else 0))),
      gboolean(gint((if autoexpand == true then 1 else 0))),
      create_func,
      gpointer(user_data),
      user_destroy
    ).asInstanceOf
  )
end TreeListModel
