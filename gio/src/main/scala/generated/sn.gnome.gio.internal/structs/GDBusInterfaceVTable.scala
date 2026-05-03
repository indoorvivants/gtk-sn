package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusInterfaceVTable: _property: Function for getting a property.
*/
opaque type GDBusInterfaceVTable = CArray[CChar, Nat.Digit2[Nat._8, Nat._8]]

object GDBusInterfaceVTable:
  given _tag: Tag[GDBusInterfaceVTable] = Tag.CArray[CChar, Nat.Digit2[Nat._8, Nat._8]](Tag.Byte, Tag.Digit2[Nat._8, Nat._8](Tag.Nat8, Tag.Nat8))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GDBusInterfaceVTable)
      inline def method_call: GDBusInterfaceMethodCallFunc = !struct.at(offsets(0)).asInstanceOf[Ptr[GDBusInterfaceMethodCallFunc]]
      inline def method_call_=(value: GDBusInterfaceMethodCallFunc): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[GDBusInterfaceMethodCallFunc]] = value
      inline def get_property: GDBusInterfaceGetPropertyFunc = !struct.at(offsets(1)).asInstanceOf[Ptr[GDBusInterfaceGetPropertyFunc]]
      inline def get_property_=(value: GDBusInterfaceGetPropertyFunc): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[GDBusInterfaceGetPropertyFunc]] = value
      inline def set_property: GDBusInterfaceSetPropertyFunc = !struct.at(offsets(2)).asInstanceOf[Ptr[GDBusInterfaceSetPropertyFunc]]
      inline def set_property_=(value: GDBusInterfaceSetPropertyFunc): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[GDBusInterfaceSetPropertyFunc]] = value
      inline def padding: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8] = !struct.at(offsets(3)).asInstanceOf[Ptr[CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]]
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]] = value
    end extension
  
  // Allocates GDBusInterfaceVTable on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GDBusInterfaceVTable] = scala.scalanative.unsafe.alloc[GDBusInterfaceVTable](1)
  def apply(method_call : GDBusInterfaceMethodCallFunc, get_property : GDBusInterfaceGetPropertyFunc, set_property : GDBusInterfaceSetPropertyFunc, padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8])(using Zone): Ptr[GDBusInterfaceVTable] =
    val ____ptr = apply()
    (!____ptr).method_call = method_call
    (!____ptr).get_property = get_property
    (!____ptr).set_property = set_property
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
    
    res(0) = align(0, alignmentof[GDBusInterfaceMethodCallFunc].toInt)
    res(1) = align(res(0) + sizeof[GDBusInterfaceMethodCallFunc].toInt, alignmentof[GDBusInterfaceGetPropertyFunc].toInt)
    res(2) = align(res(1) + sizeof[GDBusInterfaceGetPropertyFunc].toInt, alignmentof[GDBusInterfaceSetPropertyFunc].toInt)
    res(3) = align(res(2) + sizeof[GDBusInterfaceSetPropertyFunc].toInt, alignmentof[_root_.sn.gnome.glib.internal.gpointer].toInt)
    res
  end offsets