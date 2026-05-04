package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
opaque type GInitiallyUnowned_autoptr = Ptr[GInitiallyUnowned]
object GInitiallyUnowned_autoptr:
  given _tag: Tag[GInitiallyUnowned_autoptr] = Tag.Ptr[GInitiallyUnowned](GInitiallyUnowned._tag)
  inline def apply(inline o: Ptr[GInitiallyUnowned]): GInitiallyUnowned_autoptr = o
  extension (v: GInitiallyUnowned_autoptr)
    inline def value: Ptr[GInitiallyUnowned] = v