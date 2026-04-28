package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkWindowControls_autoptr = Ptr[GtkWindowControls]
object GtkWindowControls_autoptr:
  given _tag: Tag[GtkWindowControls_autoptr] = Tag.Ptr[GtkWindowControls](GtkWindowControls._tag)
  inline def apply(inline o: Ptr[GtkWindowControls]): GtkWindowControls_autoptr = o
  extension (v: GtkWindowControls_autoptr)
    inline def value: Ptr[GtkWindowControls] = v