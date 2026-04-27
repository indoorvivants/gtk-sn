package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTlsBackendInterface: _iface: The parent interface. _tls: returns whether the backend supports TLS. _dtls: returns whether the backend supports DTLS _default_database: returns a default #GTlsDatabase instance. _certificate_type: returns the #GTlsCertificate implementation type _client_connection_type: returns the #GTlsClientConnection implementation type _server_connection_type: returns the #GTlsServerConnection implementation type _file_database_type: returns the #GTlsFileDatabase implementation type. _dtls_client_connection_type: returns the #GDtlsClientConnection implementation type _dtls_server_connection_type: returns the #GDtlsServerConnection implementation type
*/
opaque type GTlsBackendInterface = CArray[CChar, Nat.Digit2[Nat._8, Nat._8]]

object GTlsBackendInterface:
  given _tag: Tag[GTlsBackendInterface] = Tag.CArray[CChar, Nat.Digit2[Nat._8, Nat._8]](Tag.Byte, Tag.Digit2[Nat._8, Nat._8](Tag.Nat8, Tag.Nat8))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GTlsBackendInterface)
      inline def g_iface: _root_.sn.gnome.gobject.internal.GTypeInterface = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]]
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]] = value
      inline def supports_tls: CFuncPtr1[Ptr[GTlsBackend], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GTlsBackend], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def supports_tls_=(value: CFuncPtr1[Ptr[GTlsBackend], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GTlsBackend], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def get_certificate_type: CFuncPtr0[_root_.sn.gnome.gobject.internal.GType] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr0[_root_.sn.gnome.gobject.internal.GType]]]
      inline def get_certificate_type_=(value: CFuncPtr0[_root_.sn.gnome.gobject.internal.GType]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr0[_root_.sn.gnome.gobject.internal.GType]]] = value
      inline def get_client_connection_type: CFuncPtr0[_root_.sn.gnome.gobject.internal.GType] = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr0[_root_.sn.gnome.gobject.internal.GType]]]
      inline def get_client_connection_type_=(value: CFuncPtr0[_root_.sn.gnome.gobject.internal.GType]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr0[_root_.sn.gnome.gobject.internal.GType]]] = value
      inline def get_server_connection_type: CFuncPtr0[_root_.sn.gnome.gobject.internal.GType] = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr0[_root_.sn.gnome.gobject.internal.GType]]]
      inline def get_server_connection_type_=(value: CFuncPtr0[_root_.sn.gnome.gobject.internal.GType]): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr0[_root_.sn.gnome.gobject.internal.GType]]] = value
      inline def get_file_database_type: CFuncPtr0[_root_.sn.gnome.gobject.internal.GType] = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr0[_root_.sn.gnome.gobject.internal.GType]]]
      inline def get_file_database_type_=(value: CFuncPtr0[_root_.sn.gnome.gobject.internal.GType]): Unit = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr0[_root_.sn.gnome.gobject.internal.GType]]] = value
      inline def get_default_database: CFuncPtr1[Ptr[GTlsBackend], Ptr[GTlsDatabase]] = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GTlsBackend], Ptr[GTlsDatabase]]]]
      inline def get_default_database_=(value: CFuncPtr1[Ptr[GTlsBackend], Ptr[GTlsDatabase]]): Unit = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GTlsBackend], Ptr[GTlsDatabase]]]] = value
      inline def supports_dtls: CFuncPtr1[Ptr[GTlsBackend], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(7)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GTlsBackend], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def supports_dtls_=(value: CFuncPtr1[Ptr[GTlsBackend], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(7)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GTlsBackend], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def get_dtls_client_connection_type: CFuncPtr0[_root_.sn.gnome.gobject.internal.GType] = !struct.at(offsets(8)).asInstanceOf[Ptr[CFuncPtr0[_root_.sn.gnome.gobject.internal.GType]]]
      inline def get_dtls_client_connection_type_=(value: CFuncPtr0[_root_.sn.gnome.gobject.internal.GType]): Unit = !struct.at(offsets(8)).asInstanceOf[Ptr[CFuncPtr0[_root_.sn.gnome.gobject.internal.GType]]] = value
      inline def get_dtls_server_connection_type: CFuncPtr0[_root_.sn.gnome.gobject.internal.GType] = !struct.at(offsets(9)).asInstanceOf[Ptr[CFuncPtr0[_root_.sn.gnome.gobject.internal.GType]]]
      inline def get_dtls_server_connection_type_=(value: CFuncPtr0[_root_.sn.gnome.gobject.internal.GType]): Unit = !struct.at(offsets(9)).asInstanceOf[Ptr[CFuncPtr0[_root_.sn.gnome.gobject.internal.GType]]] = value
    end extension
  
  // Allocates GTlsBackendInterface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GTlsBackendInterface] = scala.scalanative.unsafe.alloc[GTlsBackendInterface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, supports_tls : CFuncPtr1[Ptr[GTlsBackend], _root_.sn.gnome.glib.internal.gboolean], get_certificate_type : CFuncPtr0[_root_.sn.gnome.gobject.internal.GType], get_client_connection_type : CFuncPtr0[_root_.sn.gnome.gobject.internal.GType], get_server_connection_type : CFuncPtr0[_root_.sn.gnome.gobject.internal.GType], get_file_database_type : CFuncPtr0[_root_.sn.gnome.gobject.internal.GType], get_default_database : CFuncPtr1[Ptr[GTlsBackend], Ptr[GTlsDatabase]], supports_dtls : CFuncPtr1[Ptr[GTlsBackend], _root_.sn.gnome.glib.internal.gboolean], get_dtls_client_connection_type : CFuncPtr0[_root_.sn.gnome.gobject.internal.GType], get_dtls_server_connection_type : CFuncPtr0[_root_.sn.gnome.gobject.internal.GType])(using Zone): Ptr[GTlsBackendInterface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).supports_tls = supports_tls
    (!____ptr).get_certificate_type = get_certificate_type
    (!____ptr).get_client_connection_type = get_client_connection_type
    (!____ptr).get_server_connection_type = get_server_connection_type
    (!____ptr).get_file_database_type = get_file_database_type
    (!____ptr).get_default_database = get_default_database
    (!____ptr).supports_dtls = supports_dtls
    (!____ptr).get_dtls_client_connection_type = get_dtls_client_connection_type
    (!____ptr).get_dtls_server_connection_type = get_dtls_server_connection_type
    ____ptr
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](10)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt, alignmentof[CFuncPtr1[Ptr[GTlsBackend], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr1[Ptr[GTlsBackend], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr0[_root_.sn.gnome.gobject.internal.GType]].toInt)
    res(3) = align(res(2) + sizeof[CFuncPtr0[_root_.sn.gnome.gobject.internal.GType]].toInt, alignmentof[CFuncPtr0[_root_.sn.gnome.gobject.internal.GType]].toInt)
    res(4) = align(res(3) + sizeof[CFuncPtr0[_root_.sn.gnome.gobject.internal.GType]].toInt, alignmentof[CFuncPtr0[_root_.sn.gnome.gobject.internal.GType]].toInt)
    res(5) = align(res(4) + sizeof[CFuncPtr0[_root_.sn.gnome.gobject.internal.GType]].toInt, alignmentof[CFuncPtr0[_root_.sn.gnome.gobject.internal.GType]].toInt)
    res(6) = align(res(5) + sizeof[CFuncPtr0[_root_.sn.gnome.gobject.internal.GType]].toInt, alignmentof[CFuncPtr1[Ptr[GTlsBackend], Ptr[GTlsDatabase]]].toInt)
    res(7) = align(res(6) + sizeof[CFuncPtr1[Ptr[GTlsBackend], Ptr[GTlsDatabase]]].toInt, alignmentof[CFuncPtr1[Ptr[GTlsBackend], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(8) = align(res(7) + sizeof[CFuncPtr1[Ptr[GTlsBackend], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr0[_root_.sn.gnome.gobject.internal.GType]].toInt)
    res(9) = align(res(8) + sizeof[CFuncPtr0[_root_.sn.gnome.gobject.internal.GType]].toInt, alignmentof[CFuncPtr0[_root_.sn.gnome.gobject.internal.GType]].toInt)
    res
  end offsets