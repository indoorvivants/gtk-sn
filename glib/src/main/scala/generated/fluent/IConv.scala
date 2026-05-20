package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{GIConv, gint}

/** The GIConv struct wraps an iconv() conversion descriptor. It contains
  * private data and should only be accessed using the following functions.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class IConv private[gnome] (raw: Ptr[GIConv]):

  def getUnsafeRawPointer(): Ptr[GIConv] = this.raw

  /** Same as the standard UNIX routine iconv(), but may be implemented via
    * libiconv on UNIX flavors that lack a native implementation.
    *
    * GLib provides g_convert() and g_locale_to_utf8() which are likely more
    * convenient than the raw iconv wrappers.
    *
    * Note that the behaviour of iconv() for characters which are valid in the
    * input character set, but which have no representation in the output
    * character set, is implementation defined. This function may return success
    * (with a positive number of non-reversible conversions as replacement
    * characters were used), or it may return -1 and set an error such as
    * %EILSEQ, in such a situation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method ]: Method  contains an INOUT parameter, which is not supported yet"
  )
  private def __ = ???

  /** Same as the standard UNIX routine iconv_close(), but may be implemented
    * via libiconv on UNIX flavors that lack a native implementation. Should be
    * called to clean up the conversion descriptor from g_iconv_open() when you
    * are done converting things.
    *
    * GLib provides g_convert() and g_locale_to_utf8() which are likely more
    * convenient than the raw iconv wrappers.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def close(): Int /* None */ =
    g_iconv_close(this.getUnsafeRawPointer().asInstanceOf[GIConv]).value
  end close

end IConv
object IConv:
  def fromRaw(ptr: Ptr[GIConv]): IConv = new IConv(ptr)
end IConv
