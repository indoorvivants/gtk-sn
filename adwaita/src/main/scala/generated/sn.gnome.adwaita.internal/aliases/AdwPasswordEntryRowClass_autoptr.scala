package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-password-entry-row.h
*/
opaque type AdwPasswordEntryRowClass_autoptr = Ptr[AdwPasswordEntryRowClass]
object AdwPasswordEntryRowClass_autoptr:
  given _tag: Tag[AdwPasswordEntryRowClass_autoptr] = Tag.Ptr[AdwPasswordEntryRowClass](AdwPasswordEntryRowClass._tag)
  inline def apply(inline o: Ptr[AdwPasswordEntryRowClass]): AdwPasswordEntryRowClass_autoptr = o
  extension (v: AdwPasswordEntryRowClass_autoptr)
    inline def value: Ptr[AdwPasswordEntryRowClass] = v