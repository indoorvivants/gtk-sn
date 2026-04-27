package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * AdwSwipeableInterface: : The parent interface. _distance: Gets the swipe distance. _snap_points: Gets the snap points. _progress: Gets the current progress. _cancel_progress: Gets the cancel progress. _swipe_area: Gets the swipeable rectangle.

 * [bindgen] header: /usr/include/libadwaita-1/adw-swipeable.h
*/
opaque type AdwSwipeableInterface = CStruct7[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr1[Ptr[AdwSwipeable], Double], CFuncPtr2[Ptr[AdwSwipeable], Ptr[CInt], Ptr[Double]], CFuncPtr1[Ptr[AdwSwipeable], Double], CFuncPtr1[Ptr[AdwSwipeable], Double], CFuncPtr4[Ptr[AdwSwipeable], AdwNavigationDirection, _root_.sn.gnome.glib.internal.gboolean, Ptr[_root_.sn.gnome.gtk4.internal.GdkRectangle], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]

object AdwSwipeableInterface:
  given _tag: Tag[AdwSwipeableInterface] = Tag.materializeCStruct7Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr1[Ptr[AdwSwipeable], Double], CFuncPtr2[Ptr[AdwSwipeable], Ptr[CInt], Ptr[Double]], CFuncPtr1[Ptr[AdwSwipeable], Double], CFuncPtr1[Ptr[AdwSwipeable], Double], CFuncPtr4[Ptr[AdwSwipeable], AdwNavigationDirection, _root_.sn.gnome.glib.internal.gboolean, Ptr[_root_.sn.gnome.gtk4.internal.GdkRectangle], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: AdwSwipeableInterface)
      inline def parent : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def parent_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
      inline def get_distance : CFuncPtr1[Ptr[AdwSwipeable], Double] = struct._2
      inline def get_distance_=(value: CFuncPtr1[Ptr[AdwSwipeable], Double]): Unit = (!struct.at2 = value)
      inline def get_snap_points : CFuncPtr2[Ptr[AdwSwipeable], Ptr[CInt], Ptr[Double]] = struct._3
      inline def get_snap_points_=(value: CFuncPtr2[Ptr[AdwSwipeable], Ptr[CInt], Ptr[Double]]): Unit = (!struct.at3 = value)
      inline def get_progress : CFuncPtr1[Ptr[AdwSwipeable], Double] = struct._4
      inline def get_progress_=(value: CFuncPtr1[Ptr[AdwSwipeable], Double]): Unit = (!struct.at4 = value)
      inline def get_cancel_progress : CFuncPtr1[Ptr[AdwSwipeable], Double] = struct._5
      inline def get_cancel_progress_=(value: CFuncPtr1[Ptr[AdwSwipeable], Double]): Unit = (!struct.at5 = value)
      inline def get_swipe_area : CFuncPtr4[Ptr[AdwSwipeable], AdwNavigationDirection, _root_.sn.gnome.glib.internal.gboolean, Ptr[_root_.sn.gnome.gtk4.internal.GdkRectangle], Unit] = struct._6
      inline def get_swipe_area_=(value: CFuncPtr4[Ptr[AdwSwipeable], AdwNavigationDirection, _root_.sn.gnome.glib.internal.gboolean, Ptr[_root_.sn.gnome.gtk4.internal.GdkRectangle], Unit]): Unit = (!struct.at6 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4] = struct._7
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]): Unit = (!struct.at7 = value)
    end extension
  
  // Allocates AdwSwipeableInterface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[AdwSwipeableInterface] = scala.scalanative.unsafe.alloc[AdwSwipeableInterface](1)
  def apply(parent : _root_.sn.gnome.gobject.internal.GTypeInterface, get_distance : CFuncPtr1[Ptr[AdwSwipeable], Double], get_snap_points : CFuncPtr2[Ptr[AdwSwipeable], Ptr[CInt], Ptr[Double]], get_progress : CFuncPtr1[Ptr[AdwSwipeable], Double], get_cancel_progress : CFuncPtr1[Ptr[AdwSwipeable], Double], get_swipe_area : CFuncPtr4[Ptr[AdwSwipeable], AdwNavigationDirection, _root_.sn.gnome.glib.internal.gboolean, Ptr[_root_.sn.gnome.gtk4.internal.GdkRectangle], Unit], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4])(using Zone): Ptr[AdwSwipeableInterface] =
    val ____ptr = apply()
    (!____ptr).parent = parent
    (!____ptr).get_distance = get_distance
    (!____ptr).get_snap_points = get_snap_points
    (!____ptr).get_progress = get_progress
    (!____ptr).get_cancel_progress = get_cancel_progress
    (!____ptr).get_swipe_area = get_swipe_area
    (!____ptr).padding = padding
    ____ptr