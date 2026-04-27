package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-preferences-window.h
*/
opaque type AdwPreferencesWindowClass_autoptr = Ptr[AdwPreferencesWindowClass]
object AdwPreferencesWindowClass_autoptr:
  given _tag: Tag[AdwPreferencesWindowClass_autoptr] = Tag.Ptr[AdwPreferencesWindowClass](AdwPreferencesWindowClass._tag)
  inline def apply(inline o: Ptr[AdwPreferencesWindowClass]): AdwPreferencesWindowClass_autoptr = o
  extension (v: AdwPreferencesWindowClass_autoptr)
    inline def value: Ptr[AdwPreferencesWindowClass] = v