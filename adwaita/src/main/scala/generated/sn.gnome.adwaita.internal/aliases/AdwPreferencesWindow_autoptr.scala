package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-preferences-window.h
*/
opaque type AdwPreferencesWindow_autoptr = Ptr[AdwPreferencesWindow]
object AdwPreferencesWindow_autoptr:
  given _tag: Tag[AdwPreferencesWindow_autoptr] = Tag.Ptr[AdwPreferencesWindow](AdwPreferencesWindow._tag)
  inline def apply(inline o: Ptr[AdwPreferencesWindow]): AdwPreferencesWindow_autoptr = o
  extension (v: AdwPreferencesWindow_autoptr)
    inline def value: Ptr[AdwPreferencesWindow] = v