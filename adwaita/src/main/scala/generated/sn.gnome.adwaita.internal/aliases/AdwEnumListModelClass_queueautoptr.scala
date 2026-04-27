package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-enum-list-model.h
*/
opaque type AdwEnumListModelClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object AdwEnumListModelClass_queueautoptr:
  given _tag: Tag[AdwEnumListModelClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): AdwEnumListModelClass_queueautoptr = o
  extension (v: AdwEnumListModelClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v