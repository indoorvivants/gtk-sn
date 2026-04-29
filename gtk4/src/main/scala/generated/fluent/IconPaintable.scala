package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Paintable
import sn.gnome.gio.fluent.File
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.SymbolicPaintable
import sn.gnome.gtk4.internal.GtkIconPaintable

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Contains information found when looking up an icon in `GtkIconTheme`.
  *
  * `GtkIconPaintable` implements `GdkPaintable`.
  */
class IconPaintable(raw: Ptr[GtkIconPaintable])
    extends Object(raw.asInstanceOf),
      Paintable,
      SymbolicPaintable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the `GFile` that was used to load the icon.
    *
    * Returns %NULL if the icon was not loaded from a file.
    */
  def getFile(): File = new File.Abstract(
    gtk_icon_paintable_get_file(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Get the icon name being used for this icon.
    *
    * When an icon looked up in the icon theme was not available, the icon theme
    * may use fallback icons - either those specified to
    * gtk_icon_theme_lookup_icon() or the always-available "image-missing". The
    * icon chosen is returned by this function.
    *
    * If the icon was created without an icon theme, this function returns
    * %NULL.
    */
  def getIconName()(using Zone): String = fromCString(
    gtk_icon_paintable_get_icon_name(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks if the icon is symbolic or not.
    *
    * This currently uses only the file name and not the file contents for
    * determining this. This behaviour may change in the future.
    *
    * Note that to render a symbolic `GtkIconPaintable` properly (with
    * recoloring), you have to set its icon name on a `GtkImage`.
    */
  def isSymbolic(): Boolean =
    gtk_icon_paintable_is_symbolic(this.raw.asInstanceOf).value.!=(0)

end IconPaintable

object IconPaintable:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a `GtkIconPaintable` for a file with a given size and scale.
    *
    * The icon can then be rendered by using it as a `GdkPaintable`.
    */
  def forFile(file: File, size: Int, scale: Int): IconPaintable =
    new IconPaintable(
      gtk_icon_paintable_new_for_file(
        file.getUnsafeRawPointer().asInstanceOf,
        size,
        scale
      ).asInstanceOf
    )
end IconPaintable
