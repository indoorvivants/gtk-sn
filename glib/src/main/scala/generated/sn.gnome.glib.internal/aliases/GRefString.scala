package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GRefString:
*/
opaque type GRefString = CChar
object GRefString:
  given _tag: Tag[GRefString] = Tag.Byte
  inline def apply(inline o: CChar): GRefString = o
  extension (v: GRefString)
    inline def value: CChar = v