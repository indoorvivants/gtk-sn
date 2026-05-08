package sn.gnome.gdkpixbuf.fluent

import _root_.sn.gnome.gdkpixbuf.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdkpixbuf.fluent.{Pixbuf, PixbufAnimation}
import sn.gnome.gdkpixbuf.internal.GdkPixbufSimpleAnim
import sn.gnome.glib.internal.{gboolean, gfloat, gint}
import sn.gnome.gobject.runtime.*

/** An opaque struct representing a simple animation.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class PixbufSimpleAnim(raw: Ptr[GdkPixbufSimpleAnim])
    extends PixbufAnimation(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Adds a new frame to @animation. The @pixbuf must have the dimensions
    * specified when the animation was constructed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addFrame(pixbuf: Pixbuf /* Some(Ptr[GdkPixbuf]) */ ): Unit /* None */ =
    gdk_pixbuf_simple_anim_add_frame(
      this.raw.asInstanceOf[Ptr[GdkPixbufSimpleAnim]],
      pixbuf.getUnsafeRawPointer().asInstanceOf
    )

  /** Gets whether @animation should loop indefinitely when it reaches the end.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLoop(): Boolean /* None */ = gdk_pixbuf_simple_anim_get_loop(
    this.raw.asInstanceOf[Ptr[GdkPixbufSimpleAnim]]
  ).value.!=(0)

  /** Sets whether @animation should loop indefinitely when it reaches the end.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setLoop(
      loop: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gdk_pixbuf_simple_anim_set_loop(
    this.raw.asInstanceOf[Ptr[GdkPixbufSimpleAnim]],
    gboolean(gint((if loop == true then 1 else 0)))
  )

end PixbufSimpleAnim

object PixbufSimpleAnim:
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
      r => new PixbufSimpleAnim(r.asInstanceOf)
    )
  end apply
end PixbufSimpleAnim
