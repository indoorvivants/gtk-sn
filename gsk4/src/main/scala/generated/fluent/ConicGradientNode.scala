package sn.gnome.gsk4

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.gsize
import sn.gnome.gobject.runtime.*
import sn.gnome.graphene.Point
import sn.gnome.gsk4.RenderNode
import sn.gnome.gsk4.internal.GskConicGradientNode

/** A render node for a conic gradient.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ConicGradientNode private[gnome] (raw: Ptr[GskConicGradientNode])
    extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Retrieves the angle for the gradient in radians, normalized in [0, 2 *
    * PI].
    *
    * The angle is starting at the top and going clockwise, as expressed in the
    * css specification:
    *
    * angle = 90 - gsk_conic_gradient_node_get_rotation()
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAngle(): Float /* None */ =
    gsk_conic_gradient_node_get_angle(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
    )
  end getAngle

  /** Retrieves the center pointer for the gradient.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCenter(): sn.gnome.graphene.Point /* None */ =
    sn.gnome.graphene.Point.fromRaw(
      gsk_conic_gradient_node_get_center(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
      )
    )
  end getCenter

  /** Retrieves the color stops in the gradient.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_color_stops]: Method get_color_stops contains an OUT parameter, which is not supported yet"
  )
  private def getColorStops__ = ???

  /** Retrieves the number of color stops in the gradient.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNColorStops(): CUnsignedLongInt /* None */ =
    gsk_conic_gradient_node_get_n_color_stops(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
    ).value
  end getNColorStops

  /** Retrieves the rotation for the gradient in degrees.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRotation(): Float /* None */ =
    gsk_conic_gradient_node_get_rotation(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
    )
  end getRotation

end ConicGradientNode

object ConicGradientNode:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GskConicGradientNode])(using Runtime) =
    summon[Runtime].getOrCreate[ConicGradientNode](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ConicGradientNode(ptr)
    )

  /** Creates a `GskRenderNode` that draws a conic gradient.
    *
    * The conic gradient starts around @center in the direction of @rotation. A
    * rotation of 0 means that the gradient points up. Color stops are then
    * added clockwise.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[constructor new/color_stops]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(ColorStop), @type -> DataRecord(GskColorStop)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(4), @type -> DataRecord(const GskColorStop*)))"
  )
  private def apply() = ???

end ConicGradientNode
