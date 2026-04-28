package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkMediaControls_autoptr = Ptr[GtkMediaControls]
object GtkMediaControls_autoptr:
  given _tag: Tag[GtkMediaControls_autoptr] = Tag.Ptr[GtkMediaControls](GtkMediaControls._tag)
  inline def apply(inline o: Ptr[GtkMediaControls]): GtkMediaControls_autoptr = o
  extension (v: GtkMediaControls_autoptr)
    inline def value: Ptr[GtkMediaControls] = v