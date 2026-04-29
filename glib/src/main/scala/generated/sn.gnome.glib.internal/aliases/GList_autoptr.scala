package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GList_autoptr = Ptr[GList]
object GList_autoptr:
  given _tag: Tag[GList_autoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GList_autoptr = o
  extension (v: GList_autoptr)
    inline def value: Ptr[GList] = v