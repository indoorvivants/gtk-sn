package sn.gnome.gsk4

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.graphene.{Matrix, Vec4}
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
  def getColorMatrix(): sn.gnome.graphene.Matrix /* None */ =
    sn.gnome.graphene.Matrix.fromRaw(
      gsk_color_matrix_node_get_color_matrix(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
      )
    )
  end getColorMatrix

  /** Retrieves the color offset used by the @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getColorOffset(): sn.gnome.graphene.Vec4 /* None */ =
    sn.gnome.graphene.Vec4.fromRaw(
      gsk_color_matrix_node_get_color_offset(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
      )
    )
  end getColorOffset

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
  def apply(
      child: sn.gnome.gsk4.RenderNode /* Some(Ptr[GskRenderNode]) */,
      color_matrix: sn.gnome.graphene.Matrix /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_matrix_t]) */,
      color_offset: sn.gnome.graphene.Vec4 /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_vec4_t]) */
  )(using Runtime): ColorMatrixNode =
    val raw: Ptr[Byte] = gsk_color_matrix_node_new(
      child.getUnsafeRawPointer().asInstanceOf,
      color_matrix.getUnsafeRawPointer().asInstanceOf,
      color_offset.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
    summon[Runtime].getOrCreate[ColorMatrixNode](
      raw,
      r => ColorMatrixNode.applyUnsafe(r.asInstanceOf)
    )
  end apply
end ColorMatrixNode
