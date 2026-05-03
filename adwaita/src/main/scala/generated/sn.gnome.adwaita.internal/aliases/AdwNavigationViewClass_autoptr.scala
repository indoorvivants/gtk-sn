package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-navigation-view.h
*/
opaque type AdwNavigationViewClass_autoptr = Ptr[AdwNavigationViewClass]
object AdwNavigationViewClass_autoptr:
  given _tag: Tag[AdwNavigationViewClass_autoptr] = Tag.Ptr[AdwNavigationViewClass](AdwNavigationViewClass._tag)
  inline def apply(inline o: Ptr[AdwNavigationViewClass]): AdwNavigationViewClass_autoptr = o
  extension (v: AdwNavigationViewClass_autoptr)
    inline def value: Ptr[AdwNavigationViewClass] = v