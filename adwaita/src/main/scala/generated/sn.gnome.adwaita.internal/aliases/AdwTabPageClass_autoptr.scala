package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-tab-view.h
*/
opaque type AdwTabPageClass_autoptr = Ptr[AdwTabPageClass]
object AdwTabPageClass_autoptr:
  given _tag: Tag[AdwTabPageClass_autoptr] = Tag.Ptr[AdwTabPageClass](AdwTabPageClass._tag)
  inline def apply(inline o: Ptr[AdwTabPageClass]): AdwTabPageClass_autoptr = o
  extension (v: AdwTabPageClass_autoptr)
    inline def value: Ptr[AdwTabPageClass] = v