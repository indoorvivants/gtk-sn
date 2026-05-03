package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-spin-row.h
*/
opaque type AdwSpinRowClass_autoptr = Ptr[AdwSpinRowClass]
object AdwSpinRowClass_autoptr:
  given _tag: Tag[AdwSpinRowClass_autoptr] = Tag.Ptr[AdwSpinRowClass](AdwSpinRowClass._tag)
  inline def apply(inline o: Ptr[AdwSpinRowClass]): AdwSpinRowClass_autoptr = o
  extension (v: AdwSpinRowClass_autoptr)
    inline def value: Ptr[AdwSpinRowClass] = v