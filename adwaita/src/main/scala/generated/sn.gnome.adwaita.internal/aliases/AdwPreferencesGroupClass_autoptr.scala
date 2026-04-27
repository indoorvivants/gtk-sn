package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-preferences-group.h
*/
opaque type AdwPreferencesGroupClass_autoptr = Ptr[AdwPreferencesGroupClass]
object AdwPreferencesGroupClass_autoptr:
  given _tag: Tag[AdwPreferencesGroupClass_autoptr] = Tag.Ptr[AdwPreferencesGroupClass](AdwPreferencesGroupClass._tag)
  inline def apply(inline o: Ptr[AdwPreferencesGroupClass]): AdwPreferencesGroupClass_autoptr = o
  extension (v: AdwPreferencesGroupClass_autoptr)
    inline def value: Ptr[AdwPreferencesGroupClass] = v