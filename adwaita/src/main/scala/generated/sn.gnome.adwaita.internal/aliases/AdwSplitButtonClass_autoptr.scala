package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-split-button.h
*/
opaque type AdwSplitButtonClass_autoptr = Ptr[AdwSplitButtonClass]
object AdwSplitButtonClass_autoptr:
  given _tag: Tag[AdwSplitButtonClass_autoptr] = Tag.Ptr[AdwSplitButtonClass](AdwSplitButtonClass._tag)
  inline def apply(inline o: Ptr[AdwSplitButtonClass]): AdwSplitButtonClass_autoptr = o
  extension (v: AdwSplitButtonClass_autoptr)
    inline def value: Ptr[AdwSplitButtonClass] = v