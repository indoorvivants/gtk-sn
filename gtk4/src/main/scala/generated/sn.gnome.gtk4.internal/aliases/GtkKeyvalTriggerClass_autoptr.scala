package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkKeyvalTriggerClass_autoptr = Ptr[GtkKeyvalTriggerClass]
object GtkKeyvalTriggerClass_autoptr:
  given _tag: Tag[GtkKeyvalTriggerClass_autoptr] = Tag.Ptr[GtkKeyvalTriggerClass](GtkKeyvalTriggerClass._tag)
  inline def apply(inline o: Ptr[GtkKeyvalTriggerClass]): GtkKeyvalTriggerClass_autoptr = o
  extension (v: GtkKeyvalTriggerClass_autoptr)
    inline def value: Ptr[GtkKeyvalTriggerClass] = v