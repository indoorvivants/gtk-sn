package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-about-window.h
*/
opaque type AdwAboutWindow_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object AdwAboutWindow_listautoptr:
  given _tag: Tag[AdwAboutWindow_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): AdwAboutWindow_listautoptr = o
  extension (v: AdwAboutWindow_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v