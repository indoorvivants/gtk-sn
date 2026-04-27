package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkDropDownClass_autoptr = Ptr[GtkDropDownClass]
object GtkDropDownClass_autoptr:
  given _tag: Tag[GtkDropDownClass_autoptr] = Tag.Ptr[GtkDropDownClass](GtkDropDownClass._tag)
  inline def apply(inline o: Ptr[GtkDropDownClass]): GtkDropDownClass_autoptr = o
  extension (v: GtkDropDownClass_autoptr)
    inline def value: Ptr[GtkDropDownClass] = v