package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-application.h
*/
opaque type AdwApplicationClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object AdwApplicationClass_slistautoptr:
  given _tag: Tag[AdwApplicationClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): AdwApplicationClass_slistautoptr = o
  extension (v: AdwApplicationClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v