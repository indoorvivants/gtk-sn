package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusInterfaceVTable: _property: Function for getting a property.
*/
opaque type _GDBusInterfaceVTable = CStruct4[GDBusInterfaceMethodCallFunc, GDBusInterfaceGetPropertyFunc, GDBusInterfaceSetPropertyFunc, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]

object _GDBusInterfaceVTable:
  given _tag: Tag[_GDBusInterfaceVTable] = Tag.materializeCStruct4Tag[GDBusInterfaceMethodCallFunc, GDBusInterfaceGetPropertyFunc, GDBusInterfaceSetPropertyFunc, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GDBusInterfaceVTable)
      inline def method_call : GDBusInterfaceMethodCallFunc = struct._1
      inline def method_call_=(value: GDBusInterfaceMethodCallFunc): Unit = (!struct.at1 = value)
      inline def get_property : GDBusInterfaceGetPropertyFunc = struct._2
      inline def get_property_=(value: GDBusInterfaceGetPropertyFunc): Unit = (!struct.at2 = value)
      inline def set_property : GDBusInterfaceSetPropertyFunc = struct._3
      inline def set_property_=(value: GDBusInterfaceSetPropertyFunc): Unit = (!struct.at3 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8] = struct._4
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]): Unit = (!struct.at4 = value)
    end extension
  
  // Allocates _GDBusInterfaceVTable on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GDBusInterfaceVTable] = scala.scalanative.unsafe.alloc[_GDBusInterfaceVTable](1)
  def apply(method_call : GDBusInterfaceMethodCallFunc, get_property : GDBusInterfaceGetPropertyFunc, set_property : GDBusInterfaceSetPropertyFunc, padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8])(using Zone): Ptr[_GDBusInterfaceVTable] =
    val ____ptr = apply()
    (!____ptr).method_call = method_call
    (!____ptr).get_property = get_property
    (!____ptr).set_property = set_property
    (!____ptr).padding = padding
    ____ptr