package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkMediaFileClass_autoptr = Ptr[GtkMediaFileClass]
object GtkMediaFileClass_autoptr:
  given _tag: Tag[GtkMediaFileClass_autoptr] = Tag.Ptr[GtkMediaFileClass](GtkMediaFileClass._tag)
  inline def apply(inline o: Ptr[GtkMediaFileClass]): GtkMediaFileClass_autoptr = o
  extension (v: GtkMediaFileClass_autoptr)
    inline def value: Ptr[GtkMediaFileClass] = v