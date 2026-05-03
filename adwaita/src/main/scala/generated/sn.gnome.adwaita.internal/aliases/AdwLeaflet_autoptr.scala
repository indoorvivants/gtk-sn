package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-leaflet.h
*/
opaque type AdwLeaflet_autoptr = Ptr[AdwLeaflet]
object AdwLeaflet_autoptr:
  given _tag: Tag[AdwLeaflet_autoptr] = Tag.Ptr[AdwLeaflet](AdwLeaflet._tag)
  inline def apply(inline o: Ptr[AdwLeaflet]): AdwLeaflet_autoptr = o
  extension (v: AdwLeaflet_autoptr)
    inline def value: Ptr[AdwLeaflet] = v