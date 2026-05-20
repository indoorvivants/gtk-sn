package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.ContentFormats
import sn.gnome.gdk4.internal.GdkContentFormats
import sn.gnome.glib.String
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.internal.GType

/** The `GdkContentFormats` structure is used to advertise and negotiate the
  * format of content.
  *
  * You will encounter `GdkContentFormats` when interacting with objects
  * controlling operations that pass data between different widgets, window or
  * application, like [class@Gdk.Drag], [class@Gdk.Drop], [class@Gdk.Clipboard]
  * or [class@Gdk.ContentProvider].
  *
  * GDK supports content in 2 forms: `GType` and mime type. Using `GTypes` is
  * meant only for in-process content transfers. Mime types are meant to be used
  * for data passing both in-process and out-of-process. The details of how data
  * is passed is described in the documentation of the actual implementations.
  * To transform between the two forms, [class@Gdk.ContentSerializer] and
  * [class@Gdk.ContentDeserializer] are used.
  *
  * A `GdkContentFormats` describes a set of possible formats content can be
  * exchanged in. It is assumed that this set is ordered. `GTypes` are more
  * important than mime types. Order between different `GTypes` or mime types is
  * the order they were added in, most important first. Functions that care
  * about order, such as [method@Gdk.ContentFormats.union], will describe in
  * their documentation how they interpret that order, though in general the
  * order of the first argument is considered the primary order of the result,
  * followed by the order of further arguments.
  *
  * For debugging purposes, the function [method@Gdk.ContentFormats.to_string]
  * exists. It will print a comma-separated list of formats from most important
  * to least important.
  *
  * `GdkContentFormats` is an immutable struct. After creation, you cannot
  * change the types it represents. Instead, new `GdkContentFormats` have to be
  * created. The [struct@Gdk.ContentFormatsBuilder] structure is meant to help
  * in this endeavor.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ContentFormats private[gnome] (raw: Ptr[GdkContentFormats]):

  def getUnsafeRawPointer(): Ptr[GdkContentFormats] = this.raw

  /** Checks if a given `GType` is part of the given @formats.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def containGtype(
      `type`: GType /* Some(_root_.sn.gnome.gobject.internal.GType) */
  ): Boolean /* None */ =
    gdk_content_formats_contain_gtype(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkContentFormats]],
      `type`
    ).value.!=(0)
  end containGtype

  /** Checks if a given mime type is part of the given @formats.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def containMimeType(
      mime_type: scala.Predef.String /* Some(CString) */
  )(using Zone): Boolean /* None */ =
    gdk_content_formats_contain_mime_type(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkContentFormats]],
      toCString(mime_type)
    ).value.!=(0)
  end containMimeType

  /** Gets the `GType`s included in @formats.
    *
    * Note that @formats may not contain any `GType`s, in particular when they
    * are empty. In that case %NULL will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_gtypes]: Method get_gtypes contains an OUT parameter, which is not supported yet"
  )
  private def getGtypes__ = ???

  /** Gets the mime types included in @formats.
    *
    * Note that @formats may not contain any mime types, in particular when they
    * are empty. In that case %NULL will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_mime_types]: Method get_mime_types contains an OUT parameter, which is not supported yet"
  )
  private def getMimeTypes__ = ???

  /** Checks if @first and @second have any matching formats.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def `match`(
      second: sn.gnome.gdk4.ContentFormats /* Some(Ptr[GdkContentFormats]) */
  ): Boolean /* None */ =
    gdk_content_formats_match(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkContentFormats]],
      second.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end `match`

  /** Finds the first `GType` from @first that is also contained in @second.
    *
    * If no matching `GType` is found, %G_TYPE_INVALID is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def matchGtype(
      second: sn.gnome.gdk4.ContentFormats /* Some(Ptr[GdkContentFormats]) */
  ): GType /* None */ =
    gdk_content_formats_match_gtype(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkContentFormats]],
      second.getUnsafeRawPointer().asInstanceOf
    )
  end matchGtype

  /** Finds the first mime type from @first that is also contained in @second.
    *
    * If no matching mime type is found, %NULL is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def matchMimeType(
      second: sn.gnome.gdk4.ContentFormats /* Some(Ptr[GdkContentFormats]) */
  ): scala.Predef.String /* None */ =
    fromCString(
      gdk_content_formats_match_mime_type(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkContentFormats]],
        second.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )
  end matchMimeType

  /** Prints the given @formats into a string for human consumption.
    *
    * The result of this function can later be parsed with
    * [func@Gdk.ContentFormats.parse].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def print(
      string: sn.gnome.glib.String /* Some(Ptr[_root_.sn.gnome.glib.internal.GString]) */
  ): Unit /* None */ =
    gdk_content_formats_print(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkContentFormats]],
      string.getUnsafeRawPointer().asInstanceOf
    )
  end print

  /** Increases the reference count of a `GdkContentFormats` by one.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref(): sn.gnome.gdk4.ContentFormats /* None */ =
    sn.gnome.gdk4.ContentFormats.fromRaw(
      gdk_content_formats_ref(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkContentFormats]]
      )
    )
  end ref

  /** Prints the given @formats into a human-readable string.
    *
    * The resulting string can be parsed with [func@Gdk.ContentFormats.parse].
    *
    * This is a small wrapper around [method@Gdk.ContentFormats.print] to help
    * when debugging.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def _toString(): scala.Predef.String /* None */ =
    fromCString(
      gdk_content_formats_to_string(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkContentFormats]]
      ).asInstanceOf
    )
  end _toString

  /** Append all missing types from @second to @first, in the order they had in @second.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def union(
      second: sn.gnome.gdk4.ContentFormats /* Some(Ptr[GdkContentFormats]) */
  ): sn.gnome.gdk4.ContentFormats /* None */ =
    sn.gnome.gdk4.ContentFormats.fromRaw(
      gdk_content_formats_union(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkContentFormats]],
        second.getUnsafeRawPointer().asInstanceOf
      )
    )
  end union

  /** Add GTypes for mime types in @formats for which deserializers are
    * registered.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unionDeserializeGtypes(): sn.gnome.gdk4.ContentFormats /* None */ =
    sn.gnome.gdk4.ContentFormats.fromRaw(
      gdk_content_formats_union_deserialize_gtypes(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkContentFormats]]
      )
    )
  end unionDeserializeGtypes

  /** Add mime types for GTypes in @formats for which deserializers are
    * registered.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unionDeserializeMimeTypes(): sn.gnome.gdk4.ContentFormats /* None */ =
    sn.gnome.gdk4.ContentFormats.fromRaw(
      gdk_content_formats_union_deserialize_mime_types(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkContentFormats]]
      )
    )
  end unionDeserializeMimeTypes

  /** Add GTypes for the mime types in @formats for which serializers are
    * registered.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unionSerializeGtypes(): sn.gnome.gdk4.ContentFormats /* None */ =
    sn.gnome.gdk4.ContentFormats.fromRaw(
      gdk_content_formats_union_serialize_gtypes(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkContentFormats]]
      )
    )
  end unionSerializeGtypes

  /** Add mime types for GTypes in @formats for which serializers are
    * registered.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unionSerializeMimeTypes(): sn.gnome.gdk4.ContentFormats /* None */ =
    sn.gnome.gdk4.ContentFormats.fromRaw(
      gdk_content_formats_union_serialize_mime_types(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkContentFormats]]
      )
    )
  end unionSerializeMimeTypes

  /** Decreases the reference count of a `GdkContentFormats` by one.
    *
    * If the resulting reference count is zero, frees the formats.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    gdk_content_formats_unref(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkContentFormats]]
    )
  end unref

end ContentFormats

object ContentFormats:
  def fromRaw(ptr: Ptr[GdkContentFormats]): ContentFormats = new ContentFormats(
    ptr
  )
end ContentFormats
