package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type PangoAttrIterator_autoptr = Ptr[PangoAttrIterator]
object PangoAttrIterator_autoptr:
  given _tag: Tag[PangoAttrIterator_autoptr] = Tag.Ptr[PangoAttrIterator](PangoAttrIterator._tag)
  inline def apply(inline o: Ptr[PangoAttrIterator]): PangoAttrIterator_autoptr = o
  extension (v: PangoAttrIterator_autoptr)
    inline def value: Ptr[PangoAttrIterator] = v