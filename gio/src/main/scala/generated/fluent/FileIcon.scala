package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.{File, Icon, LoadableIcon}
import sn.gnome.gio.internal.GFileIcon
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*

/** #GFileIcon specifies an icon by pointing to an image file to be used as
  * icon.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FileIcon private[gnome] (raw: Ptr[GFileIcon])
    extends Object(raw.asInstanceOf),
      Icon,
      LoadableIcon:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the #GFile associated with the given @icon.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFile(): File /* None */ =
    new File.Abstract(
      g_file_icon_get_file(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileIcon]]
      ).asInstanceOf
    )
  end getFile

end FileIcon

object FileIcon:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GFileIcon])(using Runtime) = summon[Runtime]
    .getOrCreate[FileIcon](ptr.asInstanceOf[Ptr[Byte]], p => new FileIcon(ptr))

  /** Creates a new icon for a file.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(file: File /* Some(Ptr[GFile]) */ )(using Runtime): FileIcon =
    val raw: Ptr[Byte] = g_file_icon_new(
      file.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[FileIcon](raw, r => FileIcon.applyUnsafe(r.asInstanceOf))
  end apply
end FileIcon
