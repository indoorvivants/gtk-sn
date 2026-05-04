package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.{Paintable, Texture}
import sn.gnome.gdk4.internal.GdkMemoryTexture
import sn.gnome.gio.fluent.{Icon, LoadableIcon}

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A `GdkTexture` representing image data in memory.
  */
class MemoryTexture(raw: Ptr[GdkMemoryTexture])
    extends Texture(raw.asInstanceOf),
      Paintable,
      Icon,
      LoadableIcon:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end MemoryTexture

object MemoryTexture:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new texture for a blob of image data.
    *
    * The `GBytes` must contain @stride × @height pixels in the given format.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))"
  )
  def `new`() = ???

end MemoryTexture
