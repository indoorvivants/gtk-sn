package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{GDir, gchar}

/** An opaque structure representing an opened directory.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Dir private[gnome] (raw: Ptr[GDir]):

  def getUnsafeRawPointer(): Ptr[GDir] = this.raw

  /** Closes the directory and deallocates all related resources.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def close(): Unit /* None */ =
    g_dir_close(this.getUnsafeRawPointer().asInstanceOf[Ptr[GDir]])
  end close

  /** Retrieves the name of another entry in the directory, or %NULL. The order
    * of entries returned from this function is not defined, and may vary by
    * file system or other operating-system dependent factors.
    *
    * %NULL may also be returned in case of errors. On Unix, you can check
    * `errno` to find out if %NULL was returned because of an error.
    *
    * On Unix, the '.' and '..' entries are omitted, and the returned name is in
    * the on-disk encoding.
    *
    * On Windows, as is true of all GLib functions which operate on filenames,
    * the returned name is in UTF-8.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def readName(): scala.Predef.String /* None */ =
    fromCString(
      g_dir_read_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDir]]
      ).asInstanceOf
    )
  end readName

  /** Resets the given directory. The next call to g_dir_read_name() will return
    * the first entry again.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def rewind(): Unit /* None */ =
    g_dir_rewind(this.getUnsafeRawPointer().asInstanceOf[Ptr[GDir]])
  end rewind

end Dir

object Dir:
  def fromRaw(ptr: Ptr[GDir]): Dir = new Dir(ptr)
end Dir
