package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkFixedLayoutClass_autoptr = Ptr[GtkFixedLayoutClass]
object GtkFixedLayoutClass_autoptr:
  given _tag: Tag[GtkFixedLayoutClass_autoptr] = Tag.Ptr[GtkFixedLayoutClass](GtkFixedLayoutClass._tag)
  inline def apply(inline o: Ptr[GtkFixedLayoutClass]): GtkFixedLayoutClass_autoptr = o
  extension (v: GtkFixedLayoutClass_autoptr)
    inline def value: Ptr[GtkFixedLayoutClass] = v