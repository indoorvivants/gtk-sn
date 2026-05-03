package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-clamp-layout.h
*/
opaque type AdwClampLayout_autoptr = Ptr[AdwClampLayout]
object AdwClampLayout_autoptr:
  given _tag: Tag[AdwClampLayout_autoptr] = Tag.Ptr[AdwClampLayout](AdwClampLayout._tag)
  inline def apply(inline o: Ptr[AdwClampLayout]): AdwClampLayout_autoptr = o
  extension (v: AdwClampLayout_autoptr)
    inline def value: Ptr[AdwClampLayout] = v