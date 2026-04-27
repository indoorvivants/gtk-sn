package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.File
import sn.gnome.gio.fluent.Icon
import sn.gnome.gio.fluent.LoadableIcon
import sn.gnome.gio.internal.GFileIcon
import sn.gnome.gobject.fluent.Object

class FileIcon(raw: Ptr[GFileIcon])
    extends Object(raw.asInstanceOf),
      Icon,
      LoadableIcon:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getFile(): File =
    new File.Abstract(g_file_icon_get_file(this.raw.asInstanceOf).asInstanceOf)

end FileIcon

object FileIcon:
  def apply(file: File): FileIcon = new FileIcon(
    g_file_icon_new(file.getUnsafeRawPointer().asInstanceOf).asInstanceOf
  )
end FileIcon
