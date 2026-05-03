package sn.gnome.gsk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GskRenderNode_autoptr = Ptr[GskRenderNode]
object GskRenderNode_autoptr:
  given _tag: Tag[GskRenderNode_autoptr] = Tag.Ptr[GskRenderNode](GskRenderNode._tag)
  inline def apply(inline o: Ptr[GskRenderNode]): GskRenderNode_autoptr = o
  extension (v: GskRenderNode_autoptr)
    inline def value: Ptr[GskRenderNode] = v