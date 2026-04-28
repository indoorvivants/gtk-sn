package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkAssistant_autoptr = Ptr[GtkAssistant]
object GtkAssistant_autoptr:
  given _tag: Tag[GtkAssistant_autoptr] = Tag.Ptr[GtkAssistant](GtkAssistant._tag)
  inline def apply(inline o: Ptr[GtkAssistant]): GtkAssistant_autoptr = o
  extension (v: GtkAssistant_autoptr)
    inline def value: Ptr[GtkAssistant] = v