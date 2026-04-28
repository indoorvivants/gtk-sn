package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GtkEditableInterface = CStruct10[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr4[Ptr[GtkEditable], CString, CInt, Ptr[CInt], Unit], CFuncPtr3[Ptr[GtkEditable], CInt, CInt, Unit], CFuncPtr1[Ptr[GtkEditable], Unit], CFuncPtr1[Ptr[GtkEditable], CString], CFuncPtr4[Ptr[GtkEditable], CString, CInt, Ptr[CInt], Unit], CFuncPtr3[Ptr[GtkEditable], CInt, CInt, Unit], CFuncPtr3[Ptr[GtkEditable], Ptr[CInt], Ptr[CInt], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[GtkEditable], CInt, CInt, Unit], CFuncPtr1[Ptr[GtkEditable], Ptr[GtkEditable]]]

object _GtkEditableInterface:
  given _tag: Tag[_GtkEditableInterface] = Tag.materializeCStruct10Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr4[Ptr[GtkEditable], CString, CInt, Ptr[CInt], Unit], CFuncPtr3[Ptr[GtkEditable], CInt, CInt, Unit], CFuncPtr1[Ptr[GtkEditable], Unit], CFuncPtr1[Ptr[GtkEditable], CString], CFuncPtr4[Ptr[GtkEditable], CString, CInt, Ptr[CInt], Unit], CFuncPtr3[Ptr[GtkEditable], CInt, CInt, Unit], CFuncPtr3[Ptr[GtkEditable], Ptr[CInt], Ptr[CInt], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[GtkEditable], CInt, CInt, Unit], CFuncPtr1[Ptr[GtkEditable], Ptr[GtkEditable]]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkEditableInterface)
      inline def base_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def base_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
      inline def insert_text : CFuncPtr4[Ptr[GtkEditable], CString, CInt, Ptr[CInt], Unit] = struct._2
      inline def insert_text_=(value: CFuncPtr4[Ptr[GtkEditable], CString, CInt, Ptr[CInt], Unit]): Unit = (!struct.at2 = value)
      inline def delete_text : CFuncPtr3[Ptr[GtkEditable], CInt, CInt, Unit] = struct._3
      inline def delete_text_=(value: CFuncPtr3[Ptr[GtkEditable], CInt, CInt, Unit]): Unit = (!struct.at3 = value)
      inline def changed : CFuncPtr1[Ptr[GtkEditable], Unit] = struct._4
      inline def changed_=(value: CFuncPtr1[Ptr[GtkEditable], Unit]): Unit = (!struct.at4 = value)
      inline def get_text : CFuncPtr1[Ptr[GtkEditable], CString] = struct._5
      inline def get_text_=(value: CFuncPtr1[Ptr[GtkEditable], CString]): Unit = (!struct.at5 = value)
      inline def do_insert_text : CFuncPtr4[Ptr[GtkEditable], CString, CInt, Ptr[CInt], Unit] = struct._6
      inline def do_insert_text_=(value: CFuncPtr4[Ptr[GtkEditable], CString, CInt, Ptr[CInt], Unit]): Unit = (!struct.at6 = value)
      inline def do_delete_text : CFuncPtr3[Ptr[GtkEditable], CInt, CInt, Unit] = struct._7
      inline def do_delete_text_=(value: CFuncPtr3[Ptr[GtkEditable], CInt, CInt, Unit]): Unit = (!struct.at7 = value)
      inline def get_selection_bounds : CFuncPtr3[Ptr[GtkEditable], Ptr[CInt], Ptr[CInt], _root_.sn.gnome.glib.internal.gboolean] = struct._8
      inline def get_selection_bounds_=(value: CFuncPtr3[Ptr[GtkEditable], Ptr[CInt], Ptr[CInt], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at8 = value)
      inline def set_selection_bounds : CFuncPtr3[Ptr[GtkEditable], CInt, CInt, Unit] = struct._9
      inline def set_selection_bounds_=(value: CFuncPtr3[Ptr[GtkEditable], CInt, CInt, Unit]): Unit = (!struct.at9 = value)
      inline def get_delegate : CFuncPtr1[Ptr[GtkEditable], Ptr[GtkEditable]] = struct._10
      inline def get_delegate_=(value: CFuncPtr1[Ptr[GtkEditable], Ptr[GtkEditable]]): Unit = (!struct.at10 = value)
    end extension
  
  // Allocates _GtkEditableInterface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkEditableInterface] = scala.scalanative.unsafe.alloc[_GtkEditableInterface](1)
  def apply(base_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, insert_text : CFuncPtr4[Ptr[GtkEditable], CString, CInt, Ptr[CInt], Unit], delete_text : CFuncPtr3[Ptr[GtkEditable], CInt, CInt, Unit], changed : CFuncPtr1[Ptr[GtkEditable], Unit], get_text : CFuncPtr1[Ptr[GtkEditable], CString], do_insert_text : CFuncPtr4[Ptr[GtkEditable], CString, CInt, Ptr[CInt], Unit], do_delete_text : CFuncPtr3[Ptr[GtkEditable], CInt, CInt, Unit], get_selection_bounds : CFuncPtr3[Ptr[GtkEditable], Ptr[CInt], Ptr[CInt], _root_.sn.gnome.glib.internal.gboolean], set_selection_bounds : CFuncPtr3[Ptr[GtkEditable], CInt, CInt, Unit], get_delegate : CFuncPtr1[Ptr[GtkEditable], Ptr[GtkEditable]])(using Zone): Ptr[_GtkEditableInterface] =
    val ____ptr = apply()
    (!____ptr).base_iface = base_iface
    (!____ptr).insert_text = insert_text
    (!____ptr).delete_text = delete_text
    (!____ptr).changed = changed
    (!____ptr).get_text = get_text
    (!____ptr).do_insert_text = do_insert_text
    (!____ptr).do_delete_text = do_delete_text
    (!____ptr).get_selection_bounds = get_selection_bounds
    (!____ptr).set_selection_bounds = set_selection_bounds
    (!____ptr).get_delegate = get_delegate
    ____ptr