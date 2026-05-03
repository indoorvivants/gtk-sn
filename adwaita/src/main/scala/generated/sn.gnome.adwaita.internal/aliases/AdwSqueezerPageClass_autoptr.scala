package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-squeezer.h
*/
opaque type AdwSqueezerPageClass_autoptr = Ptr[AdwSqueezerPageClass]
object AdwSqueezerPageClass_autoptr:
  given _tag: Tag[AdwSqueezerPageClass_autoptr] = Tag.Ptr[AdwSqueezerPageClass](AdwSqueezerPageClass._tag)
  inline def apply(inline o: Ptr[AdwSqueezerPageClass]): AdwSqueezerPageClass_autoptr = o
  extension (v: AdwSqueezerPageClass_autoptr)
    inline def value: Ptr[AdwSqueezerPageClass] = v