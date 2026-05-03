package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-tab-view.h
*/
opaque type AdwTabViewClass_autoptr = Ptr[AdwTabViewClass]
object AdwTabViewClass_autoptr:
  given _tag: Tag[AdwTabViewClass_autoptr] = Tag.Ptr[AdwTabViewClass](AdwTabViewClass._tag)
  inline def apply(inline o: Ptr[AdwTabViewClass]): AdwTabViewClass_autoptr = o
  extension (v: AdwTabViewClass_autoptr)
    inline def value: Ptr[AdwTabViewClass] = v