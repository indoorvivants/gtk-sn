package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkTextIter = CStruct14[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, CInt, CInt, CInt, CInt, CInt, CInt, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, CInt, CInt, CInt, _root_.sn.gnome.glib.internal.gpointer]

object GtkTextIter:
  given _tag: Tag[GtkTextIter] = Tag.materializeCStruct14Tag[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, CInt, CInt, CInt, CInt, CInt, CInt, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, CInt, CInt, CInt, _root_.sn.gnome.glib.internal.gpointer]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkTextIter)
      inline def dummy1 : _root_.sn.gnome.glib.internal.gpointer = struct._1
      inline def dummy1_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = (!struct.at1 = value)
      inline def dummy2 : _root_.sn.gnome.glib.internal.gpointer = struct._2
      inline def dummy2_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = (!struct.at2 = value)
      inline def dummy3 : CInt = struct._3
      inline def dummy3_=(value: CInt): Unit = (!struct.at3 = value)
      inline def dummy4 : CInt = struct._4
      inline def dummy4_=(value: CInt): Unit = (!struct.at4 = value)
      inline def dummy5 : CInt = struct._5
      inline def dummy5_=(value: CInt): Unit = (!struct.at5 = value)
      inline def dummy6 : CInt = struct._6
      inline def dummy6_=(value: CInt): Unit = (!struct.at6 = value)
      inline def dummy7 : CInt = struct._7
      inline def dummy7_=(value: CInt): Unit = (!struct.at7 = value)
      inline def dummy8 : CInt = struct._8
      inline def dummy8_=(value: CInt): Unit = (!struct.at8 = value)
      inline def dummy9 : _root_.sn.gnome.glib.internal.gpointer = struct._9
      inline def dummy9_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = (!struct.at9 = value)
      inline def dummy10 : _root_.sn.gnome.glib.internal.gpointer = struct._10
      inline def dummy10_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = (!struct.at10 = value)
      inline def dummy11 : CInt = struct._11
      inline def dummy11_=(value: CInt): Unit = (!struct.at11 = value)
      inline def dummy12 : CInt = struct._12
      inline def dummy12_=(value: CInt): Unit = (!struct.at12 = value)
      inline def dummy13 : CInt = struct._13
      inline def dummy13_=(value: CInt): Unit = (!struct.at13 = value)
      inline def dummy14 : _root_.sn.gnome.glib.internal.gpointer = struct._14
      inline def dummy14_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = (!struct.at14 = value)
    end extension
  
  // Allocates GtkTextIter on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkTextIter] = scala.scalanative.unsafe.alloc[GtkTextIter](1)
  def apply(dummy1 : _root_.sn.gnome.glib.internal.gpointer, dummy2 : _root_.sn.gnome.glib.internal.gpointer, dummy3 : CInt, dummy4 : CInt, dummy5 : CInt, dummy6 : CInt, dummy7 : CInt, dummy8 : CInt, dummy9 : _root_.sn.gnome.glib.internal.gpointer, dummy10 : _root_.sn.gnome.glib.internal.gpointer, dummy11 : CInt, dummy12 : CInt, dummy13 : CInt, dummy14 : _root_.sn.gnome.glib.internal.gpointer)(using Zone): Ptr[GtkTextIter] =
    val ____ptr = apply()
    (!____ptr).dummy1 = dummy1
    (!____ptr).dummy2 = dummy2
    (!____ptr).dummy3 = dummy3
    (!____ptr).dummy4 = dummy4
    (!____ptr).dummy5 = dummy5
    (!____ptr).dummy6 = dummy6
    (!____ptr).dummy7 = dummy7
    (!____ptr).dummy8 = dummy8
    (!____ptr).dummy9 = dummy9
    (!____ptr).dummy10 = dummy10
    (!____ptr).dummy11 = dummy11
    (!____ptr).dummy12 = dummy12
    (!____ptr).dummy13 = dummy13
    (!____ptr).dummy14 = dummy14
    ____ptr