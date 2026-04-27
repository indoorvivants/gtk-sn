package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkMediaStream_autoptr = Ptr[GtkMediaStream]
object GtkMediaStream_autoptr:
  given _tag: Tag[GtkMediaStream_autoptr] = Tag.Ptr[GtkMediaStream](GtkMediaStream._tag)
  inline def apply(inline o: Ptr[GtkMediaStream]): GtkMediaStream_autoptr = o
  extension (v: GtkMediaStream_autoptr)
    inline def value: Ptr[GtkMediaStream] = v