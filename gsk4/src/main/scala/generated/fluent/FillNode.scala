package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gsk4.fluent.{FillRule, RenderNode}
import sn.gnome.gsk4.internal.GskFillNode

/** A render node filling the area given by [struct@Gsk.Path] and
  * [enum@Gsk.FillRule] with the child node.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FillNode(raw: Ptr[GskFillNode]) extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the child node that is getting drawn by the given @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChild(): RenderNode /* None */ = new RenderNode(
    gsk_fill_node_get_child(
      this.raw.asInstanceOf[Ptr[GskRenderNode]]
    ).asInstanceOf
  )

  /** Retrieves the fill rule used to determine how the path is filled.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFillRule(): FillRule /* None */ = FillRule.fromRaw(
    gsk_fill_node_get_fill_rule(this.raw.asInstanceOf[Ptr[GskRenderNode]])
  )

  /** Retrieves the path used to describe the area filled with the contents of
    * the @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_path/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Path), @type -> DataRecord(GskPath*)))"
  )
  private def getPath__ = ???

end FillNode

object FillNode:
  /** Creates a `GskRenderNode` that will fill the @child in the area given by @path
    * and @fill_rule.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[path]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Path), @type -> DataRecord(GskPath*)))"
  )
  private def `new`() = ???

end FillNode
