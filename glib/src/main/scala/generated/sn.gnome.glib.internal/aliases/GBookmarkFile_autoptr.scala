package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GBookmarkFile_autoptr = Ptr[GBookmarkFile]
object GBookmarkFile_autoptr:
  given _tag: Tag[GBookmarkFile_autoptr] = Tag.Ptr[GBookmarkFile](GBookmarkFile._tag)
  inline def apply(inline o: Ptr[GBookmarkFile]): GBookmarkFile_autoptr = o
  extension (v: GBookmarkFile_autoptr)
    inline def value: Ptr[GBookmarkFile] = v