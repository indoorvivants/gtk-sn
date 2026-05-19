package sn.gnome.gsk4

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.gsize
import sn.gnome.gobject.runtime.*
import sn.gnome.gsk4.RenderNode
import sn.gnome.gsk4.internal.GskShadowNode

/** A render node drawing one or more shadows behind its single child node.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ShadowNode private[gnome] (raw: Ptr[GskShadowNode])
    extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Retrieves the child `GskRenderNode` of the shadow @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChild()(using Runtime): sn.gnome.gsk4.RenderNode /* None */ =
    sn.gnome.gsk4.RenderNode.applyUnsafe(
      gsk_shadow_node_get_child(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
      ).asInstanceOf
    )
  end getChild

  /** Retrieves the number of shadows in the @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNShadows(): CUnsignedLongInt /* None */ =
    gsk_shadow_node_get_n_shadows(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
    ).value
  end getNShadows

  /** Retrieves the shadow data at the given index @i.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_shadow/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Shadow), @type -> DataRecord(const GskShadow*)))"
  )
  private def getShadow__ = ???

end ShadowNode

object ShadowNode:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GskShadowNode])(using Runtime) =
    summon[Runtime].getOrCreate[ShadowNode](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ShadowNode(ptr)
    )

  /** Creates a `GskRenderNode` that will draw a @child with the given
    * @shadows
    *   below it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[constructor new/shadows]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Shadow), @type -> DataRecord(GskShadow)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(2), @type -> DataRecord(const GskShadow*)))"
  )
  private def apply() = ???

end ShadowNode
