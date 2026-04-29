package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-application-window.h
*/
opaque type AdwApplicationWindowClass_autoptr = Ptr[AdwApplicationWindowClass]
object AdwApplicationWindowClass_autoptr:
  given _tag: Tag[AdwApplicationWindowClass_autoptr] = Tag.Ptr[AdwApplicationWindowClass](AdwApplicationWindowClass._tag)
  inline def apply(inline o: Ptr[AdwApplicationWindowClass]): AdwApplicationWindowClass_autoptr = o
  extension (v: AdwApplicationWindowClass_autoptr)
    inline def value: Ptr[AdwApplicationWindowClass] = v