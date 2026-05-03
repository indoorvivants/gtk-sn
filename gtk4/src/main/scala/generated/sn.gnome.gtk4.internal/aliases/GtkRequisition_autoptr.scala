package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkRequisition_autoptr = Ptr[GtkRequisition]
object GtkRequisition_autoptr:
  given _tag: Tag[GtkRequisition_autoptr] = Tag.Ptr[GtkRequisition](GtkRequisition._tag)
  inline def apply(inline o: Ptr[GtkRequisition]): GtkRequisition_autoptr = o
  extension (v: GtkRequisition_autoptr)
    inline def value: Ptr[GtkRequisition] = v