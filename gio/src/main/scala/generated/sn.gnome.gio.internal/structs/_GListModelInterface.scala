package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GListModelInterface = CStruct4[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr1[Ptr[GListModel], _root_.sn.gnome.gobject.internal.GType], CFuncPtr1[Ptr[GListModel], _root_.sn.gnome.glib.internal.guint], CFuncPtr2[Ptr[GListModel], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gpointer]]

object _GListModelInterface:
  given _tag: Tag[_GListModelInterface] = Tag.materializeCStruct4Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr1[Ptr[GListModel], _root_.sn.gnome.gobject.internal.GType], CFuncPtr1[Ptr[GListModel], _root_.sn.gnome.glib.internal.guint], CFuncPtr2[Ptr[GListModel], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gpointer]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GListModelInterface)
      inline def g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
      inline def get_item_type : CFuncPtr1[Ptr[GListModel], _root_.sn.gnome.gobject.internal.GType] = struct._2
      inline def get_item_type_=(value: CFuncPtr1[Ptr[GListModel], _root_.sn.gnome.gobject.internal.GType]): Unit = (!struct.at2 = value)
      inline def get_n_items : CFuncPtr1[Ptr[GListModel], _root_.sn.gnome.glib.internal.guint] = struct._3
      inline def get_n_items_=(value: CFuncPtr1[Ptr[GListModel], _root_.sn.gnome.glib.internal.guint]): Unit = (!struct.at3 = value)
      inline def get_item : CFuncPtr2[Ptr[GListModel], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gpointer] = struct._4
      inline def get_item_=(value: CFuncPtr2[Ptr[GListModel], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gpointer]): Unit = (!struct.at4 = value)
    end extension
  
  // Allocates _GListModelInterface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GListModelInterface] = scala.scalanative.unsafe.alloc[_GListModelInterface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, get_item_type : CFuncPtr1[Ptr[GListModel], _root_.sn.gnome.gobject.internal.GType], get_n_items : CFuncPtr1[Ptr[GListModel], _root_.sn.gnome.glib.internal.guint], get_item : CFuncPtr2[Ptr[GListModel], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gpointer])(using Zone): Ptr[_GListModelInterface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).get_item_type = get_item_type
    (!____ptr).get_n_items = get_n_items
    (!____ptr).get_item = get_item
    ____ptr