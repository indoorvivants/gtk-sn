package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkAccessibleTextInterface:
*/
opaque type _GtkAccessibleTextInterface = CStruct7[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr3[Ptr[GtkAccessibleText], CUnsignedInt, CUnsignedInt, Ptr[_root_.sn.gnome.glib.internal.GBytes]], CFuncPtr5[Ptr[GtkAccessibleText], CUnsignedInt, GtkAccessibleTextGranularity, Ptr[CUnsignedInt], Ptr[CUnsignedInt], Ptr[_root_.sn.gnome.glib.internal.GBytes]], CFuncPtr1[Ptr[GtkAccessibleText], CUnsignedInt], CFuncPtr3[Ptr[GtkAccessibleText], Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[Ptr[GtkAccessibleTextRange]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr6[Ptr[GtkAccessibleText], CUnsignedInt, Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[Ptr[GtkAccessibleTextRange]], Ptr[Ptr[CString]], Ptr[Ptr[CString]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[GtkAccessibleText], Ptr[Ptr[CString]], Ptr[Ptr[CString]], Unit]]

object _GtkAccessibleTextInterface:
  given _tag: Tag[_GtkAccessibleTextInterface] = Tag.materializeCStruct7Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr3[Ptr[GtkAccessibleText], CUnsignedInt, CUnsignedInt, Ptr[_root_.sn.gnome.glib.internal.GBytes]], CFuncPtr5[Ptr[GtkAccessibleText], CUnsignedInt, GtkAccessibleTextGranularity, Ptr[CUnsignedInt], Ptr[CUnsignedInt], Ptr[_root_.sn.gnome.glib.internal.GBytes]], CFuncPtr1[Ptr[GtkAccessibleText], CUnsignedInt], CFuncPtr3[Ptr[GtkAccessibleText], Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[Ptr[GtkAccessibleTextRange]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr6[Ptr[GtkAccessibleText], CUnsignedInt, Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[Ptr[GtkAccessibleTextRange]], Ptr[Ptr[CString]], Ptr[Ptr[CString]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[GtkAccessibleText], Ptr[Ptr[CString]], Ptr[Ptr[CString]], Unit]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkAccessibleTextInterface)
      inline def g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
      inline def get_contents : CFuncPtr3[Ptr[GtkAccessibleText], CUnsignedInt, CUnsignedInt, Ptr[_root_.sn.gnome.glib.internal.GBytes]] = struct._2
      inline def get_contents_=(value: CFuncPtr3[Ptr[GtkAccessibleText], CUnsignedInt, CUnsignedInt, Ptr[_root_.sn.gnome.glib.internal.GBytes]]): Unit = (!struct.at2 = value)
      inline def get_contents_at : CFuncPtr5[Ptr[GtkAccessibleText], CUnsignedInt, GtkAccessibleTextGranularity, Ptr[CUnsignedInt], Ptr[CUnsignedInt], Ptr[_root_.sn.gnome.glib.internal.GBytes]] = struct._3
      inline def get_contents_at_=(value: CFuncPtr5[Ptr[GtkAccessibleText], CUnsignedInt, GtkAccessibleTextGranularity, Ptr[CUnsignedInt], Ptr[CUnsignedInt], Ptr[_root_.sn.gnome.glib.internal.GBytes]]): Unit = (!struct.at3 = value)
      inline def get_caret_position : CFuncPtr1[Ptr[GtkAccessibleText], CUnsignedInt] = struct._4
      inline def get_caret_position_=(value: CFuncPtr1[Ptr[GtkAccessibleText], CUnsignedInt]): Unit = (!struct.at4 = value)
      inline def get_selection : CFuncPtr3[Ptr[GtkAccessibleText], Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[Ptr[GtkAccessibleTextRange]], _root_.sn.gnome.glib.internal.gboolean] = struct._5
      inline def get_selection_=(value: CFuncPtr3[Ptr[GtkAccessibleText], Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[Ptr[GtkAccessibleTextRange]], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at5 = value)
      inline def get_attributes : CFuncPtr6[Ptr[GtkAccessibleText], CUnsignedInt, Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[Ptr[GtkAccessibleTextRange]], Ptr[Ptr[CString]], Ptr[Ptr[CString]], _root_.sn.gnome.glib.internal.gboolean] = struct._6
      inline def get_attributes_=(value: CFuncPtr6[Ptr[GtkAccessibleText], CUnsignedInt, Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[Ptr[GtkAccessibleTextRange]], Ptr[Ptr[CString]], Ptr[Ptr[CString]], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at6 = value)
      inline def get_default_attributes : CFuncPtr3[Ptr[GtkAccessibleText], Ptr[Ptr[CString]], Ptr[Ptr[CString]], Unit] = struct._7
      inline def get_default_attributes_=(value: CFuncPtr3[Ptr[GtkAccessibleText], Ptr[Ptr[CString]], Ptr[Ptr[CString]], Unit]): Unit = (!struct.at7 = value)
    end extension
  
  // Allocates _GtkAccessibleTextInterface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkAccessibleTextInterface] = scala.scalanative.unsafe.alloc[_GtkAccessibleTextInterface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, get_contents : CFuncPtr3[Ptr[GtkAccessibleText], CUnsignedInt, CUnsignedInt, Ptr[_root_.sn.gnome.glib.internal.GBytes]], get_contents_at : CFuncPtr5[Ptr[GtkAccessibleText], CUnsignedInt, GtkAccessibleTextGranularity, Ptr[CUnsignedInt], Ptr[CUnsignedInt], Ptr[_root_.sn.gnome.glib.internal.GBytes]], get_caret_position : CFuncPtr1[Ptr[GtkAccessibleText], CUnsignedInt], get_selection : CFuncPtr3[Ptr[GtkAccessibleText], Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[Ptr[GtkAccessibleTextRange]], _root_.sn.gnome.glib.internal.gboolean], get_attributes : CFuncPtr6[Ptr[GtkAccessibleText], CUnsignedInt, Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[Ptr[GtkAccessibleTextRange]], Ptr[Ptr[CString]], Ptr[Ptr[CString]], _root_.sn.gnome.glib.internal.gboolean], get_default_attributes : CFuncPtr3[Ptr[GtkAccessibleText], Ptr[Ptr[CString]], Ptr[Ptr[CString]], Unit])(using Zone): Ptr[_GtkAccessibleTextInterface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).get_contents = get_contents
    (!____ptr).get_contents_at = get_contents_at
    (!____ptr).get_caret_position = get_caret_position
    (!____ptr).get_selection = get_selection
    (!____ptr).get_attributes = get_attributes
    (!____ptr).get_default_attributes = get_default_attributes
    ____ptr