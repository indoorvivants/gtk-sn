package sn.gnome.gdkpixbuf

import _root_.sn.gnome.gdkpixbuf.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdkpixbuf.internal.GdkPixbufAnimationClass

/** Modules supporting animations must derive a type from #GdkPixbufAnimation,
  * providing suitable implementations of the virtual functions.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class PixbufAnimationClass private[gnome] (raw: Ptr[GdkPixbufAnimationClass]):

  def getUnsafeRawPointer(): Ptr[GdkPixbufAnimationClass] = this.raw

  /** the parent class
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def parentClass: sn.gnome.gobject.ObjectClass /* None */ =
    sn.gnome.gobject.ObjectClass.fromRaw((!raw).parent_class)
  @annotation.compileTimeOnly(
    "[field is_static_image]: Field is missing <type>"
  )
  private def isStaticImage__ = ???
  @annotation.compileTimeOnly(
    "[field get_static_image]: Field is missing <type>"
  )
  private def getStaticImage__ = ???
  @annotation.compileTimeOnly("[field get_size]: Field is missing <type>")
  private def getSize__ = ???
  @annotation.compileTimeOnly("[field get_iter]: Field is missing <type>")
  private def getIter__ = ???
end PixbufAnimationClass
object PixbufAnimationClass:
  def fromRaw(ptr: Ptr[GdkPixbufAnimationClass]): PixbufAnimationClass =
    new PixbufAnimationClass(ptr)
end PixbufAnimationClass
