package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-split-button.h
*/
opaque type AdwSplitButton_autoptr = Ptr[AdwSplitButton]
object AdwSplitButton_autoptr:
  given _tag: Tag[AdwSplitButton_autoptr] = Tag.Ptr[AdwSplitButton](AdwSplitButton._tag)
  inline def apply(inline o: Ptr[AdwSplitButton]): AdwSplitButton_autoptr = o
  extension (v: AdwSplitButton_autoptr)
    inline def value: Ptr[AdwSplitButton] = v