package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GdkContentProvider_autoptr = Ptr[GdkContentProvider]
object GdkContentProvider_autoptr:
  given _tag: Tag[GdkContentProvider_autoptr] = Tag.Ptr[GdkContentProvider](GdkContentProvider._tag)
  inline def apply(inline o: Ptr[GdkContentProvider]): GdkContentProvider_autoptr = o
  extension (v: GdkContentProvider_autoptr)
    inline def value: Ptr[GdkContentProvider] = v