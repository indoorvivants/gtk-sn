package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.gsize
import sn.gnome.graphene.internal.graphene_point_t
import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskRadialGradientNode

class RadialGradientNode(raw: Ptr[GskRadialGradientNode])
    extends RenderNode(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getCenter(): Ptr[graphene_point_t] = gsk_radial_gradient_node_get_center(
    this.raw.asInstanceOf
  )

  // Method get_color_stops contains an OUT parameter, which is not supported yet

  def getEnd(): Float = gsk_radial_gradient_node_get_end(this.raw.asInstanceOf)

  def getHradius(): Float = gsk_radial_gradient_node_get_hradius(
    this.raw.asInstanceOf
  )

  def getNColorStops(): CUnsignedLongInt =
    gsk_radial_gradient_node_get_n_color_stops(this.raw.asInstanceOf).value

  def getStart(): Float = gsk_radial_gradient_node_get_start(
    this.raw.asInstanceOf
  )

  def getVradius(): Float = gsk_radial_gradient_node_get_vradius(
    this.raw.asInstanceOf
  )

end RadialGradientNode
