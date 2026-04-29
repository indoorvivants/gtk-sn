package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GTlsInteractionClass = CStruct8[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr4[Ptr[GTlsInteraction], Ptr[GTlsPassword], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GTlsInteractionResult], CFuncPtr5[Ptr[GTlsInteraction], Ptr[GTlsPassword], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GTlsInteraction], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GTlsInteractionResult], CFuncPtr5[Ptr[GTlsInteraction], Ptr[GTlsConnection], GTlsCertificateRequestFlags, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GTlsInteractionResult], CFuncPtr6[Ptr[GTlsInteraction], Ptr[GTlsConnection], GTlsCertificateRequestFlags, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GTlsInteraction], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GTlsInteractionResult], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._2, Nat._1]]]

object _GTlsInteractionClass:
  given _tag: Tag[_GTlsInteractionClass] = Tag.materializeCStruct8Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr4[Ptr[GTlsInteraction], Ptr[GTlsPassword], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GTlsInteractionResult], CFuncPtr5[Ptr[GTlsInteraction], Ptr[GTlsPassword], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GTlsInteraction], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GTlsInteractionResult], CFuncPtr5[Ptr[GTlsInteraction], Ptr[GTlsConnection], GTlsCertificateRequestFlags, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GTlsInteractionResult], CFuncPtr6[Ptr[GTlsInteraction], Ptr[GTlsConnection], GTlsCertificateRequestFlags, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GTlsInteraction], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GTlsInteractionResult], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._2, Nat._1]]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GTlsInteractionClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
      inline def ask_password : CFuncPtr4[Ptr[GTlsInteraction], Ptr[GTlsPassword], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GTlsInteractionResult] = struct._2
      inline def ask_password_=(value: CFuncPtr4[Ptr[GTlsInteraction], Ptr[GTlsPassword], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GTlsInteractionResult]): Unit = (!struct.at2 = value)
      inline def ask_password_async : CFuncPtr5[Ptr[GTlsInteraction], Ptr[GTlsPassword], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = struct._3
      inline def ask_password_async_=(value: CFuncPtr5[Ptr[GTlsInteraction], Ptr[GTlsPassword], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = (!struct.at3 = value)
      inline def ask_password_finish : CFuncPtr3[Ptr[GTlsInteraction], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GTlsInteractionResult] = struct._4
      inline def ask_password_finish_=(value: CFuncPtr3[Ptr[GTlsInteraction], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GTlsInteractionResult]): Unit = (!struct.at4 = value)
      inline def request_certificate : CFuncPtr5[Ptr[GTlsInteraction], Ptr[GTlsConnection], GTlsCertificateRequestFlags, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GTlsInteractionResult] = struct._5
      inline def request_certificate_=(value: CFuncPtr5[Ptr[GTlsInteraction], Ptr[GTlsConnection], GTlsCertificateRequestFlags, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GTlsInteractionResult]): Unit = (!struct.at5 = value)
      inline def request_certificate_async : CFuncPtr6[Ptr[GTlsInteraction], Ptr[GTlsConnection], GTlsCertificateRequestFlags, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = struct._6
      inline def request_certificate_async_=(value: CFuncPtr6[Ptr[GTlsInteraction], Ptr[GTlsConnection], GTlsCertificateRequestFlags, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = (!struct.at6 = value)
      inline def request_certificate_finish : CFuncPtr3[Ptr[GTlsInteraction], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GTlsInteractionResult] = struct._7
      inline def request_certificate_finish_=(value: CFuncPtr3[Ptr[GTlsInteraction], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GTlsInteractionResult]): Unit = (!struct.at7 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._2, Nat._1]] = struct._8
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._2, Nat._1]]): Unit = (!struct.at8 = value)
    end extension
  
  // Allocates _GTlsInteractionClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GTlsInteractionClass] = scala.scalanative.unsafe.alloc[_GTlsInteractionClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, ask_password : CFuncPtr4[Ptr[GTlsInteraction], Ptr[GTlsPassword], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GTlsInteractionResult], ask_password_async : CFuncPtr5[Ptr[GTlsInteraction], Ptr[GTlsPassword], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], ask_password_finish : CFuncPtr3[Ptr[GTlsInteraction], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GTlsInteractionResult], request_certificate : CFuncPtr5[Ptr[GTlsInteraction], Ptr[GTlsConnection], GTlsCertificateRequestFlags, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GTlsInteractionResult], request_certificate_async : CFuncPtr6[Ptr[GTlsInteraction], Ptr[GTlsConnection], GTlsCertificateRequestFlags, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], request_certificate_finish : CFuncPtr3[Ptr[GTlsInteraction], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GTlsInteractionResult], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._2, Nat._1]])(using Zone): Ptr[_GTlsInteractionClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).ask_password = ask_password
    (!____ptr).ask_password_async = ask_password_async
    (!____ptr).ask_password_finish = ask_password_finish
    (!____ptr).request_certificate = request_certificate
    (!____ptr).request_certificate_async = request_certificate_async
    (!____ptr).request_certificate_finish = request_certificate_finish
    (!____ptr).padding = padding
    ____ptr