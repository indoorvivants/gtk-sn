package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-expander-row.h
*/
opaque type AdwExpanderRow_autoptr = Ptr[AdwExpanderRow]
object AdwExpanderRow_autoptr:
  given _tag: Tag[AdwExpanderRow_autoptr] = Tag.Ptr[AdwExpanderRow](AdwExpanderRow._tag)
  inline def apply(inline o: Ptr[AdwExpanderRow]): AdwExpanderRow_autoptr = o
  extension (v: AdwExpanderRow_autoptr)
    inline def value: Ptr[AdwExpanderRow] = v