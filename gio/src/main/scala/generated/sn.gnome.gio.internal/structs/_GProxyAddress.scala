package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GProxyAddress = CStruct2[GInetSocketAddress, Ptr[GProxyAddressPrivate]]

object _GProxyAddress:
  given _tag: Tag[_GProxyAddress] = Tag.materializeCStruct2Tag[GInetSocketAddress, Ptr[GProxyAddressPrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GProxyAddress)
      inline def parent_instance : GInetSocketAddress = struct._1
      inline def parent_instance_=(value: GInetSocketAddress): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GProxyAddressPrivate] = struct._2
      inline def priv_=(value: Ptr[GProxyAddressPrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GProxyAddress on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GProxyAddress] = scala.scalanative.unsafe.alloc[_GProxyAddress](1)
  def apply(parent_instance : GInetSocketAddress, priv : Ptr[GProxyAddressPrivate])(using Zone): Ptr[_GProxyAddress] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr