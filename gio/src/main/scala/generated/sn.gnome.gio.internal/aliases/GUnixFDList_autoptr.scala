package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GUnixFDList_autoptr = Ptr[GUnixFDList]
object GUnixFDList_autoptr:
  given _tag: Tag[GUnixFDList_autoptr] = Tag.Ptr[GUnixFDList](GUnixFDList._tag)
  inline def apply(inline o: Ptr[GUnixFDList]): GUnixFDList_autoptr = o
  extension (v: GUnixFDList_autoptr)
    inline def value: Ptr[GUnixFDList] = v