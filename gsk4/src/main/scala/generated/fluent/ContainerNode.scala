package sn.gnome.gsk4

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.runtime.*
import sn.gnome.gsk4.RenderNode
import sn.gnome.gsk4.internal.GskContainerNode

/** A render node that can contain other render nodes.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ContainerNode private[gnome] (raw: Ptr[GskContainerNode])
    extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets one of the children of @container.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChild(
      idx: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  )(using Runtime): sn.gnome.gsk4.RenderNode /* None */ =
    sn.gnome.gsk4.RenderNode.applyUnsafe(
      gsk_container_node_get_child(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]],
        guint(idx)
      ).asInstanceOf
    )
  end getChild

  /** Retrieves the number of direct children of @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNChildren(): UInt /* None */ =
    gsk_container_node_get_n_children(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
    ).value
  end getNChildren

end ContainerNode

object ContainerNode:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GskContainerNode])(using Runtime) =
    summon[Runtime].getOrCreate[ContainerNode](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ContainerNode(ptr)
    )

  /** Creates a new `GskRenderNode` instance for holding the given @children.
    *
    * The new node will acquire a reference to each of the children.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[constructor new]: Constructor new is weird: non NULL-terminated arrays require special handling"
  )
  private def apply() = ???

end ContainerNode
