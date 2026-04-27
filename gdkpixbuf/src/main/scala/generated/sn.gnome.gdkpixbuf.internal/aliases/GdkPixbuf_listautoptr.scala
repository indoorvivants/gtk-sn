package sn.gnome.gdkpixbuf.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GdkPixbuf_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GdkPixbuf_listautoptr:
  given _tag: Tag[GdkPixbuf_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GdkPixbuf_listautoptr = o
  extension (v: GdkPixbuf_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v