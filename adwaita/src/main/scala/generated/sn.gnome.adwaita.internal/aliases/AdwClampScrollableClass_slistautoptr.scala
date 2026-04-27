package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-clamp-scrollable.h
*/
opaque type AdwClampScrollableClass_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object AdwClampScrollableClass_slistautoptr:
  given _tag: Tag[AdwClampScrollableClass_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): AdwClampScrollableClass_slistautoptr = o
  extension (v: AdwClampScrollableClass_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v