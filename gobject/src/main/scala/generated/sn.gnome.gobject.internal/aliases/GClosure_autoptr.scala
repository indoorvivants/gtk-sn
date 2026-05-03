package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GClosure_autoptr = Ptr[GClosure]
object GClosure_autoptr:
  given _tag: Tag[GClosure_autoptr] = Tag.Ptr[GClosure](GClosure._tag)
  inline def apply(inline o: Ptr[GClosure]): GClosure_autoptr = o
  extension (v: GClosure_autoptr)
    inline def value: Ptr[GClosure] = v