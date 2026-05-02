package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.internal.GTlsPassword
import sn.gnome.gio.internal.GTlsPasswordFlags
import sn.gnome.glib.internal.GDestroyNotify
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gssize
import sn.gnome.glib.internal.guchar
import sn.gnome.gobject.fluent.Object

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Holds a password used in TLS.
  */
class TlsPassword(raw: Ptr[GTlsPassword]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Get a description string about what the password will be used for.
    */
  def getDescription()(using Zone): String /* None */ = fromCString(
    g_tls_password_get_description(
      this.raw.asInstanceOf[Ptr[GTlsPassword]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Get flags about the password.
    */
  def getFlags(): GTlsPasswordFlags /* None */ = g_tls_password_get_flags(
    this.raw.asInstanceOf[Ptr[GTlsPassword]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Get the password value. If @length is not %NULL then it will be filled in
    * with the length of the password value. (Note that the password value is
    * not nul-terminated, so you can only pass %NULL for @length in contexts
    * where you know the password will have a certain fixed length.)
    */
  @annotation.compileTimeOnly(
    "Method get_value contains an OUT parameter, which is not supported yet"
  )
  private def getValue__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Get a user readable translated warning. Usually this warning is a
    * representation of the password flags returned from
    * g_tls_password_get_flags().
    */
  def getWarning()(using Zone): String /* None */ = fromCString(
    g_tls_password_get_warning(
      this.raw.asInstanceOf[Ptr[GTlsPassword]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Set a description string about what the password will be used for.
    */
  def setDescription(
      description: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Unit /* None */ = g_tls_password_set_description(
    this.raw.asInstanceOf[Ptr[GTlsPassword]],
    __sn_extract_string(description).asInstanceOf[Ptr[gchar]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Set flags about the password.
    */
  def setFlags(
      flags: GTlsPasswordFlags /* Some(GTlsPasswordFlags) */
  ): Unit /* None */ =
    g_tls_password_set_flags(this.raw.asInstanceOf[Ptr[GTlsPassword]], flags)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Set the value for this password. The @value will be copied by the password
    * object.
    *
    * Specify the @length, for a non-nul-terminated password. Pass -1 as
    * @length
    *   if using a nul-terminated password, and @length will be calculated
    *   automatically. (Note that the terminating nul is not considered part of
    *   the password in this case.)
    */
  def setValue(
      value: Ptr[UByte] /* Some(Ptr[_root_.sn.gnome.glib.internal.guchar]) */,
      length: CLongInt /* Some(_root_.sn.gnome.glib.internal.gssize) */
  ): Unit /* None */ = g_tls_password_set_value(
    this.raw.asInstanceOf[Ptr[GTlsPassword]],
    value.asInstanceOf,
    gssize(length)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Provide the value for this password.
    *
    * The @value will be owned by the password object, and later freed using the @destroy
    * function callback.
    *
    * Specify the @length, for a non-nul-terminated password. Pass -1 as
    * @length
    *   if using a nul-terminated password, and @length will be calculated
    *   automatically. (Note that the terminating nul is not considered part of
    *   the password in this case.)
    */
  def setValueFull(
      value: Ptr[UByte] /* Some(Ptr[_root_.sn.gnome.glib.internal.guchar]) */,
      length: CLongInt /* Some(_root_.sn.gnome.glib.internal.gssize) */,
      destroy: Option[
        GDestroyNotify /* Some(_root_.sn.gnome.glib.internal.GDestroyNotify) */
      ]
  ): Unit /* None */ = g_tls_password_set_value_full(
    this.raw.asInstanceOf[Ptr[GTlsPassword]],
    value.asInstanceOf,
    gssize(length),
    destroy
      .map[_root_.sn.gnome.glib.internal.GDestroyNotify](o => o)
      .getOrElse(
        null.asInstanceOf[_root_.sn.gnome.glib.internal.GDestroyNotify]
      )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Set a user readable translated warning. Usually this warning is a
    * representation of the password flags returned from
    * g_tls_password_get_flags().
    */
  def setWarning(
      warning: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Unit /* None */ = g_tls_password_set_warning(
    this.raw.asInstanceOf[Ptr[GTlsPassword]],
    __sn_extract_string(warning).asInstanceOf[Ptr[gchar]]
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end TlsPassword

object TlsPassword:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Create a new #GTlsPassword object.
    */
  def apply(
      flags: GTlsPasswordFlags /* Some(GTlsPasswordFlags) */,
      description: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): TlsPassword = new TlsPassword(
    g_tls_password_new(
      flags,
      __sn_extract_string(description).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end TlsPassword
