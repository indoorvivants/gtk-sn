package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GtkTextView = CStruct2[GtkWidget, Ptr[GtkTextViewPrivate]]

object _GtkTextView:
  given _tag: Tag[_GtkTextView] = Tag.materializeCStruct2Tag[GtkWidget, Ptr[GtkTextViewPrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkTextView)
      inline def parent_instance : GtkWidget = struct._1
      inline def parent_instance_=(value: GtkWidget): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GtkTextViewPrivate] = struct._2
      inline def priv_=(value: Ptr[GtkTextViewPrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GtkTextView on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkTextView] = scala.scalanative.unsafe.alloc[_GtkTextView](1)
  def apply(parent_instance : GtkWidget, priv : Ptr[GtkTextViewPrivate])(using Zone): Ptr[_GtkTextView] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr