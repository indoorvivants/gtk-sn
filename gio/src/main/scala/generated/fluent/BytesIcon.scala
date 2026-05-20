package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.{Icon, LoadableIcon}
import sn.gnome.gio.internal.GBytesIcon
import sn.gnome.glib.Bytes
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*

/** #GBytesIcon specifies an image held in memory in a common format (usually
  * png) to be used as icon.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class BytesIcon private[gnome] (raw: Ptr[GBytesIcon])
    extends Object(raw.asInstanceOf),
      Icon,
      LoadableIcon:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the #GBytes associated with the given @icon.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getBytes(): sn.gnome.glib.Bytes /* None */ =
    sn.gnome.glib.Bytes.fromRaw(
      g_bytes_icon_get_bytes(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GBytesIcon]]
      )
    )
  end getBytes

end BytesIcon

object BytesIcon:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GBytesIcon])(using Runtime) =
    summon[Runtime].getOrCreate[BytesIcon](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new BytesIcon(ptr)
    )

  /** Creates a new icon for a bytes.
    *
    * This cannot fail, but loading and interpreting the bytes may fail later on
    * (for example, if g_loadable_icon_load() is called) if the image is
    * invalid.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      bytes: sn.gnome.glib.Bytes /* Some(Ptr[_root_.sn.gnome.glib.internal.GBytes]) */
  )(using Runtime): BytesIcon =
    val raw: Ptr[Byte] = g_bytes_icon_new(
      bytes.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[BytesIcon](raw, r => BytesIcon.applyUnsafe(r.asInstanceOf))
  end apply
end BytesIcon
