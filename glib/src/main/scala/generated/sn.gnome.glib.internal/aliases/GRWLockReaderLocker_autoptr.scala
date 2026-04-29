package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GRWLockReaderLocker_autoptr = Ptr[GRWLockReaderLocker]
object GRWLockReaderLocker_autoptr:
  given _tag: Tag[GRWLockReaderLocker_autoptr] = Tag.Ptr[GRWLockReaderLocker](GRWLockReaderLocker._tag)
  inline def apply(inline o: Ptr[GRWLockReaderLocker]): GRWLockReaderLocker_autoptr = o
  extension (v: GRWLockReaderLocker_autoptr)
    inline def value: Ptr[GRWLockReaderLocker] = v