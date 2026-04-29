package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-password-entry-row.h
*/
opaque type AdwPasswordEntryRow_autoptr = Ptr[AdwPasswordEntryRow]
object AdwPasswordEntryRow_autoptr:
  given _tag: Tag[AdwPasswordEntryRow_autoptr] = Tag.Ptr[AdwPasswordEntryRow](AdwPasswordEntryRow._tag)
  inline def apply(inline o: Ptr[AdwPasswordEntryRow]): AdwPasswordEntryRow_autoptr = o
  extension (v: AdwPasswordEntryRow_autoptr)
    inline def value: Ptr[AdwPasswordEntryRow] = v