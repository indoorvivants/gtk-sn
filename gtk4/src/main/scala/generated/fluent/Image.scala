package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Paintable
import sn.gnome.gdkpixbuf.fluent.Pixbuf
import sn.gnome.gio.fluent.Icon
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkIconSize
import sn.gnome.gtk4.internal.GtkImage
import sn.gnome.gtk4.internal.GtkImageType

class Image(raw: Ptr[GtkImage])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def clear(): Unit = gtk_image_clear(this.raw.asInstanceOf)

  def getGicon(): Icon =
    new Icon.Abstract(gtk_image_get_gicon(this.raw.asInstanceOf).asInstanceOf)

  def getIconName()(using Zone): String = fromCString(
    gtk_image_get_icon_name(this.raw.asInstanceOf).asInstanceOf
  )

  def getIconSize(): GtkIconSize = gtk_image_get_icon_size(
    this.raw.asInstanceOf
  )

  def getPaintable(): Paintable = new Paintable.Abstract(
    gtk_image_get_paintable(this.raw.asInstanceOf).asInstanceOf
  )

  def getPixelSize(): Int = gtk_image_get_pixel_size(this.raw.asInstanceOf)

  def getStorageType(): GtkImageType = gtk_image_get_storage_type(
    this.raw.asInstanceOf
  )

  def setFromFile(filename: String | CString)(using Zone): Unit =
    gtk_image_set_from_file(
      this.raw.asInstanceOf,
      __sn_extract_string(filename)
    )

  def setFromGicon(icon: Icon): Unit = gtk_image_set_from_gicon(
    this.raw.asInstanceOf,
    icon.getUnsafeRawPointer().asInstanceOf
  )

  def setFromIconName(icon_name: String | CString)(using Zone): Unit =
    gtk_image_set_from_icon_name(
      this.raw.asInstanceOf,
      __sn_extract_string(icon_name)
    )

  def setFromPaintable(paintable: Paintable): Unit =
    gtk_image_set_from_paintable(
      this.raw.asInstanceOf,
      paintable.getUnsafeRawPointer().asInstanceOf
    )

  def setFromPixbuf(pixbuf: Pixbuf): Unit = gtk_image_set_from_pixbuf(
    this.raw.asInstanceOf,
    pixbuf.getUnsafeRawPointer().asInstanceOf
  )

  def setFromResource(resource_path: String | CString)(using Zone): Unit =
    gtk_image_set_from_resource(
      this.raw.asInstanceOf,
      __sn_extract_string(resource_path)
    )

  def setIconSize(icon_size: GtkIconSize): Unit =
    gtk_image_set_icon_size(this.raw.asInstanceOf, icon_size)

  def setPixelSize(pixel_size: Int): Unit =
    gtk_image_set_pixel_size(this.raw.asInstanceOf, pixel_size)

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Image

object Image:
  def apply(): Image = new Image(gtk_image_new().asInstanceOf)
  def fromFile(filename: String | CString)(using Zone): Image = new Image(
    gtk_image_new_from_file(__sn_extract_string(filename)).asInstanceOf
  )
  def fromGicon(icon: Icon): Image = new Image(
    gtk_image_new_from_gicon(
      icon.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
  def fromIconName(icon_name: String | CString)(using Zone): Image = new Image(
    gtk_image_new_from_icon_name(__sn_extract_string(icon_name)).asInstanceOf
  )
  def fromPaintable(paintable: Paintable): Image = new Image(
    gtk_image_new_from_paintable(
      paintable.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
  def fromPixbuf(pixbuf: Pixbuf): Image = new Image(
    gtk_image_new_from_pixbuf(
      pixbuf.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
  def fromResource(resource_path: String | CString)(using Zone): Image =
    new Image(
      gtk_image_new_from_resource(
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
end Image
