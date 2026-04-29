package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTlsConnectionClass: _class: The parent class. _certificate: Check whether to accept a certificate. : Perform a handshake operation. _async: Start an asynchronous handshake operation. _finish: Finish an asynchronous handshake operation. _binding_data: Retrieve TLS channel binding data (Since: 2.66) _negotiated_protocol: Get ALPN-negotiated protocol (Since: 2.70)
*/
opaque type _GTlsConnectionClass = CStruct8[GIOStreamClass, CFuncPtr3[Ptr[GTlsConnection], Ptr[GTlsCertificate], GTlsCertificateFlags, _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[GTlsConnection], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr5[Ptr[GTlsConnection], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GTlsConnection], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr4[Ptr[GTlsConnection], GTlsChannelBindingType, Ptr[_root_.sn.gnome.glib.internal.GByteArray], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[GTlsConnection], Ptr[_root_.sn.gnome.glib.internal.gchar]], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._6]]

object _GTlsConnectionClass:
  given _tag: Tag[_GTlsConnectionClass] = Tag.materializeCStruct8Tag[GIOStreamClass, CFuncPtr3[Ptr[GTlsConnection], Ptr[GTlsCertificate], GTlsCertificateFlags, _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[GTlsConnection], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr5[Ptr[GTlsConnection], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GTlsConnection], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr4[Ptr[GTlsConnection], GTlsChannelBindingType, Ptr[_root_.sn.gnome.glib.internal.GByteArray], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[GTlsConnection], Ptr[_root_.sn.gnome.glib.internal.gchar]], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._6]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GTlsConnectionClass)
      inline def parent_class : GIOStreamClass = struct._1
      inline def parent_class_=(value: GIOStreamClass): Unit = (!struct.at1 = value)
      inline def accept_certificate : CFuncPtr3[Ptr[GTlsConnection], Ptr[GTlsCertificate], GTlsCertificateFlags, _root_.sn.gnome.glib.internal.gboolean] = struct._2
      inline def accept_certificate_=(value: CFuncPtr3[Ptr[GTlsConnection], Ptr[GTlsCertificate], GTlsCertificateFlags, _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at2 = value)
      inline def handshake : CFuncPtr3[Ptr[GTlsConnection], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = struct._3
      inline def handshake_=(value: CFuncPtr3[Ptr[GTlsConnection], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at3 = value)
      inline def handshake_async : CFuncPtr5[Ptr[GTlsConnection], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = struct._4
      inline def handshake_async_=(value: CFuncPtr5[Ptr[GTlsConnection], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = (!struct.at4 = value)
      inline def handshake_finish : CFuncPtr3[Ptr[GTlsConnection], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = struct._5
      inline def handshake_finish_=(value: CFuncPtr3[Ptr[GTlsConnection], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at5 = value)
      inline def get_binding_data : CFuncPtr4[Ptr[GTlsConnection], GTlsChannelBindingType, Ptr[_root_.sn.gnome.glib.internal.GByteArray], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = struct._6
      inline def get_binding_data_=(value: CFuncPtr4[Ptr[GTlsConnection], GTlsChannelBindingType, Ptr[_root_.sn.gnome.glib.internal.GByteArray], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at6 = value)
      inline def get_negotiated_protocol : CFuncPtr1[Ptr[GTlsConnection], Ptr[_root_.sn.gnome.glib.internal.gchar]] = struct._7
      inline def get_negotiated_protocol_=(value: CFuncPtr1[Ptr[GTlsConnection], Ptr[_root_.sn.gnome.glib.internal.gchar]]): Unit = (!struct.at7 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._6] = struct._8
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._6]): Unit = (!struct.at8 = value)
    end extension
  
  // Allocates _GTlsConnectionClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GTlsConnectionClass] = scala.scalanative.unsafe.alloc[_GTlsConnectionClass](1)
  def apply(parent_class : GIOStreamClass, accept_certificate : CFuncPtr3[Ptr[GTlsConnection], Ptr[GTlsCertificate], GTlsCertificateFlags, _root_.sn.gnome.glib.internal.gboolean], handshake : CFuncPtr3[Ptr[GTlsConnection], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], handshake_async : CFuncPtr5[Ptr[GTlsConnection], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], handshake_finish : CFuncPtr3[Ptr[GTlsConnection], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], get_binding_data : CFuncPtr4[Ptr[GTlsConnection], GTlsChannelBindingType, Ptr[_root_.sn.gnome.glib.internal.GByteArray], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], get_negotiated_protocol : CFuncPtr1[Ptr[GTlsConnection], Ptr[_root_.sn.gnome.glib.internal.gchar]], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._6])(using Zone): Ptr[_GTlsConnectionClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).accept_certificate = accept_certificate
    (!____ptr).handshake = handshake
    (!____ptr).handshake_async = handshake_async
    (!____ptr).handshake_finish = handshake_finish
    (!____ptr).get_binding_data = get_binding_data
    (!____ptr).get_negotiated_protocol = get_negotiated_protocol
    (!____ptr).padding = padding
    ____ptr