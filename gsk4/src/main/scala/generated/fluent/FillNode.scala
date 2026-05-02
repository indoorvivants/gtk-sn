package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskFillNode
import sn.gnome.gsk4.internal.GskFillRule
import sn.gnome.gsk4.internal.GskPath

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A render node filling the area given by [struct@Gsk.Path] and
  * [enum@Gsk.FillRule] with the child node.
  */
class FillNode(raw: Ptr[GskFillNode]) extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the child node that is getting drawn by the given @node.
    */
  def getChild(): RenderNode /* None */ = new RenderNode(
    gsk_fill_node_get_child(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the fill rule used to determine how the path is filled.
    */
  def getFillRule(): GskFillRule /* None */ = gsk_fill_node_get_fill_rule(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the path used to describe the area filled with the contents of
    * the @node.
    */
  def getPath(): Ptr[GskPath] /* None */ = gsk_fill_node_get_path(
    this.raw.asInstanceOf
  )

end FillNode

object FillNode:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a `GskRenderNode` that will fill the @child in the area given by @path
    * and @fill_rule.
    */
  def apply(
      child: RenderNode /* Some(Ptr[GskRenderNode]) */,
      path: Ptr[GskPath] /* Some(Ptr[GskPath]) */,
      fill_rule: GskFillRule /* Some(GskFillRule) */
  ): FillNode = new FillNode(
    gsk_fill_node_new(
      child.getUnsafeRawPointer().asInstanceOf,
      path,
      fill_rule
    ).asInstanceOf
  )
end FillNode
