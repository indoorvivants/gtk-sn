package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GdkPopupLayout_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GdkPopupLayout_queueautoptr:
  given _tag: Tag[GdkPopupLayout_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GdkPopupLayout_queueautoptr = o
  extension (v: GdkPopupLayout_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v