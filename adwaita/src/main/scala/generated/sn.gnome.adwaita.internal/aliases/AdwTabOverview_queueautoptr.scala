package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-tab-overview.h
*/
opaque type AdwTabOverview_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object AdwTabOverview_queueautoptr:
  given _tag: Tag[AdwTabOverview_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): AdwTabOverview_queueautoptr = o
  extension (v: AdwTabOverview_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v