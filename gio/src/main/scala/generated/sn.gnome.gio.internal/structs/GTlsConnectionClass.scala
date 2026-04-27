package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTlsConnectionClass: _class: The parent class. _certificate: Check whether to accept a certificate. : Perform a handshake operation. _async: Start an asynchronous handshake operation. _finish: Finish an asynchronous handshake operation. _binding_data: Retrieve TLS channel binding data (Since: 2.66) _negotiated_protocol: Get ALPN-negotiated protocol (Since: 2.70)
*/
opaque type GTlsConnectionClass = CArray[CChar, Nat.Digit3[Nat._3, Nat._5, Nat._2]]

object GTlsConnectionClass:
  given _tag: Tag[GTlsConnectionClass] = Tag.CArray[CChar, Nat.Digit3[Nat._3, Nat._5, Nat._2]](Tag.Byte, Tag.Digit3[Nat._3, Nat._5, Nat._2](Tag.Nat3, Tag.Nat5, Tag.Nat2))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GTlsConnectionClass)
      inline def parent_class: GIOStreamClass = !struct.at(offsets(0)).asInstanceOf[Ptr[GIOStreamClass]]
      inline def parent_class_=(value: GIOStreamClass): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[GIOStreamClass]] = value
      inline def accept_certificate: CFuncPtr3[Ptr[GTlsConnection], Ptr[GTlsCertificate], GTlsCertificateFlags, _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GTlsConnection], Ptr[GTlsCertificate], GTlsCertificateFlags, _root_.sn.gnome.glib.internal.gboolean]]]
      inline def accept_certificate_=(value: CFuncPtr3[Ptr[GTlsConnection], Ptr[GTlsCertificate], GTlsCertificateFlags, _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GTlsConnection], Ptr[GTlsCertificate], GTlsCertificateFlags, _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def handshake: CFuncPtr3[Ptr[GTlsConnection], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GTlsConnection], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def handshake_=(value: CFuncPtr3[Ptr[GTlsConnection], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GTlsConnection], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def handshake_async: CFuncPtr5[Ptr[GTlsConnection], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr5[Ptr[GTlsConnection], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]]
      inline def handshake_async_=(value: CFuncPtr5[Ptr[GTlsConnection], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr5[Ptr[GTlsConnection], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]] = value
      inline def handshake_finish: CFuncPtr3[Ptr[GTlsConnection], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GTlsConnection], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def handshake_finish_=(value: CFuncPtr3[Ptr[GTlsConnection], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GTlsConnection], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def get_binding_data: CFuncPtr4[Ptr[GTlsConnection], GTlsChannelBindingType, Ptr[_root_.sn.gnome.glib.internal.GByteArray], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GTlsConnection], GTlsChannelBindingType, Ptr[_root_.sn.gnome.glib.internal.GByteArray], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def get_binding_data_=(value: CFuncPtr4[Ptr[GTlsConnection], GTlsChannelBindingType, Ptr[_root_.sn.gnome.glib.internal.GByteArray], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GTlsConnection], GTlsChannelBindingType, Ptr[_root_.sn.gnome.glib.internal.GByteArray], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def get_negotiated_protocol: CFuncPtr1[Ptr[GTlsConnection], Ptr[_root_.sn.gnome.glib.internal.gchar]] = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GTlsConnection], Ptr[_root_.sn.gnome.glib.internal.gchar]]]]
      inline def get_negotiated_protocol_=(value: CFuncPtr1[Ptr[GTlsConnection], Ptr[_root_.sn.gnome.glib.internal.gchar]]): Unit = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GTlsConnection], Ptr[_root_.sn.gnome.glib.internal.gchar]]]] = value
      inline def padding: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._6] = !struct.at(offsets(7)).asInstanceOf[Ptr[CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._6]]]
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._6]): Unit = !struct.at(offsets(7)).asInstanceOf[Ptr[CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._6]]] = value
    end extension
  
  // Allocates GTlsConnectionClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GTlsConnectionClass] = scala.scalanative.unsafe.alloc[GTlsConnectionClass](1)
  def apply(parent_class : GIOStreamClass, accept_certificate : CFuncPtr3[Ptr[GTlsConnection], Ptr[GTlsCertificate], GTlsCertificateFlags, _root_.sn.gnome.glib.internal.gboolean], handshake : CFuncPtr3[Ptr[GTlsConnection], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], handshake_async : CFuncPtr5[Ptr[GTlsConnection], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], handshake_finish : CFuncPtr3[Ptr[GTlsConnection], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], get_binding_data : CFuncPtr4[Ptr[GTlsConnection], GTlsChannelBindingType, Ptr[_root_.sn.gnome.glib.internal.GByteArray], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], get_negotiated_protocol : CFuncPtr1[Ptr[GTlsConnection], Ptr[_root_.sn.gnome.glib.internal.gchar]], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._6])(using Zone): Ptr[GTlsConnectionClass] =
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
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](8)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[GIOStreamClass].toInt)
    res(1) = align(res(0) + sizeof[GIOStreamClass].toInt, alignmentof[CFuncPtr3[Ptr[GTlsConnection], Ptr[GTlsCertificate], GTlsCertificateFlags, _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr3[Ptr[GTlsConnection], Ptr[GTlsCertificate], GTlsCertificateFlags, _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr3[Ptr[GTlsConnection], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(3) = align(res(2) + sizeof[CFuncPtr3[Ptr[GTlsConnection], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr5[Ptr[GTlsConnection], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt)
    res(4) = align(res(3) + sizeof[CFuncPtr5[Ptr[GTlsConnection], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt, alignmentof[CFuncPtr3[Ptr[GTlsConnection], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(5) = align(res(4) + sizeof[CFuncPtr3[Ptr[GTlsConnection], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr4[Ptr[GTlsConnection], GTlsChannelBindingType, Ptr[_root_.sn.gnome.glib.internal.GByteArray], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(6) = align(res(5) + sizeof[CFuncPtr4[Ptr[GTlsConnection], GTlsChannelBindingType, Ptr[_root_.sn.gnome.glib.internal.GByteArray], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr1[Ptr[GTlsConnection], Ptr[_root_.sn.gnome.glib.internal.gchar]]].toInt)
    res(7) = align(res(6) + sizeof[CFuncPtr1[Ptr[GTlsConnection], Ptr[_root_.sn.gnome.glib.internal.gchar]]].toInt, alignmentof[_root_.sn.gnome.glib.internal.gpointer].toInt)
    res
  end offsets