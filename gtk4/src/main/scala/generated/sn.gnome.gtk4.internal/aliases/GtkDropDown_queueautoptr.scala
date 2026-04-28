package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkDropDown_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object GtkDropDown_queueautoptr:
  given _tag: Tag[GtkDropDown_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): GtkDropDown_queueautoptr = o
  extension (v: GtkDropDown_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v