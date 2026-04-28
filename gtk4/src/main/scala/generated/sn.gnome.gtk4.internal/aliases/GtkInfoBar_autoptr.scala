package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkInfoBar_autoptr = Ptr[GtkInfoBar]
object GtkInfoBar_autoptr:
  given _tag: Tag[GtkInfoBar_autoptr] = Tag.Ptr[GtkInfoBar](GtkInfoBar._tag)
  inline def apply(inline o: Ptr[GtkInfoBar]): GtkInfoBar_autoptr = o
  extension (v: GtkInfoBar_autoptr)
    inline def value: Ptr[GtkInfoBar] = v