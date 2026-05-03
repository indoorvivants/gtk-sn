package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkBuilderCScopeClass_autoptr = Ptr[GtkBuilderCScopeClass]
object GtkBuilderCScopeClass_autoptr:
  given _tag: Tag[GtkBuilderCScopeClass_autoptr] = Tag.Ptr[GtkBuilderCScopeClass](GtkBuilderCScopeClass._tag)
  inline def apply(inline o: Ptr[GtkBuilderCScopeClass]): GtkBuilderCScopeClass_autoptr = o
  extension (v: GtkBuilderCScopeClass_autoptr)
    inline def value: Ptr[GtkBuilderCScopeClass] = v