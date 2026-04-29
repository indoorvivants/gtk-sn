package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GKeyFile_queueautoptr = Ptr[GQueue]
object GKeyFile_queueautoptr:
  given _tag: Tag[GKeyFile_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GKeyFile_queueautoptr = o
  extension (v: GKeyFile_queueautoptr)
    inline def value: Ptr[GQueue] = v