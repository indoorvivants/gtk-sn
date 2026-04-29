package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * _name must be a printable ASCII character different from '-', or zero if the option has no short name. : Flags from #GOptionFlags
*/
opaque type GOptionEntry = CStruct7[Ptr[gchar], gchar, gint, GOptionArg, gpointer, Ptr[gchar], Ptr[gchar]]

object GOptionEntry:
  given _tag: Tag[GOptionEntry] = Tag.materializeCStruct7Tag[Ptr[gchar], gchar, gint, GOptionArg, gpointer, Ptr[gchar], Ptr[gchar]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GOptionEntry)
      inline def long_name : Ptr[gchar] = struct._1
      inline def long_name_=(value: Ptr[gchar]): Unit = (!struct.at1 = value)
      inline def short_name : gchar = struct._2
      inline def short_name_=(value: gchar): Unit = (!struct.at2 = value)
      inline def flags : gint = struct._3
      inline def flags_=(value: gint): Unit = (!struct.at3 = value)
      inline def arg : GOptionArg = struct._4
      inline def arg_=(value: GOptionArg): Unit = (!struct.at4 = value)
      inline def arg_data : gpointer = struct._5
      inline def arg_data_=(value: gpointer): Unit = (!struct.at5 = value)
      inline def description : Ptr[gchar] = struct._6
      inline def description_=(value: Ptr[gchar]): Unit = (!struct.at6 = value)
      inline def arg_description : Ptr[gchar] = struct._7
      inline def arg_description_=(value: Ptr[gchar]): Unit = (!struct.at7 = value)
    end extension
  
  // Allocates GOptionEntry on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GOptionEntry] = scala.scalanative.unsafe.alloc[GOptionEntry](1)
  def apply(long_name : Ptr[gchar], short_name : gchar, flags : gint, arg : GOptionArg, arg_data : gpointer, description : Ptr[gchar], arg_description : Ptr[gchar])(using Zone): Ptr[GOptionEntry] =
    val ____ptr = apply()
    (!____ptr).long_name = long_name
    (!____ptr).short_name = short_name
    (!____ptr).flags = flags
    (!____ptr).arg = arg
    (!____ptr).arg_data = arg_data
    (!____ptr).description = description
    (!____ptr).arg_description = arg_description
    ____ptr