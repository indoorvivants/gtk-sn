package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkGraphicsOffload_autoptr = Ptr[GtkGraphicsOffload]
object GtkGraphicsOffload_autoptr:
  given _tag: Tag[GtkGraphicsOffload_autoptr] = Tag.Ptr[GtkGraphicsOffload](GtkGraphicsOffload._tag)
  inline def apply(inline o: Ptr[GtkGraphicsOffload]): GtkGraphicsOffload_autoptr = o
  extension (v: GtkGraphicsOffload_autoptr)
    inline def value: Ptr[GtkGraphicsOffload] = v