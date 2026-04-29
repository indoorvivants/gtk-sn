package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusArgInfo: _count: The reference count or -1 if statically allocated. : D-Bus signature of the argument (a single complete type). : (array zero-terminated=1): A pointer to a %NULL-terminated array of pointers to #GDBusAnnotationInfo structures or %NULL if there are no annotations.
*/
opaque type _GDBusArgInfo = CStruct4[_root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[Byte]]

object _GDBusArgInfo:
  given _tag: Tag[_GDBusArgInfo] = Tag.materializeCStruct4Tag[_root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[Byte]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GDBusArgInfo)
      inline def ref_count : _root_.sn.gnome.glib.internal.gint = struct._1
      inline def ref_count_=(value: _root_.sn.gnome.glib.internal.gint): Unit = (!struct.at1 = value)
      inline def name : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._2
      inline def name_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = (!struct.at2 = value)
      inline def signature : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._3
      inline def signature_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = (!struct.at3 = value)
      inline def annotations : Ptr[Ptr[GDBusAnnotationInfo]] = struct._4.asInstanceOf[Ptr[Ptr[GDBusAnnotationInfo]]]
      inline def annotations_=(value: Ptr[Ptr[GDBusAnnotationInfo]]): Unit = (!struct.at4 = value.asInstanceOf[Ptr[Byte]])
    end extension
  
  // Allocates _GDBusArgInfo on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GDBusArgInfo] = scala.scalanative.unsafe.alloc[_GDBusArgInfo](1)
  def apply(ref_count : _root_.sn.gnome.glib.internal.gint, name : Ptr[_root_.sn.gnome.glib.internal.gchar], signature : Ptr[_root_.sn.gnome.glib.internal.gchar], annotations : Ptr[Ptr[GDBusAnnotationInfo]])(using Zone): Ptr[_GDBusArgInfo] =
    val ____ptr = apply()
    (!____ptr).ref_count = ref_count
    (!____ptr).name = name
    (!____ptr).signature = signature
    (!____ptr).annotations = annotations
    ____ptr