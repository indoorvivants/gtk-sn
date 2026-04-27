package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GNetworkAddress_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GNetworkAddress_listautoptr:
  given _tag: Tag[GNetworkAddress_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GNetworkAddress_listautoptr = o
  extension (v: GNetworkAddress_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v