package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GFileIOStream_autoptr = Ptr[GFileIOStream]
object GFileIOStream_autoptr:
  given _tag: Tag[GFileIOStream_autoptr] = Tag.Ptr[GFileIOStream](GFileIOStream._tag)
  inline def apply(inline o: Ptr[GFileIOStream]): GFileIOStream_autoptr = o
  extension (v: GFileIOStream_autoptr)
    inline def value: Ptr[GFileIOStream] = v