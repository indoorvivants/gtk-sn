package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-preferences-group.h
*/
opaque type AdwPreferencesGroup_autoptr = Ptr[AdwPreferencesGroup]
object AdwPreferencesGroup_autoptr:
  given _tag: Tag[AdwPreferencesGroup_autoptr] = Tag.Ptr[AdwPreferencesGroup](AdwPreferencesGroup._tag)
  inline def apply(inline o: Ptr[AdwPreferencesGroup]): AdwPreferencesGroup_autoptr = o
  extension (v: AdwPreferencesGroup_autoptr)
    inline def value: Ptr[AdwPreferencesGroup] = v