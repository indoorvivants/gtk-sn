package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.internal.GdkPaintableInterface

/** The list of functions that can be implemented for the `GdkPaintable`
  * interface.
  *
  * Note that apart from the [vfunc@Gdk.Paintable.snapshot] function, no virtual
  * function of this interface is mandatory to implement, though it is a good
  * idea to implement [vfunc@Gdk.Paintable.get_current_image] for non-static
  * paintables and [vfunc@Gdk.Paintable.get_flags] if the image is not dynamic
  * as the default implementation returns no flags and that will make the
  * implementation likely quite slow.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class PaintableInterface private[gnome] (raw: Ptr[GdkPaintableInterface]):

  def getUnsafeRawPointer(): Ptr[GdkPaintableInterface] = this.raw

  @annotation.compileTimeOnly("[field snapshot]: Field is missing <type>")
  private def snapshot__ = ???
  @annotation.compileTimeOnly(
    "[field get_current_image]: Field is missing <type>"
  )
  private def getCurrentImage__ = ???
  @annotation.compileTimeOnly("[field get_flags]: Field is missing <type>")
  private def getFlags__ = ???
  @annotation.compileTimeOnly(
    "[field get_intrinsic_width]: Field is missing <type>"
  )
  private def getIntrinsicWidth__ = ???
  @annotation.compileTimeOnly(
    "[field get_intrinsic_height]: Field is missing <type>"
  )
  private def getIntrinsicHeight__ = ???
  @annotation.compileTimeOnly(
    "[field get_intrinsic_aspect_ratio]: Field is missing <type>"
  )
  private def getIntrinsicAspectRatio__ = ???
end PaintableInterface

object PaintableInterface:
  def fromRaw(ptr: Ptr[GdkPaintableInterface]): PaintableInterface =
    new PaintableInterface(ptr)
end PaintableInterface
