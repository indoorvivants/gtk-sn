package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-application-window.h
*/
opaque type AdwApplicationWindow_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object AdwApplicationWindow_slistautoptr:
  given _tag: Tag[AdwApplicationWindow_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): AdwApplicationWindow_slistautoptr = o
  extension (v: AdwApplicationWindow_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v