package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusInterfaceInfo: _count: The reference count or -1 if statically allocated. : (array zero-terminated=1): A pointer to a %NULL-terminated array of pointers to #GDBusSignalInfo structures or %NULL if there are no signals. : (array zero-terminated=1): A pointer to a %NULL-terminated array of pointers to #GDBusPropertyInfo structures or %NULL if there are no properties. : (array zero-terminated=1): A pointer to a %NULL-terminated array of pointers to #GDBusAnnotationInfo structures or %NULL if there are no annotations.
*/
opaque type GDBusInterfaceInfo = CArray[CChar, Nat.Digit2[Nat._4, Nat._8]]

object GDBusInterfaceInfo:
  given _tag: Tag[GDBusInterfaceInfo] = Tag.CArray[CChar, Nat.Digit2[Nat._4, Nat._8]](Tag.Byte, Tag.Digit2[Nat._4, Nat._8](Tag.Nat4, Tag.Nat8))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GDBusInterfaceInfo)
      inline def ref_count: _root_.sn.gnome.glib.internal.gint = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint]]
      inline def ref_count_=(value: _root_.sn.gnome.glib.internal.gint): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint]] = value
      inline def name: Ptr[_root_.sn.gnome.glib.internal.gchar] = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]
      inline def name_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]] = value
      inline def methods: Ptr[Ptr[GDBusMethodInfo]] = !struct.at(offsets(2)).asInstanceOf[Ptr[Ptr[Ptr[GDBusMethodInfo]]]]
      inline def methods_=(value: Ptr[Ptr[GDBusMethodInfo]]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[Ptr[Ptr[GDBusMethodInfo]]]] = value
      inline def signals: Ptr[Ptr[GDBusSignalInfo]] = !struct.at(offsets(3)).asInstanceOf[Ptr[Ptr[Ptr[GDBusSignalInfo]]]]
      inline def signals_=(value: Ptr[Ptr[GDBusSignalInfo]]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[Ptr[Ptr[GDBusSignalInfo]]]] = value
      inline def properties: Ptr[Ptr[GDBusPropertyInfo]] = !struct.at(offsets(4)).asInstanceOf[Ptr[Ptr[Ptr[GDBusPropertyInfo]]]]
      inline def properties_=(value: Ptr[Ptr[GDBusPropertyInfo]]): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[Ptr[Ptr[GDBusPropertyInfo]]]] = value
      inline def annotations: Ptr[Ptr[GDBusAnnotationInfo]] = !struct.at(offsets(5)).asInstanceOf[Ptr[Ptr[Ptr[GDBusAnnotationInfo]]]]
      inline def annotations_=(value: Ptr[Ptr[GDBusAnnotationInfo]]): Unit = !struct.at(offsets(5)).asInstanceOf[Ptr[Ptr[Ptr[GDBusAnnotationInfo]]]] = value
    end extension
  
  // Allocates GDBusInterfaceInfo on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GDBusInterfaceInfo] = scala.scalanative.unsafe.alloc[GDBusInterfaceInfo](1)
  def apply(ref_count : _root_.sn.gnome.glib.internal.gint, name : Ptr[_root_.sn.gnome.glib.internal.gchar], methods : Ptr[Ptr[GDBusMethodInfo]], signals : Ptr[Ptr[GDBusSignalInfo]], properties : Ptr[Ptr[GDBusPropertyInfo]], annotations : Ptr[Ptr[GDBusAnnotationInfo]])(using Zone): Ptr[GDBusInterfaceInfo] =
    val ____ptr = apply()
    (!____ptr).ref_count = ref_count
    (!____ptr).name = name
    (!____ptr).methods = methods
    (!____ptr).signals = signals
    (!____ptr).properties = properties
    (!____ptr).annotations = annotations
    ____ptr
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](6)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.glib.internal.gint].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.glib.internal.gint].toInt, alignmentof[Ptr[_root_.sn.gnome.glib.internal.gchar]].toInt)
    res(2) = align(res(1) + sizeof[Ptr[_root_.sn.gnome.glib.internal.gchar]].toInt, alignmentof[Ptr[Ptr[GDBusMethodInfo]]].toInt)
    res(3) = align(res(2) + sizeof[Ptr[Ptr[GDBusMethodInfo]]].toInt, alignmentof[Ptr[Ptr[GDBusSignalInfo]]].toInt)
    res(4) = align(res(3) + sizeof[Ptr[Ptr[GDBusSignalInfo]]].toInt, alignmentof[Ptr[Ptr[GDBusPropertyInfo]]].toInt)
    res(5) = align(res(4) + sizeof[Ptr[Ptr[GDBusPropertyInfo]]].toInt, alignmentof[Ptr[Ptr[GDBusAnnotationInfo]]].toInt)
    res
  end offsets