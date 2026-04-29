package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-tab-view.h
*/
opaque type AdwTabPage_autoptr = Ptr[AdwTabPage]
object AdwTabPage_autoptr:
  given _tag: Tag[AdwTabPage_autoptr] = Tag.Ptr[AdwTabPage](AdwTabPage._tag)
  inline def apply(inline o: Ptr[AdwTabPage]): AdwTabPage_autoptr = o
  extension (v: AdwTabPage_autoptr)
    inline def value: Ptr[AdwTabPage] = v