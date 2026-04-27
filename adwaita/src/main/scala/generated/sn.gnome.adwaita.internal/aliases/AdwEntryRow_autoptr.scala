package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-entry-row.h
*/
opaque type AdwEntryRow_autoptr = Ptr[AdwEntryRow]
object AdwEntryRow_autoptr:
  given _tag: Tag[AdwEntryRow_autoptr] = Tag.Ptr[AdwEntryRow](AdwEntryRow._tag)
  inline def apply(inline o: Ptr[AdwEntryRow]): AdwEntryRow_autoptr = o
  extension (v: AdwEntryRow_autoptr)
    inline def value: Ptr[AdwEntryRow] = v