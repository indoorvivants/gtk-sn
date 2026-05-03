package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDatagramBasedInterface: _iface: The parent interface. _messages: Virtual method for g_datagram_based_receive_messages(). _messages: Virtual method for g_datagram_based_send_messages(). _source: Virtual method for g_datagram_based_create_source(). _check: Virtual method for g_datagram_based_condition_check(). _wait: Virtual method for g_datagram_based_condition_wait().
*/
opaque type GDatagramBasedInterface = CArray[CChar, Nat.Digit2[Nat._5, Nat._6]]

object GDatagramBasedInterface:
  given _tag: Tag[GDatagramBasedInterface] = Tag.CArray[CChar, Nat.Digit2[Nat._5, Nat._6]](Tag.Byte, Tag.Digit2[Nat._5, Nat._6](Tag.Nat5, Tag.Nat6))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GDatagramBasedInterface)
      inline def g_iface: _root_.sn.gnome.gobject.internal.GTypeInterface = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]]
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]] = value
      inline def receive_messages: CFuncPtr7[Ptr[GDatagramBased], Ptr[GInputMessage], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint64, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gint] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr7[Ptr[GDatagramBased], Ptr[GInputMessage], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint64, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gint]]]
      inline def receive_messages_=(value: CFuncPtr7[Ptr[GDatagramBased], Ptr[GInputMessage], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint64, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gint]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr7[Ptr[GDatagramBased], Ptr[GInputMessage], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint64, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gint]]] = value
      inline def send_messages: CFuncPtr7[Ptr[GDatagramBased], Ptr[GOutputMessage], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint64, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gint] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr7[Ptr[GDatagramBased], Ptr[GOutputMessage], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint64, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gint]]]
      inline def send_messages_=(value: CFuncPtr7[Ptr[GDatagramBased], Ptr[GOutputMessage], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint64, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gint]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr7[Ptr[GDatagramBased], Ptr[GOutputMessage], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint64, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gint]]] = value
      inline def create_source: CFuncPtr3[Ptr[GDatagramBased], _root_.sn.gnome.glib.internal.GIOCondition, Ptr[GCancellable], Ptr[_root_.sn.gnome.glib.internal.GSource]] = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GDatagramBased], _root_.sn.gnome.glib.internal.GIOCondition, Ptr[GCancellable], Ptr[_root_.sn.gnome.glib.internal.GSource]]]]
      inline def create_source_=(value: CFuncPtr3[Ptr[GDatagramBased], _root_.sn.gnome.glib.internal.GIOCondition, Ptr[GCancellable], Ptr[_root_.sn.gnome.glib.internal.GSource]]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GDatagramBased], _root_.sn.gnome.glib.internal.GIOCondition, Ptr[GCancellable], Ptr[_root_.sn.gnome.glib.internal.GSource]]]] = value
      inline def condition_check: CFuncPtr2[Ptr[GDatagramBased], _root_.sn.gnome.glib.internal.GIOCondition, _root_.sn.gnome.glib.internal.GIOCondition] = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GDatagramBased], _root_.sn.gnome.glib.internal.GIOCondition, _root_.sn.gnome.glib.internal.GIOCondition]]]
      inline def condition_check_=(value: CFuncPtr2[Ptr[GDatagramBased], _root_.sn.gnome.glib.internal.GIOCondition, _root_.sn.gnome.glib.internal.GIOCondition]): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GDatagramBased], _root_.sn.gnome.glib.internal.GIOCondition, _root_.sn.gnome.glib.internal.GIOCondition]]] = value
      inline def condition_wait: CFuncPtr5[Ptr[GDatagramBased], _root_.sn.gnome.glib.internal.GIOCondition, _root_.sn.gnome.glib.internal.gint64, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr5[Ptr[GDatagramBased], _root_.sn.gnome.glib.internal.GIOCondition, _root_.sn.gnome.glib.internal.gint64, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def condition_wait_=(value: CFuncPtr5[Ptr[GDatagramBased], _root_.sn.gnome.glib.internal.GIOCondition, _root_.sn.gnome.glib.internal.gint64, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr5[Ptr[GDatagramBased], _root_.sn.gnome.glib.internal.GIOCondition, _root_.sn.gnome.glib.internal.gint64, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]] = value
    end extension
  
  // Allocates GDatagramBasedInterface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GDatagramBasedInterface] = scala.scalanative.unsafe.alloc[GDatagramBasedInterface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, receive_messages : CFuncPtr7[Ptr[GDatagramBased], Ptr[GInputMessage], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint64, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gint], send_messages : CFuncPtr7[Ptr[GDatagramBased], Ptr[GOutputMessage], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint64, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gint], create_source : CFuncPtr3[Ptr[GDatagramBased], _root_.sn.gnome.glib.internal.GIOCondition, Ptr[GCancellable], Ptr[_root_.sn.gnome.glib.internal.GSource]], condition_check : CFuncPtr2[Ptr[GDatagramBased], _root_.sn.gnome.glib.internal.GIOCondition, _root_.sn.gnome.glib.internal.GIOCondition], condition_wait : CFuncPtr5[Ptr[GDatagramBased], _root_.sn.gnome.glib.internal.GIOCondition, _root_.sn.gnome.glib.internal.gint64, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean])(using Zone): Ptr[GDatagramBasedInterface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).receive_messages = receive_messages
    (!____ptr).send_messages = send_messages
    (!____ptr).create_source = create_source
    (!____ptr).condition_check = condition_check
    (!____ptr).condition_wait = condition_wait
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
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt, alignmentof[CFuncPtr7[Ptr[GDatagramBased], Ptr[GInputMessage], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint64, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gint]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr7[Ptr[GDatagramBased], Ptr[GInputMessage], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint64, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gint]].toInt, alignmentof[CFuncPtr7[Ptr[GDatagramBased], Ptr[GOutputMessage], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint64, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gint]].toInt)
    res(3) = align(res(2) + sizeof[CFuncPtr7[Ptr[GDatagramBased], Ptr[GOutputMessage], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint64, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gint]].toInt, alignmentof[CFuncPtr3[Ptr[GDatagramBased], _root_.sn.gnome.glib.internal.GIOCondition, Ptr[GCancellable], Ptr[_root_.sn.gnome.glib.internal.GSource]]].toInt)
    res(4) = align(res(3) + sizeof[CFuncPtr3[Ptr[GDatagramBased], _root_.sn.gnome.glib.internal.GIOCondition, Ptr[GCancellable], Ptr[_root_.sn.gnome.glib.internal.GSource]]].toInt, alignmentof[CFuncPtr2[Ptr[GDatagramBased], _root_.sn.gnome.glib.internal.GIOCondition, _root_.sn.gnome.glib.internal.GIOCondition]].toInt)
    res(5) = align(res(4) + sizeof[CFuncPtr2[Ptr[GDatagramBased], _root_.sn.gnome.glib.internal.GIOCondition, _root_.sn.gnome.glib.internal.GIOCondition]].toInt, alignmentof[CFuncPtr5[Ptr[GDatagramBased], _root_.sn.gnome.glib.internal.GIOCondition, _root_.sn.gnome.glib.internal.gint64, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res
  end offsets