package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkGraphicsOffloadClass_autoptr = Ptr[GtkGraphicsOffloadClass]
object GtkGraphicsOffloadClass_autoptr:
  given _tag: Tag[GtkGraphicsOffloadClass_autoptr] = Tag.Ptr[GtkGraphicsOffloadClass](GtkGraphicsOffloadClass._tag)
  inline def apply(inline o: Ptr[GtkGraphicsOffloadClass]): GtkGraphicsOffloadClass_autoptr = o
  extension (v: GtkGraphicsOffloadClass_autoptr)
    inline def value: Ptr[GtkGraphicsOffloadClass] = v