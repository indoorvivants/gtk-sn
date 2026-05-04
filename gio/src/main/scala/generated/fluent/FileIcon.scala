package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.{File, Icon, LoadableIcon}
import sn.gnome.gio.internal.GFileIcon
import sn.gnome.gobject.fluent.Object

/** #GFileIcon specifies an icon by pointing to an image file to be used as
  * icon.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FileIcon(raw: Ptr[GFileIcon])
    extends Object(raw.asInstanceOf),
      Icon,
      LoadableIcon:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the #GFile associated with the given @icon.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFile(): File /* None */ = new File.Abstract(
    g_file_icon_get_file(this.raw.asInstanceOf[Ptr[GFileIcon]]).asInstanceOf
  )

end FileIcon

object FileIcon:
  /** Creates a new icon for a file.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(file: File /* Some(Ptr[GFile]) */ ): FileIcon = new FileIcon(
    g_file_icon_new(file.getUnsafeRawPointer().asInstanceOf).asInstanceOf
  )
end FileIcon
