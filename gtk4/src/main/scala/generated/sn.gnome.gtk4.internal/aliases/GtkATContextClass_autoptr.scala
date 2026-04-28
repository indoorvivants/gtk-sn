package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkATContextClass_autoptr = Ptr[GtkATContextClass]
object GtkATContextClass_autoptr:
  given _tag: Tag[GtkATContextClass_autoptr] = Tag.Ptr[GtkATContextClass](GtkATContextClass._tag)
  inline def apply(inline o: Ptr[GtkATContextClass]): GtkATContextClass_autoptr = o
  extension (v: GtkATContextClass_autoptr)
    inline def value: Ptr[GtkATContextClass] = v