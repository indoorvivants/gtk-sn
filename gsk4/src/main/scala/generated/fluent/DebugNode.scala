package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskDebugNode

class DebugNode(raw: Ptr[GskDebugNode]) extends RenderNode(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getChild(): RenderNode = new RenderNode(
    gsk_debug_node_get_child(this.raw.asInstanceOf).asInstanceOf
  )

  def getMessage()(using Zone): String = fromCString(
    gsk_debug_node_get_message(this.raw.asInstanceOf).asInstanceOf
  )

end DebugNode

object DebugNode:
  def apply(child: RenderNode, message: String | CString)(using
      Zone
  ): DebugNode = new DebugNode(
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
