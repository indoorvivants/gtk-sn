package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskFillNode
import sn.gnome.gsk4.internal.GskFillRule
import sn.gnome.gsk4.internal.GskPath

class FillNode(raw: Ptr[GskFillNode]) extends RenderNode(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getChild(): RenderNode = new RenderNode(
    gsk_fill_node_get_child(this.raw.asInstanceOf).asInstanceOf
  )

  def getFillRule(): GskFillRule = gsk_fill_node_get_fill_rule(
    this.raw.asInstanceOf
  )

  def getPath(): Ptr[GskPath] = gsk_fill_node_get_path(this.raw.asInstanceOf)

end FillNode

object FillNode:
  def apply(
      child: RenderNode,
      path: Ptr[GskPath],
      fill_rule: GskFillRule
  ): FillNode = new FillNode(
    gsk_fill_node_new(
      child.getUnsafeRawPointer().asInstanceOf,
      path,
      fill_rule
    ).asInstanceOf
  )
end FillNode
