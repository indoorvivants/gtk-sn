package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-entry-row.h
*/
opaque type AdwEntryRow_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object AdwEntryRow_slistautoptr:
  given _tag: Tag[AdwEntryRow_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): AdwEntryRow_slistautoptr = o
  extension (v: AdwEntryRow_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v