package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.TlsPasswordFlags
import sn.gnome.gio.internal.GTlsPassword
import sn.gnome.glib.internal.gchar
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.runtime.*

/** Holds a password used in TLS.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TlsPassword private[gnome] (raw: Ptr[GTlsPassword])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Get a description string about what the password will be used for.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDescription()(using Zone): String /* None */ =
    fromCString(
      g_tls_password_get_description(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsPassword]]
      ).asInstanceOf
    )
  end getDescription

  /** Get flags about the password.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFlags(): TlsPasswordFlags /* None */ =
    TlsPasswordFlags.fromRaw(
      g_tls_password_get_flags(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsPassword]]
      )
    )
  end getFlags

  /** Get the password value. If @length is not %NULL then it will be filled in
    * with the length of the password value. (Note that the password value is
    * not nul-terminated, so you can only pass %NULL for @length in contexts
    * where you know the password will have a certain fixed length.)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_value]: Method get_value contains an OUT parameter, which is not supported yet"
  )
  private def getValue__ = ???

  /** Get a user readable translated warning. Usually this warning is a
    * representation of the password flags returned from
    * g_tls_password_get_flags().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getWarning()(using Zone): String /* None */ =
    fromCString(
      g_tls_password_get_warning(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsPassword]]
      ).asInstanceOf
    )
  end getWarning

  /** Set a description string about what the password will be used for.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDescription(
      description: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Unit /* None */ =
    g_tls_password_set_description(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsPassword]],
      toCString(description).asInstanceOf[Ptr[gchar]]
    )
  end setDescription

  /** Set flags about the password.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFlags(
      flags: TlsPasswordFlags /* Some(GTlsPasswordFlags) */
  ): Unit /* None */ =
    g_tls_password_set_flags(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsPassword]],
      flags.raw
    )
  end setFlags

  /** Set the value for this password. The @value will be copied by the password
    * object.
    *
    * Specify the @length, for a non-nul-terminated password. Pass -1 as
    * @length
    *   if using a nul-terminated password, and @length will be calculated
    *   automatically. (Note that the terminating nul is not considered part of
    *   the password in this case.)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_value/<method parameters>/value]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8), @type -> DataRecord(guchar)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const guchar*)))"
  )
  private def setValue__ = ???

  /** Provide the value for this password.
    *
    * The @value will be owned by the password object, and later freed using the @destroy
    * function callback.
    *
    * Specify the @length, for a non-nul-terminated password. Pass -1 as
    * @length
    *   if using a nul-terminated password, and @length will be calculated
    *   automatically. (Note that the terminating nul is not considered part of
    *   the password in this case.)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_value_full/<method parameters>/value]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8), @type -> DataRecord(guchar)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(guchar*)))"
  )
  private def setValueFull__ = ???

  /** Set a user readable translated warning. Usually this warning is a
    * representation of the password flags returned from
    * g_tls_password_get_flags().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setWarning(
      warning: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Unit /* None */ =
    g_tls_password_set_warning(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsPassword]],
      toCString(warning).asInstanceOf[Ptr[gchar]]
    )
  end setWarning

end TlsPassword

object TlsPassword:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GTlsPassword])(using Runtime) =
    summon[Runtime].getOrCreate[TlsPassword](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new TlsPassword(ptr)
    )

  /** Create a new #GTlsPassword object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      flags: TlsPasswordFlags /* Some(GTlsPasswordFlags) */,
      description: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone, Runtime): TlsPassword =
    val raw: Ptr[Byte] = g_tls_password_new(
      flags.raw,
      toCString(description).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
    summon[Runtime].getOrCreate[TlsPassword](
      raw,
      r => TlsPassword.applyUnsafe(r.asInstanceOf)
    )
  end apply
end TlsPassword
