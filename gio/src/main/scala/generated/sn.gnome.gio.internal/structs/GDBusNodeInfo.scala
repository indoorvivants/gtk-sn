package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusNodeInfo: _count: The reference count or -1 if statically allocated. : The path of the node or %NULL if omitted. Note that this may be a relative path. See the D-Bus specification for more details. : (array zero-terminated=1): A pointer to a %NULL-terminated array of pointers to #GDBusNodeInfo structures or %NULL if there are no nodes. : (array zero-terminated=1): A pointer to a %NULL-terminated array of pointers to #GDBusAnnotationInfo structures or %NULL if there are no annotations.
*/
opaque type GDBusNodeInfo = CArray[CChar, Nat.Digit2[Nat._4, Nat._0]]

object GDBusNodeInfo:
  given _tag: Tag[GDBusNodeInfo] = Tag.CArray[CChar, Nat.Digit2[Nat._4, Nat._0]](Tag.Byte, Tag.Digit2[Nat._4, Nat._0](Tag.Nat4, Tag.Nat0))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GDBusNodeInfo)
      inline def ref_count: _root_.sn.gnome.glib.internal.gint = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint]]
      inline def ref_count_=(value: _root_.sn.gnome.glib.internal.gint): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint]] = value
      inline def path: Ptr[_root_.sn.gnome.glib.internal.gchar] = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]
      inline def path_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]] = value
      inline def interfaces: Ptr[Ptr[GDBusInterfaceInfo]] = !struct.at(offsets(2)).asInstanceOf[Ptr[Ptr[Ptr[GDBusInterfaceInfo]]]]
      inline def interfaces_=(value: Ptr[Ptr[GDBusInterfaceInfo]]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[Ptr[Ptr[GDBusInterfaceInfo]]]] = value
      inline def nodes: Ptr[Ptr[GDBusNodeInfo]] = !struct.at(offsets(3)).asInstanceOf[Ptr[Ptr[Ptr[GDBusNodeInfo]]]]
      inline def nodes_=(value: Ptr[Ptr[GDBusNodeInfo]]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[Ptr[Ptr[GDBusNodeInfo]]]] = value
      inline def annotations: Ptr[Ptr[GDBusAnnotationInfo]] = !struct.at(offsets(4)).asInstanceOf[Ptr[Ptr[Ptr[GDBusAnnotationInfo]]]]
      inline def annotations_=(value: Ptr[Ptr[GDBusAnnotationInfo]]): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[Ptr[Ptr[GDBusAnnotationInfo]]]] = value
    end extension
  
  // Allocates GDBusNodeInfo on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GDBusNodeInfo] = scala.scalanative.unsafe.alloc[GDBusNodeInfo](1)
  def apply(ref_count : _root_.sn.gnome.glib.internal.gint, path : Ptr[_root_.sn.gnome.glib.internal.gchar], interfaces : Ptr[Ptr[GDBusInterfaceInfo]], nodes : Ptr[Ptr[GDBusNodeInfo]], annotations : Ptr[Ptr[GDBusAnnotationInfo]])(using Zone): Ptr[GDBusNodeInfo] =
    val ____ptr = apply()
    (!____ptr).ref_count = ref_count
    (!____ptr).path = path
    (!____ptr).interfaces = interfaces
    (!____ptr).nodes = nodes
    (!____ptr).annotations = annotations
    ____ptr
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](5)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.glib.internal.gint].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.glib.internal.gint].toInt, alignmentof[Ptr[_root_.sn.gnome.glib.internal.gchar]].toInt)
    res(2) = align(res(1) + sizeof[Ptr[_root_.sn.gnome.glib.internal.gchar]].toInt, alignmentof[Ptr[Ptr[GDBusInterfaceInfo]]].toInt)
    res(3) = align(res(2) + sizeof[Ptr[Ptr[GDBusInterfaceInfo]]].toInt, alignmentof[Ptr[Ptr[GDBusNodeInfo]]].toInt)
    res(4) = align(res(3) + sizeof[Ptr[Ptr[GDBusNodeInfo]]].toInt, alignmentof[Ptr[Ptr[GDBusAnnotationInfo]]].toInt)
    res
  end offsets