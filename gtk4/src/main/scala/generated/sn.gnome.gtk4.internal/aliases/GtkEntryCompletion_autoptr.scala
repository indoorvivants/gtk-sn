package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkEntryCompletion_autoptr = Ptr[GtkEntryCompletion]
object GtkEntryCompletion_autoptr:
  given _tag: Tag[GtkEntryCompletion_autoptr] = Tag.Ptr[GtkEntryCompletion](GtkEntryCompletion._tag)
  inline def apply(inline o: Ptr[GtkEntryCompletion]): GtkEntryCompletion_autoptr = o
  extension (v: GtkEntryCompletion_autoptr)
    inline def value: Ptr[GtkEntryCompletion] = v