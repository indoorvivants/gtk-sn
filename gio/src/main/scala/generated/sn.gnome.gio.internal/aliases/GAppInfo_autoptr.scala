package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GAppInfo_autoptr = Ptr[GAppInfo]
object GAppInfo_autoptr:
  given _tag: Tag[GAppInfo_autoptr] = Tag.Ptr[GAppInfo](GAppInfo._tag)
  inline def apply(inline o: Ptr[GAppInfo]): GAppInfo_autoptr = o
  extension (v: GAppInfo_autoptr)
    inline def value: Ptr[GAppInfo] = v