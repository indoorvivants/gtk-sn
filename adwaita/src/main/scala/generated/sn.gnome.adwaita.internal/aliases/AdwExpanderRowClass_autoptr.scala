package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-expander-row.h
*/
opaque type AdwExpanderRowClass_autoptr = Ptr[AdwExpanderRowClass]
object AdwExpanderRowClass_autoptr:
  given _tag: Tag[AdwExpanderRowClass_autoptr] = Tag.Ptr[AdwExpanderRowClass](AdwExpanderRowClass._tag)
  inline def apply(inline o: Ptr[AdwExpanderRowClass]): AdwExpanderRowClass_autoptr = o
  extension (v: AdwExpanderRowClass_autoptr)
    inline def value: Ptr[AdwExpanderRowClass] = v