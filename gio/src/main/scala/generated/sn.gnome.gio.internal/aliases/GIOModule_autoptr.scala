package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GIOModule_autoptr = Ptr[GIOModule]
object GIOModule_autoptr:
  given _tag: Tag[GIOModule_autoptr] = Tag.Ptr[GIOModule](GIOModule._tag)
  inline def apply(inline o: Ptr[GIOModule]): GIOModule_autoptr = o
  extension (v: GIOModule_autoptr)
    inline def value: Ptr[GIOModule] = v