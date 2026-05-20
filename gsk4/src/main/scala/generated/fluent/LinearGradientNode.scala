package sn.gnome.gsk4

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.gsize
import sn.gnome.gobject.runtime.*
import sn.gnome.graphene.Point
import sn.gnome.gsk4.RenderNode
import sn.gnome.gsk4.internal.GskLinearGradientNode

/** A render node for a linear gradient.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class LinearGradientNode private[gnome] (raw: Ptr[GskLinearGradientNode])
    extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Retrieves the color stops in the gradient.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_color_stops]: Method get_color_stops contains an OUT parameter, which is not supported yet"
  )
  private def getColorStops__ = ???

  /** Retrieves the final point of the linear gradient.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getEnd(): sn.gnome.graphene.Point /* None */ =
    sn.gnome.graphene.Point.fromRaw(
      gsk_linear_gradient_node_get_end(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
      )
    )
  end getEnd

  /** Retrieves the number of color stops in the gradient.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNColorStops(): CUnsignedLongInt /* None */ =
    gsk_linear_gradient_node_get_n_color_stops(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
    ).value
  end getNColorStops

  /** Retrieves the initial point of the linear gradient.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getStart(): sn.gnome.graphene.Point /* None */ =
    sn.gnome.graphene.Point.fromRaw(
      gsk_linear_gradient_node_get_start(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
      )
    )
  end getStart

end LinearGradientNode

object LinearGradientNode:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GskLinearGradientNode])(using Runtime) =
    summon[Runtime].getOrCreate[LinearGradientNode](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new LinearGradientNode(ptr)
    )

  /** Creates a `GskRenderNode` that will create a linear gradient from the
    * given points and color stops, and render that into the area given by @bounds.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[constructor new/color_stops]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(ColorStop), @type -> DataRecord(GskColorStop)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(4), @type -> DataRecord(const GskColorStop*)))"
  )
  private def apply() = ???

end LinearGradientNode
