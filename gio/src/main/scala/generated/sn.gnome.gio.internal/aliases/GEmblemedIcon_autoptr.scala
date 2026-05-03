package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GEmblemedIcon_autoptr = Ptr[GEmblemedIcon]
object GEmblemedIcon_autoptr:
  given _tag: Tag[GEmblemedIcon_autoptr] = Tag.Ptr[GEmblemedIcon](GEmblemedIcon._tag)
  inline def apply(inline o: Ptr[GEmblemedIcon]): GEmblemedIcon_autoptr = o
  extension (v: GEmblemedIcon_autoptr)
    inline def value: Ptr[GEmblemedIcon] = v