package sn.gnome.gsk4

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.graphene.{Point, Rect, Size}
import sn.gnome.gsk4.RoundedRect
import sn.gnome.gsk4.internal.GskRoundedRect

/** A rectangular region with rounded corners.
  *
  * Application code should normalize rectangles using
  * [method@Gsk.RoundedRect.normalize]; this function will ensure that the
  * bounds of the rectangle are normalized and ensure that the corner values are
  * positive and the corners do not overlap.
  *
  * All functions taking a `GskRoundedRect` as an argument will internally
  * operate on a normalized copy; all functions returning a `GskRoundedRect`
  * will always return a normalized one.
  *
  * The algorithm used for normalizing corner sizes is described in [the CSS
  * specification](https://drafts.csswg.org/css-backgrounds-3/#border-radius).
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class RoundedRect private[gnome] (raw: Ptr[GskRoundedRect]):

  def getUnsafeRawPointer(): Ptr[GskRoundedRect] = this.raw

  /** the bounds of the rectangle
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def bounds: sn.gnome.graphene.Rect /* None */ = (!raw).bounds
    .asInstanceOf[_root_.sn.gnome.graphene.internal.graphene_rect_t]

  /** the bounds of the rectangle
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def bounds_=(value: sn.gnome.graphene.Rect /* None */ ): Unit =
    (!raw).bounds_=(
      value
        .getUnsafeRawPointer()
        .asInstanceOf
        .asInstanceOf[_root_.sn.gnome.graphene.internal.graphene_rect_t]
    )

  /** the size of the 4 rounded corners
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly("[field corner]: key not found: @type")
  private def corner__ = ???

  /** Checks if the given @point is inside the rounded rectangle.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def containsPoint(
      point: sn.gnome.graphene.Point /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_point_t]) */
  ): Boolean /* None */ =
    gsk_rounded_rect_contains_point(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRoundedRect]],
      point.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end containsPoint

  /** Checks if the given @rect is contained inside the rounded rectangle.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def containsRect(
      rect: sn.gnome.graphene.Rect /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_rect_t]) */
  ): Boolean /* None */ =
    gsk_rounded_rect_contains_rect(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRoundedRect]],
      rect.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end containsRect

  /** Initializes the given `GskRoundedRect` with the given values.
    *
    * This function will implicitly normalize the `GskRoundedRect` before
    * returning.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def init(
      bounds: sn.gnome.graphene.Rect /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_rect_t]) */,
      top_left: sn.gnome.graphene.Size /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_size_t]) */,
      top_right: sn.gnome.graphene.Size /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_size_t]) */,
      bottom_right: sn.gnome.graphene.Size /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_size_t]) */,
      bottom_left: sn.gnome.graphene.Size /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_size_t]) */
  ): sn.gnome.gsk4.RoundedRect /* None */ =
    sn.gnome.gsk4.RoundedRect.fromRaw(
      gsk_rounded_rect_init(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRoundedRect]],
        bounds.getUnsafeRawPointer().asInstanceOf,
        top_left.getUnsafeRawPointer().asInstanceOf,
        top_right.getUnsafeRawPointer().asInstanceOf,
        bottom_right.getUnsafeRawPointer().asInstanceOf,
        bottom_left.getUnsafeRawPointer().asInstanceOf
      )
    )
  end init

  /** Initializes @self using the given @src rectangle.
    *
    * This function will not normalize the `GskRoundedRect`, so make sure the
    * source is normalized.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def initCopy(
      src: sn.gnome.gsk4.RoundedRect /* Some(Ptr[GskRoundedRect]) */
  ): sn.gnome.gsk4.RoundedRect /* None */ =
    sn.gnome.gsk4.RoundedRect.fromRaw(
      gsk_rounded_rect_init_copy(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRoundedRect]],
        src.getUnsafeRawPointer().asInstanceOf
      )
    )
  end initCopy

  /** Initializes @self to the given @bounds and sets the radius of all four
    * corners to @radius.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def initFromRect(
      bounds: sn.gnome.graphene.Rect /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_rect_t]) */,
      radius: Float /* Some(Float) */
  ): sn.gnome.gsk4.RoundedRect /* None */ =
    sn.gnome.gsk4.RoundedRect.fromRaw(
      gsk_rounded_rect_init_from_rect(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRoundedRect]],
        bounds.getUnsafeRawPointer().asInstanceOf,
        radius.asInstanceOf
      )
    )
  end initFromRect

  /** Checks if part of the given @rect is contained inside the rounded
    * rectangle.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def intersectsRect(
      rect: sn.gnome.graphene.Rect /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_rect_t]) */
  ): Boolean /* None */ =
    gsk_rounded_rect_intersects_rect(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRoundedRect]],
      rect.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end intersectsRect

  /** Checks if all corners of @self are right angles and the rectangle covers
    * all of its bounds.
    *
    * This information can be used to decide if [ctor@Gsk.ClipNode.new] or
    * [ctor@Gsk.RoundedClipNode.new] should be called.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isRectilinear(): Boolean /* None */ =
    gsk_rounded_rect_is_rectilinear(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRoundedRect]]
    ).value.!=(0)
  end isRectilinear

  /** Normalizes the passed rectangle.
    *
    * This function will ensure that the bounds of the rectangle are normalized
    * and ensure that the corner values are positive and the corners do not
    * overlap.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def normalize(): sn.gnome.gsk4.RoundedRect /* None */ =
    sn.gnome.gsk4.RoundedRect.fromRaw(
      gsk_rounded_rect_normalize(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRoundedRect]]
      )
    )
  end normalize

  /** Offsets the bound's origin by @dx and @dy.
    *
    * The size and corners of the rectangle are unchanged.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def offset(
      dx: Float /* Some(Float) */,
      dy: Float /* Some(Float) */
  ): sn.gnome.gsk4.RoundedRect /* None */ =
    sn.gnome.gsk4.RoundedRect.fromRaw(
      gsk_rounded_rect_offset(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRoundedRect]],
        dx.asInstanceOf,
        dy.asInstanceOf
      )
    )
  end offset

  /** Shrinks (or grows) the given rectangle by moving the 4 sides according to
    * the offsets given.
    *
    * The corner radii will be changed in a way that tries to keep the center of
    * the corner circle intact. This emulates CSS behavior.
    *
    * This function also works for growing rectangles if you pass negative
    * values for the @top, @right, @bottom or @left.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def shrink(
      top: Float /* Some(Float) */,
      right: Float /* Some(Float) */,
      bottom: Float /* Some(Float) */,
      left: Float /* Some(Float) */
  ): sn.gnome.gsk4.RoundedRect /* None */ =
    sn.gnome.gsk4.RoundedRect.fromRaw(
      gsk_rounded_rect_shrink(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRoundedRect]],
        top.asInstanceOf,
        right.asInstanceOf,
        bottom.asInstanceOf,
        left.asInstanceOf
      )
    )
  end shrink

end RoundedRect

object RoundedRect:
  def fromRaw(ptr: Ptr[GskRoundedRect]): RoundedRect = new RoundedRect(ptr)
end RoundedRect
