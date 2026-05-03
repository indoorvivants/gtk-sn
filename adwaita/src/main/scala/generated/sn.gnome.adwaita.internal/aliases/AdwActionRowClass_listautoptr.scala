package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-action-row.h
*/
opaque type AdwActionRowClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object AdwActionRowClass_listautoptr:
  given _tag: Tag[AdwActionRowClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): AdwActionRowClass_listautoptr = o
  extension (v: AdwActionRowClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v