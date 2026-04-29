package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GVfsClass = CStruct18[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr1[Ptr[GVfs], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr2[Ptr[GVfs], CString, Ptr[GFile]], CFuncPtr2[Ptr[GVfs], CString, Ptr[GFile]], CFuncPtr1[Ptr[GVfs], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]], CFuncPtr2[Ptr[GVfs], CString, Ptr[GFile]], CFuncPtr8[Ptr[GVfs], CString, _root_.sn.gnome.glib.internal.guint64, Ptr[GFileAttributeMatcher], Ptr[GFileInfo], Ptr[GCancellable], Ptr[_root_.sn.gnome.glib.internal.gpointer], Ptr[_root_.sn.gnome.glib.internal.GDestroyNotify], Unit], CFuncPtr2[Ptr[GVfs], Ptr[GFileAttributeInfoList], Unit], CFuncPtr6[Ptr[GVfs], CString, Ptr[GFileInfo], GFileQueryInfoFlags, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr2[Ptr[GVfs], CString, Unit], CFuncPtr3[Ptr[GVfs], CString, CString, Unit], CFuncPtr2[Ptr[GVfs], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[GIcon]], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]

object _GVfsClass:
  given _tag: Tag[_GVfsClass] = Tag.materializeCStruct18Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr1[Ptr[GVfs], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr2[Ptr[GVfs], CString, Ptr[GFile]], CFuncPtr2[Ptr[GVfs], CString, Ptr[GFile]], CFuncPtr1[Ptr[GVfs], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]], CFuncPtr2[Ptr[GVfs], CString, Ptr[GFile]], CFuncPtr8[Ptr[GVfs], CString, _root_.sn.gnome.glib.internal.guint64, Ptr[GFileAttributeMatcher], Ptr[GFileInfo], Ptr[GCancellable], Ptr[_root_.sn.gnome.glib.internal.gpointer], Ptr[_root_.sn.gnome.glib.internal.GDestroyNotify], Unit], CFuncPtr2[Ptr[GVfs], Ptr[GFileAttributeInfoList], Unit], CFuncPtr6[Ptr[GVfs], CString, Ptr[GFileInfo], GFileQueryInfoFlags, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr2[Ptr[GVfs], CString, Unit], CFuncPtr3[Ptr[GVfs], CString, CString, Unit], CFuncPtr2[Ptr[GVfs], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[GIcon]], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GVfsClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
      inline def is_active : CFuncPtr1[Ptr[GVfs], _root_.sn.gnome.glib.internal.gboolean] = struct._2
      inline def is_active_=(value: CFuncPtr1[Ptr[GVfs], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at2 = value)
      inline def get_file_for_path : CFuncPtr2[Ptr[GVfs], CString, Ptr[GFile]] = struct._3
      inline def get_file_for_path_=(value: CFuncPtr2[Ptr[GVfs], CString, Ptr[GFile]]): Unit = (!struct.at3 = value)
      inline def get_file_for_uri : CFuncPtr2[Ptr[GVfs], CString, Ptr[GFile]] = struct._4
      inline def get_file_for_uri_=(value: CFuncPtr2[Ptr[GVfs], CString, Ptr[GFile]]): Unit = (!struct.at4 = value)
      inline def get_supported_uri_schemes : CFuncPtr1[Ptr[GVfs], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]] = struct._5
      inline def get_supported_uri_schemes_=(value: CFuncPtr1[Ptr[GVfs], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]): Unit = (!struct.at5 = value)
      inline def parse_name : CFuncPtr2[Ptr[GVfs], CString, Ptr[GFile]] = struct._6
      inline def parse_name_=(value: CFuncPtr2[Ptr[GVfs], CString, Ptr[GFile]]): Unit = (!struct.at6 = value)
      inline def local_file_add_info : CFuncPtr8[Ptr[GVfs], CString, _root_.sn.gnome.glib.internal.guint64, Ptr[GFileAttributeMatcher], Ptr[GFileInfo], Ptr[GCancellable], Ptr[_root_.sn.gnome.glib.internal.gpointer], Ptr[_root_.sn.gnome.glib.internal.GDestroyNotify], Unit] = struct._7
      inline def local_file_add_info_=(value: CFuncPtr8[Ptr[GVfs], CString, _root_.sn.gnome.glib.internal.guint64, Ptr[GFileAttributeMatcher], Ptr[GFileInfo], Ptr[GCancellable], Ptr[_root_.sn.gnome.glib.internal.gpointer], Ptr[_root_.sn.gnome.glib.internal.GDestroyNotify], Unit]): Unit = (!struct.at7 = value)
      inline def add_writable_namespaces : CFuncPtr2[Ptr[GVfs], Ptr[GFileAttributeInfoList], Unit] = struct._8
      inline def add_writable_namespaces_=(value: CFuncPtr2[Ptr[GVfs], Ptr[GFileAttributeInfoList], Unit]): Unit = (!struct.at8 = value)
      inline def local_file_set_attributes : CFuncPtr6[Ptr[GVfs], CString, Ptr[GFileInfo], GFileQueryInfoFlags, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = struct._9
      inline def local_file_set_attributes_=(value: CFuncPtr6[Ptr[GVfs], CString, Ptr[GFileInfo], GFileQueryInfoFlags, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at9 = value)
      inline def local_file_removed : CFuncPtr2[Ptr[GVfs], CString, Unit] = struct._10
      inline def local_file_removed_=(value: CFuncPtr2[Ptr[GVfs], CString, Unit]): Unit = (!struct.at10 = value)
      inline def local_file_moved : CFuncPtr3[Ptr[GVfs], CString, CString, Unit] = struct._11
      inline def local_file_moved_=(value: CFuncPtr3[Ptr[GVfs], CString, CString, Unit]): Unit = (!struct.at11 = value)
      inline def deserialize_icon : CFuncPtr2[Ptr[GVfs], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[GIcon]] = struct._12
      inline def deserialize_icon_=(value: CFuncPtr2[Ptr[GVfs], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[GIcon]]): Unit = (!struct.at12 = value)
      inline def _g_reserved1 : CFuncPtr0[Unit] = struct._13
      inline def _g_reserved1_=(value: CFuncPtr0[Unit]): Unit = (!struct.at13 = value)
      inline def _g_reserved2 : CFuncPtr0[Unit] = struct._14
      inline def _g_reserved2_=(value: CFuncPtr0[Unit]): Unit = (!struct.at14 = value)
      inline def _g_reserved3 : CFuncPtr0[Unit] = struct._15
      inline def _g_reserved3_=(value: CFuncPtr0[Unit]): Unit = (!struct.at15 = value)
      inline def _g_reserved4 : CFuncPtr0[Unit] = struct._16
      inline def _g_reserved4_=(value: CFuncPtr0[Unit]): Unit = (!struct.at16 = value)
      inline def _g_reserved5 : CFuncPtr0[Unit] = struct._17
      inline def _g_reserved5_=(value: CFuncPtr0[Unit]): Unit = (!struct.at17 = value)
      inline def _g_reserved6 : CFuncPtr0[Unit] = struct._18
      inline def _g_reserved6_=(value: CFuncPtr0[Unit]): Unit = (!struct.at18 = value)
    end extension
  
  // Allocates _GVfsClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GVfsClass] = scala.scalanative.unsafe.alloc[_GVfsClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, is_active : CFuncPtr1[Ptr[GVfs], _root_.sn.gnome.glib.internal.gboolean], get_file_for_path : CFuncPtr2[Ptr[GVfs], CString, Ptr[GFile]], get_file_for_uri : CFuncPtr2[Ptr[GVfs], CString, Ptr[GFile]], get_supported_uri_schemes : CFuncPtr1[Ptr[GVfs], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]], parse_name : CFuncPtr2[Ptr[GVfs], CString, Ptr[GFile]], local_file_add_info : CFuncPtr8[Ptr[GVfs], CString, _root_.sn.gnome.glib.internal.guint64, Ptr[GFileAttributeMatcher], Ptr[GFileInfo], Ptr[GCancellable], Ptr[_root_.sn.gnome.glib.internal.gpointer], Ptr[_root_.sn.gnome.glib.internal.GDestroyNotify], Unit], add_writable_namespaces : CFuncPtr2[Ptr[GVfs], Ptr[GFileAttributeInfoList], Unit], local_file_set_attributes : CFuncPtr6[Ptr[GVfs], CString, Ptr[GFileInfo], GFileQueryInfoFlags, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], local_file_removed : CFuncPtr2[Ptr[GVfs], CString, Unit], local_file_moved : CFuncPtr3[Ptr[GVfs], CString, CString, Unit], deserialize_icon : CFuncPtr2[Ptr[GVfs], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[GIcon]], _g_reserved1 : CFuncPtr0[Unit], _g_reserved2 : CFuncPtr0[Unit], _g_reserved3 : CFuncPtr0[Unit], _g_reserved4 : CFuncPtr0[Unit], _g_reserved5 : CFuncPtr0[Unit], _g_reserved6 : CFuncPtr0[Unit])(using Zone): Ptr[_GVfsClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).is_active = is_active
    (!____ptr).get_file_for_path = get_file_for_path
    (!____ptr).get_file_for_uri = get_file_for_uri
    (!____ptr).get_supported_uri_schemes = get_supported_uri_schemes
    (!____ptr).parse_name = parse_name
    (!____ptr).local_file_add_info = local_file_add_info
    (!____ptr).add_writable_namespaces = add_writable_namespaces
    (!____ptr).local_file_set_attributes = local_file_set_attributes
    (!____ptr).local_file_removed = local_file_removed
    (!____ptr).local_file_moved = local_file_moved
    (!____ptr).deserialize_icon = deserialize_icon
    (!____ptr)._g_reserved1 = _g_reserved1
    (!____ptr)._g_reserved2 = _g_reserved2
    (!____ptr)._g_reserved3 = _g_reserved3
    (!____ptr)._g_reserved4 = _g_reserved4
    (!____ptr)._g_reserved5 = _g_reserved5
    (!____ptr)._g_reserved6 = _g_reserved6
    ____ptr