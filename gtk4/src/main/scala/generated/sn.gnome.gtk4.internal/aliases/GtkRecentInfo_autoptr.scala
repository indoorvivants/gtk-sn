package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkRecentInfo_autoptr = Ptr[GtkRecentInfo]
object GtkRecentInfo_autoptr:
  given _tag: Tag[GtkRecentInfo_autoptr] = Tag.Ptr[GtkRecentInfo](GtkRecentInfo._tag)
  inline def apply(inline o: Ptr[GtkRecentInfo]): GtkRecentInfo_autoptr = o
  extension (v: GtkRecentInfo_autoptr)
    inline def value: Ptr[GtkRecentInfo] = v