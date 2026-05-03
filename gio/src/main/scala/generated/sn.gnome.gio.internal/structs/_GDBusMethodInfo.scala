package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusMethodInfo: _count: The reference count or -1 if statically allocated. _args: (array zero-terminated=1): A pointer to a %NULL-terminated array of pointers to #GDBusArgInfo structures or %NULL if there are no in arguments. _args: (array zero-terminated=1): A pointer to a %NULL-terminated array of pointers to #GDBusArgInfo structures or %NULL if there are no out arguments. : (array zero-terminated=1): A pointer to a %NULL-terminated array of pointers to #GDBusAnnotationInfo structures or %NULL if there are no annotations.
*/
opaque type _GDBusMethodInfo = CStruct5[_root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[Byte], Ptr[Byte], Ptr[Byte]]

object _GDBusMethodInfo:
  given _tag: Tag[_GDBusMethodInfo] = Tag.materializeCStruct5Tag[_root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[Byte], Ptr[Byte], Ptr[Byte]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GDBusMethodInfo)
      inline def ref_count : _root_.sn.gnome.glib.internal.gint = struct._1
      inline def ref_count_=(value: _root_.sn.gnome.glib.internal.gint): Unit = (!struct.at1 = value)
      inline def name : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._2
      inline def name_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = (!struct.at2 = value)
      inline def in_args : Ptr[Ptr[GDBusArgInfo]] = struct._3.asInstanceOf[Ptr[Ptr[GDBusArgInfo]]]
      inline def in_args_=(value: Ptr[Ptr[GDBusArgInfo]]): Unit = (!struct.at3 = value.asInstanceOf[Ptr[Byte]])
      inline def out_args : Ptr[Ptr[GDBusArgInfo]] = struct._4.asInstanceOf[Ptr[Ptr[GDBusArgInfo]]]
      inline def out_args_=(value: Ptr[Ptr[GDBusArgInfo]]): Unit = (!struct.at4 = value.asInstanceOf[Ptr[Byte]])
      inline def annotations : Ptr[Ptr[GDBusAnnotationInfo]] = struct._5.asInstanceOf[Ptr[Ptr[GDBusAnnotationInfo]]]
      inline def annotations_=(value: Ptr[Ptr[GDBusAnnotationInfo]]): Unit = (!struct.at5 = value.asInstanceOf[Ptr[Byte]])
    end extension
  
  // Allocates _GDBusMethodInfo on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GDBusMethodInfo] = scala.scalanative.unsafe.alloc[_GDBusMethodInfo](1)
  def apply(ref_count : _root_.sn.gnome.glib.internal.gint, name : Ptr[_root_.sn.gnome.glib.internal.gchar], in_args : Ptr[Ptr[GDBusArgInfo]], out_args : Ptr[Ptr[GDBusArgInfo]], annotations : Ptr[Ptr[GDBusAnnotationInfo]])(using Zone): Ptr[_GDBusMethodInfo] =
    val ____ptr = apply()
    (!____ptr).ref_count = ref_count
    (!____ptr).name = name
    (!____ptr).in_args = in_args
    (!____ptr).out_args = out_args
    (!____ptr).annotations = annotations
    ____ptr