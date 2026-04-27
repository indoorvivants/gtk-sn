package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-button-content.h
*/
opaque type AdwButtonContent_autoptr = Ptr[AdwButtonContent]
object AdwButtonContent_autoptr:
  given _tag: Tag[AdwButtonContent_autoptr] = Tag.Ptr[AdwButtonContent](AdwButtonContent._tag)
  inline def apply(inline o: Ptr[AdwButtonContent]): AdwButtonContent_autoptr = o
  extension (v: AdwButtonContent_autoptr)
    inline def value: Ptr[AdwButtonContent] = v