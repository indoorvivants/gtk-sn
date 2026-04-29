package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GSocketAddressEnumerator_autoptr = Ptr[GSocketAddressEnumerator]
object GSocketAddressEnumerator_autoptr:
  given _tag: Tag[GSocketAddressEnumerator_autoptr] = Tag.Ptr[GSocketAddressEnumerator](GSocketAddressEnumerator._tag)
  inline def apply(inline o: Ptr[GSocketAddressEnumerator]): GSocketAddressEnumerator_autoptr = o
  extension (v: GSocketAddressEnumerator_autoptr)
    inline def value: Ptr[GSocketAddressEnumerator] = v