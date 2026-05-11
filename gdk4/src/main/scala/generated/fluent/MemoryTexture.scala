package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.{Paintable, Texture}
import sn.gnome.gdk4.internal.GdkMemoryTexture
import sn.gnome.gio.fluent.{Icon, LoadableIcon}
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
  @annotation.compileTimeOnly(
    "[bytes]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))"
  )
  private def `new`() = ???

end MemoryTexture
