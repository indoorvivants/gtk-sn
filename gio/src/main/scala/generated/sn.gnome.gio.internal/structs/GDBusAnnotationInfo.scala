package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusAnnotationInfo: _count: The reference count or -1 if statically allocated. : The name of the annotation, e.g. "org.freedesktop.DBus.Deprecated". : The value of the annotation. : (array zero-terminated=1): A pointer to a %NULL-terminated array of pointers to #GDBusAnnotationInfo structures or %NULL if there are no annotations.
*/
opaque type GDBusAnnotationInfo = CArray[CChar, Nat.Digit2[Nat._3, Nat._2]]

object GDBusAnnotationInfo:
  given _tag: Tag[GDBusAnnotationInfo] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GDBusAnnotationInfo)
      inline def ref_count: _root_.sn.gnome.glib.internal.gint = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint]]
      inline def ref_count_=(value: _root_.sn.gnome.glib.internal.gint): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint]] = value
      inline def key: Ptr[_root_.sn.gnome.glib.internal.gchar] = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]
      inline def key_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]] = value
      inline def value: Ptr[_root_.sn.gnome.glib.internal.gchar] = !struct.at(offsets(2)).asInstanceOf[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]
      inline def value_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]] = value
      inline def annotations: Ptr[Ptr[GDBusAnnotationInfo]] = !struct.at(offsets(3)).asInstanceOf[Ptr[Ptr[Ptr[GDBusAnnotationInfo]]]]
      inline def annotations_=(value: Ptr[Ptr[GDBusAnnotationInfo]]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[Ptr[Ptr[GDBusAnnotationInfo]]]] = value
    end extension
  
  // Allocates GDBusAnnotationInfo on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GDBusAnnotationInfo] = scala.scalanative.unsafe.alloc[GDBusAnnotationInfo](1)
  def apply(ref_count : _root_.sn.gnome.glib.internal.gint, key : Ptr[_root_.sn.gnome.glib.internal.gchar], value : Ptr[_root_.sn.gnome.glib.internal.gchar], annotations : Ptr[Ptr[GDBusAnnotationInfo]])(using Zone): Ptr[GDBusAnnotationInfo] =
    val ____ptr = apply()
    (!____ptr).ref_count = ref_count
    (!____ptr).key = key
    (!____ptr).value = value
    (!____ptr).annotations = annotations
    ____ptr
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](4)
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
    res(3) = align(res(2) + sizeof[Ptr[_root_.sn.gnome.glib.internal.gchar]].toInt, alignmentof[Ptr[Ptr[GDBusAnnotationInfo]]].toInt)
    res
  end offsets