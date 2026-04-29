package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GProxyAddressEnumerator = CStruct2[GSocketAddressEnumerator, Ptr[GProxyAddressEnumeratorPrivate]]

object _GProxyAddressEnumerator:
  given _tag: Tag[_GProxyAddressEnumerator] = Tag.materializeCStruct2Tag[GSocketAddressEnumerator, Ptr[GProxyAddressEnumeratorPrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GProxyAddressEnumerator)
      inline def parent_instance : GSocketAddressEnumerator = struct._1
      inline def parent_instance_=(value: GSocketAddressEnumerator): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GProxyAddressEnumeratorPrivate] = struct._2
      inline def priv_=(value: Ptr[GProxyAddressEnumeratorPrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GProxyAddressEnumerator on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GProxyAddressEnumerator] = scala.scalanative.unsafe.alloc[_GProxyAddressEnumerator](1)
  def apply(parent_instance : GSocketAddressEnumerator, priv : Ptr[GProxyAddressEnumeratorPrivate])(using Zone): Ptr[_GProxyAddressEnumerator] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr