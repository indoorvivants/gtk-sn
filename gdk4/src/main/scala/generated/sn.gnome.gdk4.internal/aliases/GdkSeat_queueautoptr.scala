package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GdkSeat_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GdkSeat_queueautoptr:
  given _tag: Tag[GdkSeat_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GdkSeat_queueautoptr = o
  extension (v: GdkSeat_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v