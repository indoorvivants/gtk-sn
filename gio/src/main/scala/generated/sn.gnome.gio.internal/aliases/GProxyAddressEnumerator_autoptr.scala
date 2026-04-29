package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GProxyAddressEnumerator_autoptr = Ptr[GProxyAddressEnumerator]
object GProxyAddressEnumerator_autoptr:
  given _tag: Tag[GProxyAddressEnumerator_autoptr] = Tag.Ptr[GProxyAddressEnumerator](GProxyAddressEnumerator._tag)
  inline def apply(inline o: Ptr[GProxyAddressEnumerator]): GProxyAddressEnumerator_autoptr = o
  extension (v: GProxyAddressEnumerator_autoptr)
    inline def value: Ptr[GProxyAddressEnumerator] = v