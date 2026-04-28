package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.gsize
import sn.gnome.graphene.internal.graphene_point_t
import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskLinearGradientNode

class LinearGradientNode(raw: Ptr[GskLinearGradientNode])
    extends RenderNode(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  // Method get_color_stops contains an OUT parameter, which is not supported yet

  def getEnd(): Ptr[graphene_point_t] = gsk_linear_gradient_node_get_end(
    this.raw.asInstanceOf
  )

  def getNColorStops(): CUnsignedLongInt =
    gsk_linear_gradient_node_get_n_color_stops(this.raw.asInstanceOf).value

  def getStart(): Ptr[graphene_point_t] = gsk_linear_gradient_node_get_start(
    this.raw.asInstanceOf
  )

end LinearGradientNode
