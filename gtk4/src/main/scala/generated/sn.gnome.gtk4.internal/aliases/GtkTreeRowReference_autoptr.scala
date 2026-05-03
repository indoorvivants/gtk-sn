package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkTreeRowReference_autoptr = Ptr[GtkTreeRowReference]
object GtkTreeRowReference_autoptr:
  given _tag: Tag[GtkTreeRowReference_autoptr] = Tag.Ptr[GtkTreeRowReference](GtkTreeRowReference._tag)
  inline def apply(inline o: Ptr[GtkTreeRowReference]): GtkTreeRowReference_autoptr = o
  extension (v: GtkTreeRowReference_autoptr)
    inline def value: Ptr[GtkTreeRowReference] = v