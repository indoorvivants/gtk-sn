package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkFixedLayoutChildClass_autoptr = Ptr[GtkFixedLayoutChildClass]
object GtkFixedLayoutChildClass_autoptr:
  given _tag: Tag[GtkFixedLayoutChildClass_autoptr] = Tag.Ptr[GtkFixedLayoutChildClass](GtkFixedLayoutChildClass._tag)
  inline def apply(inline o: Ptr[GtkFixedLayoutChildClass]): GtkFixedLayoutChildClass_autoptr = o
  extension (v: GtkFixedLayoutChildClass_autoptr)
    inline def value: Ptr[GtkFixedLayoutChildClass] = v