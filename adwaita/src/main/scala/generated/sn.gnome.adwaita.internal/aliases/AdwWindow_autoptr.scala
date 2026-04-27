package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-window.h
*/
opaque type AdwWindow_autoptr = Ptr[AdwWindow]
object AdwWindow_autoptr:
  given _tag: Tag[AdwWindow_autoptr] = Tag.Ptr[AdwWindow](AdwWindow._tag)
  inline def apply(inline o: Ptr[AdwWindow]): AdwWindow_autoptr = o
  extension (v: AdwWindow_autoptr)
    inline def value: Ptr[AdwWindow] = v