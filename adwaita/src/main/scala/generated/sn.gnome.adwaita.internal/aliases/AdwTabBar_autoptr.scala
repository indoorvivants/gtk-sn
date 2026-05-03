package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-tab-bar.h
*/
opaque type AdwTabBar_autoptr = Ptr[AdwTabBar]
object AdwTabBar_autoptr:
  given _tag: Tag[AdwTabBar_autoptr] = Tag.Ptr[AdwTabBar](AdwTabBar._tag)
  inline def apply(inline o: Ptr[AdwTabBar]): AdwTabBar_autoptr = o
  extension (v: AdwTabBar_autoptr)
    inline def value: Ptr[AdwTabBar] = v