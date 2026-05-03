package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkAlternativeTrigger_autoptr = Ptr[GtkAlternativeTrigger]
object GtkAlternativeTrigger_autoptr:
  given _tag: Tag[GtkAlternativeTrigger_autoptr] = Tag.Ptr[GtkAlternativeTrigger](GtkAlternativeTrigger._tag)
  inline def apply(inline o: Ptr[GtkAlternativeTrigger]): GtkAlternativeTrigger_autoptr = o
  extension (v: GtkAlternativeTrigger_autoptr)
    inline def value: Ptr[GtkAlternativeTrigger] = v