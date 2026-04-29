package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-flap.h
*/
opaque type AdwFlap_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object AdwFlap_slistautoptr:
  given _tag: Tag[AdwFlap_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): AdwFlap_slistautoptr = o
  extension (v: AdwFlap_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v