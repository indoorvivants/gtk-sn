package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.{ContentFormats, ContentFormatsBuilder}
import sn.gnome.gdk4.internal.GdkContentFormatsBuilder
import sn.gnome.gobject.internal.GType

/** A `GdkContentFormatsBuilder` is an auxiliary struct used to create new
  * `GdkContentFormats`, and should not be kept around.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ContentFormatsBuilder private[gnome] (raw: Ptr[GdkContentFormatsBuilder]):

  def getUnsafeRawPointer(): Ptr[GdkContentFormatsBuilder] = this.raw

  /** Appends all formats from @formats to @builder, skipping those that already
    * exist.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addFormats(
      formats: sn.gnome.gdk4.ContentFormats /* Some(Ptr[GdkContentFormats]) */
  ): Unit /* None */ =
    gdk_content_formats_builder_add_formats(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkContentFormatsBuilder]],
      formats.getUnsafeRawPointer().asInstanceOf
    )
  end addFormats

  /** Appends @type to @builder if it has not already been added.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addGtype(
      `type`: GType /* Some(_root_.sn.gnome.gobject.internal.GType) */
  ): Unit /* None */ =
    gdk_content_formats_builder_add_gtype(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkContentFormatsBuilder]],
      `type`
    )
  end addGtype

  /** Appends @mime_type to @builder if it has not already been added.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addMimeType(
      mime_type: scala.Predef.String /* Some(CString) */
  )(using Zone): Unit /* None */ =
    gdk_content_formats_builder_add_mime_type(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkContentFormatsBuilder]],
      toCString(mime_type)
    )
  end addMimeType

  /** Creates a new `GdkContentFormats` from the current state of the given @builder,
    * and frees the @builder instance.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def freeToFormats(): sn.gnome.gdk4.ContentFormats /* None */ =
    sn.gnome.gdk4.ContentFormats.fromRaw(
      gdk_content_formats_builder_free_to_formats(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkContentFormatsBuilder]]
      )
    )
  end freeToFormats

  /** Acquires a reference on the given @builder.
    *
    * This function is intended primarily for bindings.
    * `GdkContentFormatsBuilder` objects should not be kept around.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref(): sn.gnome.gdk4.ContentFormatsBuilder /* None */ =
    sn.gnome.gdk4.ContentFormatsBuilder.fromRaw(
      gdk_content_formats_builder_ref(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkContentFormatsBuilder]]
      )
    )
  end ref

  /** Creates a new `GdkContentFormats` from the given @builder.
    *
    * The given `GdkContentFormatsBuilder` is reset once this function returns;
    * you cannot call this function multiple times on the same @builder
    * instance.
    *
    * This function is intended primarily for bindings. C code should use
    * [method@Gdk.ContentFormatsBuilder.free_to_formats].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def toFormats(): sn.gnome.gdk4.ContentFormats /* None */ =
    sn.gnome.gdk4.ContentFormats.fromRaw(
      gdk_content_formats_builder_to_formats(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkContentFormatsBuilder]]
      )
    )
  end toFormats

  /** Releases a reference on the given @builder.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    gdk_content_formats_builder_unref(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkContentFormatsBuilder]]
    )
  end unref

end ContentFormatsBuilder

object ContentFormatsBuilder:
  def fromRaw(ptr: Ptr[GdkContentFormatsBuilder]): ContentFormatsBuilder =
    new ContentFormatsBuilder(ptr)
end ContentFormatsBuilder
