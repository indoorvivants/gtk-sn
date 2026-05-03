package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GOutputMessage = CStruct6[Ptr[GSocketAddress], Ptr[GOutputVector], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, Ptr[Ptr[GSocketControlMessage]], _root_.sn.gnome.glib.internal.guint]

object _GOutputMessage:
  given _tag: Tag[_GOutputMessage] = Tag.materializeCStruct6Tag[Ptr[GSocketAddress], Ptr[GOutputVector], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, Ptr[Ptr[GSocketControlMessage]], _root_.sn.gnome.glib.internal.guint]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GOutputMessage)
      inline def address : Ptr[GSocketAddress] = struct._1
      inline def address_=(value: Ptr[GSocketAddress]): Unit = (!struct.at1 = value)
      inline def vectors : Ptr[GOutputVector] = struct._2
      inline def vectors_=(value: Ptr[GOutputVector]): Unit = (!struct.at2 = value)
      inline def num_vectors : _root_.sn.gnome.glib.internal.guint = struct._3
      inline def num_vectors_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at3 = value)
      inline def bytes_sent : _root_.sn.gnome.glib.internal.guint = struct._4
      inline def bytes_sent_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at4 = value)
      inline def control_messages : Ptr[Ptr[GSocketControlMessage]] = struct._5
      inline def control_messages_=(value: Ptr[Ptr[GSocketControlMessage]]): Unit = (!struct.at5 = value)
      inline def num_control_messages : _root_.sn.gnome.glib.internal.guint = struct._6
      inline def num_control_messages_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at6 = value)
    end extension
  
  // Allocates _GOutputMessage on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GOutputMessage] = scala.scalanative.unsafe.alloc[_GOutputMessage](1)
  def apply(address : Ptr[GSocketAddress], vectors : Ptr[GOutputVector], num_vectors : _root_.sn.gnome.glib.internal.guint, bytes_sent : _root_.sn.gnome.glib.internal.guint, control_messages : Ptr[Ptr[GSocketControlMessage]], num_control_messages : _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[_GOutputMessage] =
    val ____ptr = apply()
    (!____ptr).address = address
    (!____ptr).vectors = vectors
    (!____ptr).num_vectors = num_vectors
    (!____ptr).bytes_sent = bytes_sent
    (!____ptr).control_messages = control_messages
    (!____ptr).num_control_messages = num_control_messages
    ____ptr