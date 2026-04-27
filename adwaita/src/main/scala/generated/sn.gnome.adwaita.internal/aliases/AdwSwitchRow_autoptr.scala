package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-switch-row.h
*/
opaque type AdwSwitchRow_autoptr = Ptr[AdwSwitchRow]
object AdwSwitchRow_autoptr:
  given _tag: Tag[AdwSwitchRow_autoptr] = Tag.Ptr[AdwSwitchRow](AdwSwitchRow._tag)
  inline def apply(inline o: Ptr[AdwSwitchRow]): AdwSwitchRow_autoptr = o
  extension (v: AdwSwitchRow_autoptr)
    inline def value: Ptr[AdwSwitchRow] = v