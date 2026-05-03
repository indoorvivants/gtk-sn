package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GTcpWrapperConnectionClass = CStruct1[GTcpConnectionClass]

object _GTcpWrapperConnectionClass:
  given _tag: Tag[_GTcpWrapperConnectionClass] = Tag.materializeCStruct1Tag[GTcpConnectionClass]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GTcpWrapperConnectionClass)
      inline def parent_class : GTcpConnectionClass = struct._1
      inline def parent_class_=(value: GTcpConnectionClass): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates _GTcpWrapperConnectionClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GTcpWrapperConnectionClass] = scala.scalanative.unsafe.alloc[_GTcpWrapperConnectionClass](1)
  def apply(parent_class : GTcpConnectionClass)(using Zone): Ptr[_GTcpWrapperConnectionClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr