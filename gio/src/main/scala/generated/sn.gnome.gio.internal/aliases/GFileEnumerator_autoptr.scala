package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GFileEnumerator_autoptr = Ptr[GFileEnumerator]
object GFileEnumerator_autoptr:
  given _tag: Tag[GFileEnumerator_autoptr] = Tag.Ptr[GFileEnumerator](GFileEnumerator._tag)
  inline def apply(inline o: Ptr[GFileEnumerator]): GFileEnumerator_autoptr = o
  extension (v: GFileEnumerator_autoptr)
    inline def value: Ptr[GFileEnumerator] = v