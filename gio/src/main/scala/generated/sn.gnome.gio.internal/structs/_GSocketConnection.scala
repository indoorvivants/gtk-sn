package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GSocketConnection = CStruct2[GIOStream, Ptr[GSocketConnectionPrivate]]

object _GSocketConnection:
  given _tag: Tag[_GSocketConnection] = Tag.materializeCStruct2Tag[GIOStream, Ptr[GSocketConnectionPrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GSocketConnection)
      inline def parent_instance : GIOStream = struct._1
      inline def parent_instance_=(value: GIOStream): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GSocketConnectionPrivate] = struct._2
      inline def priv_=(value: Ptr[GSocketConnectionPrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GSocketConnection on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GSocketConnection] = scala.scalanative.unsafe.alloc[_GSocketConnection](1)
  def apply(parent_instance : GIOStream, priv : Ptr[GSocketConnectionPrivate])(using Zone): Ptr[_GSocketConnection] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr