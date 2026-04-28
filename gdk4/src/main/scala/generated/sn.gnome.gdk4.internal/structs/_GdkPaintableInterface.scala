package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GdkPaintableInterface: : Snapshot the paintable. The given and are guaranteed to be larger than 0.0. The resulting snapshot must modify only the area in the rectangle from (0,0) to (width, height). This is the only function that must be implemented for this interface. _current_image: return a `GdkPaintable` that does not change over time. This means the `GDK_PAINTABLE_STATIC_SIZE` and `GDK_PAINTABLE_STATIC_CONTENTS` flag are set. _flags: Get the flags for this instance. See [flags.PaintableFlags] for details. _intrinsic_width: The preferred width for this object to be snapshot at or 0 if none. This is purely a hint. The object must still be able to render at any size. _intrinsic_height: The preferred height for this object to be snapshot at or 0 if none. This is purely a hint. The object must still be able to render at any size. _intrinsic_aspect_ratio: The preferred aspect ratio for this object or 0 if none. If both [vfunc.Paintable.get_intrinsic_width] and [vfunc.Paintable.get_intrinsic_height] return non-zero values, this function should return the aspect ratio computed from those.
*/
opaque type _GdkPaintableInterface = CStruct7[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr4[Ptr[GdkPaintable], Ptr[GdkSnapshot], Double, Double, Unit], CFuncPtr1[Ptr[GdkPaintable], Ptr[GdkPaintable]], CFuncPtr1[Ptr[GdkPaintable], GdkPaintableFlags], CFuncPtr1[Ptr[GdkPaintable], CInt], CFuncPtr1[Ptr[GdkPaintable], CInt], CFuncPtr1[Ptr[GdkPaintable], Double]]

object _GdkPaintableInterface:
  given _tag: Tag[_GdkPaintableInterface] = Tag.materializeCStruct7Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr4[Ptr[GdkPaintable], Ptr[GdkSnapshot], Double, Double, Unit], CFuncPtr1[Ptr[GdkPaintable], Ptr[GdkPaintable]], CFuncPtr1[Ptr[GdkPaintable], GdkPaintableFlags], CFuncPtr1[Ptr[GdkPaintable], CInt], CFuncPtr1[Ptr[GdkPaintable], CInt], CFuncPtr1[Ptr[GdkPaintable], Double]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GdkPaintableInterface)
      inline def g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
      inline def snapshot : CFuncPtr4[Ptr[GdkPaintable], Ptr[GdkSnapshot], Double, Double, Unit] = struct._2
      inline def snapshot_=(value: CFuncPtr4[Ptr[GdkPaintable], Ptr[GdkSnapshot], Double, Double, Unit]): Unit = (!struct.at2 = value)
      inline def get_current_image : CFuncPtr1[Ptr[GdkPaintable], Ptr[GdkPaintable]] = struct._3
      inline def get_current_image_=(value: CFuncPtr1[Ptr[GdkPaintable], Ptr[GdkPaintable]]): Unit = (!struct.at3 = value)
      inline def get_flags : CFuncPtr1[Ptr[GdkPaintable], GdkPaintableFlags] = struct._4
      inline def get_flags_=(value: CFuncPtr1[Ptr[GdkPaintable], GdkPaintableFlags]): Unit = (!struct.at4 = value)
      inline def get_intrinsic_width : CFuncPtr1[Ptr[GdkPaintable], CInt] = struct._5
      inline def get_intrinsic_width_=(value: CFuncPtr1[Ptr[GdkPaintable], CInt]): Unit = (!struct.at5 = value)
      inline def get_intrinsic_height : CFuncPtr1[Ptr[GdkPaintable], CInt] = struct._6
      inline def get_intrinsic_height_=(value: CFuncPtr1[Ptr[GdkPaintable], CInt]): Unit = (!struct.at6 = value)
      inline def get_intrinsic_aspect_ratio : CFuncPtr1[Ptr[GdkPaintable], Double] = struct._7
      inline def get_intrinsic_aspect_ratio_=(value: CFuncPtr1[Ptr[GdkPaintable], Double]): Unit = (!struct.at7 = value)
    end extension
  
  // Allocates _GdkPaintableInterface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GdkPaintableInterface] = scala.scalanative.unsafe.alloc[_GdkPaintableInterface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, snapshot : CFuncPtr4[Ptr[GdkPaintable], Ptr[GdkSnapshot], Double, Double, Unit], get_current_image : CFuncPtr1[Ptr[GdkPaintable], Ptr[GdkPaintable]], get_flags : CFuncPtr1[Ptr[GdkPaintable], GdkPaintableFlags], get_intrinsic_width : CFuncPtr1[Ptr[GdkPaintable], CInt], get_intrinsic_height : CFuncPtr1[Ptr[GdkPaintable], CInt], get_intrinsic_aspect_ratio : CFuncPtr1[Ptr[GdkPaintable], Double])(using Zone): Ptr[_GdkPaintableInterface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).snapshot = snapshot
    (!____ptr).get_current_image = get_current_image
    (!____ptr).get_flags = get_flags
    (!____ptr).get_intrinsic_width = get_intrinsic_width
    (!____ptr).get_intrinsic_height = get_intrinsic_height
    (!____ptr).get_intrinsic_aspect_ratio = get_intrinsic_aspect_ratio
    ____ptr