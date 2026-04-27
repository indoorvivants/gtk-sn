package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkWidget = CStruct2[_root_.sn.gnome.gobject.internal.GInitiallyUnowned, Ptr[GtkWidgetPrivate]]

object GtkWidget:
  given _tag: Tag[GtkWidget] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gobject.internal.GInitiallyUnowned, Ptr[GtkWidgetPrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkWidget)
      inline def parent_instance : _root_.sn.gnome.gobject.internal.GInitiallyUnowned = struct._1
      inline def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GInitiallyUnowned): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GtkWidgetPrivate] = struct._2
      inline def priv_=(value: Ptr[GtkWidgetPrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates GtkWidget on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkWidget] = scala.scalanative.unsafe.alloc[GtkWidget](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GInitiallyUnowned, priv : Ptr[GtkWidgetPrivate])(using Zone): Ptr[GtkWidget] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr