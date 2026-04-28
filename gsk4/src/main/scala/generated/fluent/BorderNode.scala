package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.internal.GdkRGBA
import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskBorderNode
import sn.gnome.gsk4.internal.GskRoundedRect

class BorderNode(raw: Ptr[GskBorderNode]) extends RenderNode(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getColors(): Ptr[GdkRGBA] = gsk_border_node_get_colors(
    this.raw.asInstanceOf
  )

  def getOutline(): Ptr[GskRoundedRect] = gsk_border_node_get_outline(
    this.raw.asInstanceOf
  )

  def getWidths(): Ptr[Float] = gsk_border_node_get_widths(
    this.raw.asInstanceOf
  )

end BorderNode
