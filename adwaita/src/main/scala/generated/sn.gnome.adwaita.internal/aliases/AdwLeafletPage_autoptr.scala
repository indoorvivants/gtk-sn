package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-leaflet.h
*/
opaque type AdwLeafletPage_autoptr = Ptr[AdwLeafletPage]
object AdwLeafletPage_autoptr:
  given _tag: Tag[AdwLeafletPage_autoptr] = Tag.Ptr[AdwLeafletPage](AdwLeafletPage._tag)
  inline def apply(inline o: Ptr[AdwLeafletPage]): AdwLeafletPage_autoptr = o
  extension (v: AdwLeafletPage_autoptr)
    inline def value: Ptr[AdwLeafletPage] = v