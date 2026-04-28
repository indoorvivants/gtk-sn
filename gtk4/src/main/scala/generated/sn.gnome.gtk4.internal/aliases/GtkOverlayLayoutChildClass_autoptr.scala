package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkOverlayLayoutChildClass_autoptr = Ptr[GtkOverlayLayoutChildClass]
object GtkOverlayLayoutChildClass_autoptr:
  given _tag: Tag[GtkOverlayLayoutChildClass_autoptr] = Tag.Ptr[GtkOverlayLayoutChildClass](GtkOverlayLayoutChildClass._tag)
  inline def apply(inline o: Ptr[GtkOverlayLayoutChildClass]): GtkOverlayLayoutChildClass_autoptr = o
  extension (v: GtkOverlayLayoutChildClass_autoptr)
    inline def value: Ptr[GtkOverlayLayoutChildClass] = v