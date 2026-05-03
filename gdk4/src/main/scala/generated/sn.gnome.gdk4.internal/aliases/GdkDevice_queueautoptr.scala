package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GdkDevice_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GdkDevice_queueautoptr:
  given _tag: Tag[GdkDevice_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GdkDevice_queueautoptr = o
  extension (v: GdkDevice_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v