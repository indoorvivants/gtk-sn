package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkMediaFile_autoptr = Ptr[GtkMediaFile]
object GtkMediaFile_autoptr:
  given _tag: Tag[GtkMediaFile_autoptr] = Tag.Ptr[GtkMediaFile](GtkMediaFile._tag)
  inline def apply(inline o: Ptr[GtkMediaFile]): GtkMediaFile_autoptr = o
  extension (v: GtkMediaFile_autoptr)
    inline def value: Ptr[GtkMediaFile] = v