package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkBuildableIface: _iface: the parent class
*/
opaque type _GtkBuildableIface = CStruct11[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr2[Ptr[GtkBuildable], CString, Unit], CFuncPtr1[Ptr[GtkBuildable], CString], CFuncPtr4[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.sn.gnome.gobject.internal.GObject], CString, Unit], CFuncPtr4[Ptr[GtkBuildable], Ptr[GtkBuilder], CString, Ptr[_root_.sn.gnome.gobject.internal.GValue], Unit], CFuncPtr3[Ptr[GtkBuildable], Ptr[GtkBuilder], CString, Ptr[_root_.sn.gnome.gobject.internal.GObject]], CFuncPtr6[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.sn.gnome.gobject.internal.GObject], CString, Ptr[GtkBuildableParser], Ptr[_root_.sn.gnome.glib.internal.gpointer], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr5[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.sn.gnome.gobject.internal.GObject], CString, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr5[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.sn.gnome.gobject.internal.GObject], CString, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr2[Ptr[GtkBuildable], Ptr[GtkBuilder], Unit], CFuncPtr3[Ptr[GtkBuildable], Ptr[GtkBuilder], CString, Ptr[_root_.sn.gnome.gobject.internal.GObject]]]

object _GtkBuildableIface:
  given _tag: Tag[_GtkBuildableIface] = Tag.materializeCStruct11Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr2[Ptr[GtkBuildable], CString, Unit], CFuncPtr1[Ptr[GtkBuildable], CString], CFuncPtr4[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.sn.gnome.gobject.internal.GObject], CString, Unit], CFuncPtr4[Ptr[GtkBuildable], Ptr[GtkBuilder], CString, Ptr[_root_.sn.gnome.gobject.internal.GValue], Unit], CFuncPtr3[Ptr[GtkBuildable], Ptr[GtkBuilder], CString, Ptr[_root_.sn.gnome.gobject.internal.GObject]], CFuncPtr6[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.sn.gnome.gobject.internal.GObject], CString, Ptr[GtkBuildableParser], Ptr[_root_.sn.gnome.glib.internal.gpointer], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr5[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.sn.gnome.gobject.internal.GObject], CString, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr5[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.sn.gnome.gobject.internal.GObject], CString, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr2[Ptr[GtkBuildable], Ptr[GtkBuilder], Unit], CFuncPtr3[Ptr[GtkBuildable], Ptr[GtkBuilder], CString, Ptr[_root_.sn.gnome.gobject.internal.GObject]]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkBuildableIface)
      inline def g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
      inline def set_id : CFuncPtr2[Ptr[GtkBuildable], CString, Unit] = struct._2
      inline def set_id_=(value: CFuncPtr2[Ptr[GtkBuildable], CString, Unit]): Unit = (!struct.at2 = value)
      inline def get_id : CFuncPtr1[Ptr[GtkBuildable], CString] = struct._3
      inline def get_id_=(value: CFuncPtr1[Ptr[GtkBuildable], CString]): Unit = (!struct.at3 = value)
      inline def add_child : CFuncPtr4[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.sn.gnome.gobject.internal.GObject], CString, Unit] = struct._4
      inline def add_child_=(value: CFuncPtr4[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.sn.gnome.gobject.internal.GObject], CString, Unit]): Unit = (!struct.at4 = value)
      inline def set_buildable_property : CFuncPtr4[Ptr[GtkBuildable], Ptr[GtkBuilder], CString, Ptr[_root_.sn.gnome.gobject.internal.GValue], Unit] = struct._5
      inline def set_buildable_property_=(value: CFuncPtr4[Ptr[GtkBuildable], Ptr[GtkBuilder], CString, Ptr[_root_.sn.gnome.gobject.internal.GValue], Unit]): Unit = (!struct.at5 = value)
      inline def construct_child : CFuncPtr3[Ptr[GtkBuildable], Ptr[GtkBuilder], CString, Ptr[_root_.sn.gnome.gobject.internal.GObject]] = struct._6
      inline def construct_child_=(value: CFuncPtr3[Ptr[GtkBuildable], Ptr[GtkBuilder], CString, Ptr[_root_.sn.gnome.gobject.internal.GObject]]): Unit = (!struct.at6 = value)
      inline def custom_tag_start : CFuncPtr6[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.sn.gnome.gobject.internal.GObject], CString, Ptr[GtkBuildableParser], Ptr[_root_.sn.gnome.glib.internal.gpointer], _root_.sn.gnome.glib.internal.gboolean] = struct._7
      inline def custom_tag_start_=(value: CFuncPtr6[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.sn.gnome.gobject.internal.GObject], CString, Ptr[GtkBuildableParser], Ptr[_root_.sn.gnome.glib.internal.gpointer], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at7 = value)
      inline def custom_tag_end : CFuncPtr5[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.sn.gnome.gobject.internal.GObject], CString, _root_.sn.gnome.glib.internal.gpointer, Unit] = struct._8
      inline def custom_tag_end_=(value: CFuncPtr5[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.sn.gnome.gobject.internal.GObject], CString, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = (!struct.at8 = value)
      inline def custom_finished : CFuncPtr5[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.sn.gnome.gobject.internal.GObject], CString, _root_.sn.gnome.glib.internal.gpointer, Unit] = struct._9
      inline def custom_finished_=(value: CFuncPtr5[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.sn.gnome.gobject.internal.GObject], CString, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = (!struct.at9 = value)
      inline def parser_finished : CFuncPtr2[Ptr[GtkBuildable], Ptr[GtkBuilder], Unit] = struct._10
      inline def parser_finished_=(value: CFuncPtr2[Ptr[GtkBuildable], Ptr[GtkBuilder], Unit]): Unit = (!struct.at10 = value)
      inline def get_internal_child : CFuncPtr3[Ptr[GtkBuildable], Ptr[GtkBuilder], CString, Ptr[_root_.sn.gnome.gobject.internal.GObject]] = struct._11
      inline def get_internal_child_=(value: CFuncPtr3[Ptr[GtkBuildable], Ptr[GtkBuilder], CString, Ptr[_root_.sn.gnome.gobject.internal.GObject]]): Unit = (!struct.at11 = value)
    end extension
  
  // Allocates _GtkBuildableIface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkBuildableIface] = scala.scalanative.unsafe.alloc[_GtkBuildableIface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, set_id : CFuncPtr2[Ptr[GtkBuildable], CString, Unit], get_id : CFuncPtr1[Ptr[GtkBuildable], CString], add_child : CFuncPtr4[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.sn.gnome.gobject.internal.GObject], CString, Unit], set_buildable_property : CFuncPtr4[Ptr[GtkBuildable], Ptr[GtkBuilder], CString, Ptr[_root_.sn.gnome.gobject.internal.GValue], Unit], construct_child : CFuncPtr3[Ptr[GtkBuildable], Ptr[GtkBuilder], CString, Ptr[_root_.sn.gnome.gobject.internal.GObject]], custom_tag_start : CFuncPtr6[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.sn.gnome.gobject.internal.GObject], CString, Ptr[GtkBuildableParser], Ptr[_root_.sn.gnome.glib.internal.gpointer], _root_.sn.gnome.glib.internal.gboolean], custom_tag_end : CFuncPtr5[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.sn.gnome.gobject.internal.GObject], CString, _root_.sn.gnome.glib.internal.gpointer, Unit], custom_finished : CFuncPtr5[Ptr[GtkBuildable], Ptr[GtkBuilder], Ptr[_root_.sn.gnome.gobject.internal.GObject], CString, _root_.sn.gnome.glib.internal.gpointer, Unit], parser_finished : CFuncPtr2[Ptr[GtkBuildable], Ptr[GtkBuilder], Unit], get_internal_child : CFuncPtr3[Ptr[GtkBuildable], Ptr[GtkBuilder], CString, Ptr[_root_.sn.gnome.gobject.internal.GObject]])(using Zone): Ptr[_GtkBuildableIface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).set_id = set_id
    (!____ptr).get_id = get_id
    (!____ptr).add_child = add_child
    (!____ptr).set_buildable_property = set_buildable_property
    (!____ptr).construct_child = construct_child
    (!____ptr).custom_tag_start = custom_tag_start
    (!____ptr).custom_tag_end = custom_tag_end
    (!____ptr).custom_finished = custom_finished
    (!____ptr).parser_finished = parser_finished
    (!____ptr).get_internal_child = get_internal_child
    ____ptr