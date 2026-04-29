package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GOutputMessage = CArray[CChar, Nat.Digit2[Nat._4, Nat._0]]

object GOutputMessage:
  given _tag: Tag[GOutputMessage] = Tag.CArray[CChar, Nat.Digit2[Nat._4, Nat._0]](Tag.Byte, Tag.Digit2[Nat._4, Nat._0](Tag.Nat4, Tag.Nat0))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GOutputMessage)
      inline def address: Ptr[GSocketAddress] = !struct.at(offsets(0)).asInstanceOf[Ptr[Ptr[GSocketAddress]]]
      inline def address_=(value: Ptr[GSocketAddress]): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[Ptr[GSocketAddress]]] = value
      inline def vectors: Ptr[GOutputVector] = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[GOutputVector]]]
      inline def vectors_=(value: Ptr[GOutputVector]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[GOutputVector]]] = value
      inline def num_vectors: _root_.sn.gnome.glib.internal.guint = !struct.at(offsets(2)).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint]]
      inline def num_vectors_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint]] = value
      inline def bytes_sent: _root_.sn.gnome.glib.internal.guint = !struct.at(offsets(3)).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint]]
      inline def bytes_sent_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint]] = value
      inline def control_messages: Ptr[Ptr[GSocketControlMessage]] = !struct.at(offsets(4)).asInstanceOf[Ptr[Ptr[Ptr[GSocketControlMessage]]]]
      inline def control_messages_=(value: Ptr[Ptr[GSocketControlMessage]]): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[Ptr[Ptr[GSocketControlMessage]]]] = value
      inline def num_control_messages: _root_.sn.gnome.glib.internal.guint = !struct.at(offsets(5)).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint]]
      inline def num_control_messages_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at(offsets(5)).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint]] = value
    end extension
  
  // Allocates GOutputMessage on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GOutputMessage] = scala.scalanative.unsafe.alloc[GOutputMessage](1)
  def apply(address : Ptr[GSocketAddress], vectors : Ptr[GOutputVector], num_vectors : _root_.sn.gnome.glib.internal.guint, bytes_sent : _root_.sn.gnome.glib.internal.guint, control_messages : Ptr[Ptr[GSocketControlMessage]], num_control_messages : _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[GOutputMessage] =
    val ____ptr = apply()
    (!____ptr).address = address
    (!____ptr).vectors = vectors
    (!____ptr).num_vectors = num_vectors
    (!____ptr).bytes_sent = bytes_sent
    (!____ptr).control_messages = control_messages
    (!____ptr).num_control_messages = num_control_messages
    ____ptr
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](6)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[Ptr[GSocketAddress]].toInt)
    res(1) = align(res(0) + sizeof[Ptr[GSocketAddress]].toInt, alignmentof[Ptr[GOutputVector]].toInt)
    res(2) = align(res(1) + sizeof[Ptr[GOutputVector]].toInt, alignmentof[_root_.sn.gnome.glib.internal.guint].toInt)
    res(3) = align(res(2) + sizeof[_root_.sn.gnome.glib.internal.guint].toInt, alignmentof[_root_.sn.gnome.glib.internal.guint].toInt)
    res(4) = align(res(3) + sizeof[_root_.sn.gnome.glib.internal.guint].toInt, alignmentof[Ptr[Ptr[GSocketControlMessage]]].toInt)
    res(5) = align(res(4) + sizeof[Ptr[Ptr[GSocketControlMessage]]].toInt, alignmentof[_root_.sn.gnome.glib.internal.guint].toInt)
    res
  end offsets