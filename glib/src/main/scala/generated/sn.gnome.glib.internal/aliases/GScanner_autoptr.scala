package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GScanner_autoptr = Ptr[GScanner]
object GScanner_autoptr:
  given _tag: Tag[GScanner_autoptr] = Tag.Ptr[GScanner](GScanner._tag)
  inline def apply(inline o: Ptr[GScanner]): GScanner_autoptr = o
  extension (v: GScanner_autoptr)
    inline def value: Ptr[GScanner] = v