package sn.gnome.gsk4

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gsk4.{FillRule, Path, RenderNode}
import sn.gnome.gsk4.internal.GskFillNode

/** A render node filling the area given by [struct@Gsk.Path] and
  * [enum@Gsk.FillRule] with the child node.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FillNode private[gnome] (raw: Ptr[GskFillNode])
    extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the child node that is getting drawn by the given @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChild()(using Runtime): sn.gnome.gsk4.RenderNode /* None */ =
    sn.gnome.gsk4.RenderNode.applyUnsafe(
      gsk_fill_node_get_child(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
      ).asInstanceOf
    )
  end getChild

  /** Retrieves the fill rule used to determine how the path is filled.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFillRule(): sn.gnome.gsk4.FillRule /* None */ =
    sn.gnome.gsk4.FillRule.fromRaw(
      gsk_fill_node_get_fill_rule(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
      )
    )
  end getFillRule

  /** Retrieves the path used to describe the area filled with the contents of
    * the @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPath(): sn.gnome.gsk4.Path /* None */ =
    sn.gnome.gsk4.Path.fromRaw(
      gsk_fill_node_get_path(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
      )
    )
  end getPath

end FillNode

object FillNode:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GskFillNode])(using Runtime) = summon[Runtime]
    .getOrCreate[FillNode](ptr.asInstanceOf[Ptr[Byte]], p => new FillNode(ptr))

  /** Creates a `GskRenderNode` that will fill the @child in the area given by @path
    * and @fill_rule.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      child: sn.gnome.gsk4.RenderNode /* Some(Ptr[GskRenderNode]) */,
      path: sn.gnome.gsk4.Path /* Some(Ptr[GskPath]) */,
      fill_rule: sn.gnome.gsk4.FillRule /* Some(GskFillRule) */
  )(using Runtime): FillNode =
    val raw: Ptr[Byte] = gsk_fill_node_new(
      child.getUnsafeRawPointer().asInstanceOf,
      path.getUnsafeRawPointer().asInstanceOf,
      fill_rule.raw
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[FillNode](raw, r => FillNode.applyUnsafe(r.asInstanceOf))
  end apply
end FillNode
