package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GtkScrollableInterface = CStruct2[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr2[Ptr[GtkScrollable], Ptr[GtkBorder], _root_.sn.gnome.glib.internal.gboolean]]

object _GtkScrollableInterface:
  given _tag: Tag[_GtkScrollableInterface] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr2[Ptr[GtkScrollable], Ptr[GtkBorder], _root_.sn.gnome.glib.internal.gboolean]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkScrollableInterface)
      inline def base_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def base_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
      inline def get_border : CFuncPtr2[Ptr[GtkScrollable], Ptr[GtkBorder], _root_.sn.gnome.glib.internal.gboolean] = struct._2
      inline def get_border_=(value: CFuncPtr2[Ptr[GtkScrollable], Ptr[GtkBorder], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GtkScrollableInterface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkScrollableInterface] = scala.scalanative.unsafe.alloc[_GtkScrollableInterface](1)
  def apply(base_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, get_border : CFuncPtr2[Ptr[GtkScrollable], Ptr[GtkBorder], _root_.sn.gnome.glib.internal.gboolean])(using Zone): Ptr[_GtkScrollableInterface] =
    val ____ptr = apply()
    (!____ptr).base_iface = base_iface
    (!____ptr).get_border = get_border
    ____ptr