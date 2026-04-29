package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GInputMessage = CArray[CChar, Nat.Digit2[Nat._5, Nat._6]]

object GInputMessage:
  given _tag: Tag[GInputMessage] = Tag.CArray[CChar, Nat.Digit2[Nat._5, Nat._6]](Tag.Byte, Tag.Digit2[Nat._5, Nat._6](Tag.Nat5, Tag.Nat6))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GInputMessage)
      inline def address: Ptr[Ptr[GSocketAddress]] = !struct.at(offsets(0)).asInstanceOf[Ptr[Ptr[Ptr[GSocketAddress]]]]
      inline def address_=(value: Ptr[Ptr[GSocketAddress]]): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[Ptr[Ptr[GSocketAddress]]]] = value
      inline def vectors: Ptr[GInputVector] = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[GInputVector]]]
      inline def vectors_=(value: Ptr[GInputVector]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[GInputVector]]] = value
      inline def num_vectors: _root_.sn.gnome.glib.internal.guint = !struct.at(offsets(2)).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint]]
      inline def num_vectors_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint]] = value
      inline def bytes_received: _root_.sn.gnome.glib.internal.gsize = !struct.at(offsets(3)).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gsize]]
      inline def bytes_received_=(value: _root_.sn.gnome.glib.internal.gsize): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gsize]] = value
      inline def flags: _root_.sn.gnome.glib.internal.gint = !struct.at(offsets(4)).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint]]
      inline def flags_=(value: _root_.sn.gnome.glib.internal.gint): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint]] = value
      inline def control_messages: Ptr[Ptr[Ptr[GSocketControlMessage]]] = !struct.at(offsets(5)).asInstanceOf[Ptr[Ptr[Ptr[Ptr[GSocketControlMessage]]]]]
      inline def control_messages_=(value: Ptr[Ptr[Ptr[GSocketControlMessage]]]): Unit = !struct.at(offsets(5)).asInstanceOf[Ptr[Ptr[Ptr[Ptr[GSocketControlMessage]]]]] = value
      inline def num_control_messages: Ptr[_root_.sn.gnome.glib.internal.guint] = !struct.at(offsets(6)).asInstanceOf[Ptr[Ptr[_root_.sn.gnome.glib.internal.guint]]]
      inline def num_control_messages_=(value: Ptr[_root_.sn.gnome.glib.internal.guint]): Unit = !struct.at(offsets(6)).asInstanceOf[Ptr[Ptr[_root_.sn.gnome.glib.internal.guint]]] = value
    end extension
  
  // Allocates GInputMessage on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GInputMessage] = scala.scalanative.unsafe.alloc[GInputMessage](1)
  def apply(address : Ptr[Ptr[GSocketAddress]], vectors : Ptr[GInputVector], num_vectors : _root_.sn.gnome.glib.internal.guint, bytes_received : _root_.sn.gnome.glib.internal.gsize, flags : _root_.sn.gnome.glib.internal.gint, control_messages : Ptr[Ptr[Ptr[GSocketControlMessage]]], num_control_messages : Ptr[_root_.sn.gnome.glib.internal.guint])(using Zone): Ptr[GInputMessage] =
    val ____ptr = apply()
    (!____ptr).address = address
    (!____ptr).vectors = vectors
    (!____ptr).num_vectors = num_vectors
    (!____ptr).bytes_received = bytes_received
    (!____ptr).flags = flags
    (!____ptr).control_messages = control_messages
    (!____ptr).num_control_messages = num_control_messages
    ____ptr
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](7)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[Ptr[Ptr[GSocketAddress]]].toInt)
    res(1) = align(res(0) + sizeof[Ptr[Ptr[GSocketAddress]]].toInt, alignmentof[Ptr[GInputVector]].toInt)
    res(2) = align(res(1) + sizeof[Ptr[GInputVector]].toInt, alignmentof[_root_.sn.gnome.glib.internal.guint].toInt)
    res(3) = align(res(2) + sizeof[_root_.sn.gnome.glib.internal.guint].toInt, alignmentof[_root_.sn.gnome.glib.internal.gsize].toInt)
    res(4) = align(res(3) + sizeof[_root_.sn.gnome.glib.internal.gsize].toInt, alignmentof[_root_.sn.gnome.glib.internal.gint].toInt)
    res(5) = align(res(4) + sizeof[_root_.sn.gnome.glib.internal.gint].toInt, alignmentof[Ptr[Ptr[Ptr[GSocketControlMessage]]]].toInt)
    res(6) = align(res(5) + sizeof[Ptr[Ptr[Ptr[GSocketControlMessage]]]].toInt, alignmentof[Ptr[_root_.sn.gnome.glib.internal.guint]].toInt)
    res
  end offsets