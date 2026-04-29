package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GTcpWrapperConnection = CStruct2[GTcpConnection, Ptr[GTcpWrapperConnectionPrivate]]

object _GTcpWrapperConnection:
  given _tag: Tag[_GTcpWrapperConnection] = Tag.materializeCStruct2Tag[GTcpConnection, Ptr[GTcpWrapperConnectionPrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GTcpWrapperConnection)
      inline def parent_instance : GTcpConnection = struct._1
      inline def parent_instance_=(value: GTcpConnection): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GTcpWrapperConnectionPrivate] = struct._2
      inline def priv_=(value: Ptr[GTcpWrapperConnectionPrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GTcpWrapperConnection on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GTcpWrapperConnection] = scala.scalanative.unsafe.alloc[_GTcpWrapperConnection](1)
  def apply(parent_instance : GTcpConnection, priv : Ptr[GTcpWrapperConnectionPrivate])(using Zone): Ptr[_GTcpWrapperConnection] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr