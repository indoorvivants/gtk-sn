package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkInscription_autoptr = Ptr[GtkInscription]
object GtkInscription_autoptr:
  given _tag: Tag[GtkInscription_autoptr] = Tag.Ptr[GtkInscription](GtkInscription._tag)
  inline def apply(inline o: Ptr[GtkInscription]): GtkInscription_autoptr = o
  extension (v: GtkInscription_autoptr)
    inline def value: Ptr[GtkInscription] = v