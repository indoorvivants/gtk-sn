package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.guint
import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskContainerNode

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A render node that can contain other render nodes.
  */
class ContainerNode(raw: Ptr[GskContainerNode])
    extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets one of the children of @container.
    */
  def getChild(
      idx: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): RenderNode /* None */ = new RenderNode(
    gsk_container_node_get_child(this.raw.asInstanceOf, guint(idx)).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the number of direct children of @node.
    */
  def getNChildren(): UInt /* None */ = gsk_container_node_get_n_children(
    this.raw.asInstanceOf
  ).value

end ContainerNode

object ContainerNode:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GskRenderNode` instance for holding the given @children.
    *
    * The new node will acquire a reference to each of the children.
    */
  @annotation.compileTimeOnly(
    "Constructor new is weird: non NULL-terminated arrays require special handling"
  )
  def apply() = ???

end ContainerNode
