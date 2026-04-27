package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-preferences-window.h
*/
opaque type AdwPreferencesWindow_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object AdwPreferencesWindow_listautoptr:
  given _tag: Tag[AdwPreferencesWindow_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): AdwPreferencesWindow_listautoptr = o
  extension (v: AdwPreferencesWindow_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v