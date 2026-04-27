package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-bin.h
*/
opaque type AdwBin_autoptr = Ptr[AdwBin]
object AdwBin_autoptr:
  given _tag: Tag[AdwBin_autoptr] = Tag.Ptr[AdwBin](AdwBin._tag)
  inline def apply(inline o: Ptr[AdwBin]): AdwBin_autoptr = o
  extension (v: AdwBin_autoptr)
    inline def value: Ptr[AdwBin] = v