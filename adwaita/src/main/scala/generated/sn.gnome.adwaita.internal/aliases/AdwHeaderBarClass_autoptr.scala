package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-header-bar.h
*/
opaque type AdwHeaderBarClass_autoptr = Ptr[AdwHeaderBarClass]
object AdwHeaderBarClass_autoptr:
  given _tag: Tag[AdwHeaderBarClass_autoptr] = Tag.Ptr[AdwHeaderBarClass](AdwHeaderBarClass._tag)
  inline def apply(inline o: Ptr[AdwHeaderBarClass]): AdwHeaderBarClass_autoptr = o
  extension (v: AdwHeaderBarClass_autoptr)
    inline def value: Ptr[AdwHeaderBarClass] = v