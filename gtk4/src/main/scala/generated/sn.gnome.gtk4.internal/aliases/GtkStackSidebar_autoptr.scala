package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkStackSidebar_autoptr = Ptr[GtkStackSidebar]
object GtkStackSidebar_autoptr:
  given _tag: Tag[GtkStackSidebar_autoptr] = Tag.Ptr[GtkStackSidebar](GtkStackSidebar._tag)
  inline def apply(inline o: Ptr[GtkStackSidebar]): GtkStackSidebar_autoptr = o
  extension (v: GtkStackSidebar_autoptr)
    inline def value: Ptr[GtkStackSidebar] = v