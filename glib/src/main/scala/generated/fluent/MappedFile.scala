package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.{Bytes, MappedFile}
import sn.gnome.glib.internal.{GMappedFile, gchar, gsize}

/** The #GMappedFile represents a file mapping created with g_mapped_file_new().
  * It has only private members and should not be accessed directly.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class MappedFile private[gnome] (raw: Ptr[GMappedFile]):

  def getUnsafeRawPointer(): Ptr[GMappedFile] = this.raw

  /** This call existed before #GMappedFile had refcounting and is currently
    * exactly the same as g_mapped_file_unref().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def free(): Unit /* None */ =
    g_mapped_file_free(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GMappedFile]]
    )
  end free

  /** Creates a new #GBytes which references the data mapped from @file. The
    * mapped contents of the file must not be modified after creating this bytes
    * object, because a #GBytes should be immutable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getBytes(): sn.gnome.glib.Bytes /* None */ =
    sn.gnome.glib.Bytes.fromRaw(
      g_mapped_file_get_bytes(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GMappedFile]]
      )
    )
  end getBytes

  /** Returns the contents of a #GMappedFile.
    *
    * Note that the contents may not be zero-terminated, even if the
    * #GMappedFile is backed by a text file.
    *
    * If the file is empty then %NULL is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getContents()(using Zone): scala.Predef.String /* None */ =
    fromCString(
      g_mapped_file_get_contents(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GMappedFile]]
      ).asInstanceOf
    )
  end getContents

  /** Returns the length of the contents of a #GMappedFile.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLength(): CUnsignedLongInt /* None */ =
    g_mapped_file_get_length(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GMappedFile]]
    ).value
  end getLength

  /** Increments the reference count of @file by one. It is safe to call this
    * function from any thread.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref(): sn.gnome.glib.MappedFile /* None */ =
    sn.gnome.glib.MappedFile.fromRaw(
      g_mapped_file_ref(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GMappedFile]]
      )
    )
  end ref

  /** Decrements the reference count of @file by one. If the reference count
    * drops to 0, unmaps the buffer of @file and frees it.
    *
    * It is safe to call this function from any thread.
    *
    * Since 2.22
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    g_mapped_file_unref(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GMappedFile]]
    )
  end unref

end MappedFile

object MappedFile:
  def fromRaw(ptr: Ptr[GMappedFile]): MappedFile = new MappedFile(ptr)
end MappedFile
