package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.internal.GdkRGBA
import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskBorderNode
import sn.gnome.gsk4.internal.GskRoundedRect

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A render node for a border.
  */
class BorderNode(raw: Ptr[GskBorderNode]) extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the colors of the border.
    */
  def getColors(): Ptr[GdkRGBA] /* None */ = gsk_border_node_get_colors(
    this.raw.asInstanceOf[Ptr[GskRenderNode]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the outline of the border.
    */
  def getOutline(): Ptr[GskRoundedRect] /* None */ =
    gsk_border_node_get_outline(this.raw.asInstanceOf[Ptr[GskRenderNode]])

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the stroke widths of the border.
    */
  def getWidths(): Ptr[Float /* None */ ] /* None */ =
    gsk_border_node_get_widths(this.raw.asInstanceOf[Ptr[GskRenderNode]])

end BorderNode

object BorderNode:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a `GskRenderNode` that will stroke a border rectangle inside the
    * given @outline.
    *
    * The 4 sides of the border can have different widths and colors.
    */
  @annotation.compileTimeOnly(
    "Constructor new is weird: non NULL-terminated arrays require special handling"
  )
  def apply() = ???

end BorderNode
