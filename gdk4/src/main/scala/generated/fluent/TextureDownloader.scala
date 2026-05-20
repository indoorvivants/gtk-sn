package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.{MemoryFormat, Texture, TextureDownloader}
import sn.gnome.gdk4.internal.GdkTextureDownloader
import sn.gnome.gobject.runtime.*

/** The `GdkTextureDownloader` is used to download the contents of a
  * [class@Gdk.Texture].
  *
  * It is intended to be created as a short-term object for a single download,
  * but can be used for multipe downloads of different textures or with
  * different settings.
  *
  * `GdkTextureDownloader` can be used to convert data between different
  * formats. Create a `GdkTexture` for the existing format and then download it
  * in a different format.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TextureDownloader private[gnome] (raw: Ptr[GdkTextureDownloader]):

  def getUnsafeRawPointer(): Ptr[GdkTextureDownloader] = this.raw

  /** Creates a copy of the downloader.
    *
    * This function is meant for language bindings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copy(): sn.gnome.gdk4.TextureDownloader /* None */ =
    sn.gnome.gdk4.TextureDownloader.fromRaw(
      gdk_texture_downloader_copy(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkTextureDownloader]]
      )
    )
  end copy

  /** Downloads the given texture pixels into a `GBytes`. The rowstride will be
    * stored in the stride value.
    *
    * This function will abort if it tries to download a large texture and fails
    * to allocate memory. If you think that may happen, you should handle memory
    * allocation yourself and use [method@Gdk.TextureDownloader.download_into]
    * once allocation succeeded.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method download_bytes]: Method download_bytes contains an OUT parameter, which is not supported yet"
  )
  private def downloadBytes__ = ???

  /** Downloads the @texture into local memory.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method download_into/<method parameters>/data]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8), @type -> DataRecord(guchar)))),ListMap(@zero-terminated -> DataRecord(0), @type -> DataRecord(guchar*)))"
  )
  private def downloadInto__ = ???

  /** Frees the given downloader and all its associated resources.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def free(): Unit /* None */ =
    gdk_texture_downloader_free(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkTextureDownloader]]
    )
  end free

  /** Gets the format that the data will be downloaded in.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFormat(): sn.gnome.gdk4.MemoryFormat /* None */ =
    sn.gnome.gdk4.MemoryFormat.fromRaw(
      gdk_texture_downloader_get_format(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkTextureDownloader]]
      )
    )
  end getFormat

  /** Gets the texture that the downloader will download.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTexture()(using Runtime): sn.gnome.gdk4.Texture /* None */ =
    sn.gnome.gdk4.Texture.applyUnsafe(
      gdk_texture_downloader_get_texture(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkTextureDownloader]]
      ).asInstanceOf
    )
  end getTexture

  /** Sets the format the downloader will download.
    *
    * By default, GDK_MEMORY_DEFAULT is set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFormat(
      format: sn.gnome.gdk4.MemoryFormat /* Some(GdkMemoryFormat) */
  ): Unit /* None */ =
    gdk_texture_downloader_set_format(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkTextureDownloader]],
      format.raw
    )
  end setFormat

  /** Changes the texture the downloader will download.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTexture(
      texture: sn.gnome.gdk4.Texture /* Some(Ptr[GdkTexture]) */
  )(using Runtime): Unit /* None */ =
    gdk_texture_downloader_set_texture(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkTextureDownloader]],
      texture.getUnsafeRawPointer().asInstanceOf
    )
  end setTexture

end TextureDownloader

object TextureDownloader:
  def fromRaw(ptr: Ptr[GdkTextureDownloader]): TextureDownloader =
    new TextureDownloader(ptr)
end TextureDownloader
