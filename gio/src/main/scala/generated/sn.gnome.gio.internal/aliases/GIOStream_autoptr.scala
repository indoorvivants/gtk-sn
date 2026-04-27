package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GIOStream_autoptr = Ptr[GIOStream]
object GIOStream_autoptr:
  given _tag: Tag[GIOStream_autoptr] = Tag.Ptr[GIOStream](GIOStream._tag)
  inline def apply(inline o: Ptr[GIOStream]): GIOStream_autoptr = o
  extension (v: GIOStream_autoptr)
    inline def value: Ptr[GIOStream] = v