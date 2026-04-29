package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type gpointer = Ptr[Byte]
object gpointer:
  given _tag: Tag[gpointer] = Tag.Ptr(Tag.Byte)
  inline def apply(inline o: Ptr[Byte]): gpointer = o
  extension (v: gpointer)
    inline def value: Ptr[Byte] = v