package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GUnixSocketAddressClass = CStruct1[GSocketAddressClass]

object _GUnixSocketAddressClass:
  given _tag: Tag[_GUnixSocketAddressClass] = Tag.materializeCStruct1Tag[GSocketAddressClass]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GUnixSocketAddressClass)
      inline def parent_class : GSocketAddressClass = struct._1
      inline def parent_class_=(value: GSocketAddressClass): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates _GUnixSocketAddressClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GUnixSocketAddressClass] = scala.scalanative.unsafe.alloc[_GUnixSocketAddressClass](1)
  def apply(parent_class : GSocketAddressClass)(using Zone): Ptr[_GUnixSocketAddressClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr