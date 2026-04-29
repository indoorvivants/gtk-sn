package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDatagramBasedInterface: _iface: The parent interface. _messages: Virtual method for g_datagram_based_receive_messages(). _messages: Virtual method for g_datagram_based_send_messages(). _source: Virtual method for g_datagram_based_create_source(). _check: Virtual method for g_datagram_based_condition_check(). _wait: Virtual method for g_datagram_based_condition_wait().
*/
opaque type _GDatagramBasedInterface = CStruct6[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr7[Ptr[GDatagramBased], Ptr[GInputMessage], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint64, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gint], CFuncPtr7[Ptr[GDatagramBased], Ptr[GOutputMessage], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint64, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gint], CFuncPtr3[Ptr[GDatagramBased], _root_.sn.gnome.glib.internal.GIOCondition, Ptr[GCancellable], Ptr[Byte]], CFuncPtr2[Ptr[GDatagramBased], _root_.sn.gnome.glib.internal.GIOCondition, _root_.sn.gnome.glib.internal.GIOCondition], CFuncPtr5[Ptr[GDatagramBased], _root_.sn.gnome.glib.internal.GIOCondition, _root_.sn.gnome.glib.internal.gint64, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]

object _GDatagramBasedInterface:
  given _tag: Tag[_GDatagramBasedInterface] = Tag.materializeCStruct6Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr7[Ptr[GDatagramBased], Ptr[GInputMessage], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint64, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gint], CFuncPtr7[Ptr[GDatagramBased], Ptr[GOutputMessage], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint64, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gint], CFuncPtr3[Ptr[GDatagramBased], _root_.sn.gnome.glib.internal.GIOCondition, Ptr[GCancellable], Ptr[Byte]], CFuncPtr2[Ptr[GDatagramBased], _root_.sn.gnome.glib.internal.GIOCondition, _root_.sn.gnome.glib.internal.GIOCondition], CFuncPtr5[Ptr[GDatagramBased], _root_.sn.gnome.glib.internal.GIOCondition, _root_.sn.gnome.glib.internal.gint64, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GDatagramBasedInterface)
      inline def g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
      inline def receive_messages : CFuncPtr7[Ptr[GDatagramBased], Ptr[GInputMessage], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint64, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gint] = struct._2
      inline def receive_messages_=(value: CFuncPtr7[Ptr[GDatagramBased], Ptr[GInputMessage], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint64, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gint]): Unit = (!struct.at2 = value)
      inline def send_messages : CFuncPtr7[Ptr[GDatagramBased], Ptr[GOutputMessage], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint64, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gint] = struct._3
      inline def send_messages_=(value: CFuncPtr7[Ptr[GDatagramBased], Ptr[GOutputMessage], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint64, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gint]): Unit = (!struct.at3 = value)
      inline def create_source : CFuncPtr3[Ptr[GDatagramBased], _root_.sn.gnome.glib.internal.GIOCondition, Ptr[GCancellable], Ptr[_root_.sn.gnome.glib.internal.GSource]] = struct._4.asInstanceOf[CFuncPtr3[Ptr[GDatagramBased], _root_.sn.gnome.glib.internal.GIOCondition, Ptr[GCancellable], Ptr[_root_.sn.gnome.glib.internal.GSource]]]
      inline def create_source_=(value: CFuncPtr3[Ptr[GDatagramBased], _root_.sn.gnome.glib.internal.GIOCondition, Ptr[GCancellable], Ptr[_root_.sn.gnome.glib.internal.GSource]]): Unit = (!struct.at4 = value.asInstanceOf[CFuncPtr3[Ptr[GDatagramBased], _root_.sn.gnome.glib.internal.GIOCondition, Ptr[GCancellable], Ptr[Byte]]])
      inline def condition_check : CFuncPtr2[Ptr[GDatagramBased], _root_.sn.gnome.glib.internal.GIOCondition, _root_.sn.gnome.glib.internal.GIOCondition] = struct._5
      inline def condition_check_=(value: CFuncPtr2[Ptr[GDatagramBased], _root_.sn.gnome.glib.internal.GIOCondition, _root_.sn.gnome.glib.internal.GIOCondition]): Unit = (!struct.at5 = value)
      inline def condition_wait : CFuncPtr5[Ptr[GDatagramBased], _root_.sn.gnome.glib.internal.GIOCondition, _root_.sn.gnome.glib.internal.gint64, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = struct._6
      inline def condition_wait_=(value: CFuncPtr5[Ptr[GDatagramBased], _root_.sn.gnome.glib.internal.GIOCondition, _root_.sn.gnome.glib.internal.gint64, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at6 = value)
    end extension
  
  // Allocates _GDatagramBasedInterface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GDatagramBasedInterface] = scala.scalanative.unsafe.alloc[_GDatagramBasedInterface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, receive_messages : CFuncPtr7[Ptr[GDatagramBased], Ptr[GInputMessage], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint64, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gint], send_messages : CFuncPtr7[Ptr[GDatagramBased], Ptr[GOutputMessage], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint64, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gint], create_source : CFuncPtr3[Ptr[GDatagramBased], _root_.sn.gnome.glib.internal.GIOCondition, Ptr[GCancellable], Ptr[_root_.sn.gnome.glib.internal.GSource]], condition_check : CFuncPtr2[Ptr[GDatagramBased], _root_.sn.gnome.glib.internal.GIOCondition, _root_.sn.gnome.glib.internal.GIOCondition], condition_wait : CFuncPtr5[Ptr[GDatagramBased], _root_.sn.gnome.glib.internal.GIOCondition, _root_.sn.gnome.glib.internal.gint64, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean])(using Zone): Ptr[_GDatagramBasedInterface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).receive_messages = receive_messages
    (!____ptr).send_messages = send_messages
    (!____ptr).create_source = create_source
    (!____ptr).condition_check = condition_check
    (!____ptr).condition_wait = condition_wait
    ____ptr