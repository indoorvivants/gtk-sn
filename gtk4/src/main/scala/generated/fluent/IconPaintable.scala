package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Paintable
import sn.gnome.gio.fluent.File
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.SymbolicPaintable
import sn.gnome.gtk4.internal.GtkIconPaintable

/** Contains information found when looking up an icon in `GtkIconTheme`.
  *
  * `GtkIconPaintable` implements `GdkPaintable`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class IconPaintable(raw: Ptr[GtkIconPaintable])
    extends Object(raw.asInstanceOf),
      Paintable,
      SymbolicPaintable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the `GFile` that was used to load the icon.
    *
    * Returns %NULL if the icon was not loaded from a file.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFile(): File /* None */ = new File.Abstract(
    gtk_icon_paintable_get_file(
      this.raw.asInstanceOf[Ptr[GtkIconPaintable]]
    ).asInstanceOf
  )

  /** Get the icon name being used for this icon.
    *
    * When an icon looked up in the icon theme was not available, the icon theme
    * may use fallback icons - either those specified to
    * gtk_icon_theme_lookup_icon() or the always-available "image-missing". The
    * icon chosen is returned by this function.
    *
    * If the icon was created without an icon theme, this function returns
    * %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIconName()(using Zone): String /* None */ = fromCString(
    gtk_icon_paintable_get_icon_name(
      this.raw.asInstanceOf[Ptr[GtkIconPaintable]]
    ).asInstanceOf
  )

  /** Checks if the icon is symbolic or not.
    *
    * This currently uses only the file name and not the file contents for
    * determining this. This behaviour may change in the future.
    *
    * Note that to render a symbolic `GtkIconPaintable` properly (with
    * recoloring), you have to set its icon name on a `GtkImage`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isSymbolic(): Boolean /* None */ = gtk_icon_paintable_is_symbolic(
    this.raw.asInstanceOf[Ptr[GtkIconPaintable]]
  ).value.!=(0)

end IconPaintable

object IconPaintable:
  /** Creates a `GtkIconPaintable` for a file with a given size and scale.
    *
    * The icon can then be rendered by using it as a `GdkPaintable`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def forFile(
      file: File /* Some(Ptr[_root_.sn.gnome.gio.internal.GFile]) */,
      size: Int /* Some(CInt) */,
      scale: Int /* Some(CInt) */
  )(using Runtime): IconPaintable =
    val raw: Ptr[Byte] = gtk_icon_paintable_new_for_file(
      file.getUnsafeRawPointer().asInstanceOf,
      size,
      scale
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[IconPaintable](raw, r => new IconPaintable(r.asInstanceOf))
  end forFile
end IconPaintable
