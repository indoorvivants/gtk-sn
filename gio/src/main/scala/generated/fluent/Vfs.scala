package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.File
import sn.gnome.gio.internal.GVfs
import sn.gnome.gio.internal.GVfsFileLookupFunc
import sn.gnome.glib.internal.GDestroyNotify
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object

class Vfs(raw: Ptr[GVfs]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getFileForPath(path: String | CString)(using Zone): File =
    new File.Abstract(
      g_vfs_get_file_for_path(
        this.raw.asInstanceOf,
        __sn_extract_string(path)
      ).asInstanceOf
    )

  def getFileForUri(uri: String | CString)(using Zone): File =
    new File.Abstract(
      g_vfs_get_file_for_uri(
        this.raw.asInstanceOf,
        __sn_extract_string(uri)
      ).asInstanceOf
    )

  def isActive(): Boolean = g_vfs_is_active(this.raw.asInstanceOf).value.!=(0)

  def parseName(parse_name: String | CString)(using Zone): File =
    new File.Abstract(
      g_vfs_parse_name(
        this.raw.asInstanceOf,
        __sn_extract_string(parse_name)
      ).asInstanceOf
    )

  def registerUriScheme(
      scheme: String | CString,
      uri_func: GVfsFileLookupFunc,
      uri_data: Ptr[Byte],
      uri_destroy: GDestroyNotify,
      parse_name_func: GVfsFileLookupFunc,
      parse_name_data: Ptr[Byte],
      parse_name_destroy: GDestroyNotify
  )(using Zone): Boolean = g_vfs_register_uri_scheme(
    this.raw.asInstanceOf,
    __sn_extract_string(scheme),
    uri_func,
    gpointer(uri_data),
    uri_destroy,
    parse_name_func,
    gpointer(parse_name_data),
    parse_name_destroy
  ).value.!=(0)

  def unregisterUriScheme(scheme: String | CString)(using Zone): Boolean =
    g_vfs_unregister_uri_scheme(
      this.raw.asInstanceOf,
      __sn_extract_string(scheme)
    ).value.!=(0)

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Vfs
