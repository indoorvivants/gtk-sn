package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-preferences-dialog.h
*/
opaque type AdwPreferencesDialogClass_autoptr = Ptr[AdwPreferencesDialogClass]
object AdwPreferencesDialogClass_autoptr:
  given _tag: Tag[AdwPreferencesDialogClass_autoptr] = Tag.Ptr[AdwPreferencesDialogClass](AdwPreferencesDialogClass._tag)
  inline def apply(inline o: Ptr[AdwPreferencesDialogClass]): AdwPreferencesDialogClass_autoptr = o
  extension (v: AdwPreferencesDialogClass_autoptr)
    inline def value: Ptr[AdwPreferencesDialogClass] = v