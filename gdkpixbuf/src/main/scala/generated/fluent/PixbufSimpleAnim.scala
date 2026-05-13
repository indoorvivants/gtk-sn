package sn.gnome.gdkpixbuf

import _root_.sn.gnome.gdkpixbuf.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdkpixbuf.{Pixbuf, PixbufAnimation}
import sn.gnome.gdkpixbuf.internal.{GdkPixbufAnimation, GdkPixbufSimpleAnim}
import sn.gnome.glib.internal.{gboolean, gfloat, gint}
import sn.gnome.gobject.runtime.*

/** An opaque struct representing a simple animation.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class PixbufSimpleAnim private[gnome] (raw: Ptr[GdkPixbufSimpleAnim])
    extends PixbufAnimation(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Adds a new frame to @animation. The @pixbuf must have the dimensions
    * specified when the animation was constructed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addFrame(
      pixbuf: sn.gnome.gdkpixbuf.Pixbuf /* Some(Ptr[GdkPixbuf]) */
  )(using Runtime): Unit /* None */ =
    gdk_pixbuf_simple_anim_add_frame(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbufSimpleAnim]],
      pixbuf.getUnsafeRawPointer().asInstanceOf
    )
  end addFrame

  /** Gets whether @animation should loop indefinitely when it reaches the end.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLoop(): Boolean /* None */ =
    gdk_pixbuf_simple_anim_get_loop(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbufSimpleAnim]]
    ).value.!=(0)
  end getLoop

  /** Adds a reference to an animation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def ref()(using
      Runtime
  ): sn.gnome.gdkpixbuf.PixbufAnimation /* None */ =
    sn.gnome.gdkpixbuf.PixbufAnimation.applyUnsafe(
      gdk_pixbuf_animation_ref(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbufAnimation]]
      ).asInstanceOf
    )
  end ref

  /** Sets whether @animation should loop indefinitely when it reaches the end.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setLoop(
      loop: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gdk_pixbuf_simple_anim_set_loop(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbufSimpleAnim]],
      gboolean(gint((if loop == true then 1 else 0)))
    )
  end setLoop

  /** Removes a reference from an animation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def unref(): Unit /* None */ =
    gdk_pixbuf_animation_unref(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbufAnimation]]
    )
  end unref

end PixbufSimpleAnim

object PixbufSimpleAnim:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GdkPixbufSimpleAnim])(using Runtime) =
    summon[Runtime].getOrCreate[PixbufSimpleAnim](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new PixbufSimpleAnim(ptr)
    )

  /** Creates a new, empty animation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      width: Int /* Some(_root_.sn.gnome.glib.internal.gint) */,
      height: Int /* Some(_root_.sn.gnome.glib.internal.gint) */,
      rate: Float /* Some(_root_.sn.gnome.glib.internal.gfloat) */
  )(using Runtime): PixbufSimpleAnim =
    val raw: Ptr[Byte] = gdk_pixbuf_simple_anim_new(
      gint(width),
      gint(height),
      gfloat(rate)
    ).asInstanceOf
    summon[Runtime].getOrCreate[PixbufSimpleAnim](
      raw,
      r => PixbufSimpleAnim.applyUnsafe(r.asInstanceOf)
    )
  end apply
end PixbufSimpleAnim
