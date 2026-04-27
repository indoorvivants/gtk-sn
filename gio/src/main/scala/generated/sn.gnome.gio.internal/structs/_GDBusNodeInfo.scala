package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusNodeInfo: _count: The reference count or -1 if statically allocated. : The path of the node or %NULL if omitted. Note that this may be a relative path. See the D-Bus specification for more details. : (array zero-terminated=1): A pointer to a %NULL-terminated array of pointers to #GDBusNodeInfo structures or %NULL if there are no nodes. : (array zero-terminated=1): A pointer to a %NULL-terminated array of pointers to #GDBusAnnotationInfo structures or %NULL if there are no annotations.
*/
opaque type _GDBusNodeInfo = CStruct5[_root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[Byte], Ptr[Byte], Ptr[Byte]]

object _GDBusNodeInfo:
  given _tag: Tag[_GDBusNodeInfo] = Tag.materializeCStruct5Tag[_root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[Byte], Ptr[Byte], Ptr[Byte]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GDBusNodeInfo)
      inline def ref_count : _root_.sn.gnome.glib.internal.gint = struct._1
      inline def ref_count_=(value: _root_.sn.gnome.glib.internal.gint): Unit = (!struct.at1 = value)
      inline def path : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._2
      inline def path_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = (!struct.at2 = value)
      inline def interfaces : Ptr[Ptr[GDBusInterfaceInfo]] = struct._3.asInstanceOf[Ptr[Ptr[GDBusInterfaceInfo]]]
      inline def interfaces_=(value: Ptr[Ptr[GDBusInterfaceInfo]]): Unit = (!struct.at3 = value.asInstanceOf[Ptr[Byte]])
      inline def nodes : Ptr[Ptr[GDBusNodeInfo]] = struct._4.asInstanceOf[Ptr[Ptr[GDBusNodeInfo]]]
      inline def nodes_=(value: Ptr[Ptr[GDBusNodeInfo]]): Unit = (!struct.at4 = value.asInstanceOf[Ptr[Byte]])
      inline def annotations : Ptr[Ptr[GDBusAnnotationInfo]] = struct._5.asInstanceOf[Ptr[Ptr[GDBusAnnotationInfo]]]
      inline def annotations_=(value: Ptr[Ptr[GDBusAnnotationInfo]]): Unit = (!struct.at5 = value.asInstanceOf[Ptr[Byte]])
    end extension
  
  // Allocates _GDBusNodeInfo on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GDBusNodeInfo] = scala.scalanative.unsafe.alloc[_GDBusNodeInfo](1)
  def apply(ref_count : _root_.sn.gnome.glib.internal.gint, path : Ptr[_root_.sn.gnome.glib.internal.gchar], interfaces : Ptr[Ptr[GDBusInterfaceInfo]], nodes : Ptr[Ptr[GDBusNodeInfo]], annotations : Ptr[Ptr[GDBusAnnotationInfo]])(using Zone): Ptr[_GDBusNodeInfo] =
    val ____ptr = apply()
    (!____ptr).ref_count = ref_count
    (!____ptr).path = path
    (!____ptr).interfaces = interfaces
    (!____ptr).nodes = nodes
    (!____ptr).annotations = annotations
    ____ptr