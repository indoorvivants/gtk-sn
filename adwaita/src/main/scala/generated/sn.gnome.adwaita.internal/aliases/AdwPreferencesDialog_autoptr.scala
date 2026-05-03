package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-preferences-dialog.h
*/
opaque type AdwPreferencesDialog_autoptr = Ptr[AdwPreferencesDialog]
object AdwPreferencesDialog_autoptr:
  given _tag: Tag[AdwPreferencesDialog_autoptr] = Tag.Ptr[AdwPreferencesDialog](AdwPreferencesDialog._tag)
  inline def apply(inline o: Ptr[AdwPreferencesDialog]): AdwPreferencesDialog_autoptr = o
  extension (v: AdwPreferencesDialog_autoptr)
    inline def value: Ptr[AdwPreferencesDialog] = v