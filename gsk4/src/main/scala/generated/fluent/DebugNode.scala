package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskDebugNode

/** A render node that emits a debugging message when drawing its child node.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DebugNode(raw: Ptr[GskDebugNode]) extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the child node that is getting drawn by the given @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChild(): RenderNode /* None */ = new RenderNode(
    gsk_debug_node_get_child(
      this.raw.asInstanceOf[Ptr[GskRenderNode]]
    ).asInstanceOf
  )

  /** Gets the debug message that was set on this node
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMessage()(using Zone): String /* None */ = fromCString(
    gsk_debug_node_get_message(
      this.raw.asInstanceOf[Ptr[GskRenderNode]]
    ).asInstanceOf
  )

end DebugNode

object DebugNode:
  /** Creates a `GskRenderNode` that will add debug information about the given @child.
    *
    * Adding this node has no visual effect.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      child: RenderNode /* Some(Ptr[GskRenderNode]) */,
      message: String | CString /* Some(CString) */
  )(using Zone)(using Runtime): DebugNode =
    val raw: Ptr[Byte] = gsk_debug_node_new(
      child.getUnsafeRawPointer().asInstanceOf,
      __sn_extract_string(message)
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[DebugNode](raw, r => new DebugNode(r.asInstanceOf))
  end apply

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end DebugNode
