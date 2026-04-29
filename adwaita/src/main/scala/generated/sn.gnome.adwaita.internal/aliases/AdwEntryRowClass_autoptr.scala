package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-entry-row.h
*/
opaque type AdwEntryRowClass_autoptr = Ptr[AdwEntryRowClass]
object AdwEntryRowClass_autoptr:
  given _tag: Tag[AdwEntryRowClass_autoptr] = Tag.Ptr[AdwEntryRowClass](AdwEntryRowClass._tag)
  inline def apply(inline o: Ptr[AdwEntryRowClass]): AdwEntryRowClass_autoptr = o
  extension (v: AdwEntryRowClass_autoptr)
    inline def value: Ptr[AdwEntryRowClass] = v