package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-navigation-split-view.h
*/
opaque type AdwNavigationSplitView_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object AdwNavigationSplitView_listautoptr:
  given _tag: Tag[AdwNavigationSplitView_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): AdwNavigationSplitView_listautoptr = o
  extension (v: AdwNavigationSplitView_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v