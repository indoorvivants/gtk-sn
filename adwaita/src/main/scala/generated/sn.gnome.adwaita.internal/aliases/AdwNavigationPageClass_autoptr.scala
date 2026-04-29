package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-navigation-view.h
*/
opaque type AdwNavigationPageClass_autoptr = Ptr[AdwNavigationPageClass]
object AdwNavigationPageClass_autoptr:
  given _tag: Tag[AdwNavigationPageClass_autoptr] = Tag.Ptr[AdwNavigationPageClass](AdwNavigationPageClass._tag)
  inline def apply(inline o: Ptr[AdwNavigationPageClass]): AdwNavigationPageClass_autoptr = o
  extension (v: AdwNavigationPageClass_autoptr)
    inline def value: Ptr[AdwNavigationPageClass] = v