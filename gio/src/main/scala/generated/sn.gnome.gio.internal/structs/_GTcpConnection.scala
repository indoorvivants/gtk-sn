package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GTcpConnection = CStruct2[GSocketConnection, Ptr[GTcpConnectionPrivate]]

object _GTcpConnection:
  given _tag: Tag[_GTcpConnection] = Tag.materializeCStruct2Tag[GSocketConnection, Ptr[GTcpConnectionPrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GTcpConnection)
      inline def parent_instance : GSocketConnection = struct._1
      inline def parent_instance_=(value: GSocketConnection): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GTcpConnectionPrivate] = struct._2
      inline def priv_=(value: Ptr[GTcpConnectionPrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GTcpConnection on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GTcpConnection] = scala.scalanative.unsafe.alloc[_GTcpConnection](1)
  def apply(parent_instance : GSocketConnection, priv : Ptr[GTcpConnectionPrivate])(using Zone): Ptr[_GTcpConnection] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr