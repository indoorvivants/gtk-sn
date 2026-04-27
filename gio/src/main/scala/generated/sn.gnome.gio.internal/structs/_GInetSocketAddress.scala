package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GInetSocketAddress = CStruct2[GSocketAddress, Ptr[GInetSocketAddressPrivate]]

object _GInetSocketAddress:
  given _tag: Tag[_GInetSocketAddress] = Tag.materializeCStruct2Tag[GSocketAddress, Ptr[GInetSocketAddressPrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GInetSocketAddress)
      inline def parent_instance : GSocketAddress = struct._1
      inline def parent_instance_=(value: GSocketAddress): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GInetSocketAddressPrivate] = struct._2
      inline def priv_=(value: Ptr[GInetSocketAddressPrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GInetSocketAddress on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GInetSocketAddress] = scala.scalanative.unsafe.alloc[_GInetSocketAddress](1)
  def apply(parent_instance : GSocketAddress, priv : Ptr[GInetSocketAddressPrivate])(using Zone): Ptr[_GInetSocketAddress] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr