package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkBinLayoutClass_autoptr = Ptr[GtkBinLayoutClass]
object GtkBinLayoutClass_autoptr:
  given _tag: Tag[GtkBinLayoutClass_autoptr] = Tag.Ptr[GtkBinLayoutClass](GtkBinLayoutClass._tag)
  inline def apply(inline o: Ptr[GtkBinLayoutClass]): GtkBinLayoutClass_autoptr = o
  extension (v: GtkBinLayoutClass_autoptr)
    inline def value: Ptr[GtkBinLayoutClass] = v