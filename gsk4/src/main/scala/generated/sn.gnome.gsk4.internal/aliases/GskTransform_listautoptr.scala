package sn.gnome.gsk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GskTransform_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GskTransform_listautoptr:
  given _tag: Tag[GskTransform_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GskTransform_listautoptr = o
  extension (v: GskTransform_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v