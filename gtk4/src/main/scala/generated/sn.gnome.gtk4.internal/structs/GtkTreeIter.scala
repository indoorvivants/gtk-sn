package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkTreeIter: : a unique stamp to catch invalid iterators _data: model-specific data _data2: model-specific data _data3: model-specific data
*/
opaque type GtkTreeIter = CStruct4[CInt, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer]

object GtkTreeIter:
  given _tag: Tag[GtkTreeIter] = Tag.materializeCStruct4Tag[CInt, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkTreeIter)
      inline def stamp : CInt = struct._1
      inline def stamp_=(value: CInt): Unit = (!struct.at1 = value)
      inline def user_data : _root_.sn.gnome.glib.internal.gpointer = struct._2
      inline def user_data_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = (!struct.at2 = value)
      inline def user_data2 : _root_.sn.gnome.glib.internal.gpointer = struct._3
      inline def user_data2_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = (!struct.at3 = value)
      inline def user_data3 : _root_.sn.gnome.glib.internal.gpointer = struct._4
      inline def user_data3_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = (!struct.at4 = value)
    end extension
  
  // Allocates GtkTreeIter on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkTreeIter] = scala.scalanative.unsafe.alloc[GtkTreeIter](1)
  def apply(stamp : CInt, user_data : _root_.sn.gnome.glib.internal.gpointer, user_data2 : _root_.sn.gnome.glib.internal.gpointer, user_data3 : _root_.sn.gnome.glib.internal.gpointer)(using Zone): Ptr[GtkTreeIter] =
    val ____ptr = apply()
    (!____ptr).stamp = stamp
    (!____ptr).user_data = user_data
    (!____ptr).user_data2 = user_data2
    (!____ptr).user_data3 = user_data3
    ____ptr