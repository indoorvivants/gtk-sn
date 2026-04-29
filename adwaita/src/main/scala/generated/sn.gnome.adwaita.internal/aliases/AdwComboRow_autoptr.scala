package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-combo-row.h
*/
opaque type AdwComboRow_autoptr = Ptr[AdwComboRow]
object AdwComboRow_autoptr:
  given _tag: Tag[AdwComboRow_autoptr] = Tag.Ptr[AdwComboRow](AdwComboRow._tag)
  inline def apply(inline o: Ptr[AdwComboRow]): AdwComboRow_autoptr = o
  extension (v: AdwComboRow_autoptr)
    inline def value: Ptr[AdwComboRow] = v