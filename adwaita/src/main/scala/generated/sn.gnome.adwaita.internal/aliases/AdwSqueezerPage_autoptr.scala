package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-squeezer.h
*/
opaque type AdwSqueezerPage_autoptr = Ptr[AdwSqueezerPage]
object AdwSqueezerPage_autoptr:
  given _tag: Tag[AdwSqueezerPage_autoptr] = Tag.Ptr[AdwSqueezerPage](AdwSqueezerPage._tag)
  inline def apply(inline o: Ptr[AdwSqueezerPage]): AdwSqueezerPage_autoptr = o
  extension (v: AdwSqueezerPage_autoptr)
    inline def value: Ptr[AdwSqueezerPage] = v