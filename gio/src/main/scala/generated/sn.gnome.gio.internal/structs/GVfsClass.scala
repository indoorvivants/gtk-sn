package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GVfsClass = CArray[CChar, Nat.Digit3[Nat._2, Nat._7, Nat._2]]

object GVfsClass:
  given _tag: Tag[GVfsClass] = Tag.CArray[CChar, Nat.Digit3[Nat._2, Nat._7, Nat._2]](Tag.Byte, Tag.Digit3[Nat._2, Nat._7, Nat._2](Tag.Nat2, Tag.Nat7, Tag.Nat2))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GVfsClass)
      inline def parent_class: _root_.sn.gnome.gobject.internal.GObjectClass = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]]
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]] = value
      inline def is_active: CFuncPtr1[Ptr[GVfs], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GVfs], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def is_active_=(value: CFuncPtr1[Ptr[GVfs], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GVfs], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def get_file_for_path: CFuncPtr2[Ptr[GVfs], CString, Ptr[GFile]] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GVfs], CString, Ptr[GFile]]]]
      inline def get_file_for_path_=(value: CFuncPtr2[Ptr[GVfs], CString, Ptr[GFile]]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GVfs], CString, Ptr[GFile]]]] = value
      inline def get_file_for_uri: CFuncPtr2[Ptr[GVfs], CString, Ptr[GFile]] = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GVfs], CString, Ptr[GFile]]]]
      inline def get_file_for_uri_=(value: CFuncPtr2[Ptr[GVfs], CString, Ptr[GFile]]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GVfs], CString, Ptr[GFile]]]] = value
      inline def get_supported_uri_schemes: CFuncPtr1[Ptr[GVfs], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]] = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GVfs], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]]]
      inline def get_supported_uri_schemes_=(value: CFuncPtr1[Ptr[GVfs], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GVfs], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]]] = value
      inline def parse_name: CFuncPtr2[Ptr[GVfs], CString, Ptr[GFile]] = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GVfs], CString, Ptr[GFile]]]]
      inline def parse_name_=(value: CFuncPtr2[Ptr[GVfs], CString, Ptr[GFile]]): Unit = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GVfs], CString, Ptr[GFile]]]] = value
      inline def local_file_add_info: CFuncPtr8[Ptr[GVfs], CString, _root_.sn.gnome.glib.internal.guint64, Ptr[GFileAttributeMatcher], Ptr[GFileInfo], Ptr[GCancellable], Ptr[_root_.sn.gnome.glib.internal.gpointer], Ptr[_root_.sn.gnome.glib.internal.GDestroyNotify], Unit] = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr8[Ptr[GVfs], CString, _root_.sn.gnome.glib.internal.guint64, Ptr[GFileAttributeMatcher], Ptr[GFileInfo], Ptr[GCancellable], Ptr[_root_.sn.gnome.glib.internal.gpointer], Ptr[_root_.sn.gnome.glib.internal.GDestroyNotify], Unit]]]
      inline def local_file_add_info_=(value: CFuncPtr8[Ptr[GVfs], CString, _root_.sn.gnome.glib.internal.guint64, Ptr[GFileAttributeMatcher], Ptr[GFileInfo], Ptr[GCancellable], Ptr[_root_.sn.gnome.glib.internal.gpointer], Ptr[_root_.sn.gnome.glib.internal.GDestroyNotify], Unit]): Unit = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr8[Ptr[GVfs], CString, _root_.sn.gnome.glib.internal.guint64, Ptr[GFileAttributeMatcher], Ptr[GFileInfo], Ptr[GCancellable], Ptr[_root_.sn.gnome.glib.internal.gpointer], Ptr[_root_.sn.gnome.glib.internal.GDestroyNotify], Unit]]] = value
      inline def add_writable_namespaces: CFuncPtr2[Ptr[GVfs], Ptr[GFileAttributeInfoList], Unit] = !struct.at(offsets(7)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GVfs], Ptr[GFileAttributeInfoList], Unit]]]
      inline def add_writable_namespaces_=(value: CFuncPtr2[Ptr[GVfs], Ptr[GFileAttributeInfoList], Unit]): Unit = !struct.at(offsets(7)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GVfs], Ptr[GFileAttributeInfoList], Unit]]] = value
      inline def local_file_set_attributes: CFuncPtr6[Ptr[GVfs], CString, Ptr[GFileInfo], GFileQueryInfoFlags, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(8)).asInstanceOf[Ptr[CFuncPtr6[Ptr[GVfs], CString, Ptr[GFileInfo], GFileQueryInfoFlags, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def local_file_set_attributes_=(value: CFuncPtr6[Ptr[GVfs], CString, Ptr[GFileInfo], GFileQueryInfoFlags, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(8)).asInstanceOf[Ptr[CFuncPtr6[Ptr[GVfs], CString, Ptr[GFileInfo], GFileQueryInfoFlags, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def local_file_removed: CFuncPtr2[Ptr[GVfs], CString, Unit] = !struct.at(offsets(9)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GVfs], CString, Unit]]]
      inline def local_file_removed_=(value: CFuncPtr2[Ptr[GVfs], CString, Unit]): Unit = !struct.at(offsets(9)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GVfs], CString, Unit]]] = value
      inline def local_file_moved: CFuncPtr3[Ptr[GVfs], CString, CString, Unit] = !struct.at(offsets(10)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GVfs], CString, CString, Unit]]]
      inline def local_file_moved_=(value: CFuncPtr3[Ptr[GVfs], CString, CString, Unit]): Unit = !struct.at(offsets(10)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GVfs], CString, CString, Unit]]] = value
      inline def deserialize_icon: CFuncPtr2[Ptr[GVfs], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[GIcon]] = !struct.at(offsets(11)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GVfs], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[GIcon]]]]
      inline def deserialize_icon_=(value: CFuncPtr2[Ptr[GVfs], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[GIcon]]): Unit = !struct.at(offsets(11)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GVfs], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[GIcon]]]] = value
      inline def _g_reserved1: CFuncPtr0[Unit] = !struct.at(offsets(12)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved1_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(12)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved2: CFuncPtr0[Unit] = !struct.at(offsets(13)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(13)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved3: CFuncPtr0[Unit] = !struct.at(offsets(14)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(14)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved4: CFuncPtr0[Unit] = !struct.at(offsets(15)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(15)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved5: CFuncPtr0[Unit] = !struct.at(offsets(16)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved5_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(16)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved6: CFuncPtr0[Unit] = !struct.at(offsets(17)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved6_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(17)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
    end extension
  
  // Allocates GVfsClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GVfsClass] = scala.scalanative.unsafe.alloc[GVfsClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, is_active : CFuncPtr1[Ptr[GVfs], _root_.sn.gnome.glib.internal.gboolean], get_file_for_path : CFuncPtr2[Ptr[GVfs], CString, Ptr[GFile]], get_file_for_uri : CFuncPtr2[Ptr[GVfs], CString, Ptr[GFile]], get_supported_uri_schemes : CFuncPtr1[Ptr[GVfs], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]], parse_name : CFuncPtr2[Ptr[GVfs], CString, Ptr[GFile]], local_file_add_info : CFuncPtr8[Ptr[GVfs], CString, _root_.sn.gnome.glib.internal.guint64, Ptr[GFileAttributeMatcher], Ptr[GFileInfo], Ptr[GCancellable], Ptr[_root_.sn.gnome.glib.internal.gpointer], Ptr[_root_.sn.gnome.glib.internal.GDestroyNotify], Unit], add_writable_namespaces : CFuncPtr2[Ptr[GVfs], Ptr[GFileAttributeInfoList], Unit], local_file_set_attributes : CFuncPtr6[Ptr[GVfs], CString, Ptr[GFileInfo], GFileQueryInfoFlags, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], local_file_removed : CFuncPtr2[Ptr[GVfs], CString, Unit], local_file_moved : CFuncPtr3[Ptr[GVfs], CString, CString, Unit], deserialize_icon : CFuncPtr2[Ptr[GVfs], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[GIcon]], _g_reserved1 : CFuncPtr0[Unit], _g_reserved2 : CFuncPtr0[Unit], _g_reserved3 : CFuncPtr0[Unit], _g_reserved4 : CFuncPtr0[Unit], _g_reserved5 : CFuncPtr0[Unit], _g_reserved6 : CFuncPtr0[Unit])(using Zone): Ptr[GVfsClass] =
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
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](18)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GObjectClass].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GObjectClass].toInt, alignmentof[CFuncPtr1[Ptr[GVfs], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr1[Ptr[GVfs], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr2[Ptr[GVfs], CString, Ptr[GFile]]].toInt)
    res(3) = align(res(2) + sizeof[CFuncPtr2[Ptr[GVfs], CString, Ptr[GFile]]].toInt, alignmentof[CFuncPtr2[Ptr[GVfs], CString, Ptr[GFile]]].toInt)
    res(4) = align(res(3) + sizeof[CFuncPtr2[Ptr[GVfs], CString, Ptr[GFile]]].toInt, alignmentof[CFuncPtr1[Ptr[GVfs], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]].toInt)
    res(5) = align(res(4) + sizeof[CFuncPtr1[Ptr[GVfs], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]].toInt, alignmentof[CFuncPtr2[Ptr[GVfs], CString, Ptr[GFile]]].toInt)
    res(6) = align(res(5) + sizeof[CFuncPtr2[Ptr[GVfs], CString, Ptr[GFile]]].toInt, alignmentof[CFuncPtr8[Ptr[GVfs], CString, _root_.sn.gnome.glib.internal.guint64, Ptr[GFileAttributeMatcher], Ptr[GFileInfo], Ptr[GCancellable], Ptr[_root_.sn.gnome.glib.internal.gpointer], Ptr[_root_.sn.gnome.glib.internal.GDestroyNotify], Unit]].toInt)
    res(7) = align(res(6) + sizeof[CFuncPtr8[Ptr[GVfs], CString, _root_.sn.gnome.glib.internal.guint64, Ptr[GFileAttributeMatcher], Ptr[GFileInfo], Ptr[GCancellable], Ptr[_root_.sn.gnome.glib.internal.gpointer], Ptr[_root_.sn.gnome.glib.internal.GDestroyNotify], Unit]].toInt, alignmentof[CFuncPtr2[Ptr[GVfs], Ptr[GFileAttributeInfoList], Unit]].toInt)
    res(8) = align(res(7) + sizeof[CFuncPtr2[Ptr[GVfs], Ptr[GFileAttributeInfoList], Unit]].toInt, alignmentof[CFuncPtr6[Ptr[GVfs], CString, Ptr[GFileInfo], GFileQueryInfoFlags, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(9) = align(res(8) + sizeof[CFuncPtr6[Ptr[GVfs], CString, Ptr[GFileInfo], GFileQueryInfoFlags, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr2[Ptr[GVfs], CString, Unit]].toInt)
    res(10) = align(res(9) + sizeof[CFuncPtr2[Ptr[GVfs], CString, Unit]].toInt, alignmentof[CFuncPtr3[Ptr[GVfs], CString, CString, Unit]].toInt)
    res(11) = align(res(10) + sizeof[CFuncPtr3[Ptr[GVfs], CString, CString, Unit]].toInt, alignmentof[CFuncPtr2[Ptr[GVfs], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[GIcon]]].toInt)
    res(12) = align(res(11) + sizeof[CFuncPtr2[Ptr[GVfs], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[GIcon]]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(13) = align(res(12) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(14) = align(res(13) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(15) = align(res(14) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(16) = align(res(15) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(17) = align(res(16) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res
  end offsets