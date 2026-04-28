package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkFixed_autoptr = Ptr[GtkFixed]
object GtkFixed_autoptr:
  given _tag: Tag[GtkFixed_autoptr] = Tag.Ptr[GtkFixed](GtkFixed._tag)
  inline def apply(inline o: Ptr[GtkFixed]): GtkFixed_autoptr = o
  extension (v: GtkFixed_autoptr)
    inline def value: Ptr[GtkFixed] = v