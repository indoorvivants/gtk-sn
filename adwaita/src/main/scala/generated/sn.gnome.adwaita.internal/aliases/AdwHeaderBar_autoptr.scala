package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-header-bar.h
*/
opaque type AdwHeaderBar_autoptr = Ptr[AdwHeaderBar]
object AdwHeaderBar_autoptr:
  given _tag: Tag[AdwHeaderBar_autoptr] = Tag.Ptr[AdwHeaderBar](AdwHeaderBar._tag)
  inline def apply(inline o: Ptr[AdwHeaderBar]): AdwHeaderBar_autoptr = o
  extension (v: AdwHeaderBar_autoptr)
    inline def value: Ptr[AdwHeaderBar] = v