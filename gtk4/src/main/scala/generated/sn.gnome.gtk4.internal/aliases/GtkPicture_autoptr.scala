package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkPicture_autoptr = Ptr[GtkPicture]
object GtkPicture_autoptr:
  given _tag: Tag[GtkPicture_autoptr] = Tag.Ptr[GtkPicture](GtkPicture._tag)
  inline def apply(inline o: Ptr[GtkPicture]): GtkPicture_autoptr = o
  extension (v: GtkPicture_autoptr)
    inline def value: Ptr[GtkPicture] = v