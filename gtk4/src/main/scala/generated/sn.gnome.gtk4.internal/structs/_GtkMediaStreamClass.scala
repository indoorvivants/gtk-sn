package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GtkMediaStreamClass = CStruct15[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr1[Ptr[GtkMediaStream], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[GtkMediaStream], Unit], CFuncPtr2[Ptr[GtkMediaStream], _root_.sn.gnome.glib.internal.gint64, Unit], CFuncPtr3[Ptr[GtkMediaStream], _root_.sn.gnome.glib.internal.gboolean, Double, Unit], CFuncPtr2[Ptr[GtkMediaStream], Ptr[_root_.sn.gnome.gdk4.internal.GdkSurface], Unit], CFuncPtr2[Ptr[GtkMediaStream], Ptr[_root_.sn.gnome.gdk4.internal.GdkSurface], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]

object _GtkMediaStreamClass:
  given _tag: Tag[_GtkMediaStreamClass] = Tag.materializeCStruct15Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr1[Ptr[GtkMediaStream], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[GtkMediaStream], Unit], CFuncPtr2[Ptr[GtkMediaStream], _root_.sn.gnome.glib.internal.gint64, Unit], CFuncPtr3[Ptr[GtkMediaStream], _root_.sn.gnome.glib.internal.gboolean, Double, Unit], CFuncPtr2[Ptr[GtkMediaStream], Ptr[_root_.sn.gnome.gdk4.internal.GdkSurface], Unit], CFuncPtr2[Ptr[GtkMediaStream], Ptr[_root_.sn.gnome.gdk4.internal.GdkSurface], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkMediaStreamClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
      inline def play : CFuncPtr1[Ptr[GtkMediaStream], _root_.sn.gnome.glib.internal.gboolean] = struct._2
      inline def play_=(value: CFuncPtr1[Ptr[GtkMediaStream], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at2 = value)
      inline def pause : CFuncPtr1[Ptr[GtkMediaStream], Unit] = struct._3
      inline def pause_=(value: CFuncPtr1[Ptr[GtkMediaStream], Unit]): Unit = (!struct.at3 = value)
      inline def seek : CFuncPtr2[Ptr[GtkMediaStream], _root_.sn.gnome.glib.internal.gint64, Unit] = struct._4
      inline def seek_=(value: CFuncPtr2[Ptr[GtkMediaStream], _root_.sn.gnome.glib.internal.gint64, Unit]): Unit = (!struct.at4 = value)
      inline def update_audio : CFuncPtr3[Ptr[GtkMediaStream], _root_.sn.gnome.glib.internal.gboolean, Double, Unit] = struct._5
      inline def update_audio_=(value: CFuncPtr3[Ptr[GtkMediaStream], _root_.sn.gnome.glib.internal.gboolean, Double, Unit]): Unit = (!struct.at5 = value)
      inline def realize : CFuncPtr2[Ptr[GtkMediaStream], Ptr[_root_.sn.gnome.gdk4.internal.GdkSurface], Unit] = struct._6
      inline def realize_=(value: CFuncPtr2[Ptr[GtkMediaStream], Ptr[_root_.sn.gnome.gdk4.internal.GdkSurface], Unit]): Unit = (!struct.at6 = value)
      inline def unrealize : CFuncPtr2[Ptr[GtkMediaStream], Ptr[_root_.sn.gnome.gdk4.internal.GdkSurface], Unit] = struct._7
      inline def unrealize_=(value: CFuncPtr2[Ptr[GtkMediaStream], Ptr[_root_.sn.gnome.gdk4.internal.GdkSurface], Unit]): Unit = (!struct.at7 = value)
      inline def _gtk_reserved1 : CFuncPtr0[Unit] = struct._8
      inline def _gtk_reserved1_=(value: CFuncPtr0[Unit]): Unit = (!struct.at8 = value)
      inline def _gtk_reserved2 : CFuncPtr0[Unit] = struct._9
      inline def _gtk_reserved2_=(value: CFuncPtr0[Unit]): Unit = (!struct.at9 = value)
      inline def _gtk_reserved3 : CFuncPtr0[Unit] = struct._10
      inline def _gtk_reserved3_=(value: CFuncPtr0[Unit]): Unit = (!struct.at10 = value)
      inline def _gtk_reserved4 : CFuncPtr0[Unit] = struct._11
      inline def _gtk_reserved4_=(value: CFuncPtr0[Unit]): Unit = (!struct.at11 = value)
      inline def _gtk_reserved5 : CFuncPtr0[Unit] = struct._12
      inline def _gtk_reserved5_=(value: CFuncPtr0[Unit]): Unit = (!struct.at12 = value)
      inline def _gtk_reserved6 : CFuncPtr0[Unit] = struct._13
      inline def _gtk_reserved6_=(value: CFuncPtr0[Unit]): Unit = (!struct.at13 = value)
      inline def _gtk_reserved7 : CFuncPtr0[Unit] = struct._14
      inline def _gtk_reserved7_=(value: CFuncPtr0[Unit]): Unit = (!struct.at14 = value)
      inline def _gtk_reserved8 : CFuncPtr0[Unit] = struct._15
      inline def _gtk_reserved8_=(value: CFuncPtr0[Unit]): Unit = (!struct.at15 = value)
    end extension
  
  // Allocates _GtkMediaStreamClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkMediaStreamClass] = scala.scalanative.unsafe.alloc[_GtkMediaStreamClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, play : CFuncPtr1[Ptr[GtkMediaStream], _root_.sn.gnome.glib.internal.gboolean], pause : CFuncPtr1[Ptr[GtkMediaStream], Unit], seek : CFuncPtr2[Ptr[GtkMediaStream], _root_.sn.gnome.glib.internal.gint64, Unit], update_audio : CFuncPtr3[Ptr[GtkMediaStream], _root_.sn.gnome.glib.internal.gboolean, Double, Unit], realize : CFuncPtr2[Ptr[GtkMediaStream], Ptr[_root_.sn.gnome.gdk4.internal.GdkSurface], Unit], unrealize : CFuncPtr2[Ptr[GtkMediaStream], Ptr[_root_.sn.gnome.gdk4.internal.GdkSurface], Unit], _gtk_reserved1 : CFuncPtr0[Unit], _gtk_reserved2 : CFuncPtr0[Unit], _gtk_reserved3 : CFuncPtr0[Unit], _gtk_reserved4 : CFuncPtr0[Unit], _gtk_reserved5 : CFuncPtr0[Unit], _gtk_reserved6 : CFuncPtr0[Unit], _gtk_reserved7 : CFuncPtr0[Unit], _gtk_reserved8 : CFuncPtr0[Unit])(using Zone): Ptr[_GtkMediaStreamClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).play = play
    (!____ptr).pause = pause
    (!____ptr).seek = seek
    (!____ptr).update_audio = update_audio
    (!____ptr).realize = realize
    (!____ptr).unrealize = unrealize
    (!____ptr)._gtk_reserved1 = _gtk_reserved1
    (!____ptr)._gtk_reserved2 = _gtk_reserved2
    (!____ptr)._gtk_reserved3 = _gtk_reserved3
    (!____ptr)._gtk_reserved4 = _gtk_reserved4
    (!____ptr)._gtk_reserved5 = _gtk_reserved5
    (!____ptr)._gtk_reserved6 = _gtk_reserved6
    (!____ptr)._gtk_reserved7 = _gtk_reserved7
    (!____ptr)._gtk_reserved8 = _gtk_reserved8
    ____ptr