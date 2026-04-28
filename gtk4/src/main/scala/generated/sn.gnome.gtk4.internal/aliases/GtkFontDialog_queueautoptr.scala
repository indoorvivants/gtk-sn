package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkFontDialog_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkFontDialog_queueautoptr:
  given _tag: Tag[GtkFontDialog_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkFontDialog_queueautoptr = o
  extension (v: GtkFontDialog_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v