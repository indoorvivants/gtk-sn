package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GFileInfo_autoptr = Ptr[GFileInfo]
object GFileInfo_autoptr:
  given _tag: Tag[GFileInfo_autoptr] = Tag.Ptr[GFileInfo](GFileInfo._tag)
  inline def apply(inline o: Ptr[GFileInfo]): GFileInfo_autoptr = o
  extension (v: GFileInfo_autoptr)
    inline def value: Ptr[GFileInfo] = v