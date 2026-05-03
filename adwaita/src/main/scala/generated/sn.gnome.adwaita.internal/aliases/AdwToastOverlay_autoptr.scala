package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-toast-overlay.h
*/
opaque type AdwToastOverlay_autoptr = Ptr[AdwToastOverlay]
object AdwToastOverlay_autoptr:
  given _tag: Tag[AdwToastOverlay_autoptr] = Tag.Ptr[AdwToastOverlay](AdwToastOverlay._tag)
  inline def apply(inline o: Ptr[AdwToastOverlay]): AdwToastOverlay_autoptr = o
  extension (v: AdwToastOverlay_autoptr)
    inline def value: Ptr[AdwToastOverlay] = v