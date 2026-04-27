package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GMountOperation_autoptr = Ptr[GMountOperation]
object GMountOperation_autoptr:
  given _tag: Tag[GMountOperation_autoptr] = Tag.Ptr[GMountOperation](GMountOperation._tag)
  inline def apply(inline o: Ptr[GMountOperation]): GMountOperation_autoptr = o
  extension (v: GMountOperation_autoptr)
    inline def value: Ptr[GMountOperation] = v