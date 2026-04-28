package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkTreeDragDestIface: _data_received: Asks the `GtkTreeDragDest` to insert a row before the path dest, deriving the contents of the row from selection_data. _drop_possible: Determines whether a drop is possible before the given dest_path, at the same depth as dest_path.
*/
opaque type _GtkTreeDragDestIface = CStruct3[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr3[Ptr[GtkTreeDragDest], Ptr[GtkTreePath], Ptr[_root_.sn.gnome.gobject.internal.GValue], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[GtkTreeDragDest], Ptr[GtkTreePath], Ptr[_root_.sn.gnome.gobject.internal.GValue], _root_.sn.gnome.glib.internal.gboolean]]

object _GtkTreeDragDestIface:
  given _tag: Tag[_GtkTreeDragDestIface] = Tag.materializeCStruct3Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr3[Ptr[GtkTreeDragDest], Ptr[GtkTreePath], Ptr[_root_.sn.gnome.gobject.internal.GValue], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[GtkTreeDragDest], Ptr[GtkTreePath], Ptr[_root_.sn.gnome.gobject.internal.GValue], _root_.sn.gnome.glib.internal.gboolean]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkTreeDragDestIface)
      inline def g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
      inline def drag_data_received : CFuncPtr3[Ptr[GtkTreeDragDest], Ptr[GtkTreePath], Ptr[_root_.sn.gnome.gobject.internal.GValue], _root_.sn.gnome.glib.internal.gboolean] = struct._2
      inline def drag_data_received_=(value: CFuncPtr3[Ptr[GtkTreeDragDest], Ptr[GtkTreePath], Ptr[_root_.sn.gnome.gobject.internal.GValue], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at2 = value)
      inline def row_drop_possible : CFuncPtr3[Ptr[GtkTreeDragDest], Ptr[GtkTreePath], Ptr[_root_.sn.gnome.gobject.internal.GValue], _root_.sn.gnome.glib.internal.gboolean] = struct._3
      inline def row_drop_possible_=(value: CFuncPtr3[Ptr[GtkTreeDragDest], Ptr[GtkTreePath], Ptr[_root_.sn.gnome.gobject.internal.GValue], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates _GtkTreeDragDestIface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkTreeDragDestIface] = scala.scalanative.unsafe.alloc[_GtkTreeDragDestIface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, drag_data_received : CFuncPtr3[Ptr[GtkTreeDragDest], Ptr[GtkTreePath], Ptr[_root_.sn.gnome.gobject.internal.GValue], _root_.sn.gnome.glib.internal.gboolean], row_drop_possible : CFuncPtr3[Ptr[GtkTreeDragDest], Ptr[GtkTreePath], Ptr[_root_.sn.gnome.gobject.internal.GValue], _root_.sn.gnome.glib.internal.gboolean])(using Zone): Ptr[_GtkTreeDragDestIface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).drag_data_received = drag_data_received
    (!____ptr).row_drop_possible = row_drop_possible
    ____ptr