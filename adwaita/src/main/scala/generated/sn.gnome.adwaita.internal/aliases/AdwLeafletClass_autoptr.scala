package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-leaflet.h
*/
opaque type AdwLeafletClass_autoptr = Ptr[AdwLeafletClass]
object AdwLeafletClass_autoptr:
  given _tag: Tag[AdwLeafletClass_autoptr] = Tag.Ptr[AdwLeafletClass](AdwLeafletClass._tag)
  inline def apply(inline o: Ptr[AdwLeafletClass]): AdwLeafletClass_autoptr = o
  extension (v: AdwLeafletClass_autoptr)
    inline def value: Ptr[AdwLeafletClass] = v