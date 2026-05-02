package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskDebugNode

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A render node that emits a debugging message when drawing its child node.
  */
class DebugNode(raw: Ptr[GskDebugNode]) extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the child node that is getting drawn by the given @node.
    */
  def getChild(): RenderNode /* None */ = new RenderNode(
    gsk_debug_node_get_child(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the debug message that was set on this node
    */
  def getMessage()(using Zone): String /* None */ = fromCString(
    gsk_debug_node_get_message(this.raw.asInstanceOf).asInstanceOf
  )

end DebugNode

object DebugNode:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a `GskRenderNode` that will add debug information about the given @child.
    *
    * Adding this node has no visual effect.
    */
  def apply(
      child: RenderNode /* Some(Ptr[GskRenderNode]) */,
      message: String | CString /* Some(CString) */
  )(using Zone): DebugNode = new DebugNode(
    gsk_debug_node_new(
      child.getUnsafeRawPointer().asInstanceOf,
      __sn_extract_string(message)
    ).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end DebugNode
