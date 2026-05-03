package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GSList_autoptr = Ptr[GSList]
object GSList_autoptr:
  given _tag: Tag[GSList_autoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GSList_autoptr = o
  extension (v: GSList_autoptr)
    inline def value: Ptr[GSList] = v