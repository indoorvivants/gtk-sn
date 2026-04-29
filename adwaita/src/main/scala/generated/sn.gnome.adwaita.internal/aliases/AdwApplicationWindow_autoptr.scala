package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-application-window.h
*/
opaque type AdwApplicationWindow_autoptr = Ptr[AdwApplicationWindow]
object AdwApplicationWindow_autoptr:
  given _tag: Tag[AdwApplicationWindow_autoptr] = Tag.Ptr[AdwApplicationWindow](AdwApplicationWindow._tag)
  inline def apply(inline o: Ptr[AdwApplicationWindow]): AdwApplicationWindow_autoptr = o
  extension (v: AdwApplicationWindow_autoptr)
    inline def value: Ptr[AdwApplicationWindow] = v