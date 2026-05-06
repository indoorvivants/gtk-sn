package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.{File, Vfs}
import sn.gnome.gio.internal.GVfs
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.fluent.Object

/** Entry point for using GIO functionality.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Vfs(raw: Ptr[GVfs]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets a #GFile for @path.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFileForPath(
      path: String | CString /* Some(CString) */
  )(using Zone): File /* None */ = new File.Abstract(
    g_vfs_get_file_for_path(
      this.raw.asInstanceOf[Ptr[GVfs]],
      __sn_extract_string(path)
    ).asInstanceOf
  )

  /** Gets a #GFile for @uri.
    *
    * This operation never fails, but the returned object might not support any
    * I/O operation if the URI is malformed or if the URI scheme is not
    * supported.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFileForUri(
      uri: String | CString /* Some(CString) */
  )(using Zone): File /* None */ = new File.Abstract(
    g_vfs_get_file_for_uri(
      this.raw.asInstanceOf[Ptr[GVfs]],
      __sn_extract_string(uri)
    ).asInstanceOf
  )

  /** Gets a list of URI schemes supported by @vfs.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_supported_uri_schemes/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(const gchar* const*)))"
  )
  private def getSupportedUriSchemes__ = ???

  /** Checks if the VFS is active.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isActive(): Boolean /* None */ =
    g_vfs_is_active(this.raw.asInstanceOf[Ptr[GVfs]]).value.!=(0)

  /** This operation never fails, but the returned object might not support any
    * I/O operations if the @parse_name cannot be parsed by the #GVfs module.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def parseName(
      parse_name: String | CString /* Some(CString) */
  )(using Zone): File /* None */ = new File.Abstract(
    g_vfs_parse_name(
      this.raw.asInstanceOf[Ptr[GVfs]],
      __sn_extract_string(parse_name)
    ).asInstanceOf
  )

  /** Registers @uri_func and @parse_name_func as the #GFile URI and parse name
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method register_uri_scheme/<method parameters>/uri_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(VfsFileLookupFunc), @type -> DataRecord(GVfsFileLookupFunc)))"
  )
  private def registerUriScheme__ = ???

  /** Unregisters the URI handler for @scheme previously registered with
    * g_vfs_register_uri_scheme().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
  /** Gets the default #GVfs for the system.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDefault(): Vfs /* Some(Ptr[GVfs]) */ = new Vfs(
    g_vfs_get_default().asInstanceOf
  )

  /** Gets the local #GVfs for the system.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLocal(): Vfs /* Some(Ptr[GVfs]) */ = new Vfs(
    g_vfs_get_local().asInstanceOf
  )

end Vfs
