package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-clamp.h
*/
opaque type AdwClampClass_autoptr = Ptr[AdwClampClass]
object AdwClampClass_autoptr:
  given _tag: Tag[AdwClampClass_autoptr] = Tag.Ptr[AdwClampClass](AdwClampClass._tag)
  inline def apply(inline o: Ptr[AdwClampClass]): AdwClampClass_autoptr = o
  extension (v: AdwClampClass_autoptr)
    inline def value: Ptr[AdwClampClass] = v