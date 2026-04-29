package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-animation.h
*/
opaque type AdwAnimation_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object AdwAnimation_listautoptr:
  given _tag: Tag[AdwAnimation_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): AdwAnimation_listautoptr = o
  extension (v: AdwAnimation_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v