package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.internal.GdkRGBA
import sn.gnome.graphene.internal.graphene_rect_t
import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskColorNode

class ColorNode(raw: Ptr[GskColorNode]) extends RenderNode(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getColor(): Ptr[GdkRGBA] = gsk_color_node_get_color(this.raw.asInstanceOf)

end ColorNode

object ColorNode:
  def apply(rgba: Ptr[GdkRGBA], bounds: Ptr[graphene_rect_t]): ColorNode =
    new ColorNode(gsk_color_node_new(rgba, bounds).asInstanceOf)
end ColorNode
