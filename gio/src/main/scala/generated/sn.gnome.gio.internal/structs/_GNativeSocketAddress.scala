package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GNativeSocketAddress = CStruct2[GSocketAddress, Ptr[GNativeSocketAddressPrivate]]

object _GNativeSocketAddress:
  given _tag: Tag[_GNativeSocketAddress] = Tag.materializeCStruct2Tag[GSocketAddress, Ptr[GNativeSocketAddressPrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GNativeSocketAddress)
      inline def parent_instance : GSocketAddress = struct._1
      inline def parent_instance_=(value: GSocketAddress): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GNativeSocketAddressPrivate] = struct._2
      inline def priv_=(value: Ptr[GNativeSocketAddressPrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GNativeSocketAddress on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GNativeSocketAddress] = scala.scalanative.unsafe.alloc[_GNativeSocketAddress](1)
  def apply(parent_instance : GSocketAddress, priv : Ptr[GNativeSocketAddressPrivate])(using Zone): Ptr[_GNativeSocketAddress] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr