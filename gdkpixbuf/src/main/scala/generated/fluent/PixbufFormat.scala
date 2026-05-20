package sn.gnome.gdkpixbuf

import _root_.sn.gnome.gdkpixbuf.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdkpixbuf.PixbufFormat
import sn.gnome.gdkpixbuf.internal.GdkPixbufFormat
import sn.gnome.glib.internal.{gboolean, gchar, gint}

/** A `GdkPixbufFormat` contains information about the image format accepted by
  * a module.
  *
  * Only modules should access the fields directly, applications should use the
  * `gdk_pixbuf_format_*` family of functions.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class PixbufFormat private[gnome] (raw: Ptr[GdkPixbufFormat]):

  def getUnsafeRawPointer(): Ptr[GdkPixbufFormat] = this.raw

  /** the name of the image format
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly("[field name]: Field name has no target types")
  private def name__ = ???

  /** the signature of the module
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field signature]: Field signature has no target types"
  )
  private def signature__ = ???

  /** the message domain for the `description`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field domain]: Field domain has no target types"
  )
  private def domain__ = ???

  /** a description of the image format
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field description]: Field description has no target types"
  )
  private def description__ = ???

  /** the MIME types for the image format
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field mime_types]: Field mime_types has no target types"
  )
  private def mimeTypes__ = ???

  /** typical filename extensions for the image format
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field extensions]: Field extensions has no target types"
  )
  private def extensions__ = ???

  /** a combination of `GdkPixbufFormatFlags`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly("[field flags]: Field flags has no target types")
  private def flags__ = ???

  /** a boolean determining whether the loader is disabled`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field disabled]: Field disabled has no target types"
  )
  private def disabled__ = ???

  /** a string containing license information, typically set to shorthands like
    * "GPL", "LGPL", etc.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field license]: Field license has no target types"
  )
  private def license__ = ???

  /** Creates a copy of `format`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copy(): sn.gnome.gdkpixbuf.PixbufFormat /* None */ =
    sn.gnome.gdkpixbuf.PixbufFormat.fromRaw(
      gdk_pixbuf_format_copy(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbufFormat]]
      )
    )
  end copy

  /** Frees the resources allocated when copying a `GdkPixbufFormat` using
    * gdk_pixbuf_format_copy()
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def free(): Unit /* None */ =
    gdk_pixbuf_format_free(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbufFormat]]
    )
  end free

  /** Returns a description of the format.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDescription()(using Zone): scala.Predef.String /* None */ =
    fromCString(
      gdk_pixbuf_format_get_description(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbufFormat]]
      ).asInstanceOf
    )
  end getDescription

  /** Returns the filename extensions typically used for files in the given
    * format.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_extensions/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(gchar**)))"
  )
  private def getExtensions__ = ???

  /** Returns information about the license of the image loader for the format.
    *
    * The returned string should be a shorthand for a well known license, e.g.
    * "LGPL", "GPL", "QPL", "GPL/QPL", or "other" to indicate some other
    * license.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLicense()(using Zone): scala.Predef.String /* None */ =
    fromCString(
      gdk_pixbuf_format_get_license(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbufFormat]]
      ).asInstanceOf
    )
  end getLicense

  /** Returns the mime types supported by the format.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_mime_types/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(gchar**)))"
  )
  private def getMimeTypes__ = ???

  /** Returns the name of the format.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getName()(using Zone): scala.Predef.String /* None */ =
    fromCString(
      gdk_pixbuf_format_get_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbufFormat]]
      ).asInstanceOf
    )
  end getName

  /** Returns whether this image format is disabled.
    *
    * See gdk_pixbuf_format_set_disabled().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isDisabled(): Boolean /* None */ =
    gdk_pixbuf_format_is_disabled(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbufFormat]]
    ).value.!=(0)
  end isDisabled

  /** Returns `TRUE` if the save option specified by @option_key is supported
    * when saving a pixbuf using the module implementing @format.
    *
    * See gdk_pixbuf_save() for more information about option keys.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isSaveOptionSupported(
      option_key: scala.Predef.String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Boolean /* None */ =
    gdk_pixbuf_format_is_save_option_supported(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbufFormat]],
      toCString(option_key).asInstanceOf[Ptr[gchar]]
    ).value.!=(0)
  end isSaveOptionSupported

  /** Returns whether this image format is scalable.
    *
    * If a file is in a scalable format, it is preferable to load it at the
    * desired size, rather than loading it at the default size and scaling the
    * resulting pixbuf to the desired size.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isScalable(): Boolean /* None */ =
    gdk_pixbuf_format_is_scalable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbufFormat]]
    ).value.!=(0)
  end isScalable

  /** Returns whether pixbufs can be saved in the given format.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isWritable(): Boolean /* None */ =
    gdk_pixbuf_format_is_writable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbufFormat]]
    ).value.!=(0)
  end isWritable

  /** Disables or enables an image format.
    *
    * If a format is disabled, GdkPixbuf won't use the image loader for this
    * format to load images.
    *
    * Applications can use this to avoid using image loaders with an
    * inappropriate license, see gdk_pixbuf_format_get_license().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDisabled(
      disabled: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gdk_pixbuf_format_set_disabled(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbufFormat]],
      gboolean(gint((if disabled == true then 1 else 0)))
    )
  end setDisabled

end PixbufFormat

object PixbufFormat:
  def fromRaw(ptr: Ptr[GdkPixbufFormat]): PixbufFormat = new PixbufFormat(ptr)
end PixbufFormat
