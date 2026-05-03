package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GIconIface: _iface: The parent interface. : A hash for a given #GIcon. : Checks if two #GIcons are equal. _tokens: Serializes a #GIcon into tokens. The tokens must not contain any whitespace. Don't implement if the #GIcon can't be serialized (Since 2.20). _tokens: Constructs a #GIcon from tokens. Set the #GError if the tokens are malformed. Don't implement if the #GIcon can't be serialized (Since 2.20). : Serializes a #GIcon into a #GVariant. Since: 2.38
*/
opaque type _GIconIface = CStruct6[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr1[Ptr[GIcon], _root_.sn.gnome.glib.internal.guint], CFuncPtr2[Ptr[GIcon], Ptr[GIcon], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[GIcon], Ptr[_root_.sn.gnome.glib.internal.GPtrArray], Ptr[_root_.sn.gnome.glib.internal.gint], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr4[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GIcon]], CFuncPtr1[Ptr[GIcon], Ptr[_root_.sn.gnome.glib.internal.GVariant]]]

object _GIconIface:
  given _tag: Tag[_GIconIface] = Tag.materializeCStruct6Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr1[Ptr[GIcon], _root_.sn.gnome.glib.internal.guint], CFuncPtr2[Ptr[GIcon], Ptr[GIcon], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[GIcon], Ptr[_root_.sn.gnome.glib.internal.GPtrArray], Ptr[_root_.sn.gnome.glib.internal.gint], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr4[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GIcon]], CFuncPtr1[Ptr[GIcon], Ptr[_root_.sn.gnome.glib.internal.GVariant]]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GIconIface)
      inline def g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
      inline def hash : CFuncPtr1[Ptr[GIcon], _root_.sn.gnome.glib.internal.guint] = struct._2
      inline def hash_=(value: CFuncPtr1[Ptr[GIcon], _root_.sn.gnome.glib.internal.guint]): Unit = (!struct.at2 = value)
      inline def equal : CFuncPtr2[Ptr[GIcon], Ptr[GIcon], _root_.sn.gnome.glib.internal.gboolean] = struct._3
      inline def equal_=(value: CFuncPtr2[Ptr[GIcon], Ptr[GIcon], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at3 = value)
      inline def to_tokens : CFuncPtr3[Ptr[GIcon], Ptr[_root_.sn.gnome.glib.internal.GPtrArray], Ptr[_root_.sn.gnome.glib.internal.gint], _root_.sn.gnome.glib.internal.gboolean] = struct._4
      inline def to_tokens_=(value: CFuncPtr3[Ptr[GIcon], Ptr[_root_.sn.gnome.glib.internal.GPtrArray], Ptr[_root_.sn.gnome.glib.internal.gint], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at4 = value)
      inline def from_tokens : CFuncPtr4[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GIcon]] = struct._5
      inline def from_tokens_=(value: CFuncPtr4[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GIcon]]): Unit = (!struct.at5 = value)
      inline def serialize : CFuncPtr1[Ptr[GIcon], Ptr[_root_.sn.gnome.glib.internal.GVariant]] = struct._6
      inline def serialize_=(value: CFuncPtr1[Ptr[GIcon], Ptr[_root_.sn.gnome.glib.internal.GVariant]]): Unit = (!struct.at6 = value)
    end extension
  
  // Allocates _GIconIface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GIconIface] = scala.scalanative.unsafe.alloc[_GIconIface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, hash : CFuncPtr1[Ptr[GIcon], _root_.sn.gnome.glib.internal.guint], equal : CFuncPtr2[Ptr[GIcon], Ptr[GIcon], _root_.sn.gnome.glib.internal.gboolean], to_tokens : CFuncPtr3[Ptr[GIcon], Ptr[_root_.sn.gnome.glib.internal.GPtrArray], Ptr[_root_.sn.gnome.glib.internal.gint], _root_.sn.gnome.glib.internal.gboolean], from_tokens : CFuncPtr4[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GIcon]], serialize : CFuncPtr1[Ptr[GIcon], Ptr[_root_.sn.gnome.glib.internal.GVariant]])(using Zone): Ptr[_GIconIface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).hash = hash
    (!____ptr).equal = equal
    (!____ptr).to_tokens = to_tokens
    (!____ptr).from_tokens = from_tokens
    (!____ptr).serialize = serialize
    ____ptr