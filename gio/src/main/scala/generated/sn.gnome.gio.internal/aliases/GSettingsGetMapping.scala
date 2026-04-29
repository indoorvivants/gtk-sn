package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GSettingsGetMapping: : the #GVariant to map, or %NULL
*/
opaque type GSettingsGetMapping = CFuncPtr3[Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[_root_.sn.gnome.glib.internal.gpointer], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object GSettingsGetMapping:
  given _tag: Tag[GSettingsGetMapping] = Tag.materializeCFuncPtr3[Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[_root_.sn.gnome.glib.internal.gpointer], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GSettingsGetMapping = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[_root_.sn.gnome.glib.internal.gpointer], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): GSettingsGetMapping = o
  extension (v: GSettingsGetMapping)
    inline def value: CFuncPtr3[Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[_root_.sn.gnome.glib.internal.gpointer], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)