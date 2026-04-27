package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusPropertyInfo: _count: The reference count or -1 if statically allocated. : The D-Bus signature of the property (a single complete type). : Access control flags for the property. : (array zero-terminated=1): A pointer to a %NULL-terminated array of pointers to #GDBusAnnotationInfo structures or %NULL if there are no annotations.
*/
opaque type GDBusPropertyInfo = CArray[CChar, Nat.Digit2[Nat._4, Nat._0]]

object GDBusPropertyInfo:
  given _tag: Tag[GDBusPropertyInfo] = Tag.CArray[CChar, Nat.Digit2[Nat._4, Nat._0]](Tag.Byte, Tag.Digit2[Nat._4, Nat._0](Tag.Nat4, Tag.Nat0))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GDBusPropertyInfo)
      inline def ref_count: _root_.sn.gnome.glib.internal.gint = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint]]
      inline def ref_count_=(value: _root_.sn.gnome.glib.internal.gint): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint]] = value
      inline def name: Ptr[_root_.sn.gnome.glib.internal.gchar] = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]
      inline def name_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]] = value
      inline def signature: Ptr[_root_.sn.gnome.glib.internal.gchar] = !struct.at(offsets(2)).asInstanceOf[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]
      inline def signature_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]] = value
      inline def flags: GDBusPropertyInfoFlags = !struct.at(offsets(3)).asInstanceOf[Ptr[GDBusPropertyInfoFlags]]
      inline def flags_=(value: GDBusPropertyInfoFlags): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[GDBusPropertyInfoFlags]] = value
      inline def annotations: Ptr[Ptr[GDBusAnnotationInfo]] = !struct.at(offsets(4)).asInstanceOf[Ptr[Ptr[Ptr[GDBusAnnotationInfo]]]]
      inline def annotations_=(value: Ptr[Ptr[GDBusAnnotationInfo]]): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[Ptr[Ptr[GDBusAnnotationInfo]]]] = value
    end extension
  
  // Allocates GDBusPropertyInfo on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GDBusPropertyInfo] = scala.scalanative.unsafe.alloc[GDBusPropertyInfo](1)
  def apply(ref_count : _root_.sn.gnome.glib.internal.gint, name : Ptr[_root_.sn.gnome.glib.internal.gchar], signature : Ptr[_root_.sn.gnome.glib.internal.gchar], flags : GDBusPropertyInfoFlags, annotations : Ptr[Ptr[GDBusAnnotationInfo]])(using Zone): Ptr[GDBusPropertyInfo] =
    val ____ptr = apply()
    (!____ptr).ref_count = ref_count
    (!____ptr).name = name
    (!____ptr).signature = signature
    (!____ptr).flags = flags
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
    res(2) = align(res(1) + sizeof[Ptr[_root_.sn.gnome.glib.internal.gchar]].toInt, alignmentof[Ptr[_root_.sn.gnome.glib.internal.gchar]].toInt)
    res(3) = align(res(2) + sizeof[Ptr[_root_.sn.gnome.glib.internal.gchar]].toInt, alignmentof[GDBusPropertyInfoFlags].toInt)
    res(4) = align(res(3) + sizeof[GDBusPropertyInfoFlags].toInt, alignmentof[Ptr[Ptr[GDBusAnnotationInfo]]].toInt)
    res
  end offsets