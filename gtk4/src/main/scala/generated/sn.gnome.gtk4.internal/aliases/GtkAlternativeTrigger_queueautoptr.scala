package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkAlternativeTrigger_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkAlternativeTrigger_queueautoptr:
  given _tag: Tag[GtkAlternativeTrigger_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkAlternativeTrigger_queueautoptr = o
  extension (v: GtkAlternativeTrigger_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v