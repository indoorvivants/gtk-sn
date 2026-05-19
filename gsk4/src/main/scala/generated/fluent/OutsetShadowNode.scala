package sn.gnome.gsk4

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gsk4.RenderNode
import sn.gnome.gsk4.internal.GskOutsetShadowNode

/** A render node for an outset shadow.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class OutsetShadowNode private[gnome] (raw: Ptr[GskOutsetShadowNode])
    extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Retrieves the blur radius of the shadow.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getBlurRadius(): Float /* None */ =
    gsk_outset_shadow_node_get_blur_radius(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
    )
  end getBlurRadius

  /** Retrieves the color of the outset shadow.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_color/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gdk.RGBA), @type -> DataRecord(const GdkRGBA*)))"
  )
  private def getColor__ = ???

  /** Retrieves the horizontal offset of the outset shadow.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDx(): Float /* None */ =
    gsk_outset_shadow_node_get_dx(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
    )
  end getDx

  /** Retrieves the vertical offset of the outset shadow.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDy(): Float /* None */ =
    gsk_outset_shadow_node_get_dy(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
    )
  end getDy

  /** Retrieves the outline rectangle of the outset shadow.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_outline/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(RoundedRect), @type -> DataRecord(const GskRoundedRect*)))"
  )
  private def getOutline__ = ???

  /** Retrieves how much the shadow spreads outwards.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSpread(): Float /* None */ =
    gsk_outset_shadow_node_get_spread(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
    )
  end getSpread

end OutsetShadowNode

object OutsetShadowNode:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GskOutsetShadowNode])(using Runtime) =
    summon[Runtime].getOrCreate[OutsetShadowNode](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new OutsetShadowNode(ptr)
    )

  /** Creates a `GskRenderNode` that will render an outset shadow around the box
    * given by @outline.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[constructor new/outline]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(RoundedRect), @type -> DataRecord(const GskRoundedRect*)))"
  )
  private def apply() = ???

end OutsetShadowNode
