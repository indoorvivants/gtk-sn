package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GString_queueautoptr = Ptr[GQueue]
object GString_queueautoptr:
  given _tag: Tag[GString_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GString_queueautoptr = o
  extension (v: GString_queueautoptr)
    inline def value: Ptr[GQueue] = v