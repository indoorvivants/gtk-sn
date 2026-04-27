package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkTreeDragSourceIface: _draggable: Asks the `GtkTreeDragSource` whether a particular row can be used as the source of a DND operation. _data_get: Asks the `GtkTreeDragSource` to fill in selection_data with a representation of the row at path. _data_delete: Asks the `GtkTreeDragSource` to delete the row at path, because it was moved somewhere else via drag-and-drop.
*/
opaque type GtkTreeDragSourceIface = CStruct4[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr2[Ptr[GtkTreeDragSource], Ptr[GtkTreePath], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr2[Ptr[GtkTreeDragSource], Ptr[GtkTreePath], Ptr[GdkContentProvider]], CFuncPtr2[Ptr[GtkTreeDragSource], Ptr[GtkTreePath], _root_.sn.gnome.glib.internal.gboolean]]

object GtkTreeDragSourceIface:
  given _tag: Tag[GtkTreeDragSourceIface] = Tag.materializeCStruct4Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr2[Ptr[GtkTreeDragSource], Ptr[GtkTreePath], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr2[Ptr[GtkTreeDragSource], Ptr[GtkTreePath], Ptr[GdkContentProvider]], CFuncPtr2[Ptr[GtkTreeDragSource], Ptr[GtkTreePath], _root_.sn.gnome.glib.internal.gboolean]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkTreeDragSourceIface)
      inline def g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
      inline def row_draggable : CFuncPtr2[Ptr[GtkTreeDragSource], Ptr[GtkTreePath], _root_.sn.gnome.glib.internal.gboolean] = struct._2
      inline def row_draggable_=(value: CFuncPtr2[Ptr[GtkTreeDragSource], Ptr[GtkTreePath], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at2 = value)
      inline def drag_data_get : CFuncPtr2[Ptr[GtkTreeDragSource], Ptr[GtkTreePath], Ptr[GdkContentProvider]] = struct._3
      inline def drag_data_get_=(value: CFuncPtr2[Ptr[GtkTreeDragSource], Ptr[GtkTreePath], Ptr[GdkContentProvider]]): Unit = (!struct.at3 = value)
      inline def drag_data_delete : CFuncPtr2[Ptr[GtkTreeDragSource], Ptr[GtkTreePath], _root_.sn.gnome.glib.internal.gboolean] = struct._4
      inline def drag_data_delete_=(value: CFuncPtr2[Ptr[GtkTreeDragSource], Ptr[GtkTreePath], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at4 = value)
    end extension
  
  // Allocates GtkTreeDragSourceIface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkTreeDragSourceIface] = scala.scalanative.unsafe.alloc[GtkTreeDragSourceIface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, row_draggable : CFuncPtr2[Ptr[GtkTreeDragSource], Ptr[GtkTreePath], _root_.sn.gnome.glib.internal.gboolean], drag_data_get : CFuncPtr2[Ptr[GtkTreeDragSource], Ptr[GtkTreePath], Ptr[GdkContentProvider]], drag_data_delete : CFuncPtr2[Ptr[GtkTreeDragSource], Ptr[GtkTreePath], _root_.sn.gnome.glib.internal.gboolean])(using Zone): Ptr[GtkTreeDragSourceIface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).row_draggable = row_draggable
    (!____ptr).drag_data_get = drag_data_get
    (!____ptr).drag_data_delete = drag_data_delete
    ____ptr