package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-preferences-page.h
*/
opaque type AdwPreferencesPage_autoptr = Ptr[AdwPreferencesPage]
object AdwPreferencesPage_autoptr:
  given _tag: Tag[AdwPreferencesPage_autoptr] = Tag.Ptr[AdwPreferencesPage](AdwPreferencesPage._tag)
  inline def apply(inline o: Ptr[AdwPreferencesPage]): AdwPreferencesPage_autoptr = o
  extension (v: AdwPreferencesPage_autoptr)
    inline def value: Ptr[AdwPreferencesPage] = v