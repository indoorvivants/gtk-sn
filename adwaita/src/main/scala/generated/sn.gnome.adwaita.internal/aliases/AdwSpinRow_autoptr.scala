package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-spin-row.h
*/
opaque type AdwSpinRow_autoptr = Ptr[AdwSpinRow]
object AdwSpinRow_autoptr:
  given _tag: Tag[AdwSpinRow_autoptr] = Tag.Ptr[AdwSpinRow](AdwSpinRow._tag)
  inline def apply(inline o: Ptr[AdwSpinRow]): AdwSpinRow_autoptr = o
  extension (v: AdwSpinRow_autoptr)
    inline def value: Ptr[AdwSpinRow] = v