package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GListStoreClass_autoptr = Ptr[GListStoreClass]
object GListStoreClass_autoptr:
  given _tag: Tag[GListStoreClass_autoptr] = Tag.Ptr[GListStoreClass](GListStoreClass._tag)
  inline def apply(inline o: Ptr[GListStoreClass]): GListStoreClass_autoptr = o
  extension (v: GListStoreClass_autoptr)
    inline def value: Ptr[GListStoreClass] = v