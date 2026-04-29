package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GFile_autoptr = Ptr[GFile]
object GFile_autoptr:
  given _tag: Tag[GFile_autoptr] = Tag.Ptr[GFile](GFile._tag)
  inline def apply(inline o: Ptr[GFile]): GFile_autoptr = o
  extension (v: GFile_autoptr)
    inline def value: Ptr[GFile] = v