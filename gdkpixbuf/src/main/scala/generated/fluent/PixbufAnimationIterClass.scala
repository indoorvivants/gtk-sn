package sn.gnome.gdkpixbuf

import _root_.sn.gnome.gdkpixbuf.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdkpixbuf.internal.GdkPixbufAnimationIterClass

/** Modules supporting animations must derive a type from
  * #GdkPixbufAnimationIter, providing suitable implementations of the virtual
  * functions.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class PixbufAnimationIterClass private[gnome] (
    raw: Ptr[GdkPixbufAnimationIterClass]
):

  def getUnsafeRawPointer(): Ptr[GdkPixbufAnimationIterClass] = this.raw

  /** the parent class
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def parentClass: sn.gnome.gobject.ObjectClass /* None */ =
    sn.gnome.gobject.ObjectClass.fromRaw((!raw).parent_class)
  @annotation.compileTimeOnly("[field get_delay_time]: Field is missing <type>")
  private def getDelayTime__ = ???
  @annotation.compileTimeOnly("[field get_pixbuf]: Field is missing <type>")
  private def getPixbuf__ = ???
  @annotation.compileTimeOnly(
    "[field on_currently_loading_frame]: Field is missing <type>"
  )
  private def onCurrentlyLoadingFrame__ = ???
  @annotation.compileTimeOnly("[field advance]: Field is missing <type>")
  private def advance__ = ???
end PixbufAnimationIterClass
object PixbufAnimationIterClass:
  def fromRaw(ptr: Ptr[GdkPixbufAnimationIterClass]): PixbufAnimationIterClass =
    new PixbufAnimationIterClass(ptr)
end PixbufAnimationIterClass
