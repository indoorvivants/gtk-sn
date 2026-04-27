package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-action-row.h
*/
opaque type AdwActionRowClass_autoptr = Ptr[AdwActionRowClass]
object AdwActionRowClass_autoptr:
  given _tag: Tag[AdwActionRowClass_autoptr] = Tag.Ptr[AdwActionRowClass](AdwActionRowClass._tag)
  inline def apply(inline o: Ptr[AdwActionRowClass]): AdwActionRowClass_autoptr = o
  extension (v: AdwActionRowClass_autoptr)
    inline def value: Ptr[AdwActionRowClass] = v