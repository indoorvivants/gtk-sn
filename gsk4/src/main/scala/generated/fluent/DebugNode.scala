package sn.gnome.gsk4

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gsk4.RenderNode
import sn.gnome.gsk4.internal.GskDebugNode

/** A render node that emits a debugging message when drawing its child node.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DebugNode private[gnome] (raw: Ptr[GskDebugNode])
    extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the child node that is getting drawn by the given @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChild()(using Runtime): sn.gnome.gsk4.RenderNode /* None */ =
    sn.gnome.gsk4.RenderNode.applyUnsafe(
      gsk_debug_node_get_child(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
      ).asInstanceOf
    )
  end getChild

  /** Gets the debug message that was set on this node
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMessage(): scala.Predef.String /* None */ =
    fromCString(
      gsk_debug_node_get_message(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
      ).asInstanceOf
    )
  end getMessage

end DebugNode

object DebugNode:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GskDebugNode])(using Runtime) =
    summon[Runtime].getOrCreate[DebugNode](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new DebugNode(ptr)
    )

  /** Creates a `GskRenderNode` that will add debug information about the given @child.
    *
    * Adding this node has no visual effect.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      child: sn.gnome.gsk4.RenderNode /* Some(Ptr[GskRenderNode]) */,
      message: scala.Predef.String /* Some(CString) */
  )(using Runtime): DebugNode =
    val raw: Ptr[Byte] = gsk_debug_node_new(
      child.getUnsafeRawPointer().asInstanceOf,
      summon[Runtime].inZone(toCString(message))
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[DebugNode](raw, r => DebugNode.applyUnsafe(r.asInstanceOf))
  end apply
end DebugNode
