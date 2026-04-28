package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkAlternativeTriggerClass_autoptr = Ptr[GtkAlternativeTriggerClass]
object GtkAlternativeTriggerClass_autoptr:
  given _tag: Tag[GtkAlternativeTriggerClass_autoptr] = Tag.Ptr[GtkAlternativeTriggerClass](GtkAlternativeTriggerClass._tag)
  inline def apply(inline o: Ptr[GtkAlternativeTriggerClass]): GtkAlternativeTriggerClass_autoptr = o
  extension (v: GtkAlternativeTriggerClass_autoptr)
    inline def value: Ptr[GtkAlternativeTriggerClass] = v