package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GTlsConnection_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GTlsConnection_listautoptr:
  given _tag: Tag[GTlsConnection_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GTlsConnection_listautoptr = o
  extension (v: GTlsConnection_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v