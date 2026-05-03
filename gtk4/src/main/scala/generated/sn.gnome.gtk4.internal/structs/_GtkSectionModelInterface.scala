package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkSectionModelInterface: _section: Return the section that covers the given position. If the position is outside the number of items, returns a single range from n_items to G_MAXUINT
*/
opaque type _GtkSectionModelInterface = CStruct2[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr4[Ptr[GtkSectionModel], _root_.sn.gnome.glib.internal.guint, Ptr[_root_.sn.gnome.glib.internal.guint], Ptr[_root_.sn.gnome.glib.internal.guint], Unit]]

object _GtkSectionModelInterface:
  given _tag: Tag[_GtkSectionModelInterface] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr4[Ptr[GtkSectionModel], _root_.sn.gnome.glib.internal.guint, Ptr[_root_.sn.gnome.glib.internal.guint], Ptr[_root_.sn.gnome.glib.internal.guint], Unit]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkSectionModelInterface)
      inline def g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
      inline def get_section : CFuncPtr4[Ptr[GtkSectionModel], _root_.sn.gnome.glib.internal.guint, Ptr[_root_.sn.gnome.glib.internal.guint], Ptr[_root_.sn.gnome.glib.internal.guint], Unit] = struct._2
      inline def get_section_=(value: CFuncPtr4[Ptr[GtkSectionModel], _root_.sn.gnome.glib.internal.guint, Ptr[_root_.sn.gnome.glib.internal.guint], Ptr[_root_.sn.gnome.glib.internal.guint], Unit]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GtkSectionModelInterface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkSectionModelInterface] = scala.scalanative.unsafe.alloc[_GtkSectionModelInterface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, get_section : CFuncPtr4[Ptr[GtkSectionModel], _root_.sn.gnome.glib.internal.guint, Ptr[_root_.sn.gnome.glib.internal.guint], Ptr[_root_.sn.gnome.glib.internal.guint], Unit])(using Zone): Ptr[_GtkSectionModelInterface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).get_section = get_section
    ____ptr