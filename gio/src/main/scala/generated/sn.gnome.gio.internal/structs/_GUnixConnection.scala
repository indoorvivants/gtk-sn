package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GUnixConnection = CStruct2[GSocketConnection, Ptr[GUnixConnectionPrivate]]

object _GUnixConnection:
  given _tag: Tag[_GUnixConnection] = Tag.materializeCStruct2Tag[GSocketConnection, Ptr[GUnixConnectionPrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GUnixConnection)
      inline def parent_instance : GSocketConnection = struct._1
      inline def parent_instance_=(value: GSocketConnection): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GUnixConnectionPrivate] = struct._2
      inline def priv_=(value: Ptr[GUnixConnectionPrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GUnixConnection on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GUnixConnection] = scala.scalanative.unsafe.alloc[_GUnixConnection](1)
  def apply(parent_instance : GSocketConnection, priv : Ptr[GUnixConnectionPrivate])(using Zone): Ptr[_GUnixConnection] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr