package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusSignalInfo: _count: The reference count or -1 if statically allocated.
*/
opaque type GDBusSignalInfo = CArray[CChar, Nat.Digit2[Nat._3, Nat._2]]

object GDBusSignalInfo:
  given _tag: Tag[GDBusSignalInfo] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GDBusSignalInfo)
      inline def ref_count: _root_.sn.gnome.glib.internal.gint = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint]]
      inline def ref_count_=(value: _root_.sn.gnome.glib.internal.gint): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint]] = value
      inline def name: Ptr[_root_.sn.gnome.glib.internal.gchar] = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]
      inline def name_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]] = value
      inline def args: Ptr[Ptr[GDBusArgInfo]] = !struct.at(offsets(2)).asInstanceOf[Ptr[Ptr[Ptr[GDBusArgInfo]]]]
      inline def args_=(value: Ptr[Ptr[GDBusArgInfo]]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[Ptr[Ptr[GDBusArgInfo]]]] = value
      inline def annotations: Ptr[Ptr[GDBusAnnotationInfo]] = !struct.at(offsets(3)).asInstanceOf[Ptr[Ptr[Ptr[GDBusAnnotationInfo]]]]
      inline def annotations_=(value: Ptr[Ptr[GDBusAnnotationInfo]]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[Ptr[Ptr[GDBusAnnotationInfo]]]] = value
    end extension
  
  // Allocates GDBusSignalInfo on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GDBusSignalInfo] = scala.scalanative.unsafe.alloc[GDBusSignalInfo](1)
  def apply(ref_count : _root_.sn.gnome.glib.internal.gint, name : Ptr[_root_.sn.gnome.glib.internal.gchar], args : Ptr[Ptr[GDBusArgInfo]], annotations : Ptr[Ptr[GDBusAnnotationInfo]])(using Zone): Ptr[GDBusSignalInfo] =
    val ____ptr = apply()
    (!____ptr).ref_count = ref_count
    (!____ptr).name = name
    (!____ptr).args = args
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
    res(2) = align(res(1) + sizeof[Ptr[_root_.sn.gnome.glib.internal.gchar]].toInt, alignmentof[Ptr[Ptr[GDBusArgInfo]]].toInt)
    res(3) = align(res(2) + sizeof[Ptr[Ptr[GDBusArgInfo]]].toInt, alignmentof[Ptr[Ptr[GDBusAnnotationInfo]]].toInt)
    res
  end offsets