package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GFileIcon_autoptr = Ptr[GFileIcon]
object GFileIcon_autoptr:
  given _tag: Tag[GFileIcon_autoptr] = Tag.Ptr[GFileIcon](GFileIcon._tag)
  inline def apply(inline o: Ptr[GFileIcon]): GFileIcon_autoptr = o
  extension (v: GFileIcon_autoptr)
    inline def value: Ptr[GFileIcon] = v