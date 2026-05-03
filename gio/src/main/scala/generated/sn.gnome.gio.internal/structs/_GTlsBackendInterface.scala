package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTlsBackendInterface: _iface: The parent interface. _tls: returns whether the backend supports TLS. _dtls: returns whether the backend supports DTLS _default_database: returns a default #GTlsDatabase instance. _certificate_type: returns the #GTlsCertificate implementation type _client_connection_type: returns the #GTlsClientConnection implementation type _server_connection_type: returns the #GTlsServerConnection implementation type _file_database_type: returns the #GTlsFileDatabase implementation type. _dtls_client_connection_type: returns the #GDtlsClientConnection implementation type _dtls_server_connection_type: returns the #GDtlsServerConnection implementation type
*/
opaque type _GTlsBackendInterface = CStruct10[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr1[Ptr[GTlsBackend], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr0[_root_.sn.gnome.gobject.internal.GType], CFuncPtr0[_root_.sn.gnome.gobject.internal.GType], CFuncPtr0[_root_.sn.gnome.gobject.internal.GType], CFuncPtr0[_root_.sn.gnome.gobject.internal.GType], CFuncPtr1[Ptr[GTlsBackend], Ptr[GTlsDatabase]], CFuncPtr1[Ptr[GTlsBackend], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr0[_root_.sn.gnome.gobject.internal.GType], CFuncPtr0[_root_.sn.gnome.gobject.internal.GType]]

object _GTlsBackendInterface:
  given _tag: Tag[_GTlsBackendInterface] = Tag.materializeCStruct10Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr1[Ptr[GTlsBackend], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr0[_root_.sn.gnome.gobject.internal.GType], CFuncPtr0[_root_.sn.gnome.gobject.internal.GType], CFuncPtr0[_root_.sn.gnome.gobject.internal.GType], CFuncPtr0[_root_.sn.gnome.gobject.internal.GType], CFuncPtr1[Ptr[GTlsBackend], Ptr[GTlsDatabase]], CFuncPtr1[Ptr[GTlsBackend], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr0[_root_.sn.gnome.gobject.internal.GType], CFuncPtr0[_root_.sn.gnome.gobject.internal.GType]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GTlsBackendInterface)
      inline def g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
      inline def supports_tls : CFuncPtr1[Ptr[GTlsBackend], _root_.sn.gnome.glib.internal.gboolean] = struct._2
      inline def supports_tls_=(value: CFuncPtr1[Ptr[GTlsBackend], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at2 = value)
      inline def get_certificate_type : CFuncPtr0[_root_.sn.gnome.gobject.internal.GType] = struct._3
      inline def get_certificate_type_=(value: CFuncPtr0[_root_.sn.gnome.gobject.internal.GType]): Unit = (!struct.at3 = value)
      inline def get_client_connection_type : CFuncPtr0[_root_.sn.gnome.gobject.internal.GType] = struct._4
      inline def get_client_connection_type_=(value: CFuncPtr0[_root_.sn.gnome.gobject.internal.GType]): Unit = (!struct.at4 = value)
      inline def get_server_connection_type : CFuncPtr0[_root_.sn.gnome.gobject.internal.GType] = struct._5
      inline def get_server_connection_type_=(value: CFuncPtr0[_root_.sn.gnome.gobject.internal.GType]): Unit = (!struct.at5 = value)
      inline def get_file_database_type : CFuncPtr0[_root_.sn.gnome.gobject.internal.GType] = struct._6
      inline def get_file_database_type_=(value: CFuncPtr0[_root_.sn.gnome.gobject.internal.GType]): Unit = (!struct.at6 = value)
      inline def get_default_database : CFuncPtr1[Ptr[GTlsBackend], Ptr[GTlsDatabase]] = struct._7
      inline def get_default_database_=(value: CFuncPtr1[Ptr[GTlsBackend], Ptr[GTlsDatabase]]): Unit = (!struct.at7 = value)
      inline def supports_dtls : CFuncPtr1[Ptr[GTlsBackend], _root_.sn.gnome.glib.internal.gboolean] = struct._8
      inline def supports_dtls_=(value: CFuncPtr1[Ptr[GTlsBackend], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at8 = value)
      inline def get_dtls_client_connection_type : CFuncPtr0[_root_.sn.gnome.gobject.internal.GType] = struct._9
      inline def get_dtls_client_connection_type_=(value: CFuncPtr0[_root_.sn.gnome.gobject.internal.GType]): Unit = (!struct.at9 = value)
      inline def get_dtls_server_connection_type : CFuncPtr0[_root_.sn.gnome.gobject.internal.GType] = struct._10
      inline def get_dtls_server_connection_type_=(value: CFuncPtr0[_root_.sn.gnome.gobject.internal.GType]): Unit = (!struct.at10 = value)
    end extension
  
  // Allocates _GTlsBackendInterface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GTlsBackendInterface] = scala.scalanative.unsafe.alloc[_GTlsBackendInterface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, supports_tls : CFuncPtr1[Ptr[GTlsBackend], _root_.sn.gnome.glib.internal.gboolean], get_certificate_type : CFuncPtr0[_root_.sn.gnome.gobject.internal.GType], get_client_connection_type : CFuncPtr0[_root_.sn.gnome.gobject.internal.GType], get_server_connection_type : CFuncPtr0[_root_.sn.gnome.gobject.internal.GType], get_file_database_type : CFuncPtr0[_root_.sn.gnome.gobject.internal.GType], get_default_database : CFuncPtr1[Ptr[GTlsBackend], Ptr[GTlsDatabase]], supports_dtls : CFuncPtr1[Ptr[GTlsBackend], _root_.sn.gnome.glib.internal.gboolean], get_dtls_client_connection_type : CFuncPtr0[_root_.sn.gnome.gobject.internal.GType], get_dtls_server_connection_type : CFuncPtr0[_root_.sn.gnome.gobject.internal.GType])(using Zone): Ptr[_GTlsBackendInterface] =
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