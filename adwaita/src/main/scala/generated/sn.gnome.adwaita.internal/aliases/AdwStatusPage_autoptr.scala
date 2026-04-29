package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-status-page.h
*/
opaque type AdwStatusPage_autoptr = Ptr[AdwStatusPage]
object AdwStatusPage_autoptr:
  given _tag: Tag[AdwStatusPage_autoptr] = Tag.Ptr[AdwStatusPage](AdwStatusPage._tag)
  inline def apply(inline o: Ptr[AdwStatusPage]): AdwStatusPage_autoptr = o
  extension (v: AdwStatusPage_autoptr)
    inline def value: Ptr[AdwStatusPage] = v