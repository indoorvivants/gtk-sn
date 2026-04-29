package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GMutexLocker_queueautoptr = Ptr[GQueue]
object GMutexLocker_queueautoptr:
  given _tag: Tag[GMutexLocker_queueautoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GMutexLocker_queueautoptr = o
  extension (v: GMutexLocker_queueautoptr)
    inline def value: Ptr[GQueue] = v