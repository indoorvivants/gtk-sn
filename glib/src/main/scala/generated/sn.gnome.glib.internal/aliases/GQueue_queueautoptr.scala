package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GQueue_queueautoptr = Ptr[GQueue]
object GQueue_queueautoptr:
  given _tag: Tag[GQueue_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GQueue_queueautoptr = o
  extension (v: GQueue_queueautoptr)
    inline def value: Ptr[GQueue] = v