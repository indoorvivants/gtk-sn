package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkIMMulticontext_autoptr = Ptr[GtkIMMulticontext]
object GtkIMMulticontext_autoptr:
  given _tag: Tag[GtkIMMulticontext_autoptr] = Tag.Ptr[GtkIMMulticontext](GtkIMMulticontext._tag)
  inline def apply(inline o: Ptr[GtkIMMulticontext]): GtkIMMulticontext_autoptr = o
  extension (v: GtkIMMulticontext_autoptr)
    inline def value: Ptr[GtkIMMulticontext] = v