package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GDebugControllerDBus_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GDebugControllerDBus_listautoptr:
  given _tag: Tag[GDebugControllerDBus_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GDebugControllerDBus_listautoptr = o
  extension (v: GDebugControllerDBus_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v