package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GTlsConnection = CStruct2[GIOStream, Ptr[GTlsConnectionPrivate]]

object _GTlsConnection:
  given _tag: Tag[_GTlsConnection] = Tag.materializeCStruct2Tag[GIOStream, Ptr[GTlsConnectionPrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GTlsConnection)
      inline def parent_instance : GIOStream = struct._1
      inline def parent_instance_=(value: GIOStream): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GTlsConnectionPrivate] = struct._2
      inline def priv_=(value: Ptr[GTlsConnectionPrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GTlsConnection on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GTlsConnection] = scala.scalanative.unsafe.alloc[_GTlsConnection](1)
  def apply(parent_instance : GIOStream, priv : Ptr[GTlsConnectionPrivate])(using Zone): Ptr[_GTlsConnection] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr