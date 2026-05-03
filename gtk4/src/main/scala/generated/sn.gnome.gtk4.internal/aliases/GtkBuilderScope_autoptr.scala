package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkBuilderScope_autoptr = Ptr[GtkBuilderScope]
object GtkBuilderScope_autoptr:
  given _tag: Tag[GtkBuilderScope_autoptr] = Tag.Ptr[GtkBuilderScope](GtkBuilderScope._tag)
  inline def apply(inline o: Ptr[GtkBuilderScope]): GtkBuilderScope_autoptr = o
  extension (v: GtkBuilderScope_autoptr)
    inline def value: Ptr[GtkBuilderScope] = v