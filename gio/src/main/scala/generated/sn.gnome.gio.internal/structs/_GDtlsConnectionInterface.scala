package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDtlsConnectionInterface: _iface: The parent interface. _certificate: Check whether to accept a certificate. : Perform a handshake operation. _async: Start an asynchronous handshake operation. _finish: Finish an asynchronous handshake operation. : Shut down one or both directions of the connection. _async: Start an asynchronous shutdown operation. _finish: Finish an asynchronous shutdown operation.
*/
opaque type _GDtlsConnectionInterface = CStruct11[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr3[Ptr[GDtlsConnection], Ptr[GTlsCertificate], GTlsCertificateFlags, _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[GDtlsConnection], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr5[Ptr[GDtlsConnection], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GDtlsConnection], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr5[Ptr[GDtlsConnection], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr7[Ptr[GDtlsConnection], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GDtlsConnection], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr2[Ptr[GDtlsConnection], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Unit], CFuncPtr1[Ptr[GDtlsConnection], Ptr[_root_.sn.gnome.glib.internal.gchar]], CFuncPtr4[Ptr[GDtlsConnection], GTlsChannelBindingType, Ptr[_root_.sn.gnome.glib.internal.GByteArray], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]

object _GDtlsConnectionInterface:
  given _tag: Tag[_GDtlsConnectionInterface] = Tag.materializeCStruct11Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr3[Ptr[GDtlsConnection], Ptr[GTlsCertificate], GTlsCertificateFlags, _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[GDtlsConnection], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr5[Ptr[GDtlsConnection], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GDtlsConnection], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr5[Ptr[GDtlsConnection], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr7[Ptr[GDtlsConnection], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GDtlsConnection], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr2[Ptr[GDtlsConnection], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Unit], CFuncPtr1[Ptr[GDtlsConnection], Ptr[_root_.sn.gnome.glib.internal.gchar]], CFuncPtr4[Ptr[GDtlsConnection], GTlsChannelBindingType, Ptr[_root_.sn.gnome.glib.internal.GByteArray], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GDtlsConnectionInterface)
      inline def g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
      inline def accept_certificate : CFuncPtr3[Ptr[GDtlsConnection], Ptr[GTlsCertificate], GTlsCertificateFlags, _root_.sn.gnome.glib.internal.gboolean] = struct._2
      inline def accept_certificate_=(value: CFuncPtr3[Ptr[GDtlsConnection], Ptr[GTlsCertificate], GTlsCertificateFlags, _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at2 = value)
      inline def handshake : CFuncPtr3[Ptr[GDtlsConnection], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = struct._3
      inline def handshake_=(value: CFuncPtr3[Ptr[GDtlsConnection], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at3 = value)
      inline def handshake_async : CFuncPtr5[Ptr[GDtlsConnection], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = struct._4
      inline def handshake_async_=(value: CFuncPtr5[Ptr[GDtlsConnection], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = (!struct.at4 = value)
      inline def handshake_finish : CFuncPtr3[Ptr[GDtlsConnection], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = struct._5
      inline def handshake_finish_=(value: CFuncPtr3[Ptr[GDtlsConnection], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at5 = value)
      inline def shutdown : CFuncPtr5[Ptr[GDtlsConnection], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = struct._6
      inline def shutdown_=(value: CFuncPtr5[Ptr[GDtlsConnection], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at6 = value)
      inline def shutdown_async : CFuncPtr7[Ptr[GDtlsConnection], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = struct._7
      inline def shutdown_async_=(value: CFuncPtr7[Ptr[GDtlsConnection], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = (!struct.at7 = value)
      inline def shutdown_finish : CFuncPtr3[Ptr[GDtlsConnection], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = struct._8
      inline def shutdown_finish_=(value: CFuncPtr3[Ptr[GDtlsConnection], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at8 = value)
      inline def set_advertised_protocols : CFuncPtr2[Ptr[GDtlsConnection], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Unit] = struct._9
      inline def set_advertised_protocols_=(value: CFuncPtr2[Ptr[GDtlsConnection], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Unit]): Unit = (!struct.at9 = value)
      inline def get_negotiated_protocol : CFuncPtr1[Ptr[GDtlsConnection], Ptr[_root_.sn.gnome.glib.internal.gchar]] = struct._10
      inline def get_negotiated_protocol_=(value: CFuncPtr1[Ptr[GDtlsConnection], Ptr[_root_.sn.gnome.glib.internal.gchar]]): Unit = (!struct.at10 = value)
      inline def get_binding_data : CFuncPtr4[Ptr[GDtlsConnection], GTlsChannelBindingType, Ptr[_root_.sn.gnome.glib.internal.GByteArray], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = struct._11
      inline def get_binding_data_=(value: CFuncPtr4[Ptr[GDtlsConnection], GTlsChannelBindingType, Ptr[_root_.sn.gnome.glib.internal.GByteArray], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at11 = value)
    end extension
  
  // Allocates _GDtlsConnectionInterface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GDtlsConnectionInterface] = scala.scalanative.unsafe.alloc[_GDtlsConnectionInterface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, accept_certificate : CFuncPtr3[Ptr[GDtlsConnection], Ptr[GTlsCertificate], GTlsCertificateFlags, _root_.sn.gnome.glib.internal.gboolean], handshake : CFuncPtr3[Ptr[GDtlsConnection], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], handshake_async : CFuncPtr5[Ptr[GDtlsConnection], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], handshake_finish : CFuncPtr3[Ptr[GDtlsConnection], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], shutdown : CFuncPtr5[Ptr[GDtlsConnection], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], shutdown_async : CFuncPtr7[Ptr[GDtlsConnection], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], shutdown_finish : CFuncPtr3[Ptr[GDtlsConnection], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], set_advertised_protocols : CFuncPtr2[Ptr[GDtlsConnection], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Unit], get_negotiated_protocol : CFuncPtr1[Ptr[GDtlsConnection], Ptr[_root_.sn.gnome.glib.internal.gchar]], get_binding_data : CFuncPtr4[Ptr[GDtlsConnection], GTlsChannelBindingType, Ptr[_root_.sn.gnome.glib.internal.GByteArray], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean])(using Zone): Ptr[_GDtlsConnectionInterface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).accept_certificate = accept_certificate
    (!____ptr).handshake = handshake
    (!____ptr).handshake_async = handshake_async
    (!____ptr).handshake_finish = handshake_finish
    (!____ptr).shutdown = shutdown
    (!____ptr).shutdown_async = shutdown_async
    (!____ptr).shutdown_finish = shutdown_finish
    (!____ptr).set_advertised_protocols = set_advertised_protocols
    (!____ptr).get_negotiated_protocol = get_negotiated_protocol
    (!____ptr).get_binding_data = get_binding_data
    ____ptr