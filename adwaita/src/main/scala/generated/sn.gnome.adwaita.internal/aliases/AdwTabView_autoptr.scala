package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-tab-view.h
*/
opaque type AdwTabView_autoptr = Ptr[AdwTabView]
object AdwTabView_autoptr:
  given _tag: Tag[AdwTabView_autoptr] = Tag.Ptr[AdwTabView](AdwTabView._tag)
  inline def apply(inline o: Ptr[AdwTabView]): AdwTabView_autoptr = o
  extension (v: AdwTabView_autoptr)
    inline def value: Ptr[AdwTabView] = v