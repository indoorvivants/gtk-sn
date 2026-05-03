package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GUnixConnectionClass = CStruct1[GSocketConnectionClass]

object _GUnixConnectionClass:
  given _tag: Tag[_GUnixConnectionClass] = Tag.materializeCStruct1Tag[GSocketConnectionClass]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GUnixConnectionClass)
      inline def parent_class : GSocketConnectionClass = struct._1
      inline def parent_class_=(value: GSocketConnectionClass): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates _GUnixConnectionClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GUnixConnectionClass] = scala.scalanative.unsafe.alloc[_GUnixConnectionClass](1)
  def apply(parent_class : GSocketConnectionClass)(using Zone): Ptr[_GUnixConnectionClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr