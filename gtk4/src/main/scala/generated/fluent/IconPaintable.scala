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

class IconPaintable(raw: Ptr[GtkIconPaintable])
    extends Object(raw.asInstanceOf),
      Paintable,
      SymbolicPaintable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getFile(): File = new File.Abstract(
    gtk_icon_paintable_get_file(this.raw.asInstanceOf).asInstanceOf
  )

  def getIconName()(using Zone): String = fromCString(
    gtk_icon_paintable_get_icon_name(this.raw.asInstanceOf).asInstanceOf
  )

  def isSymbolic(): Boolean =
    gtk_icon_paintable_is_symbolic(this.raw.asInstanceOf).value.!=(0)

end IconPaintable

object IconPaintable:
  def forFile(file: File, size: Int, scale: Int): IconPaintable =
    new IconPaintable(
      gtk_icon_paintable_new_for_file(
        file.getUnsafeRawPointer().asInstanceOf,
        size,
        scale
      ).asInstanceOf
    )
end IconPaintable
