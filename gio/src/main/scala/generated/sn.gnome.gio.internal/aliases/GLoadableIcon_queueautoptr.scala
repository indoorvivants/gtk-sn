package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GLoadableIcon_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GLoadableIcon_queueautoptr:
  given _tag: Tag[GLoadableIcon_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GLoadableIcon_queueautoptr = o
  extension (v: GLoadableIcon_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v