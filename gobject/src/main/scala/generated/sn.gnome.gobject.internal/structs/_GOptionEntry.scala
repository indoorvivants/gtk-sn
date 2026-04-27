package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * _name must be a printable ASCII character different from '-', or zero if the option has no short name. : Flags from #GOptionFlags
*/
opaque type _GOptionEntry = CStruct7[Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gchar, _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.GOptionArg, _root_.sn.gnome.glib.internal.gpointer, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar]]

object _GOptionEntry:
  given _tag: Tag[_GOptionEntry] = Tag.materializeCStruct7Tag[Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gchar, _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.GOptionArg, _root_.sn.gnome.glib.internal.gpointer, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GOptionEntry)
      inline def long_name : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._1
      inline def long_name_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = (!struct.at1 = value)
      inline def short_name : _root_.sn.gnome.glib.internal.gchar = struct._2
      inline def short_name_=(value: _root_.sn.gnome.glib.internal.gchar): Unit = (!struct.at2 = value)
      inline def flags : _root_.sn.gnome.glib.internal.gint = struct._3
      inline def flags_=(value: _root_.sn.gnome.glib.internal.gint): Unit = (!struct.at3 = value)
      inline def arg : _root_.sn.gnome.glib.internal.GOptionArg = struct._4
      inline def arg_=(value: _root_.sn.gnome.glib.internal.GOptionArg): Unit = (!struct.at4 = value)
      inline def arg_data : _root_.sn.gnome.glib.internal.gpointer = struct._5
      inline def arg_data_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = (!struct.at5 = value)
      inline def description : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._6
      inline def description_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = (!struct.at6 = value)
      inline def arg_description : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._7
      inline def arg_description_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = (!struct.at7 = value)
    end extension
  
  // Allocates _GOptionEntry on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GOptionEntry] = scala.scalanative.unsafe.alloc[_GOptionEntry](1)
  def apply(long_name : Ptr[_root_.sn.gnome.glib.internal.gchar], short_name : _root_.sn.gnome.glib.internal.gchar, flags : _root_.sn.gnome.glib.internal.gint, arg : _root_.sn.gnome.glib.internal.GOptionArg, arg_data : _root_.sn.gnome.glib.internal.gpointer, description : Ptr[_root_.sn.gnome.glib.internal.gchar], arg_description : Ptr[_root_.sn.gnome.glib.internal.gchar])(using Zone): Ptr[_GOptionEntry] =
    val ____ptr = apply()
    (!____ptr).long_name = long_name
    (!____ptr).short_name = short_name
    (!____ptr).flags = flags
    (!____ptr).arg = arg
    (!____ptr).arg_data = arg_data
    (!____ptr).description = description
    (!____ptr).arg_description = arg_description
    ____ptr