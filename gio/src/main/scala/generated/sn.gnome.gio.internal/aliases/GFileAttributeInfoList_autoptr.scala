package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GFileAttributeInfoList_autoptr = Ptr[GFileAttributeInfoList]
object GFileAttributeInfoList_autoptr:
  given _tag: Tag[GFileAttributeInfoList_autoptr] = Tag.Ptr[GFileAttributeInfoList](GFileAttributeInfoList._tag)
  inline def apply(inline o: Ptr[GFileAttributeInfoList]): GFileAttributeInfoList_autoptr = o
  extension (v: GFileAttributeInfoList_autoptr)
    inline def value: Ptr[GFileAttributeInfoList] = v