package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GDrive_autoptr = Ptr[GDrive]
object GDrive_autoptr:
  given _tag: Tag[GDrive_autoptr] = Tag.Ptr[GDrive](GDrive._tag)
  inline def apply(inline o: Ptr[GDrive]): GDrive_autoptr = o
  extension (v: GDrive_autoptr)
    inline def value: Ptr[GDrive] = v