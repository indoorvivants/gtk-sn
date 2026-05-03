package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.File
import sn.gnome.gio.fluent.Vfs
import sn.gnome.gio.internal.GVfs
import sn.gnome.gio.internal.GVfsFileLookupFunc
import sn.gnome.glib.internal.GDestroyNotify
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Entry point for using GIO functionality.
  */
class Vfs(raw: Ptr[GVfs]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets a #GFile for @path.
    */
  def getFileForPath(
      path: String | CString /* Some(CString) */
  )(using Zone): File /* None */ = new File.Abstract(
    g_vfs_get_file_for_path(
      this.raw.asInstanceOf[Ptr[GVfs]],
      __sn_extract_string(path)
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets a #GFile for @uri.
    *
    * This operation never fails, but the returned object might not support any
    * I/O operation if the URI is malformed or if the URI scheme is not
    * supported.
    */
  def getFileForUri(
      uri: String | CString /* Some(CString) */
  )(using Zone): File /* None */ = new File.Abstract(
    g_vfs_get_file_for_uri(
      this.raw.asInstanceOf[Ptr[GVfs]],
      __sn_extract_string(uri)
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks if the VFS is active.
    */
  def isActive(): Boolean /* None */ =
    g_vfs_is_active(this.raw.asInstanceOf[Ptr[GVfs]]).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This operation never fails, but the returned object might not support any
    * I/O operations if the @parse_name cannot be parsed by the #GVfs module.
    */
  def parseName(
      parse_name: String | CString /* Some(CString) */
  )(using Zone): File /* None */ = new File.Abstract(
    g_vfs_parse_name(
      this.raw.asInstanceOf[Ptr[GVfs]],
      __sn_extract_string(parse_name)
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Registers @uri_func and @parse_name_func as the #GFile URI and parse name
    * lookup functions for URIs with a scheme matching @scheme. Note that @scheme
    * is registered only within the running application, as opposed to
    * desktop-wide as it happens with GVfs backends.
    *
    * When a #GFile is requested with an URI containing @scheme (e.g. through
    * g_file_new_for_uri()), @uri_func will be called to allow a custom
    * constructor. The implementation of @uri_func should not be blocking, and
    * must not call g_vfs_register_uri_scheme() or
    * g_vfs_unregister_uri_scheme().
    *
    * When g_file_parse_name() is called with a parse name obtained from such
    * file,
    * @parse_name_func
    *   will be called to allow the #GFile to be created again. In that case,
    *   it's responsibility of @parse_name_func to make sure the parse name
    *   matches what the custom #GFile implementation returned when
    *   g_file_get_parse_name() was previously called. The implementation of
    * @parse_name_func
    *   should not be blocking, and must not call g_vfs_register_uri_scheme() or
    *   g_vfs_unregister_uri_scheme().
    *
    * It's an error to call this function twice with the same scheme. To
    * unregister a custom URI scheme, use g_vfs_unregister_uri_scheme().
    */
  def registerUriScheme(
      scheme: String | CString /* Some(CString) */,
      uri_func: Option[GVfsFileLookupFunc /* Some(GVfsFileLookupFunc) */ ],
      uri_data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ],
      uri_destroy: Option[
        GDestroyNotify /* Some(_root_.sn.gnome.glib.internal.GDestroyNotify) */
      ],
      parse_name_func: Option[
        GVfsFileLookupFunc /* Some(GVfsFileLookupFunc) */
      ],
      parse_name_data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ],
      parse_name_destroy: Option[
        GDestroyNotify /* Some(_root_.sn.gnome.glib.internal.GDestroyNotify) */
      ]
  )(using Zone): Boolean /* None */ = g_vfs_register_uri_scheme(
    this.raw.asInstanceOf[Ptr[GVfs]],
    __sn_extract_string(scheme),
    uri_func
      .map[GVfsFileLookupFunc](o => o)
      .getOrElse(null.asInstanceOf[GVfsFileLookupFunc]),
    uri_data
      .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
      .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]),
    uri_destroy
      .map[_root_.sn.gnome.glib.internal.GDestroyNotify](o => o)
      .getOrElse(
        null.asInstanceOf[_root_.sn.gnome.glib.internal.GDestroyNotify]
      ),
    parse_name_func
      .map[GVfsFileLookupFunc](o => o)
      .getOrElse(null.asInstanceOf[GVfsFileLookupFunc]),
    parse_name_data
      .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
      .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]),
    parse_name_destroy
      .map[_root_.sn.gnome.glib.internal.GDestroyNotify](o => o)
      .getOrElse(
        null.asInstanceOf[_root_.sn.gnome.glib.internal.GDestroyNotify]
      )
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unregisters the URI handler for @scheme previously registered with
    * g_vfs_register_uri_scheme().
    */
  def unregisterUriScheme(
      scheme: String | CString /* Some(CString) */
  )(using Zone): Boolean /* None */ = g_vfs_unregister_uri_scheme(
    this.raw.asInstanceOf[Ptr[GVfs]],
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

object Vfs:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the default #GVfs for the system.
    */
  def getDefault(): Vfs /* None */ = new Vfs(g_vfs_get_default().asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the local #GVfs for the system.
    */
  def getLocal(): Vfs /* None */ = new Vfs(g_vfs_get_local().asInstanceOf)

end Vfs
