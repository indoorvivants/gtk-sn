package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GResolver_autoptr = Ptr[GResolver]
object GResolver_autoptr:
  given _tag: Tag[GResolver_autoptr] = Tag.Ptr[GResolver](GResolver._tag)
  inline def apply(inline o: Ptr[GResolver]): GResolver_autoptr = o
  extension (v: GResolver_autoptr)
    inline def value: Ptr[GResolver] = v