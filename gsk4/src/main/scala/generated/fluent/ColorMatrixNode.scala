package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.graphene.internal.graphene_matrix_t
import sn.gnome.graphene.internal.graphene_vec4_t
import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskColorMatrixNode

class ColorMatrixNode(raw: Ptr[GskColorMatrixNode])
    extends RenderNode(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getChild(): RenderNode = new RenderNode(
    gsk_color_matrix_node_get_child(this.raw.asInstanceOf).asInstanceOf
  )

  def getColorMatrix(): Ptr[graphene_matrix_t] =
    gsk_color_matrix_node_get_color_matrix(this.raw.asInstanceOf)

  def getColorOffset(): Ptr[graphene_vec4_t] =
    gsk_color_matrix_node_get_color_offset(this.raw.asInstanceOf)

end ColorMatrixNode

object ColorMatrixNode:
  def apply(
      child: RenderNode,
      color_matrix: Ptr[graphene_matrix_t],
      color_offset: Ptr[graphene_vec4_t]
  ): ColorMatrixNode = new ColorMatrixNode(
    gsk_color_matrix_node_new(
      child.getUnsafeRawPointer().asInstanceOf,
      color_matrix,
      color_offset
    ).asInstanceOf
  )
end ColorMatrixNode
