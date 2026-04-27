package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-toolbar-view.h
*/
opaque type AdwToolbarView_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object AdwToolbarView_listautoptr:
  given _tag: Tag[AdwToolbarView_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): AdwToolbarView_listautoptr = o
  extension (v: AdwToolbarView_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v