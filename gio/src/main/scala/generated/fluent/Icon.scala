package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.Icon
import sn.gnome.glib.Variant
import sn.gnome.glib.internal.{gboolean, gchar, gint, guint}

trait Icon:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Checks if two icons are equal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def equal(
      icon2: Option[sn.gnome.gio.Icon /* Some(Ptr[GIcon]) */ ]
  ): Boolean /* None */ =
    g_icon_equal(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GIcon]],
      icon2
        .map[Ptr[GIcon]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GIcon]])
    ).value.!=(0)
  end equal

  /** Gets a hash for an icon.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hash(): UInt /* None */ =
    g_icon_hash(
      this
        .getUnsafeRawPointer()
        .asInstanceOf[_root_.sn.gnome.glib.internal.gconstpointer]
    ).value
  end hash

  /** Serializes a #GIcon into a #GVariant. An equivalent #GIcon can be
    * retrieved back by calling g_icon_deserialize() on the returned value. As
    * serialization will avoid using raw icon data when possible, it only makes
    * sense to transfer the #GVariant between processes on the same machine, (as
    * opposed to over the network), and within the same file system namespace.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def serialize(): sn.gnome.glib.Variant /* None */ =
    sn.gnome.glib.Variant.fromRaw(
      g_icon_serialize(this.getUnsafeRawPointer().asInstanceOf[Ptr[GIcon]])
    )
  end serialize

  /** Generates a textual representation of @icon that can be used for
    * serialization such as when passing @icon to a different process or saving
    * it to persistent storage. Use g_icon_new_for_string() to get @icon back
    * from the returned string.
    *
    * The encoding of the returned string is proprietary to #GIcon except in the
    * following two cases
    *
    *   - If @icon is a #GFileIcon, the returned string is a native path (such
    *     as `/path/to/my icon.png`) without escaping if the #GFile for @icon is
    *     a native file. If the file is not native, the returned string is the
    *     result of g_file_get_uri() (such as `sftp://path/to/my%20icon.png`).
    *   - If @icon is a #GThemedIcon with exactly one name and no fallbacks, the
    *     encoding is simply the name (such as `network-server`).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def toString()(using Zone): scala.Predef.String /* None */ =
    fromCString(
      g_icon_to_string(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GIcon]]
      ).asInstanceOf
    )
  end toString

end Icon

object Icon:
  class Abstract(raw: Ptr[Byte]) extends Icon:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end Icon
