package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GTcpConnectionClass = CStruct1[GSocketConnectionClass]

object _GTcpConnectionClass:
  given _tag: Tag[_GTcpConnectionClass] = Tag.materializeCStruct1Tag[GSocketConnectionClass]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GTcpConnectionClass)
      inline def parent_class : GSocketConnectionClass = struct._1
      inline def parent_class_=(value: GSocketConnectionClass): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates _GTcpConnectionClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GTcpConnectionClass] = scala.scalanative.unsafe.alloc[_GTcpConnectionClass](1)
  def apply(parent_class : GSocketConnectionClass)(using Zone): Ptr[_GTcpConnectionClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr