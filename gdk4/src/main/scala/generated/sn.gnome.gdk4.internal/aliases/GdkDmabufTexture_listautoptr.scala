package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GdkDmabufTexture_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GdkDmabufTexture_listautoptr:
  given _tag: Tag[GdkDmabufTexture_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GdkDmabufTexture_listautoptr = o
  extension (v: GdkDmabufTexture_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v