package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GTypeModule_autoptr = Ptr[GTypeModule]
object GTypeModule_autoptr:
  given _tag: Tag[GTypeModule_autoptr] = Tag.Ptr[GTypeModule](GTypeModule._tag)
  inline def apply(inline o: Ptr[GTypeModule]): GTypeModule_autoptr = o
  extension (v: GTypeModule_autoptr)
    inline def value: Ptr[GTypeModule] = v