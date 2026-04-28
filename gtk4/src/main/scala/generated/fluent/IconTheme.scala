package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Display
import sn.gnome.gio.fluent.Icon
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.IconPaintable
import sn.gnome.gtk4.internal.GtkIconLookupFlags
import sn.gnome.gtk4.internal.GtkIconTheme
import sn.gnome.gtk4.internal.GtkTextDirection

class IconTheme(raw: Ptr[GtkIconTheme]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def addResourcePath(path: String | CString)(using Zone): Unit =
    gtk_icon_theme_add_resource_path(
      this.raw.asInstanceOf,
      __sn_extract_string(path)
    )

  def addSearchPath(path: String | CString)(using Zone): Unit =
    gtk_icon_theme_add_search_path(
      this.raw.asInstanceOf,
      __sn_extract_string(path)
    )

  def getDisplay(): Display = new Display(
    gtk_icon_theme_get_display(this.raw.asInstanceOf).asInstanceOf
  )

  def getIconSizes(icon_name: String | CString)(using Zone): Ptr[Int] =
    gtk_icon_theme_get_icon_sizes(
      this.raw.asInstanceOf,
      __sn_extract_string(icon_name)
    )

  def getThemeName()(using Zone): String = fromCString(
    gtk_icon_theme_get_theme_name(this.raw.asInstanceOf).asInstanceOf
  )

  def hasGicon(gicon: Icon): Boolean = gtk_icon_theme_has_gicon(
    this.raw.asInstanceOf,
    gicon.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

  def hasIcon(icon_name: String | CString)(using Zone): Boolean =
    gtk_icon_theme_has_icon(
      this.raw.asInstanceOf,
      __sn_extract_string(icon_name)
    ).value.!=(0)

  def lookupByGicon(
      icon: Icon,
      size: Int,
      scale: Int,
      direction: GtkTextDirection,
      flags: GtkIconLookupFlags
  ): IconPaintable = new IconPaintable(
    gtk_icon_theme_lookup_by_gicon(
      this.raw.asInstanceOf,
      icon.getUnsafeRawPointer().asInstanceOf,
      size,
      scale,
      direction,
      flags
    ).asInstanceOf
  )

  // Method lookup_icon contains an array parameter, which is not supported yet

  // Method set_resource_path contains an array parameter, which is not supported yet

  // Method set_search_path contains an array parameter, which is not supported yet

  def setThemeName(theme_name: String | CString)(using Zone): Unit =
    gtk_icon_theme_set_theme_name(
      this.raw.asInstanceOf,
      __sn_extract_string(theme_name)
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end IconTheme

object IconTheme:
  def apply(): IconTheme = new IconTheme(gtk_icon_theme_new().asInstanceOf)
end IconTheme
