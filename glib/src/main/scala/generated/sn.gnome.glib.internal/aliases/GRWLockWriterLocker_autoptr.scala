package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GRWLockWriterLocker_autoptr = Ptr[GRWLockWriterLocker]
object GRWLockWriterLocker_autoptr:
  given _tag: Tag[GRWLockWriterLocker_autoptr] = Tag.Ptr[GRWLockWriterLocker](GRWLockWriterLocker._tag)
  inline def apply(inline o: Ptr[GRWLockWriterLocker]): GRWLockWriterLocker_autoptr = o
  extension (v: GRWLockWriterLocker_autoptr)
    inline def value: Ptr[GRWLockWriterLocker] = v