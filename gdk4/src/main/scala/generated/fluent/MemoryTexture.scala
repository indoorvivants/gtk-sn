package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.{MemoryFormat, Paintable, Texture}
import sn.gnome.gdk4.internal.GdkMemoryTexture
import sn.gnome.gio.{Icon, LoadableIcon}
import sn.gnome.glib.Bytes
import sn.gnome.glib.internal.gsize
import sn.gnome.gobject.runtime.*

/** A `GdkTexture` representing image data in memory.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class MemoryTexture private[gnome] (raw: Ptr[GdkMemoryTexture])
    extends Texture(raw.asInstanceOf),
      Paintable,
      Icon,
      LoadableIcon:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end MemoryTexture

object MemoryTexture:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GdkMemoryTexture])(using Runtime) =
    summon[Runtime].getOrCreate[MemoryTexture](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new MemoryTexture(ptr)
    )

  /** Creates a new texture for a blob of image data.
    *
    * The `GBytes` must contain @stride × @height pixels in the given format.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      width: Int /* Some(CInt) */,
      height: Int /* Some(CInt) */,
      format: sn.gnome.gdk4.MemoryFormat /* Some(GdkMemoryFormat) */,
      bytes: sn.gnome.glib.Bytes /* Some(Ptr[_root_.sn.gnome.glib.internal.GBytes]) */,
      stride: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.gsize) */
  )(using Runtime): MemoryTexture =
    val raw: Ptr[Byte] = gdk_memory_texture_new(
      width,
      height,
      format.raw,
      bytes.getUnsafeRawPointer().asInstanceOf,
      gsize(stride)
    ).asInstanceOf
    summon[Runtime].getOrCreate[MemoryTexture](
      raw,
      r => MemoryTexture.applyUnsafe(r.asInstanceOf)
    )
  end apply
end MemoryTexture
