package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GNode_autoptr = Ptr[GNode]
object GNode_autoptr:
  given _tag: Tag[GNode_autoptr] = Tag.Ptr[GNode](GNode._tag)
  inline def apply(inline o: Ptr[GNode]): GNode_autoptr = o
  extension (v: GNode_autoptr)
    inline def value: Ptr[GNode] = v