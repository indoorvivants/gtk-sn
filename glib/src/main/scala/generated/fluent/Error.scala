package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.Error
import sn.gnome.glib.internal.{GError, gchar, gint}

/** The `GError` structure contains information about an error that has
  * occurred.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Error private[gnome] (raw: Ptr[GError]):

  def getUnsafeRawPointer(): Ptr[GError] = this.raw

  /** error domain, e.g. %G_FILE_ERROR
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field domain]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Quark), @type -> DataRecord(GQuark)))"
  )
  private def domain__ = ???

  /** error code, e.g. %G_FILE_ERROR_NOENT
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def code: Int /* None */ = (!raw).code.asInstanceOf[gint]

  /** error code, e.g. %G_FILE_ERROR_NOENT
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def code_=(value: Int /* None */ ): Unit =
    (!raw).code_=(gint(value).asInstanceOf[gint])

  /** human-readable informative error message
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def message(using Zone): scala.Predef.String /* None */ =
    (!raw).message.asInstanceOf[Ptr[gchar]]

  /** human-readable informative error message
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def message_=(value: scala.Predef.String /* None */ )(using Zone): Unit =
    (!raw).message_=(
      toCString(value).asInstanceOf[Ptr[gchar]].asInstanceOf[Ptr[gchar]]
    )

  /** Makes a copy of @error.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copy(): sn.gnome.glib.Error /* None */ =
    sn.gnome.glib.Error.fromRaw(
      g_error_copy(this.getUnsafeRawPointer().asInstanceOf[Ptr[GError]])
    )
  end copy

  /** Frees a #GError and associated resources.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def free(): Unit /* None */ =
    g_error_free(this.getUnsafeRawPointer().asInstanceOf[Ptr[GError]])
  end free

  /** Returns %TRUE if @error matches @domain and @code, %FALSE otherwise. In
    * particular, when @error is %NULL, %FALSE will be returned.
    *
    * If @domain contains a `FAILED` (or otherwise generic) error code, you
    * should generally not check for it explicitly, but should instead treat any
    * not-explicitly-recognized error code as being equivalent to the `FAILED`
    * code. This way, if the domain is extended in the future to provide a more
    * specific error code for a certain case, your code will still work.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method matches/<method parameters>/domain]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Quark), @type -> DataRecord(GQuark)))"
  )
  private def matches__ = ???

end Error

object Error:
  def fromRaw(ptr: Ptr[GError]): Error = new Error(ptr)
end Error
