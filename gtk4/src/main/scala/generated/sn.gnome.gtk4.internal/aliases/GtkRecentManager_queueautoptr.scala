package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkRecentManager_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkRecentManager_queueautoptr:
  given _tag: Tag[GtkRecentManager_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkRecentManager_queueautoptr = o
  extension (v: GtkRecentManager_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v