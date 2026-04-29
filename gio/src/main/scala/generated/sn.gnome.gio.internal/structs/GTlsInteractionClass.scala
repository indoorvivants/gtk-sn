package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GTlsInteractionClass = CArray[CChar, Nat.Digit3[Nat._3, Nat._5, Nat._2]]

object GTlsInteractionClass:
  given _tag: Tag[GTlsInteractionClass] = Tag.CArray[CChar, Nat.Digit3[Nat._3, Nat._5, Nat._2]](Tag.Byte, Tag.Digit3[Nat._3, Nat._5, Nat._2](Tag.Nat3, Tag.Nat5, Tag.Nat2))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GTlsInteractionClass)
      inline def parent_class: _root_.sn.gnome.gobject.internal.GObjectClass = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]]
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]] = value
      inline def ask_password: CFuncPtr4[Ptr[GTlsInteraction], Ptr[GTlsPassword], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GTlsInteractionResult] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GTlsInteraction], Ptr[GTlsPassword], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GTlsInteractionResult]]]
      inline def ask_password_=(value: CFuncPtr4[Ptr[GTlsInteraction], Ptr[GTlsPassword], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GTlsInteractionResult]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GTlsInteraction], Ptr[GTlsPassword], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GTlsInteractionResult]]] = value
      inline def ask_password_async: CFuncPtr5[Ptr[GTlsInteraction], Ptr[GTlsPassword], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr5[Ptr[GTlsInteraction], Ptr[GTlsPassword], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]]
      inline def ask_password_async_=(value: CFuncPtr5[Ptr[GTlsInteraction], Ptr[GTlsPassword], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr5[Ptr[GTlsInteraction], Ptr[GTlsPassword], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]] = value
      inline def ask_password_finish: CFuncPtr3[Ptr[GTlsInteraction], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GTlsInteractionResult] = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GTlsInteraction], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GTlsInteractionResult]]]
      inline def ask_password_finish_=(value: CFuncPtr3[Ptr[GTlsInteraction], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GTlsInteractionResult]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GTlsInteraction], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GTlsInteractionResult]]] = value
      inline def request_certificate: CFuncPtr5[Ptr[GTlsInteraction], Ptr[GTlsConnection], GTlsCertificateRequestFlags, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GTlsInteractionResult] = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr5[Ptr[GTlsInteraction], Ptr[GTlsConnection], GTlsCertificateRequestFlags, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GTlsInteractionResult]]]
      inline def request_certificate_=(value: CFuncPtr5[Ptr[GTlsInteraction], Ptr[GTlsConnection], GTlsCertificateRequestFlags, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GTlsInteractionResult]): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr5[Ptr[GTlsInteraction], Ptr[GTlsConnection], GTlsCertificateRequestFlags, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GTlsInteractionResult]]] = value
      inline def request_certificate_async: CFuncPtr6[Ptr[GTlsInteraction], Ptr[GTlsConnection], GTlsCertificateRequestFlags, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr6[Ptr[GTlsInteraction], Ptr[GTlsConnection], GTlsCertificateRequestFlags, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]]
      inline def request_certificate_async_=(value: CFuncPtr6[Ptr[GTlsInteraction], Ptr[GTlsConnection], GTlsCertificateRequestFlags, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr6[Ptr[GTlsInteraction], Ptr[GTlsConnection], GTlsCertificateRequestFlags, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]] = value
      inline def request_certificate_finish: CFuncPtr3[Ptr[GTlsInteraction], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GTlsInteractionResult] = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GTlsInteraction], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GTlsInteractionResult]]]
      inline def request_certificate_finish_=(value: CFuncPtr3[Ptr[GTlsInteraction], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GTlsInteractionResult]): Unit = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GTlsInteraction], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GTlsInteractionResult]]] = value
      inline def padding: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._2, Nat._1]] = !struct.at(offsets(7)).asInstanceOf[Ptr[CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._2, Nat._1]]]]
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._2, Nat._1]]): Unit = !struct.at(offsets(7)).asInstanceOf[Ptr[CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._2, Nat._1]]]] = value
    end extension
  
  // Allocates GTlsInteractionClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GTlsInteractionClass] = scala.scalanative.unsafe.alloc[GTlsInteractionClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, ask_password : CFuncPtr4[Ptr[GTlsInteraction], Ptr[GTlsPassword], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GTlsInteractionResult], ask_password_async : CFuncPtr5[Ptr[GTlsInteraction], Ptr[GTlsPassword], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], ask_password_finish : CFuncPtr3[Ptr[GTlsInteraction], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GTlsInteractionResult], request_certificate : CFuncPtr5[Ptr[GTlsInteraction], Ptr[GTlsConnection], GTlsCertificateRequestFlags, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GTlsInteractionResult], request_certificate_async : CFuncPtr6[Ptr[GTlsInteraction], Ptr[GTlsConnection], GTlsCertificateRequestFlags, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], request_certificate_finish : CFuncPtr3[Ptr[GTlsInteraction], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GTlsInteractionResult], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._2, Nat._1]])(using Zone): Ptr[GTlsInteractionClass] =
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
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](8)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GObjectClass].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GObjectClass].toInt, alignmentof[CFuncPtr4[Ptr[GTlsInteraction], Ptr[GTlsPassword], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GTlsInteractionResult]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr4[Ptr[GTlsInteraction], Ptr[GTlsPassword], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GTlsInteractionResult]].toInt, alignmentof[CFuncPtr5[Ptr[GTlsInteraction], Ptr[GTlsPassword], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt)
    res(3) = align(res(2) + sizeof[CFuncPtr5[Ptr[GTlsInteraction], Ptr[GTlsPassword], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt, alignmentof[CFuncPtr3[Ptr[GTlsInteraction], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GTlsInteractionResult]].toInt)
    res(4) = align(res(3) + sizeof[CFuncPtr3[Ptr[GTlsInteraction], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GTlsInteractionResult]].toInt, alignmentof[CFuncPtr5[Ptr[GTlsInteraction], Ptr[GTlsConnection], GTlsCertificateRequestFlags, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GTlsInteractionResult]].toInt)
    res(5) = align(res(4) + sizeof[CFuncPtr5[Ptr[GTlsInteraction], Ptr[GTlsConnection], GTlsCertificateRequestFlags, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GTlsInteractionResult]].toInt, alignmentof[CFuncPtr6[Ptr[GTlsInteraction], Ptr[GTlsConnection], GTlsCertificateRequestFlags, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt)
    res(6) = align(res(5) + sizeof[CFuncPtr6[Ptr[GTlsInteraction], Ptr[GTlsConnection], GTlsCertificateRequestFlags, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt, alignmentof[CFuncPtr3[Ptr[GTlsInteraction], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GTlsInteractionResult]].toInt)
    res(7) = align(res(6) + sizeof[CFuncPtr3[Ptr[GTlsInteraction], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GTlsInteractionResult]].toInt, alignmentof[_root_.sn.gnome.glib.internal.gpointer].toInt)
    res
  end offsets