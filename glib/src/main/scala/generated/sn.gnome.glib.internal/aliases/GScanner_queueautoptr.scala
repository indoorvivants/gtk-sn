package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GScanner_queueautoptr = Ptr[GQueue]
object GScanner_queueautoptr:
  given _tag: Tag[GScanner_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GScanner_queueautoptr = o
  extension (v: GScanner_queueautoptr)
    inline def value: Ptr[GQueue] = v