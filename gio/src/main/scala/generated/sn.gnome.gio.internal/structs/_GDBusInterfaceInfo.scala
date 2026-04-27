package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusInterfaceInfo: _count: The reference count or -1 if statically allocated. : (array zero-terminated=1): A pointer to a %NULL-terminated array of pointers to #GDBusSignalInfo structures or %NULL if there are no signals. : (array zero-terminated=1): A pointer to a %NULL-terminated array of pointers to #GDBusPropertyInfo structures or %NULL if there are no properties. : (array zero-terminated=1): A pointer to a %NULL-terminated array of pointers to #GDBusAnnotationInfo structures or %NULL if there are no annotations.
*/
opaque type _GDBusInterfaceInfo = CStruct6[_root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte]]

object _GDBusInterfaceInfo:
  given _tag: Tag[_GDBusInterfaceInfo] = Tag.materializeCStruct6Tag[_root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GDBusInterfaceInfo)
      inline def ref_count : _root_.sn.gnome.glib.internal.gint = struct._1
      inline def ref_count_=(value: _root_.sn.gnome.glib.internal.gint): Unit = (!struct.at1 = value)
      inline def name : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._2
      inline def name_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = (!struct.at2 = value)
      inline def methods : Ptr[Ptr[GDBusMethodInfo]] = struct._3.asInstanceOf[Ptr[Ptr[GDBusMethodInfo]]]
      inline def methods_=(value: Ptr[Ptr[GDBusMethodInfo]]): Unit = (!struct.at3 = value.asInstanceOf[Ptr[Byte]])
      inline def signals : Ptr[Ptr[GDBusSignalInfo]] = struct._4.asInstanceOf[Ptr[Ptr[GDBusSignalInfo]]]
      inline def signals_=(value: Ptr[Ptr[GDBusSignalInfo]]): Unit = (!struct.at4 = value.asInstanceOf[Ptr[Byte]])
      inline def properties : Ptr[Ptr[GDBusPropertyInfo]] = struct._5.asInstanceOf[Ptr[Ptr[GDBusPropertyInfo]]]
      inline def properties_=(value: Ptr[Ptr[GDBusPropertyInfo]]): Unit = (!struct.at5 = value.asInstanceOf[Ptr[Byte]])
      inline def annotations : Ptr[Ptr[GDBusAnnotationInfo]] = struct._6.asInstanceOf[Ptr[Ptr[GDBusAnnotationInfo]]]
      inline def annotations_=(value: Ptr[Ptr[GDBusAnnotationInfo]]): Unit = (!struct.at6 = value.asInstanceOf[Ptr[Byte]])
    end extension
  
  // Allocates _GDBusInterfaceInfo on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GDBusInterfaceInfo] = scala.scalanative.unsafe.alloc[_GDBusInterfaceInfo](1)
  def apply(ref_count : _root_.sn.gnome.glib.internal.gint, name : Ptr[_root_.sn.gnome.glib.internal.gchar], methods : Ptr[Ptr[GDBusMethodInfo]], signals : Ptr[Ptr[GDBusSignalInfo]], properties : Ptr[Ptr[GDBusPropertyInfo]], annotations : Ptr[Ptr[GDBusAnnotationInfo]])(using Zone): Ptr[_GDBusInterfaceInfo] =
    val ____ptr = apply()
    (!____ptr).ref_count = ref_count
    (!____ptr).name = name
    (!____ptr).methods = methods
    (!____ptr).signals = signals
    (!____ptr).properties = properties
    (!____ptr).annotations = annotations
    ____ptr