package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkSymbolicPaintableInterface: _symbolic: Snapshot the paintable using the given colors. See `GtkSymbolicPaintable::snapshot_symbolic()` for details. If this function is not implemented, [vfunc.Paintable.snapshot] will be called.
*/
opaque type GtkSymbolicPaintableInterface = CStruct2[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr6[Ptr[GtkSymbolicPaintable], Ptr[GdkSnapshot], Double, Double, Ptr[GdkRGBA], _root_.sn.gnome.glib.internal.gsize, Unit]]

object GtkSymbolicPaintableInterface:
  given _tag: Tag[GtkSymbolicPaintableInterface] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr6[Ptr[GtkSymbolicPaintable], Ptr[GdkSnapshot], Double, Double, Ptr[GdkRGBA], _root_.sn.gnome.glib.internal.gsize, Unit]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkSymbolicPaintableInterface)
      inline def g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
      inline def snapshot_symbolic : CFuncPtr6[Ptr[GtkSymbolicPaintable], Ptr[GdkSnapshot], Double, Double, Ptr[GdkRGBA], _root_.sn.gnome.glib.internal.gsize, Unit] = struct._2
      inline def snapshot_symbolic_=(value: CFuncPtr6[Ptr[GtkSymbolicPaintable], Ptr[GdkSnapshot], Double, Double, Ptr[GdkRGBA], _root_.sn.gnome.glib.internal.gsize, Unit]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates GtkSymbolicPaintableInterface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkSymbolicPaintableInterface] = scala.scalanative.unsafe.alloc[GtkSymbolicPaintableInterface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, snapshot_symbolic : CFuncPtr6[Ptr[GtkSymbolicPaintable], Ptr[GdkSnapshot], Double, Double, Ptr[GdkRGBA], _root_.sn.gnome.glib.internal.gsize, Unit])(using Zone): Ptr[GtkSymbolicPaintableInterface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).snapshot_symbolic = snapshot_symbolic
    ____ptr