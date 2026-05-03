package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDtlsConnectionInterface: _iface: The parent interface. _certificate: Check whether to accept a certificate. : Perform a handshake operation. _async: Start an asynchronous handshake operation. _finish: Finish an asynchronous handshake operation. : Shut down one or both directions of the connection. _async: Start an asynchronous shutdown operation. _finish: Finish an asynchronous shutdown operation.
*/
opaque type GDtlsConnectionInterface = CArray[CChar, Nat.Digit2[Nat._9, Nat._6]]

object GDtlsConnectionInterface:
  given _tag: Tag[GDtlsConnectionInterface] = Tag.CArray[CChar, Nat.Digit2[Nat._9, Nat._6]](Tag.Byte, Tag.Digit2[Nat._9, Nat._6](Tag.Nat9, Tag.Nat6))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GDtlsConnectionInterface)
      inline def g_iface: _root_.sn.gnome.gobject.internal.GTypeInterface = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]]
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]] = value
      inline def accept_certificate: CFuncPtr3[Ptr[GDtlsConnection], Ptr[GTlsCertificate], GTlsCertificateFlags, _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GDtlsConnection], Ptr[GTlsCertificate], GTlsCertificateFlags, _root_.sn.gnome.glib.internal.gboolean]]]
      inline def accept_certificate_=(value: CFuncPtr3[Ptr[GDtlsConnection], Ptr[GTlsCertificate], GTlsCertificateFlags, _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GDtlsConnection], Ptr[GTlsCertificate], GTlsCertificateFlags, _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def handshake: CFuncPtr3[Ptr[GDtlsConnection], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GDtlsConnection], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def handshake_=(value: CFuncPtr3[Ptr[GDtlsConnection], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GDtlsConnection], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def handshake_async: CFuncPtr5[Ptr[GDtlsConnection], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr5[Ptr[GDtlsConnection], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]]
      inline def handshake_async_=(value: CFuncPtr5[Ptr[GDtlsConnection], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr5[Ptr[GDtlsConnection], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]] = value
      inline def handshake_finish: CFuncPtr3[Ptr[GDtlsConnection], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GDtlsConnection], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def handshake_finish_=(value: CFuncPtr3[Ptr[GDtlsConnection], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GDtlsConnection], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def shutdown: CFuncPtr5[Ptr[GDtlsConnection], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr5[Ptr[GDtlsConnection], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def shutdown_=(value: CFuncPtr5[Ptr[GDtlsConnection], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr5[Ptr[GDtlsConnection], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def shutdown_async: CFuncPtr7[Ptr[GDtlsConnection], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr7[Ptr[GDtlsConnection], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]]
      inline def shutdown_async_=(value: CFuncPtr7[Ptr[GDtlsConnection], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr7[Ptr[GDtlsConnection], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]] = value
      inline def shutdown_finish: CFuncPtr3[Ptr[GDtlsConnection], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(7)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GDtlsConnection], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def shutdown_finish_=(value: CFuncPtr3[Ptr[GDtlsConnection], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(7)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GDtlsConnection], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def set_advertised_protocols: CFuncPtr2[Ptr[GDtlsConnection], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Unit] = !struct.at(offsets(8)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GDtlsConnection], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Unit]]]
      inline def set_advertised_protocols_=(value: CFuncPtr2[Ptr[GDtlsConnection], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Unit]): Unit = !struct.at(offsets(8)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GDtlsConnection], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Unit]]] = value
      inline def get_negotiated_protocol: CFuncPtr1[Ptr[GDtlsConnection], Ptr[_root_.sn.gnome.glib.internal.gchar]] = !struct.at(offsets(9)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDtlsConnection], Ptr[_root_.sn.gnome.glib.internal.gchar]]]]
      inline def get_negotiated_protocol_=(value: CFuncPtr1[Ptr[GDtlsConnection], Ptr[_root_.sn.gnome.glib.internal.gchar]]): Unit = !struct.at(offsets(9)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDtlsConnection], Ptr[_root_.sn.gnome.glib.internal.gchar]]]] = value
      inline def get_binding_data: CFuncPtr4[Ptr[GDtlsConnection], GTlsChannelBindingType, Ptr[_root_.sn.gnome.glib.internal.GByteArray], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(10)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GDtlsConnection], GTlsChannelBindingType, Ptr[_root_.sn.gnome.glib.internal.GByteArray], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def get_binding_data_=(value: CFuncPtr4[Ptr[GDtlsConnection], GTlsChannelBindingType, Ptr[_root_.sn.gnome.glib.internal.GByteArray], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(10)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GDtlsConnection], GTlsChannelBindingType, Ptr[_root_.sn.gnome.glib.internal.GByteArray], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]] = value
    end extension
  
  // Allocates GDtlsConnectionInterface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GDtlsConnectionInterface] = scala.scalanative.unsafe.alloc[GDtlsConnectionInterface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, accept_certificate : CFuncPtr3[Ptr[GDtlsConnection], Ptr[GTlsCertificate], GTlsCertificateFlags, _root_.sn.gnome.glib.internal.gboolean], handshake : CFuncPtr3[Ptr[GDtlsConnection], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], handshake_async : CFuncPtr5[Ptr[GDtlsConnection], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], handshake_finish : CFuncPtr3[Ptr[GDtlsConnection], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], shutdown : CFuncPtr5[Ptr[GDtlsConnection], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], shutdown_async : CFuncPtr7[Ptr[GDtlsConnection], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], shutdown_finish : CFuncPtr3[Ptr[GDtlsConnection], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], set_advertised_protocols : CFuncPtr2[Ptr[GDtlsConnection], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Unit], get_negotiated_protocol : CFuncPtr1[Ptr[GDtlsConnection], Ptr[_root_.sn.gnome.glib.internal.gchar]], get_binding_data : CFuncPtr4[Ptr[GDtlsConnection], GTlsChannelBindingType, Ptr[_root_.sn.gnome.glib.internal.GByteArray], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean])(using Zone): Ptr[GDtlsConnectionInterface] =
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
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](11)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt, alignmentof[CFuncPtr3[Ptr[GDtlsConnection], Ptr[GTlsCertificate], GTlsCertificateFlags, _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr3[Ptr[GDtlsConnection], Ptr[GTlsCertificate], GTlsCertificateFlags, _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr3[Ptr[GDtlsConnection], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(3) = align(res(2) + sizeof[CFuncPtr3[Ptr[GDtlsConnection], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr5[Ptr[GDtlsConnection], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt)
    res(4) = align(res(3) + sizeof[CFuncPtr5[Ptr[GDtlsConnection], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt, alignmentof[CFuncPtr3[Ptr[GDtlsConnection], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(5) = align(res(4) + sizeof[CFuncPtr3[Ptr[GDtlsConnection], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr5[Ptr[GDtlsConnection], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(6) = align(res(5) + sizeof[CFuncPtr5[Ptr[GDtlsConnection], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr7[Ptr[GDtlsConnection], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt)
    res(7) = align(res(6) + sizeof[CFuncPtr7[Ptr[GDtlsConnection], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt, alignmentof[CFuncPtr3[Ptr[GDtlsConnection], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(8) = align(res(7) + sizeof[CFuncPtr3[Ptr[GDtlsConnection], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr2[Ptr[GDtlsConnection], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Unit]].toInt)
    res(9) = align(res(8) + sizeof[CFuncPtr2[Ptr[GDtlsConnection], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Unit]].toInt, alignmentof[CFuncPtr1[Ptr[GDtlsConnection], Ptr[_root_.sn.gnome.glib.internal.gchar]]].toInt)
    res(10) = align(res(9) + sizeof[CFuncPtr1[Ptr[GDtlsConnection], Ptr[_root_.sn.gnome.glib.internal.gchar]]].toInt, alignmentof[CFuncPtr4[Ptr[GDtlsConnection], GTlsChannelBindingType, Ptr[_root_.sn.gnome.glib.internal.GByteArray], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res
  end offsets