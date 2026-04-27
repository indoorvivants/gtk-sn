package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GMutexLocker_autoptr = Ptr[GMutexLocker]
object GMutexLocker_autoptr:
  given _tag: Tag[GMutexLocker_autoptr] = Tag.Ptr[GMutexLocker](GMutexLocker._tag)
  inline def apply(inline o: Ptr[GMutexLocker]): GMutexLocker_autoptr = o
  extension (v: GMutexLocker_autoptr)
    inline def value: Ptr[GMutexLocker] = v