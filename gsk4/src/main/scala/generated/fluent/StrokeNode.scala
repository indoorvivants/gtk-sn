package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskPath
import sn.gnome.gsk4.internal.GskStroke
import sn.gnome.gsk4.internal.GskStrokeNode

class StrokeNode(raw: Ptr[GskStrokeNode]) extends RenderNode(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getChild(): RenderNode = new RenderNode(
    gsk_stroke_node_get_child(this.raw.asInstanceOf).asInstanceOf
  )

  def getPath(): Ptr[GskPath] = gsk_stroke_node_get_path(this.raw.asInstanceOf)

  def getStroke(): Ptr[GskStroke] = gsk_stroke_node_get_stroke(
    this.raw.asInstanceOf
  )

end StrokeNode

object StrokeNode:
  def apply(
      child: RenderNode,
      path: Ptr[GskPath],
      stroke: Ptr[GskStroke]
  ): StrokeNode = new StrokeNode(
    gsk_stroke_node_new(
      child.getUnsafeRawPointer().asInstanceOf,
      path,
      stroke
    ).asInstanceOf
  )
end StrokeNode
