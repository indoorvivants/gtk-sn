package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GInputMessage = CStruct7[Ptr[Ptr[GSocketAddress]], Ptr[GInputVector], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gint, Ptr[Ptr[Ptr[GSocketControlMessage]]], Ptr[_root_.sn.gnome.glib.internal.guint]]

object _GInputMessage:
  given _tag: Tag[_GInputMessage] = Tag.materializeCStruct7Tag[Ptr[Ptr[GSocketAddress]], Ptr[GInputVector], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gint, Ptr[Ptr[Ptr[GSocketControlMessage]]], Ptr[_root_.sn.gnome.glib.internal.guint]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GInputMessage)
      inline def address : Ptr[Ptr[GSocketAddress]] = struct._1
      inline def address_=(value: Ptr[Ptr[GSocketAddress]]): Unit = (!struct.at1 = value)
      inline def vectors : Ptr[GInputVector] = struct._2
      inline def vectors_=(value: Ptr[GInputVector]): Unit = (!struct.at2 = value)
      inline def num_vectors : _root_.sn.gnome.glib.internal.guint = struct._3
      inline def num_vectors_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at3 = value)
      inline def bytes_received : _root_.sn.gnome.glib.internal.gsize = struct._4
      inline def bytes_received_=(value: _root_.sn.gnome.glib.internal.gsize): Unit = (!struct.at4 = value)
      inline def flags : _root_.sn.gnome.glib.internal.gint = struct._5
      inline def flags_=(value: _root_.sn.gnome.glib.internal.gint): Unit = (!struct.at5 = value)
      inline def control_messages : Ptr[Ptr[Ptr[GSocketControlMessage]]] = struct._6
      inline def control_messages_=(value: Ptr[Ptr[Ptr[GSocketControlMessage]]]): Unit = (!struct.at6 = value)
      inline def num_control_messages : Ptr[_root_.sn.gnome.glib.internal.guint] = struct._7
      inline def num_control_messages_=(value: Ptr[_root_.sn.gnome.glib.internal.guint]): Unit = (!struct.at7 = value)
    end extension
  
  // Allocates _GInputMessage on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GInputMessage] = scala.scalanative.unsafe.alloc[_GInputMessage](1)
  def apply(address : Ptr[Ptr[GSocketAddress]], vectors : Ptr[GInputVector], num_vectors : _root_.sn.gnome.glib.internal.guint, bytes_received : _root_.sn.gnome.glib.internal.gsize, flags : _root_.sn.gnome.glib.internal.gint, control_messages : Ptr[Ptr[Ptr[GSocketControlMessage]]], num_control_messages : Ptr[_root_.sn.gnome.glib.internal.guint])(using Zone): Ptr[_GInputMessage] =
    val ____ptr = apply()
    (!____ptr).address = address
    (!____ptr).vectors = vectors
    (!____ptr).num_vectors = num_vectors
    (!____ptr).bytes_received = bytes_received
    (!____ptr).flags = flags
    (!____ptr).control_messages = control_messages
    (!____ptr).num_control_messages = num_control_messages
    ____ptr