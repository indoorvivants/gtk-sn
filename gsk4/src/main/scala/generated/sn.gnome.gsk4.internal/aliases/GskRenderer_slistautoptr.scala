package sn.gnome.gsk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GskRenderer_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GskRenderer_slistautoptr:
  given _tag: Tag[GskRenderer_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GskRenderer_slistautoptr = o
  extension (v: GskRenderer_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v