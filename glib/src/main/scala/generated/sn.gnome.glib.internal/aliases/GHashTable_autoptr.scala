package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GHashTable_autoptr = Ptr[GHashTable]
object GHashTable_autoptr:
  given _tag: Tag[GHashTable_autoptr] = Tag.Ptr[GHashTable](GHashTable._tag)
  inline def apply(inline o: Ptr[GHashTable]): GHashTable_autoptr = o
  extension (v: GHashTable_autoptr)
    inline def value: Ptr[GHashTable] = v