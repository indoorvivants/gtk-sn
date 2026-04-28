package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.gsize
import sn.gnome.graphene.internal.graphene_point_t
import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskConicGradientNode

class ConicGradientNode(raw: Ptr[GskConicGradientNode])
    extends RenderNode(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getAngle(): Float = gsk_conic_gradient_node_get_angle(
    this.raw.asInstanceOf
  )

  def getCenter(): Ptr[graphene_point_t] = gsk_conic_gradient_node_get_center(
    this.raw.asInstanceOf
  )

  // Method get_color_stops contains an OUT parameter, which is not supported yet

  def getNColorStops(): CUnsignedLongInt =
    gsk_conic_gradient_node_get_n_color_stops(this.raw.asInstanceOf).value

  def getRotation(): Float = gsk_conic_gradient_node_get_rotation(
    this.raw.asInstanceOf
  )

end ConicGradientNode
