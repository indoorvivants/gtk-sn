package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GSocketControlMessageClass: _size: gets the size of the message. _level: gets the protocol of the message. _type: gets the protocol specific type of the message. : Writes out the message data. : Tries to deserialize a message.
*/
opaque type _GSocketControlMessageClass = CStruct11[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr1[Ptr[GSocketControlMessage], _root_.sn.gnome.glib.internal.gsize], CFuncPtr1[Ptr[GSocketControlMessage], CInt], CFuncPtr1[Ptr[GSocketControlMessage], CInt], CFuncPtr2[Ptr[GSocketControlMessage], _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr4[CInt, CInt, _root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gpointer, Ptr[GSocketControlMessage]], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]

object _GSocketControlMessageClass:
  given _tag: Tag[_GSocketControlMessageClass] = Tag.materializeCStruct11Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr1[Ptr[GSocketControlMessage], _root_.sn.gnome.glib.internal.gsize], CFuncPtr1[Ptr[GSocketControlMessage], CInt], CFuncPtr1[Ptr[GSocketControlMessage], CInt], CFuncPtr2[Ptr[GSocketControlMessage], _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr4[CInt, CInt, _root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gpointer, Ptr[GSocketControlMessage]], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GSocketControlMessageClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
      inline def get_size : CFuncPtr1[Ptr[GSocketControlMessage], _root_.sn.gnome.glib.internal.gsize] = struct._2
      inline def get_size_=(value: CFuncPtr1[Ptr[GSocketControlMessage], _root_.sn.gnome.glib.internal.gsize]): Unit = (!struct.at2 = value)
      inline def get_level : CFuncPtr1[Ptr[GSocketControlMessage], CInt] = struct._3
      inline def get_level_=(value: CFuncPtr1[Ptr[GSocketControlMessage], CInt]): Unit = (!struct.at3 = value)
      inline def get_type : CFuncPtr1[Ptr[GSocketControlMessage], CInt] = struct._4
      inline def get_type_=(value: CFuncPtr1[Ptr[GSocketControlMessage], CInt]): Unit = (!struct.at4 = value)
      inline def serialize : CFuncPtr2[Ptr[GSocketControlMessage], _root_.sn.gnome.glib.internal.gpointer, Unit] = struct._5
      inline def serialize_=(value: CFuncPtr2[Ptr[GSocketControlMessage], _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = (!struct.at5 = value)
      inline def deserialize : CFuncPtr4[CInt, CInt, _root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gpointer, Ptr[GSocketControlMessage]] = struct._6
      inline def deserialize_=(value: CFuncPtr4[CInt, CInt, _root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gpointer, Ptr[GSocketControlMessage]]): Unit = (!struct.at6 = value)
      inline def _g_reserved1 : CFuncPtr0[Unit] = struct._7
      inline def _g_reserved1_=(value: CFuncPtr0[Unit]): Unit = (!struct.at7 = value)
      inline def _g_reserved2 : CFuncPtr0[Unit] = struct._8
      inline def _g_reserved2_=(value: CFuncPtr0[Unit]): Unit = (!struct.at8 = value)
      inline def _g_reserved3 : CFuncPtr0[Unit] = struct._9
      inline def _g_reserved3_=(value: CFuncPtr0[Unit]): Unit = (!struct.at9 = value)
      inline def _g_reserved4 : CFuncPtr0[Unit] = struct._10
      inline def _g_reserved4_=(value: CFuncPtr0[Unit]): Unit = (!struct.at10 = value)
      inline def _g_reserved5 : CFuncPtr0[Unit] = struct._11
      inline def _g_reserved5_=(value: CFuncPtr0[Unit]): Unit = (!struct.at11 = value)
    end extension
  
  // Allocates _GSocketControlMessageClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GSocketControlMessageClass] = scala.scalanative.unsafe.alloc[_GSocketControlMessageClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, get_size : CFuncPtr1[Ptr[GSocketControlMessage], _root_.sn.gnome.glib.internal.gsize], get_level : CFuncPtr1[Ptr[GSocketControlMessage], CInt], get_type : CFuncPtr1[Ptr[GSocketControlMessage], CInt], serialize : CFuncPtr2[Ptr[GSocketControlMessage], _root_.sn.gnome.glib.internal.gpointer, Unit], deserialize : CFuncPtr4[CInt, CInt, _root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gpointer, Ptr[GSocketControlMessage]], _g_reserved1 : CFuncPtr0[Unit], _g_reserved2 : CFuncPtr0[Unit], _g_reserved3 : CFuncPtr0[Unit], _g_reserved4 : CFuncPtr0[Unit], _g_reserved5 : CFuncPtr0[Unit])(using Zone): Ptr[_GSocketControlMessageClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).get_size = get_size
    (!____ptr).get_level = get_level
    (!____ptr).get_type = get_type
    (!____ptr).serialize = serialize
    (!____ptr).deserialize = deserialize
    (!____ptr)._g_reserved1 = _g_reserved1
    (!____ptr)._g_reserved2 = _g_reserved2
    (!____ptr)._g_reserved3 = _g_reserved3
    (!____ptr)._g_reserved4 = _g_reserved4
    (!____ptr)._g_reserved5 = _g_reserved5
    ____ptr