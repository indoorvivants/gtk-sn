package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-navigation-view.h
*/
opaque type AdwNavigationPage_autoptr = Ptr[AdwNavigationPage]
object AdwNavigationPage_autoptr:
  given _tag: Tag[AdwNavigationPage_autoptr] = Tag.Ptr[AdwNavigationPage](AdwNavigationPage._tag)
  inline def apply(inline o: Ptr[AdwNavigationPage]): AdwNavigationPage_autoptr = o
  extension (v: AdwNavigationPage_autoptr)
    inline def value: Ptr[AdwNavigationPage] = v