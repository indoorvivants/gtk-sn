package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GMenuAttributeIterClass = CStruct2[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr3[Ptr[GMenuAttributeIter], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariant]], _root_.sn.gnome.glib.internal.gboolean]]

object _GMenuAttributeIterClass:
  given _tag: Tag[_GMenuAttributeIterClass] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr3[Ptr[GMenuAttributeIter], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariant]], _root_.sn.gnome.glib.internal.gboolean]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GMenuAttributeIterClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
      inline def get_next : CFuncPtr3[Ptr[GMenuAttributeIter], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariant]], _root_.sn.gnome.glib.internal.gboolean] = struct._2
      inline def get_next_=(value: CFuncPtr3[Ptr[GMenuAttributeIter], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariant]], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GMenuAttributeIterClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GMenuAttributeIterClass] = scala.scalanative.unsafe.alloc[_GMenuAttributeIterClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, get_next : CFuncPtr3[Ptr[GMenuAttributeIter], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariant]], _root_.sn.gnome.glib.internal.gboolean])(using Zone): Ptr[_GMenuAttributeIterClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).get_next = get_next
    ____ptr