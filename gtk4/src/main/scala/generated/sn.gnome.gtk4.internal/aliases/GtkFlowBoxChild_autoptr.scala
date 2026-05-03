package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkFlowBoxChild_autoptr = Ptr[GtkFlowBoxChild]
object GtkFlowBoxChild_autoptr:
  given _tag: Tag[GtkFlowBoxChild_autoptr] = Tag.Ptr[GtkFlowBoxChild](GtkFlowBoxChild._tag)
  inline def apply(inline o: Ptr[GtkFlowBoxChild]): GtkFlowBoxChild_autoptr = o
  extension (v: GtkFlowBoxChild_autoptr)
    inline def value: Ptr[GtkFlowBoxChild] = v