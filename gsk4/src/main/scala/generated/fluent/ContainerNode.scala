package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.guint
import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskContainerNode

class ContainerNode(raw: Ptr[GskContainerNode])
    extends RenderNode(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getChild(idx: UInt): RenderNode = new RenderNode(
    gsk_container_node_get_child(this.raw.asInstanceOf, guint(idx)).asInstanceOf
  )

  def getNChildren(): UInt = gsk_container_node_get_n_children(
    this.raw.asInstanceOf
  ).value

end ContainerNode
