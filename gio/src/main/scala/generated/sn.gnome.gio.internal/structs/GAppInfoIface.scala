package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GAppInfoIface = CArray[CChar, Nat.Digit3[Nat._2, Nat._1, Nat._6]]

object GAppInfoIface:
  given _tag: Tag[GAppInfoIface] = Tag.CArray[CChar, Nat.Digit3[Nat._2, Nat._1, Nat._6]](Tag.Byte, Tag.Digit3[Nat._2, Nat._1, Nat._6](Tag.Nat2, Tag.Nat1, Tag.Nat6))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GAppInfoIface)
      inline def g_iface: _root_.sn.gnome.gobject.internal.GTypeInterface = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]]
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]] = value
      inline def dup: CFuncPtr1[Ptr[GAppInfo], Ptr[GAppInfo]] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GAppInfo], Ptr[GAppInfo]]]]
      inline def dup_=(value: CFuncPtr1[Ptr[GAppInfo], Ptr[GAppInfo]]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GAppInfo], Ptr[GAppInfo]]]] = value
      inline def equal: CFuncPtr2[Ptr[GAppInfo], Ptr[GAppInfo], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GAppInfo], Ptr[GAppInfo], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def equal_=(value: CFuncPtr2[Ptr[GAppInfo], Ptr[GAppInfo], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GAppInfo], Ptr[GAppInfo], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def get_id: CFuncPtr1[Ptr[GAppInfo], CString] = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GAppInfo], CString]]]
      inline def get_id_=(value: CFuncPtr1[Ptr[GAppInfo], CString]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GAppInfo], CString]]] = value
      inline def get_name: CFuncPtr1[Ptr[GAppInfo], CString] = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GAppInfo], CString]]]
      inline def get_name_=(value: CFuncPtr1[Ptr[GAppInfo], CString]): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GAppInfo], CString]]] = value
      inline def get_description: CFuncPtr1[Ptr[GAppInfo], CString] = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GAppInfo], CString]]]
      inline def get_description_=(value: CFuncPtr1[Ptr[GAppInfo], CString]): Unit = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GAppInfo], CString]]] = value
      inline def get_executable: CFuncPtr1[Ptr[GAppInfo], CString] = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GAppInfo], CString]]]
      inline def get_executable_=(value: CFuncPtr1[Ptr[GAppInfo], CString]): Unit = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GAppInfo], CString]]] = value
      inline def get_icon: CFuncPtr1[Ptr[GAppInfo], Ptr[GIcon]] = !struct.at(offsets(7)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GAppInfo], Ptr[GIcon]]]]
      inline def get_icon_=(value: CFuncPtr1[Ptr[GAppInfo], Ptr[GIcon]]): Unit = !struct.at(offsets(7)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GAppInfo], Ptr[GIcon]]]] = value
      inline def launch: CFuncPtr4[Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GList], Ptr[GAppLaunchContext], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(8)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GList], Ptr[GAppLaunchContext], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def launch_=(value: CFuncPtr4[Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GList], Ptr[GAppLaunchContext], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(8)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GList], Ptr[GAppLaunchContext], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def supports_uris: CFuncPtr1[Ptr[GAppInfo], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(9)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GAppInfo], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def supports_uris_=(value: CFuncPtr1[Ptr[GAppInfo], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(9)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GAppInfo], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def supports_files: CFuncPtr1[Ptr[GAppInfo], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(10)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GAppInfo], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def supports_files_=(value: CFuncPtr1[Ptr[GAppInfo], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(10)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GAppInfo], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def launch_uris: CFuncPtr4[Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GList], Ptr[GAppLaunchContext], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(11)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GList], Ptr[GAppLaunchContext], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def launch_uris_=(value: CFuncPtr4[Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GList], Ptr[GAppLaunchContext], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(11)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GList], Ptr[GAppLaunchContext], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def should_show: CFuncPtr1[Ptr[GAppInfo], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(12)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GAppInfo], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def should_show_=(value: CFuncPtr1[Ptr[GAppInfo], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(12)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GAppInfo], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def set_as_default_for_type: CFuncPtr3[Ptr[GAppInfo], CString, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(13)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GAppInfo], CString, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def set_as_default_for_type_=(value: CFuncPtr3[Ptr[GAppInfo], CString, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(13)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GAppInfo], CString, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def set_as_default_for_extension: CFuncPtr3[Ptr[GAppInfo], CString, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(14)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GAppInfo], CString, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def set_as_default_for_extension_=(value: CFuncPtr3[Ptr[GAppInfo], CString, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(14)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GAppInfo], CString, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def add_supports_type: CFuncPtr3[Ptr[GAppInfo], CString, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(15)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GAppInfo], CString, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def add_supports_type_=(value: CFuncPtr3[Ptr[GAppInfo], CString, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(15)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GAppInfo], CString, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def can_remove_supports_type: CFuncPtr1[Ptr[GAppInfo], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(16)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GAppInfo], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def can_remove_supports_type_=(value: CFuncPtr1[Ptr[GAppInfo], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(16)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GAppInfo], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def remove_supports_type: CFuncPtr3[Ptr[GAppInfo], CString, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(17)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GAppInfo], CString, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def remove_supports_type_=(value: CFuncPtr3[Ptr[GAppInfo], CString, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(17)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GAppInfo], CString, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def can_delete: CFuncPtr1[Ptr[GAppInfo], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(18)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GAppInfo], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def can_delete_=(value: CFuncPtr1[Ptr[GAppInfo], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(18)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GAppInfo], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def do_delete: CFuncPtr1[Ptr[GAppInfo], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(19)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GAppInfo], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def do_delete_=(value: CFuncPtr1[Ptr[GAppInfo], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(19)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GAppInfo], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def get_commandline: CFuncPtr1[Ptr[GAppInfo], CString] = !struct.at(offsets(20)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GAppInfo], CString]]]
      inline def get_commandline_=(value: CFuncPtr1[Ptr[GAppInfo], CString]): Unit = !struct.at(offsets(20)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GAppInfo], CString]]] = value
      inline def get_display_name: CFuncPtr1[Ptr[GAppInfo], CString] = !struct.at(offsets(21)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GAppInfo], CString]]]
      inline def get_display_name_=(value: CFuncPtr1[Ptr[GAppInfo], CString]): Unit = !struct.at(offsets(21)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GAppInfo], CString]]] = value
      inline def set_as_last_used_for_type: CFuncPtr3[Ptr[GAppInfo], CString, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(22)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GAppInfo], CString, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def set_as_last_used_for_type_=(value: CFuncPtr3[Ptr[GAppInfo], CString, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(22)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GAppInfo], CString, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def get_supported_types: CFuncPtr1[Ptr[GAppInfo], Ptr[CString]] = !struct.at(offsets(23)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GAppInfo], Ptr[CString]]]]
      inline def get_supported_types_=(value: CFuncPtr1[Ptr[GAppInfo], Ptr[CString]]): Unit = !struct.at(offsets(23)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GAppInfo], Ptr[CString]]]] = value
      inline def launch_uris_async: CFuncPtr6[Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GList], Ptr[GAppLaunchContext], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = !struct.at(offsets(24)).asInstanceOf[Ptr[CFuncPtr6[Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GList], Ptr[GAppLaunchContext], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]]
      inline def launch_uris_async_=(value: CFuncPtr6[Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GList], Ptr[GAppLaunchContext], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = !struct.at(offsets(24)).asInstanceOf[Ptr[CFuncPtr6[Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GList], Ptr[GAppLaunchContext], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]] = value
      inline def launch_uris_finish: CFuncPtr3[Ptr[GAppInfo], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(25)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GAppInfo], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def launch_uris_finish_=(value: CFuncPtr3[Ptr[GAppInfo], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(25)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GAppInfo], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]] = value
    end extension
  
  // Allocates GAppInfoIface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GAppInfoIface] = scala.scalanative.unsafe.alloc[GAppInfoIface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, dup : CFuncPtr1[Ptr[GAppInfo], Ptr[GAppInfo]], equal : CFuncPtr2[Ptr[GAppInfo], Ptr[GAppInfo], _root_.sn.gnome.glib.internal.gboolean], get_id : CFuncPtr1[Ptr[GAppInfo], CString], get_name : CFuncPtr1[Ptr[GAppInfo], CString], get_description : CFuncPtr1[Ptr[GAppInfo], CString], get_executable : CFuncPtr1[Ptr[GAppInfo], CString], get_icon : CFuncPtr1[Ptr[GAppInfo], Ptr[GIcon]], launch : CFuncPtr4[Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GList], Ptr[GAppLaunchContext], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], supports_uris : CFuncPtr1[Ptr[GAppInfo], _root_.sn.gnome.glib.internal.gboolean], supports_files : CFuncPtr1[Ptr[GAppInfo], _root_.sn.gnome.glib.internal.gboolean], launch_uris : CFuncPtr4[Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GList], Ptr[GAppLaunchContext], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], should_show : CFuncPtr1[Ptr[GAppInfo], _root_.sn.gnome.glib.internal.gboolean], set_as_default_for_type : CFuncPtr3[Ptr[GAppInfo], CString, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], set_as_default_for_extension : CFuncPtr3[Ptr[GAppInfo], CString, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], add_supports_type : CFuncPtr3[Ptr[GAppInfo], CString, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], can_remove_supports_type : CFuncPtr1[Ptr[GAppInfo], _root_.sn.gnome.glib.internal.gboolean], remove_supports_type : CFuncPtr3[Ptr[GAppInfo], CString, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], can_delete : CFuncPtr1[Ptr[GAppInfo], _root_.sn.gnome.glib.internal.gboolean], do_delete : CFuncPtr1[Ptr[GAppInfo], _root_.sn.gnome.glib.internal.gboolean], get_commandline : CFuncPtr1[Ptr[GAppInfo], CString], get_display_name : CFuncPtr1[Ptr[GAppInfo], CString], set_as_last_used_for_type : CFuncPtr3[Ptr[GAppInfo], CString, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], get_supported_types : CFuncPtr1[Ptr[GAppInfo], Ptr[CString]], launch_uris_async : CFuncPtr6[Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GList], Ptr[GAppLaunchContext], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], launch_uris_finish : CFuncPtr3[Ptr[GAppInfo], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean])(using Zone): Ptr[GAppInfoIface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).dup = dup
    (!____ptr).equal = equal
    (!____ptr).get_id = get_id
    (!____ptr).get_name = get_name
    (!____ptr).get_description = get_description
    (!____ptr).get_executable = get_executable
    (!____ptr).get_icon = get_icon
    (!____ptr).launch = launch
    (!____ptr).supports_uris = supports_uris
    (!____ptr).supports_files = supports_files
    (!____ptr).launch_uris = launch_uris
    (!____ptr).should_show = should_show
    (!____ptr).set_as_default_for_type = set_as_default_for_type
    (!____ptr).set_as_default_for_extension = set_as_default_for_extension
    (!____ptr).add_supports_type = add_supports_type
    (!____ptr).can_remove_supports_type = can_remove_supports_type
    (!____ptr).remove_supports_type = remove_supports_type
    (!____ptr).can_delete = can_delete
    (!____ptr).do_delete = do_delete
    (!____ptr).get_commandline = get_commandline
    (!____ptr).get_display_name = get_display_name
    (!____ptr).set_as_last_used_for_type = set_as_last_used_for_type
    (!____ptr).get_supported_types = get_supported_types
    (!____ptr).launch_uris_async = launch_uris_async
    (!____ptr).launch_uris_finish = launch_uris_finish
    ____ptr
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](26)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt, alignmentof[CFuncPtr1[Ptr[GAppInfo], Ptr[GAppInfo]]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr1[Ptr[GAppInfo], Ptr[GAppInfo]]].toInt, alignmentof[CFuncPtr2[Ptr[GAppInfo], Ptr[GAppInfo], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(3) = align(res(2) + sizeof[CFuncPtr2[Ptr[GAppInfo], Ptr[GAppInfo], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr1[Ptr[GAppInfo], CString]].toInt)
    res(4) = align(res(3) + sizeof[CFuncPtr1[Ptr[GAppInfo], CString]].toInt, alignmentof[CFuncPtr1[Ptr[GAppInfo], CString]].toInt)
    res(5) = align(res(4) + sizeof[CFuncPtr1[Ptr[GAppInfo], CString]].toInt, alignmentof[CFuncPtr1[Ptr[GAppInfo], CString]].toInt)
    res(6) = align(res(5) + sizeof[CFuncPtr1[Ptr[GAppInfo], CString]].toInt, alignmentof[CFuncPtr1[Ptr[GAppInfo], CString]].toInt)
    res(7) = align(res(6) + sizeof[CFuncPtr1[Ptr[GAppInfo], CString]].toInt, alignmentof[CFuncPtr1[Ptr[GAppInfo], Ptr[GIcon]]].toInt)
    res(8) = align(res(7) + sizeof[CFuncPtr1[Ptr[GAppInfo], Ptr[GIcon]]].toInt, alignmentof[CFuncPtr4[Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GList], Ptr[GAppLaunchContext], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(9) = align(res(8) + sizeof[CFuncPtr4[Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GList], Ptr[GAppLaunchContext], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr1[Ptr[GAppInfo], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(10) = align(res(9) + sizeof[CFuncPtr1[Ptr[GAppInfo], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr1[Ptr[GAppInfo], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(11) = align(res(10) + sizeof[CFuncPtr1[Ptr[GAppInfo], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr4[Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GList], Ptr[GAppLaunchContext], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(12) = align(res(11) + sizeof[CFuncPtr4[Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GList], Ptr[GAppLaunchContext], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr1[Ptr[GAppInfo], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(13) = align(res(12) + sizeof[CFuncPtr1[Ptr[GAppInfo], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr3[Ptr[GAppInfo], CString, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(14) = align(res(13) + sizeof[CFuncPtr3[Ptr[GAppInfo], CString, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr3[Ptr[GAppInfo], CString, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(15) = align(res(14) + sizeof[CFuncPtr3[Ptr[GAppInfo], CString, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr3[Ptr[GAppInfo], CString, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(16) = align(res(15) + sizeof[CFuncPtr3[Ptr[GAppInfo], CString, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr1[Ptr[GAppInfo], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(17) = align(res(16) + sizeof[CFuncPtr1[Ptr[GAppInfo], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr3[Ptr[GAppInfo], CString, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(18) = align(res(17) + sizeof[CFuncPtr3[Ptr[GAppInfo], CString, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr1[Ptr[GAppInfo], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(19) = align(res(18) + sizeof[CFuncPtr1[Ptr[GAppInfo], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr1[Ptr[GAppInfo], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(20) = align(res(19) + sizeof[CFuncPtr1[Ptr[GAppInfo], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr1[Ptr[GAppInfo], CString]].toInt)
    res(21) = align(res(20) + sizeof[CFuncPtr1[Ptr[GAppInfo], CString]].toInt, alignmentof[CFuncPtr1[Ptr[GAppInfo], CString]].toInt)
    res(22) = align(res(21) + sizeof[CFuncPtr1[Ptr[GAppInfo], CString]].toInt, alignmentof[CFuncPtr3[Ptr[GAppInfo], CString, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(23) = align(res(22) + sizeof[CFuncPtr3[Ptr[GAppInfo], CString, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr1[Ptr[GAppInfo], Ptr[CString]]].toInt)
    res(24) = align(res(23) + sizeof[CFuncPtr1[Ptr[GAppInfo], Ptr[CString]]].toInt, alignmentof[CFuncPtr6[Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GList], Ptr[GAppLaunchContext], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt)
    res(25) = align(res(24) + sizeof[CFuncPtr6[Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GList], Ptr[GAppLaunchContext], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt, alignmentof[CFuncPtr3[Ptr[GAppInfo], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res
  end offsets