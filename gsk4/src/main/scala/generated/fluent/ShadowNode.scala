package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.gsize
import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskShadow
import sn.gnome.gsk4.internal.GskShadowNode

class ShadowNode(raw: Ptr[GskShadowNode]) extends RenderNode(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getChild(): RenderNode = new RenderNode(
    gsk_shadow_node_get_child(this.raw.asInstanceOf).asInstanceOf
  )

  def getNShadows(): CUnsignedLongInt = gsk_shadow_node_get_n_shadows(
    this.raw.asInstanceOf
  ).value

  def getShadow(i: CUnsignedLongInt): Ptr[GskShadow] =
    gsk_shadow_node_get_shadow(this.raw.asInstanceOf, gsize(i))

end ShadowNode
