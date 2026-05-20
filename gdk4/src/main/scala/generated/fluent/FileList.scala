package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.internal.GdkFileList
import sn.gnome.glib.SList

/** An opaque type representing a list of files.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FileList private[gnome] (raw: Ptr[GdkFileList]):

  def getUnsafeRawPointer(): Ptr[GdkFileList] = this.raw

  /** Retrieves the list of files inside a `GdkFileList`.
    *
    * This function is meant for language bindings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFiles(): sn.gnome.glib.SList /* None */ =
    sn.gnome.glib.SList.fromRaw(
      gdk_file_list_get_files(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkFileList]]
      )
    )
  end getFiles

end FileList

object FileList:
  def fromRaw(ptr: Ptr[GdkFileList]): FileList = new FileList(ptr)
end FileList
