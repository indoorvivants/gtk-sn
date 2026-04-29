package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusSubtreeVTable: : Function for enumerating child nodes. : Function for introspecting a child node. : Function for dispatching a remote call on a child node.
*/
opaque type _GDBusSubtreeVTable = CStruct4[GDBusSubtreeEnumerateFunc, Ptr[Byte], GDBusSubtreeDispatchFunc, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]

object _GDBusSubtreeVTable:
  given _tag: Tag[_GDBusSubtreeVTable] = Tag.materializeCStruct4Tag[GDBusSubtreeEnumerateFunc, Ptr[Byte], GDBusSubtreeDispatchFunc, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GDBusSubtreeVTable)
      inline def enumerate : GDBusSubtreeEnumerateFunc = struct._1
      inline def enumerate_=(value: GDBusSubtreeEnumerateFunc): Unit = (!struct.at1 = value)
      inline def introspect : GDBusSubtreeIntrospectFunc = struct._2.asInstanceOf[GDBusSubtreeIntrospectFunc]
      inline def introspect_=(value: GDBusSubtreeIntrospectFunc): Unit = (!struct.at2 = value.asInstanceOf[Ptr[Byte]])
      inline def dispatch : GDBusSubtreeDispatchFunc = struct._3
      inline def dispatch_=(value: GDBusSubtreeDispatchFunc): Unit = (!struct.at3 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8] = struct._4
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]): Unit = (!struct.at4 = value)
    end extension
  
  // Allocates _GDBusSubtreeVTable on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GDBusSubtreeVTable] = scala.scalanative.unsafe.alloc[_GDBusSubtreeVTable](1)
  def apply(enumerate : GDBusSubtreeEnumerateFunc, introspect : GDBusSubtreeIntrospectFunc, dispatch : GDBusSubtreeDispatchFunc, padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8])(using Zone): Ptr[_GDBusSubtreeVTable] =
    val ____ptr = apply()
    (!____ptr).enumerate = enumerate
    (!____ptr).introspect = introspect
    (!____ptr).dispatch = dispatch
    (!____ptr).padding = padding
    ____ptr