package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-banner.h
*/
opaque type AdwBannerClass_autoptr = Ptr[AdwBannerClass]
object AdwBannerClass_autoptr:
  given _tag: Tag[AdwBannerClass_autoptr] = Tag.Ptr[AdwBannerClass](AdwBannerClass._tag)
  inline def apply(inline o: Ptr[AdwBannerClass]): AdwBannerClass_autoptr = o
  extension (v: AdwBannerClass_autoptr)
    inline def value: Ptr[AdwBannerClass] = v