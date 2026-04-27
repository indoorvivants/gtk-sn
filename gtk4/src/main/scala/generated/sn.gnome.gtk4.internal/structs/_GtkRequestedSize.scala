package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkRequestedSize:
*/
opaque type _GtkRequestedSize = CStruct3[_root_.sn.gnome.glib.internal.gpointer, CInt, CInt]

object _GtkRequestedSize:
  given _tag: Tag[_GtkRequestedSize] = Tag.materializeCStruct3Tag[_root_.sn.gnome.glib.internal.gpointer, CInt, CInt]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkRequestedSize)
      inline def data : _root_.sn.gnome.glib.internal.gpointer = struct._1
      inline def data_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = (!struct.at1 = value)
      inline def minimum_size : CInt = struct._2
      inline def minimum_size_=(value: CInt): Unit = (!struct.at2 = value)
      inline def natural_size : CInt = struct._3
      inline def natural_size_=(value: CInt): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates _GtkRequestedSize on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkRequestedSize] = scala.scalanative.unsafe.alloc[_GtkRequestedSize](1)
  def apply(data : _root_.sn.gnome.glib.internal.gpointer, minimum_size : CInt, natural_size : CInt)(using Zone): Ptr[_GtkRequestedSize] =
    val ____ptr = apply()
    (!____ptr).data = data
    (!____ptr).minimum_size = minimum_size
    (!____ptr).natural_size = natural_size
    ____ptr