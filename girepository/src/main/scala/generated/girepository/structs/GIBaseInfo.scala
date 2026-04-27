package girepository

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GIBaseInfo = CStruct8[_root_.sn.gnome.glib.internal.gint32, _root_.sn.gnome.glib.internal.gint32, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.guint32, _root_.sn.gnome.glib.internal.guint32, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]

object GIBaseInfo:
  given _tag: Tag[GIBaseInfo] = Tag.materializeCStruct8Tag[_root_.sn.gnome.glib.internal.gint32, _root_.sn.gnome.glib.internal.gint32, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.guint32, _root_.sn.gnome.glib.internal.guint32, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
  
  export fields.*
  private[girepository] object fields:
    extension (struct: GIBaseInfo)
      inline def dummy1 : _root_.sn.gnome.glib.internal.gint32 = struct._1
      inline def dummy1_=(value: _root_.sn.gnome.glib.internal.gint32): Unit = (!struct.at1 = value)
      inline def dummy2 : _root_.sn.gnome.glib.internal.gint32 = struct._2
      inline def dummy2_=(value: _root_.sn.gnome.glib.internal.gint32): Unit = (!struct.at2 = value)
      inline def dummy3 : _root_.sn.gnome.glib.internal.gpointer = struct._3
      inline def dummy3_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = (!struct.at3 = value)
      inline def dummy4 : _root_.sn.gnome.glib.internal.gpointer = struct._4
      inline def dummy4_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = (!struct.at4 = value)
      inline def dummy5 : _root_.sn.gnome.glib.internal.gpointer = struct._5
      inline def dummy5_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = (!struct.at5 = value)
      inline def dummy6 : _root_.sn.gnome.glib.internal.guint32 = struct._6
      inline def dummy6_=(value: _root_.sn.gnome.glib.internal.guint32): Unit = (!struct.at6 = value)
      inline def dummy7 : _root_.sn.gnome.glib.internal.guint32 = struct._7
      inline def dummy7_=(value: _root_.sn.gnome.glib.internal.guint32): Unit = (!struct.at7 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4] = struct._8
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]): Unit = (!struct.at8 = value)
    end extension
  
  // Allocates GIBaseInfo on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GIBaseInfo] = scala.scalanative.unsafe.alloc[GIBaseInfo](1)
  def apply(dummy1 : _root_.sn.gnome.glib.internal.gint32, dummy2 : _root_.sn.gnome.glib.internal.gint32, dummy3 : _root_.sn.gnome.glib.internal.gpointer, dummy4 : _root_.sn.gnome.glib.internal.gpointer, dummy5 : _root_.sn.gnome.glib.internal.gpointer, dummy6 : _root_.sn.gnome.glib.internal.guint32, dummy7 : _root_.sn.gnome.glib.internal.guint32, padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4])(using Zone): Ptr[GIBaseInfo] =
    val ____ptr = apply()
    (!____ptr).dummy1 = dummy1
    (!____ptr).dummy2 = dummy2
    (!____ptr).dummy3 = dummy3
    (!____ptr).dummy4 = dummy4
    (!____ptr).dummy5 = dummy5
    (!____ptr).dummy6 = dummy6
    (!____ptr).dummy7 = dummy7
    (!____ptr).padding = padding
    ____ptr