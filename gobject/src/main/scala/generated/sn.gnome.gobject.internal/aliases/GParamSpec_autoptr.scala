package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
opaque type GParamSpec_autoptr = Ptr[GParamSpec]
object GParamSpec_autoptr:
  given _tag: Tag[GParamSpec_autoptr] = Tag.Ptr[GParamSpec](GParamSpec._tag)
  inline def apply(inline o: Ptr[GParamSpec]): GParamSpec_autoptr = o
  extension (v: GParamSpec_autoptr)
    inline def value: Ptr[GParamSpec] = v