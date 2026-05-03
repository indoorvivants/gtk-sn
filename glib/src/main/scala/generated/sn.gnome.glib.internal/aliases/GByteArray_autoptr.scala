package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GByteArray_autoptr = Ptr[GByteArray]
object GByteArray_autoptr:
  given _tag: Tag[GByteArray_autoptr] = Tag.Ptr[GByteArray](GByteArray._tag)
  inline def apply(inline o: Ptr[GByteArray]): GByteArray_autoptr = o
  extension (v: GByteArray_autoptr)
    inline def value: Ptr[GByteArray] = v