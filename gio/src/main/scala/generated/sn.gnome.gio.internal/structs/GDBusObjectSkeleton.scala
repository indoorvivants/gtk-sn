package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GDBusObjectSkeleton = CArray[CChar, Nat.Digit2[Nat._3, Nat._2]]

object GDBusObjectSkeleton:
  given _tag: Tag[GDBusObjectSkeleton] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GDBusObjectSkeleton)
      inline def parent_instance: _root_.sn.gnome.gobject.internal.GObject = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObject]]
      inline def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObject]] = value
      inline def priv: Ptr[GDBusObjectSkeletonPrivate] = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[GDBusObjectSkeletonPrivate]]]
      inline def priv_=(value: Ptr[GDBusObjectSkeletonPrivate]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[GDBusObjectSkeletonPrivate]]] = value
    end extension
  
  // Allocates GDBusObjectSkeleton on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GDBusObjectSkeleton] = scala.scalanative.unsafe.alloc[GDBusObjectSkeleton](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GObject, priv : Ptr[GDBusObjectSkeletonPrivate])(using Zone): Ptr[GDBusObjectSkeleton] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](2)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GObject].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GObject].toInt, alignmentof[Ptr[GDBusObjectSkeletonPrivate]].toInt)
    res
  end offsets