package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.{File, Icon, LoadableIcon}
import sn.gnome.gio.internal.GFileIcon
import sn.gnome.gobject.fluent.Object

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * #GFileIcon specifies an icon by pointing to an image file to be used as
  * icon.
  */
class FileIcon(raw: Ptr[GFileIcon])
    extends Object(raw.asInstanceOf),
      Icon,
      LoadableIcon:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the #GFile associated with the given @icon.
    */
  def getFile(): File /* None */ = new File.Abstract(
    g_file_icon_get_file(this.raw.asInstanceOf[Ptr[GFileIcon]]).asInstanceOf
  )

end FileIcon

object FileIcon:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new icon for a file.
    */
  def apply(file: File /* Some(Ptr[GFile]) */ ): FileIcon = new FileIcon(
    g_file_icon_new(file.getUnsafeRawPointer().asInstanceOf).asInstanceOf
  )
end FileIcon
