package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkFlowBox_autoptr = Ptr[GtkFlowBox]
object GtkFlowBox_autoptr:
  given _tag: Tag[GtkFlowBox_autoptr] = Tag.Ptr[GtkFlowBox](GtkFlowBox._tag)
  inline def apply(inline o: Ptr[GtkFlowBox]): GtkFlowBox_autoptr = o
  extension (v: GtkFlowBox_autoptr)
    inline def value: Ptr[GtkFlowBox] = v