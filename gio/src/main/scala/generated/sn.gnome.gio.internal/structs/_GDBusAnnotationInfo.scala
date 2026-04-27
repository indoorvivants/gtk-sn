package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusAnnotationInfo: _count: The reference count or -1 if statically allocated. : The name of the annotation, e.g. "org.freedesktop.DBus.Deprecated". : The value of the annotation. : (array zero-terminated=1): A pointer to a %NULL-terminated array of pointers to #GDBusAnnotationInfo structures or %NULL if there are no annotations.
*/
opaque type _GDBusAnnotationInfo = CStruct4[_root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[Byte]]

object _GDBusAnnotationInfo:
  given _tag: Tag[_GDBusAnnotationInfo] = Tag.materializeCStruct4Tag[_root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[Byte]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GDBusAnnotationInfo)
      inline def ref_count : _root_.sn.gnome.glib.internal.gint = struct._1
      inline def ref_count_=(value: _root_.sn.gnome.glib.internal.gint): Unit = (!struct.at1 = value)
      inline def key : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._2
      inline def key_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = (!struct.at2 = value)
      inline def value : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._3
      inline def value_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = (!struct.at3 = value)
      inline def annotations : Ptr[Ptr[GDBusAnnotationInfo]] = struct._4.asInstanceOf[Ptr[Ptr[GDBusAnnotationInfo]]]
      inline def annotations_=(value: Ptr[Ptr[GDBusAnnotationInfo]]): Unit = (!struct.at4 = value.asInstanceOf[Ptr[Byte]])
    end extension
  
  // Allocates _GDBusAnnotationInfo on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GDBusAnnotationInfo] = scala.scalanative.unsafe.alloc[_GDBusAnnotationInfo](1)
  def apply(ref_count : _root_.sn.gnome.glib.internal.gint, key : Ptr[_root_.sn.gnome.glib.internal.gchar], value : Ptr[_root_.sn.gnome.glib.internal.gchar], annotations : Ptr[Ptr[GDBusAnnotationInfo]])(using Zone): Ptr[_GDBusAnnotationInfo] =
    val ____ptr = apply()
    (!____ptr).ref_count = ref_count
    (!____ptr).key = key
    (!____ptr).value = value
    (!____ptr).annotations = annotations
    ____ptr