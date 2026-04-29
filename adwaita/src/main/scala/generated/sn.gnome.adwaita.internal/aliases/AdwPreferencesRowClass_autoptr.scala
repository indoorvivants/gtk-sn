package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-preferences-row.h
*/
opaque type AdwPreferencesRowClass_autoptr = Ptr[AdwPreferencesRowClass]
object AdwPreferencesRowClass_autoptr:
  given _tag: Tag[AdwPreferencesRowClass_autoptr] = Tag.Ptr[AdwPreferencesRowClass](AdwPreferencesRowClass._tag)
  inline def apply(inline o: Ptr[AdwPreferencesRowClass]): AdwPreferencesRowClass_autoptr = o
  extension (v: AdwPreferencesRowClass_autoptr)
    inline def value: Ptr[AdwPreferencesRowClass] = v