package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskBorderNode

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
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Gdk.RGBA), @type -> DataRecord(const GdkRGBA*)))"
  )
  def getColors__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the outline of the border.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(RoundedRect), @type -> DataRecord(const GskRoundedRect*)))"
  )
  def getOutline__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the stroke widths of the border.
    */
  @annotation.compileTimeOnly(
    "Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gfloat), @type -> DataRecord(float)))),ListMap(@zero-terminated -> DataRecord(0), @fixed-size -> DataRecord(4), @type -> DataRecord(const float*)))"
  )
  def getWidths__ = ???

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
  def `new`() = ???

end BorderNode
