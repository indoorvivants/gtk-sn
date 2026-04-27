package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkLayoutManagerClass: _request_mode: a virtual function, used to return the preferred request mode for the layout manager; for instance, "width for height" or "height for width"; see `GtkSizeRequestMode` : a virtual function, used to measure the minimum and preferred sizes of the widget using the layout manager for a given orientation : a virtual function, used to allocate the size of the widget using the layout manager _child_type: the type of `GtkLayoutChild` used by this layout manager _layout_child: a virtual function, used to create a `GtkLayoutChild` meta object for the layout properties : a virtual function, called when the widget using the layout manager is attached to a `GtkRoot` : a virtual function, called when the widget using the layout manager is detached from a `GtkRoot`
*/
opaque type GtkLayoutManagerClass = CStruct9[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr2[Ptr[GtkLayoutManager], Ptr[GtkWidget], GtkSizeRequestMode], CFuncPtr8[Ptr[GtkLayoutManager], Ptr[GtkWidget], GtkOrientation, CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], Unit], CFuncPtr5[Ptr[GtkLayoutManager], Ptr[GtkWidget], CInt, CInt, CInt, Unit], _root_.sn.gnome.gobject.internal.GType, CFuncPtr3[Ptr[GtkLayoutManager], Ptr[GtkWidget], Ptr[GtkWidget], Ptr[GtkLayoutChild]], CFuncPtr1[Ptr[GtkLayoutManager], Unit], CFuncPtr1[Ptr[GtkLayoutManager], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._6]]]

object GtkLayoutManagerClass:
  given _tag: Tag[GtkLayoutManagerClass] = Tag.materializeCStruct9Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr2[Ptr[GtkLayoutManager], Ptr[GtkWidget], GtkSizeRequestMode], CFuncPtr8[Ptr[GtkLayoutManager], Ptr[GtkWidget], GtkOrientation, CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], Unit], CFuncPtr5[Ptr[GtkLayoutManager], Ptr[GtkWidget], CInt, CInt, CInt, Unit], _root_.sn.gnome.gobject.internal.GType, CFuncPtr3[Ptr[GtkLayoutManager], Ptr[GtkWidget], Ptr[GtkWidget], Ptr[GtkLayoutChild]], CFuncPtr1[Ptr[GtkLayoutManager], Unit], CFuncPtr1[Ptr[GtkLayoutManager], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._6]]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkLayoutManagerClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
      inline def get_request_mode : CFuncPtr2[Ptr[GtkLayoutManager], Ptr[GtkWidget], GtkSizeRequestMode] = struct._2
      inline def get_request_mode_=(value: CFuncPtr2[Ptr[GtkLayoutManager], Ptr[GtkWidget], GtkSizeRequestMode]): Unit = (!struct.at2 = value)
      inline def measure : CFuncPtr8[Ptr[GtkLayoutManager], Ptr[GtkWidget], GtkOrientation, CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], Unit] = struct._3
      inline def measure_=(value: CFuncPtr8[Ptr[GtkLayoutManager], Ptr[GtkWidget], GtkOrientation, CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], Unit]): Unit = (!struct.at3 = value)
      inline def allocate : CFuncPtr5[Ptr[GtkLayoutManager], Ptr[GtkWidget], CInt, CInt, CInt, Unit] = struct._4
      inline def allocate_=(value: CFuncPtr5[Ptr[GtkLayoutManager], Ptr[GtkWidget], CInt, CInt, CInt, Unit]): Unit = (!struct.at4 = value)
      inline def layout_child_type : _root_.sn.gnome.gobject.internal.GType = struct._5
      inline def layout_child_type_=(value: _root_.sn.gnome.gobject.internal.GType): Unit = (!struct.at5 = value)
      inline def create_layout_child : CFuncPtr3[Ptr[GtkLayoutManager], Ptr[GtkWidget], Ptr[GtkWidget], Ptr[GtkLayoutChild]] = struct._6
      inline def create_layout_child_=(value: CFuncPtr3[Ptr[GtkLayoutManager], Ptr[GtkWidget], Ptr[GtkWidget], Ptr[GtkLayoutChild]]): Unit = (!struct.at6 = value)
      inline def root : CFuncPtr1[Ptr[GtkLayoutManager], Unit] = struct._7
      inline def root_=(value: CFuncPtr1[Ptr[GtkLayoutManager], Unit]): Unit = (!struct.at7 = value)
      inline def unroot : CFuncPtr1[Ptr[GtkLayoutManager], Unit] = struct._8
      inline def unroot_=(value: CFuncPtr1[Ptr[GtkLayoutManager], Unit]): Unit = (!struct.at8 = value)
      inline def _padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._6]] = struct._9
      inline def _padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._6]]): Unit = (!struct.at9 = value)
    end extension
  
  // Allocates GtkLayoutManagerClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkLayoutManagerClass] = scala.scalanative.unsafe.alloc[GtkLayoutManagerClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, get_request_mode : CFuncPtr2[Ptr[GtkLayoutManager], Ptr[GtkWidget], GtkSizeRequestMode], measure : CFuncPtr8[Ptr[GtkLayoutManager], Ptr[GtkWidget], GtkOrientation, CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], Unit], allocate : CFuncPtr5[Ptr[GtkLayoutManager], Ptr[GtkWidget], CInt, CInt, CInt, Unit], layout_child_type : _root_.sn.gnome.gobject.internal.GType, create_layout_child : CFuncPtr3[Ptr[GtkLayoutManager], Ptr[GtkWidget], Ptr[GtkWidget], Ptr[GtkLayoutChild]], root : CFuncPtr1[Ptr[GtkLayoutManager], Unit], unroot : CFuncPtr1[Ptr[GtkLayoutManager], Unit], _padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._6]])(using Zone): Ptr[GtkLayoutManagerClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).get_request_mode = get_request_mode
    (!____ptr).measure = measure
    (!____ptr).allocate = allocate
    (!____ptr).layout_child_type = layout_child_type
    (!____ptr).create_layout_child = create_layout_child
    (!____ptr).root = root
    (!____ptr).unroot = unroot
    (!____ptr)._padding = _padding
    ____ptr