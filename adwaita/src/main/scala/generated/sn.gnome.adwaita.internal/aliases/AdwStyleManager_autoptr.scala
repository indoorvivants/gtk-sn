package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-style-manager.h
*/
opaque type AdwStyleManager_autoptr = Ptr[AdwStyleManager]
object AdwStyleManager_autoptr:
  given _tag: Tag[AdwStyleManager_autoptr] = Tag.Ptr[AdwStyleManager](AdwStyleManager._tag)
  inline def apply(inline o: Ptr[AdwStyleManager]): AdwStyleManager_autoptr = o
  extension (v: AdwStyleManager_autoptr)
    inline def value: Ptr[AdwStyleManager] = v