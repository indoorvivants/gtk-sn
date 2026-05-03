package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkBorder_autoptr = Ptr[GtkBorder]
object GtkBorder_autoptr:
  given _tag: Tag[GtkBorder_autoptr] = Tag.Ptr[GtkBorder](GtkBorder._tag)
  inline def apply(inline o: Ptr[GtkBorder]): GtkBorder_autoptr = o
  extension (v: GtkBorder_autoptr)
    inline def value: Ptr[GtkBorder] = v