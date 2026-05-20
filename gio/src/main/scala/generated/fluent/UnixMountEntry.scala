package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GUnixMountEntry

/** Defines a Unix mount entry (e.g. <filename>/media/cdrom</filename>). This
  * corresponds roughly to a mtab entry.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class UnixMountEntry private[gnome] (raw: Ptr[GUnixMountEntry]):

  def getUnsafeRawPointer(): Ptr[GUnixMountEntry] = this.raw

end UnixMountEntry
object UnixMountEntry:
  def fromRaw(ptr: Ptr[GUnixMountEntry]): UnixMountEntry = new UnixMountEntry(
    ptr
  )
end UnixMountEntry
