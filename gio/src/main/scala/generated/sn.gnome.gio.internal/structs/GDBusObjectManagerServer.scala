package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GDBusObjectManagerServer = CArray[CChar, Nat.Digit2[Nat._3, Nat._2]]

object GDBusObjectManagerServer:
  given _tag: Tag[GDBusObjectManagerServer] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GDBusObjectManagerServer)
      inline def parent_instance: _root_.sn.gnome.gobject.internal.GObject = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObject]]
      inline def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObject]] = value
      inline def priv: Ptr[GDBusObjectManagerServerPrivate] = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[GDBusObjectManagerServerPrivate]]]
      inline def priv_=(value: Ptr[GDBusObjectManagerServerPrivate]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[GDBusObjectManagerServerPrivate]]] = value
    end extension
  
  // Allocates GDBusObjectManagerServer on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GDBusObjectManagerServer] = scala.scalanative.unsafe.alloc[GDBusObjectManagerServer](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GObject, priv : Ptr[GDBusObjectManagerServerPrivate])(using Zone): Ptr[GDBusObjectManagerServer] =
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
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GObject].toInt, alignmentof[Ptr[GDBusObjectManagerServerPrivate]].toInt)
    res
  end offsets