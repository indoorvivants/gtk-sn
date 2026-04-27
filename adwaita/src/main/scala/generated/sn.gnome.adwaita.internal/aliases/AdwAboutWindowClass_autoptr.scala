package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-about-window.h
*/
opaque type AdwAboutWindowClass_autoptr = Ptr[AdwAboutWindowClass]
object AdwAboutWindowClass_autoptr:
  given _tag: Tag[AdwAboutWindowClass_autoptr] = Tag.Ptr[AdwAboutWindowClass](AdwAboutWindowClass._tag)
  inline def apply(inline o: Ptr[AdwAboutWindowClass]): AdwAboutWindowClass_autoptr = o
  extension (v: AdwAboutWindowClass_autoptr)
    inline def value: Ptr[AdwAboutWindowClass] = v