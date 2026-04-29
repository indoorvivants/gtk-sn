package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusSubtreeVTable: : Function for enumerating child nodes. : Function for introspecting a child node. : Function for dispatching a remote call on a child node.
*/
opaque type GDBusSubtreeVTable = CArray[CChar, Nat.Digit2[Nat._8, Nat._8]]

object GDBusSubtreeVTable:
  given _tag: Tag[GDBusSubtreeVTable] = Tag.CArray[CChar, Nat.Digit2[Nat._8, Nat._8]](Tag.Byte, Tag.Digit2[Nat._8, Nat._8](Tag.Nat8, Tag.Nat8))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GDBusSubtreeVTable)
      inline def enumerate: GDBusSubtreeEnumerateFunc = !struct.at(offsets(0)).asInstanceOf[Ptr[GDBusSubtreeEnumerateFunc]]
      inline def enumerate_=(value: GDBusSubtreeEnumerateFunc): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[GDBusSubtreeEnumerateFunc]] = value
      inline def introspect: GDBusSubtreeIntrospectFunc = !struct.at(offsets(1)).asInstanceOf[Ptr[GDBusSubtreeIntrospectFunc]]
      inline def introspect_=(value: GDBusSubtreeIntrospectFunc): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[GDBusSubtreeIntrospectFunc]] = value
      inline def dispatch: GDBusSubtreeDispatchFunc = !struct.at(offsets(2)).asInstanceOf[Ptr[GDBusSubtreeDispatchFunc]]
      inline def dispatch_=(value: GDBusSubtreeDispatchFunc): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[GDBusSubtreeDispatchFunc]] = value
      inline def padding: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8] = !struct.at(offsets(3)).asInstanceOf[Ptr[CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]]
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]] = value
    end extension
  
  // Allocates GDBusSubtreeVTable on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GDBusSubtreeVTable] = scala.scalanative.unsafe.alloc[GDBusSubtreeVTable](1)
  def apply(enumerate : GDBusSubtreeEnumerateFunc, introspect : GDBusSubtreeIntrospectFunc, dispatch : GDBusSubtreeDispatchFunc, padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8])(using Zone): Ptr[GDBusSubtreeVTable] =
    val ____ptr = apply()
    (!____ptr).enumerate = enumerate
    (!____ptr).introspect = introspect
    (!____ptr).dispatch = dispatch
    (!____ptr).padding = padding
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
    
    res(0) = align(0, alignmentof[GDBusSubtreeEnumerateFunc].toInt)
    res(1) = align(res(0) + sizeof[GDBusSubtreeEnumerateFunc].toInt, alignmentof[GDBusSubtreeIntrospectFunc].toInt)
    res(2) = align(res(1) + sizeof[GDBusSubtreeIntrospectFunc].toInt, alignmentof[GDBusSubtreeDispatchFunc].toInt)
    res(3) = align(res(2) + sizeof[GDBusSubtreeDispatchFunc].toInt, alignmentof[_root_.sn.gnome.glib.internal.gpointer].toInt)
    res
  end offsets