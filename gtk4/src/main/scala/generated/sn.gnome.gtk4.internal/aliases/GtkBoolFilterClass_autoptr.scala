package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkBoolFilterClass_autoptr = Ptr[GtkBoolFilterClass]
object GtkBoolFilterClass_autoptr:
  given _tag: Tag[GtkBoolFilterClass_autoptr] = Tag.Ptr[GtkBoolFilterClass](GtkBoolFilterClass._tag)
  inline def apply(inline o: Ptr[GtkBoolFilterClass]): GtkBoolFilterClass_autoptr = o
  extension (v: GtkBoolFilterClass_autoptr)
    inline def value: Ptr[GtkBoolFilterClass] = v