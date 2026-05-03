package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GSList_queueautoptr = Ptr[GQueue]
object GSList_queueautoptr:
  given _tag: Tag[GSList_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GSList_queueautoptr = o
  extension (v: GSList_queueautoptr)
    inline def value: Ptr[GQueue] = v