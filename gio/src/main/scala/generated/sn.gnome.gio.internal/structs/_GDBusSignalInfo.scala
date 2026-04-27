package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusSignalInfo: _count: The reference count or -1 if statically allocated.
*/
opaque type _GDBusSignalInfo = CStruct4[_root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[Byte], Ptr[Byte]]

object _GDBusSignalInfo:
  given _tag: Tag[_GDBusSignalInfo] = Tag.materializeCStruct4Tag[_root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[Byte], Ptr[Byte]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GDBusSignalInfo)
      inline def ref_count : _root_.sn.gnome.glib.internal.gint = struct._1
      inline def ref_count_=(value: _root_.sn.gnome.glib.internal.gint): Unit = (!struct.at1 = value)
      inline def name : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._2
      inline def name_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = (!struct.at2 = value)
      inline def args : Ptr[Ptr[GDBusArgInfo]] = struct._3.asInstanceOf[Ptr[Ptr[GDBusArgInfo]]]
      inline def args_=(value: Ptr[Ptr[GDBusArgInfo]]): Unit = (!struct.at3 = value.asInstanceOf[Ptr[Byte]])
      inline def annotations : Ptr[Ptr[GDBusAnnotationInfo]] = struct._4.asInstanceOf[Ptr[Ptr[GDBusAnnotationInfo]]]
      inline def annotations_=(value: Ptr[Ptr[GDBusAnnotationInfo]]): Unit = (!struct.at4 = value.asInstanceOf[Ptr[Byte]])
    end extension
  
  // Allocates _GDBusSignalInfo on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GDBusSignalInfo] = scala.scalanative.unsafe.alloc[_GDBusSignalInfo](1)
  def apply(ref_count : _root_.sn.gnome.glib.internal.gint, name : Ptr[_root_.sn.gnome.glib.internal.gchar], args : Ptr[Ptr[GDBusArgInfo]], annotations : Ptr[Ptr[GDBusAnnotationInfo]])(using Zone): Ptr[_GDBusSignalInfo] =
    val ____ptr = apply()
    (!____ptr).ref_count = ref_count
    (!____ptr).name = name
    (!____ptr).args = args
    (!____ptr).annotations = annotations
    ____ptr