package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type PangoAttribute_autoptr = Ptr[PangoAttribute]
object PangoAttribute_autoptr:
  given _tag: Tag[PangoAttribute_autoptr] = Tag.Ptr[PangoAttribute](PangoAttribute._tag)
  inline def apply(inline o: Ptr[PangoAttribute]): PangoAttribute_autoptr = o
  extension (v: PangoAttribute_autoptr)
    inline def value: Ptr[PangoAttribute] = v