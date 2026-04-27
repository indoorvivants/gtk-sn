package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GRecMutexLocker_autoptr = Ptr[GRecMutexLocker]
object GRecMutexLocker_autoptr:
  given _tag: Tag[GRecMutexLocker_autoptr] = Tag.Ptr[GRecMutexLocker](GRecMutexLocker._tag)
  inline def apply(inline o: Ptr[GRecMutexLocker]): GRecMutexLocker_autoptr = o
  extension (v: GRecMutexLocker_autoptr)
    inline def value: Ptr[GRecMutexLocker] = v