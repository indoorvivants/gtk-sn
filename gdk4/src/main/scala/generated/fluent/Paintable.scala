package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.{Paintable, PaintableFlags, Snapshot}
import sn.gnome.gobject.runtime.*

trait Paintable:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Compute a concrete size for the `GdkPaintable`.
    *
    * Applies the sizing algorithm outlined in the [CSS Image
    * spec](https://drafts.csswg.org/css-images-3/#default-sizing) to the given @paintable.
    * See that link for more details.
    *
    * It is not necessary to call this function when both @specified_width and @specified_height
    * are known, but it is useful to call this function in GtkWidget:measure
    * implementations to compute the other dimension when only one dimension is
    * given.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method compute_concrete_size]: Method compute_concrete_size contains an OUT parameter, which is not supported yet"
  )
  private def computeConcreteSize__ = ???

  /** Gets an immutable paintable for the current contents displayed by @paintable.
    *
    * This is useful when you want to retain the current state of an animation,
    * for example to take a screenshot of a running animation.
    *
    * If the @paintable is already immutable, it will return itself.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCurrentImage(): sn.gnome.gdk4.Paintable /* None */ =
    new Paintable.Abstract(
      gdk_paintable_get_current_image(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPaintable]]
      ).asInstanceOf
    )
  end getCurrentImage

  /** Get flags for the paintable.
    *
    * This is oftentimes useful for optimizations.
    *
    * See [flags@Gdk.PaintableFlags] for the flags and what they mean.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFlags(): sn.gnome.gdk4.PaintableFlags /* None */ =
    sn.gnome.gdk4.PaintableFlags.fromRaw(
      gdk_paintable_get_flags(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPaintable]]
      )
    )
  end getFlags

  /** Gets the preferred aspect ratio the @paintable would like to be displayed
    * at.
    *
    * The aspect ratio is the width divided by the height, so a value of 0.5
    * means that the @paintable prefers to be displayed twice as high as it is
    * wide. Consumers of this interface can use this to preserve aspect ratio
    * when displaying the paintable.
    *
    * This is a purely informational value and does not in any way limit the
    * values that may be passed to [method@Gdk.Paintable.snapshot].
    *
    * Usually when a @paintable returns nonzero values from
    * [method@Gdk.Paintable.get_intrinsic_width] and
    * [method@Gdk.Paintable.get_intrinsic_height] the aspect ratio should
    * conform to those values, though that is not required.
    *
    * If the @paintable does not have a preferred aspect ratio, it returns 0.
    * Negative values are never returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIntrinsicAspectRatio(): Double /* None */ =
    gdk_paintable_get_intrinsic_aspect_ratio(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPaintable]]
    )
  end getIntrinsicAspectRatio

  /** Gets the preferred height the @paintable would like to be displayed at.
    *
    * Consumers of this interface can use this to reserve enough space to draw
    * the paintable.
    *
    * This is a purely informational value and does not in any way limit the
    * values that may be passed to [method@Gdk.Paintable.snapshot].
    *
    * If the @paintable does not have a preferred height, it returns 0. Negative
    * values are never returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIntrinsicHeight(): Int /* None */ =
    gdk_paintable_get_intrinsic_height(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPaintable]]
    )
  end getIntrinsicHeight

  /** Gets the preferred width the @paintable would like to be displayed at.
    *
    * Consumers of this interface can use this to reserve enough space to draw
    * the paintable.
    *
    * This is a purely informational value and does not in any way limit the
    * values that may be passed to [method@Gdk.Paintable.snapshot].
    *
    * If the @paintable does not have a preferred width, it returns 0. Negative
    * values are never returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIntrinsicWidth(): Int /* None */ =
    gdk_paintable_get_intrinsic_width(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPaintable]]
    )
  end getIntrinsicWidth

  /** Called by implementations of `GdkPaintable` to invalidate their contents.
    *
    * Unless the contents are invalidated, implementations must guarantee that
    * multiple calls of [method@Gdk.Paintable.snapshot] produce the same output.
    *
    * This function will emit the [signal@Gdk.Paintable::invalidate-contents]
    * signal.
    *
    * If a @paintable reports the %GDK_PAINTABLE_STATIC_CONTENTS flag, it must
    * not call this function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def invalidateContents(): Unit /* None */ =
    gdk_paintable_invalidate_contents(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPaintable]]
    )
  end invalidateContents

  /** Called by implementations of `GdkPaintable` to invalidate their size.
    *
    * As long as the size is not invalidated, @paintable must return the same
    * values for its intrinsic width, height and aspect ratio.
    *
    * This function will emit the [signal@Gdk.Paintable::invalidate-size]
    * signal.
    *
    * If a @paintable reports the %GDK_PAINTABLE_STATIC_SIZE flag, it must not
    * call this function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def invalidateSize(): Unit /* None */ =
    gdk_paintable_invalidate_size(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPaintable]]
    )
  end invalidateSize

  /** Snapshots the given paintable with the given @width and @height.
    *
    * The paintable is drawn at the current (0,0) offset of the @snapshot. If @width
    * and @height are not larger than zero, this function will do nothing.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def snapshot(
      snapshot: sn.gnome.gdk4.Snapshot /* Some(Ptr[GdkSnapshot]) */,
      width: Double /* Some(Double) */,
      height: Double /* Some(Double) */
  )(using Runtime): Unit /* None */ =
    gdk_paintable_snapshot(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPaintable]],
      snapshot.getUnsafeRawPointer().asInstanceOf,
      width,
      height
    )
  end snapshot

end Paintable

object Paintable:
  class Abstract(raw: Ptr[Byte]) extends Paintable:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end Paintable
