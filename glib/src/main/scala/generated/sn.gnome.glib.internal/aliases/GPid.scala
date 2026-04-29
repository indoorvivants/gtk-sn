package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GPid = CInt
object GPid:
  given _tag: Tag[GPid] = Tag.Int
  inline def apply(inline o: CInt): GPid = o
  extension (v: GPid)
    inline def value: CInt = v