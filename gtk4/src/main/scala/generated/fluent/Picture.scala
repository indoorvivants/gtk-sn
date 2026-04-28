package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Paintable
import sn.gnome.gdkpixbuf.fluent.Pixbuf
import sn.gnome.gio.fluent.File
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkContentFit
import sn.gnome.gtk4.internal.GtkPicture

class Picture(raw: Ptr[GtkPicture])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getAlternativeText()(using Zone): String = fromCString(
    gtk_picture_get_alternative_text(this.raw.asInstanceOf).asInstanceOf
  )

  def getCanShrink(): Boolean =
    gtk_picture_get_can_shrink(this.raw.asInstanceOf).value.!=(0)

  def getContentFit(): GtkContentFit = gtk_picture_get_content_fit(
    this.raw.asInstanceOf
  )

  def getFile(): File =
    new File.Abstract(gtk_picture_get_file(this.raw.asInstanceOf).asInstanceOf)

  def getKeepAspectRatio(): Boolean =
    gtk_picture_get_keep_aspect_ratio(this.raw.asInstanceOf).value.!=(0)

  def getPaintable(): Paintable = new Paintable.Abstract(
    gtk_picture_get_paintable(this.raw.asInstanceOf).asInstanceOf
  )

  def setAlternativeText(alternative_text: String | CString)(using Zone): Unit =
    gtk_picture_set_alternative_text(
      this.raw.asInstanceOf,
      __sn_extract_string(alternative_text)
    )

  def setCanShrink(can_shrink: Boolean): Unit = gtk_picture_set_can_shrink(
    this.raw.asInstanceOf,
    gboolean(gint((if can_shrink == true then 1 else 0)))
  )

  def setContentFit(content_fit: GtkContentFit): Unit =
    gtk_picture_set_content_fit(this.raw.asInstanceOf, content_fit)

  def setFile(file: File): Unit = gtk_picture_set_file(
    this.raw.asInstanceOf,
    file.getUnsafeRawPointer().asInstanceOf
  )

  def setFilename(filename: String | CString)(using Zone): Unit =
    gtk_picture_set_filename(
      this.raw.asInstanceOf,
      __sn_extract_string(filename)
    )

  def setKeepAspectRatio(keep_aspect_ratio: Boolean): Unit =
    gtk_picture_set_keep_aspect_ratio(
      this.raw.asInstanceOf,
      gboolean(gint((if keep_aspect_ratio == true then 1 else 0)))
    )

  def setPaintable(paintable: Paintable): Unit = gtk_picture_set_paintable(
    this.raw.asInstanceOf,
    paintable.getUnsafeRawPointer().asInstanceOf
  )

  def setPixbuf(pixbuf: Pixbuf): Unit = gtk_picture_set_pixbuf(
    this.raw.asInstanceOf,
    pixbuf.getUnsafeRawPointer().asInstanceOf
  )

  def setResource(resource_path: String | CString)(using Zone): Unit =
    gtk_picture_set_resource(
      this.raw.asInstanceOf,
      __sn_extract_string(resource_path)
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Picture

object Picture:
  def apply(): Picture = new Picture(gtk_picture_new().asInstanceOf)
  def forFile(file: File): Picture = new Picture(
    gtk_picture_new_for_file(
      file.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
  def forFilename(filename: String | CString)(using Zone): Picture =
    new Picture(
      gtk_picture_new_for_filename(__sn_extract_string(filename)).asInstanceOf
    )
  def forPaintable(paintable: Paintable): Picture = new Picture(
    gtk_picture_new_for_paintable(
      paintable.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
  def forPixbuf(pixbuf: Pixbuf): Picture = new Picture(
    gtk_picture_new_for_pixbuf(
      pixbuf.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
  def forResource(resource_path: String | CString)(using Zone): Picture =
    new Picture(
      gtk_picture_new_for_resource(
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
end Picture
