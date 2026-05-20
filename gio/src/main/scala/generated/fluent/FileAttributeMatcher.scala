package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.FileAttributeMatcher
import sn.gnome.gio.internal.GFileAttributeMatcher
import sn.gnome.glib.internal.{gboolean, gint}

/** Determines if a string matches a file attribute.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FileAttributeMatcher private[gnome] (raw: Ptr[GFileAttributeMatcher]):

  def getUnsafeRawPointer(): Ptr[GFileAttributeMatcher] = this.raw

  /** Checks if the matcher will match all of the keys in a given namespace.
    * This will always return %TRUE if a wildcard character is in use (e.g. if
    * matcher was created with "standard::*" and @ns is "standard", or if
    * matcher was created using "*" and namespace is anything.)
    *
    * TODO: this is awkwardly worded.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def enumerateNamespace(
      ns: scala.Predef.String /* Some(CString) */
  )(using Zone): Boolean /* None */ =
    g_file_attribute_matcher_enumerate_namespace(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileAttributeMatcher]],
      toCString(ns)
    ).value.!=(0)
  end enumerateNamespace

  /** Gets the next matched attribute from a #GFileAttributeMatcher.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def enumerateNext(): scala.Predef.String /* None */ =
    fromCString(
      g_file_attribute_matcher_enumerate_next(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileAttributeMatcher]]
      ).asInstanceOf
    )
  end enumerateNext

  /** Checks if an attribute will be matched by an attribute matcher. If the
    * matcher was created with the "*" matching string, this function will
    * always return %TRUE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def matches(
      attribute: scala.Predef.String /* Some(CString) */
  )(using Zone): Boolean /* None */ =
    g_file_attribute_matcher_matches(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileAttributeMatcher]],
      toCString(attribute)
    ).value.!=(0)
  end matches

  /** Checks if an attribute matcher only matches a given attribute. Always
    * returns %FALSE if "*" was used when creating the matcher.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def matchesOnly(
      attribute: scala.Predef.String /* Some(CString) */
  )(using Zone): Boolean /* None */ =
    g_file_attribute_matcher_matches_only(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileAttributeMatcher]],
      toCString(attribute)
    ).value.!=(0)
  end matchesOnly

  /** References a file attribute matcher.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref(): sn.gnome.gio.FileAttributeMatcher /* None */ =
    sn.gnome.gio.FileAttributeMatcher.fromRaw(
      g_file_attribute_matcher_ref(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileAttributeMatcher]]
      )
    )
  end ref

  /** Subtracts all attributes of @subtract from @matcher and returns a matcher
    * that supports those attributes.
    *
    * Note that currently it is not possible to remove a single attribute when
    * the @matcher matches the whole namespace - or remove a namespace or
    * attribute when the matcher matches everything. This is a limitation of the
    * current implementation, but may be fixed in the future.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def subtract(
      subtract: Option[
        sn.gnome.gio.FileAttributeMatcher /* Some(Ptr[GFileAttributeMatcher]) */
      ]
  ): sn.gnome.gio.FileAttributeMatcher /* None */ =
    sn.gnome.gio.FileAttributeMatcher.fromRaw(
      g_file_attribute_matcher_subtract(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileAttributeMatcher]],
        subtract
          .map[Ptr[GFileAttributeMatcher]](o =>
            o.getUnsafeRawPointer().asInstanceOf
          )
          .getOrElse(null.asInstanceOf[Ptr[GFileAttributeMatcher]])
      )
    )
  end subtract

  /** Prints what the matcher is matching against. The format will be equal to
    * the format passed to g_file_attribute_matcher_new(). The output however,
    * might not be identical, as the matcher may decide to use a different order
    * or omit needless parts.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def _toString(): scala.Predef.String /* None */ =
    fromCString(
      g_file_attribute_matcher_to_string(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileAttributeMatcher]]
      ).asInstanceOf
    )
  end _toString

  /** Unreferences @matcher. If the reference count falls below 1, the @matcher
    * is automatically freed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    g_file_attribute_matcher_unref(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileAttributeMatcher]]
    )
  end unref

end FileAttributeMatcher

object FileAttributeMatcher:
  def fromRaw(ptr: Ptr[GFileAttributeMatcher]): FileAttributeMatcher =
    new FileAttributeMatcher(ptr)
end FileAttributeMatcher
