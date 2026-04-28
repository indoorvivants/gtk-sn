package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.cairo.internal.cairo_t
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.GBytes
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskRenderNode
import sn.gnome.gsk4.internal.GskRenderNodeType

class RenderNode(raw: Ptr[GskRenderNode]):
  def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def draw(cr: Ptr[cairo_t]): Unit =
    gsk_render_node_draw(this.raw.asInstanceOf, cr)

  // Method get_bounds contains an OUT parameter, which is not supported yet

  def getNodeType(): GskRenderNodeType = gsk_render_node_get_node_type(
    this.raw.asInstanceOf
  )

  def ref(): RenderNode = new RenderNode(
    gsk_render_node_ref(this.raw.asInstanceOf).asInstanceOf
  )

  def serialize(): Ptr[GBytes] = gsk_render_node_serialize(
    this.raw.asInstanceOf
  )

  def unref(): Unit = gsk_render_node_unref(this.raw.asInstanceOf)

  def writeToFile(filename: String | CString)(using Zone): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      gsk_render_node_write_to_file(
        this.raw.asInstanceOf,
        __sn_extract_string(filename),
        __errorPtr
      ).value.!=(0)
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end RenderNode
