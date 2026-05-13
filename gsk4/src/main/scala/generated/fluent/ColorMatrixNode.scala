package sn.gnome.gsk4

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gsk4.RenderNode
import sn.gnome.gsk4.internal.GskColorMatrixNode

/** A render node controlling the color matrix of its single child node.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ColorMatrixNode private[gnome] (raw: Ptr[GskColorMatrixNode])
    extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the child node that is getting its colors modified by the given @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChild()(using Runtime): sn.gnome.gsk4.RenderNode /* None */ =
    sn.gnome.gsk4.RenderNode.applyUnsafe(
      gsk_color_matrix_node_get_child(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
      ).asInstanceOf
    )
  end getChild

  /** Retrieves the color matrix used by the @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_color_matrix/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Matrix), @type -> DataRecord(const graphene_matrix_t*)))"
  )
  private def getColorMatrix__ = ???

  /** Retrieves the color offset used by the @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_color_offset/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Vec4), @type -> DataRecord(const graphene_vec4_t*)))"
  )
  private def getColorOffset__ = ???

end ColorMatrixNode

object ColorMatrixNode:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GskColorMatrixNode])(using Runtime) =
    summon[Runtime].getOrCreate[ColorMatrixNode](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ColorMatrixNode(ptr)
    )

  /** Creates a `GskRenderNode` that will drawn the @child with
    * @color_matrix.
    *
    * In particular, the node will transform colors by applying
    *
    * pixel = transpose(color_matrix) * pixel + color_offset
    *
    * for every pixel. The transformation operates on unpremultiplied colors,
    * with color components ordered R, G, B, A.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[constructor new/color_matrix]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Matrix), @type -> DataRecord(const graphene_matrix_t*)))"
  )
  private def apply() = ???

end ColorMatrixNode
