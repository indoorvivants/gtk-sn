package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Paintable
import sn.gnome.gdk4.internal.GdkMemoryFormat
import sn.gnome.gdk4.internal.GdkTexture
import sn.gnome.gdkpixbuf.fluent.Pixbuf
import sn.gnome.gio.fluent.File
import sn.gnome.gio.fluent.Icon
import sn.gnome.gio.fluent.LoadableIcon
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.GBytes
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object

class Texture(raw: Ptr[GdkTexture])
    extends Object(raw.asInstanceOf),
      Paintable,
      Icon,
      LoadableIcon:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  // Method download contains an array parameter, which is not supported yet

  def getFormat(): GdkMemoryFormat = gdk_texture_get_format(
    this.raw.asInstanceOf
  )

  def getHeight(): Int = gdk_texture_get_height(this.raw.asInstanceOf)

  def getWidth(): Int = gdk_texture_get_width(this.raw.asInstanceOf)

  def saveToPng(filename: String | CString)(using Zone): Boolean =
    gdk_texture_save_to_png(
      this.raw.asInstanceOf,
      __sn_extract_string(filename)
    ).value.!=(0)

  def saveToPngBytes(): Ptr[GBytes] = gdk_texture_save_to_png_bytes(
    this.raw.asInstanceOf
  )

  def saveToTiff(filename: String | CString)(using Zone): Boolean =
    gdk_texture_save_to_tiff(
      this.raw.asInstanceOf,
      __sn_extract_string(filename)
    ).value.!=(0)

  def saveToTiffBytes(): Ptr[GBytes] = gdk_texture_save_to_tiff_bytes(
    this.raw.asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Texture

object Texture:
  def forPixbuf(pixbuf: Pixbuf): Texture = new Texture(
    gdk_texture_new_for_pixbuf(
      pixbuf.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
  def fromBytes(bytes: Ptr[GBytes]): GResult[Texture] =
    GResult.wrap(__errorPtr =>
      new Texture(gdk_texture_new_from_bytes(bytes, __errorPtr).asInstanceOf)
    )
  def fromFile(file: File): GResult[Texture] = GResult.wrap(__errorPtr =>
    new Texture(
      gdk_texture_new_from_file(
        file.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).asInstanceOf
    )
  )
  def fromFilename(path: String | CString)(using Zone): GResult[Texture] =
    GResult.wrap(__errorPtr =>
      new Texture(
        gdk_texture_new_from_filename(
          __sn_extract_string(path),
          __errorPtr
        ).asInstanceOf
      )
    )
  def fromResource(resource_path: String | CString)(using Zone): Texture =
    new Texture(
      gdk_texture_new_from_resource(
        __sn_extract_string(resource_path)
      ).asInstanceOf
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Texture
