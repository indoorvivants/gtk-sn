package sn.gnome.gsk4

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.GResult
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.runtime.*
import sn.gnome.gsk4.{RenderNode, RenderNodeType}
import sn.gnome.gsk4.internal.GskRenderNode

/** `GskRenderNode` is the basic block in a scene graph to be rendered using
  * [class@Gsk.Renderer].
  *
  * Each node has a parent, except the top-level node; each node may have
  * children nodes.
  *
  * Each node has an associated drawing surface, which has the size of the
  * rectangle set when creating it.
  *
  * Render nodes are meant to be transient; once they have been associated to a
  * [class@Gsk.Renderer] it's safe to release any reference you have on them.
  * All [class@Gsk.RenderNode]s are immutable, you can only specify their
  * properties during construction.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class RenderNode private[gnome] (raw: Ptr[GskRenderNode]):

  def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Draw the contents of @node to the given cairo context.
    *
    * Typically, you'll use this function to implement fallback rendering of
    * `GskRenderNode`s on an intermediate Cairo context, instead of using the
    * drawing context associated to a [class@Gdk.Surface]'s rendering buffer.
    *
    * For advanced nodes that cannot be supported using Cairo, in particular for
    * nodes doing 3D operations, this function may fail.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method draw/<method parameters>/cr]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(cairo.Context), @type -> DataRecord(cairo_t*)))"
  )
  private def draw__ = ???

  /** Retrieves the boundaries of the @node.
    *
    * The node will not draw outside of its boundaries.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_bounds]: Method get_bounds contains an OUT parameter, which is not supported yet"
  )
  private def getBounds__ = ???

  /** Returns the type of the @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNodeType(): RenderNodeType /* None */ =
    RenderNodeType.fromRaw(
      gsk_render_node_get_node_type(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
      )
    )
  end getNodeType

  /** Acquires a reference on the given `GskRenderNode`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref()(using Runtime): sn.gnome.gsk4.RenderNode /* None */ =
    sn.gnome.gsk4.RenderNode.applyUnsafe(
      gsk_render_node_ref(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
      ).asInstanceOf
    )
  end ref

  /** Serializes the @node for later deserialization via
    * gsk_render_node_deserialize(). No guarantees are made about the format
    * used other than that the same version of GTK will be able to deserialize
    * the result of a call to gsk_render_node_serialize() and
    * gsk_render_node_deserialize() will correctly reject files it cannot open
    * that were created with previous versions of GTK.
    *
    * The intended use of this functions is testing, benchmarking and debugging.
    * The format is not meant as a permanent storage format.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method serialize/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))"
  )
  private def serialize__ = ???

  /** Releases a reference on the given `GskRenderNode`.
    *
    * If the reference was the last, the resources associated to the @node are
    * freed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    gsk_render_node_unref(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
    )
  end unref

  /** This function is equivalent to calling [method@Gsk.RenderNode.serialize]
    * followed by [func@GLib.file_set_contents].
    *
    * See those two functions for details on the arguments.
    *
    * It is mostly intended for use inside a debugger to quickly dump a render
    * node to a file for later inspection.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def writeToFile(
      filename: String /* Some(CString) */
  )(using Zone): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      gsk_render_node_write_to_file(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]],
        toCString(filename),
        __errorPtr
      ).value.!=(0)
    )
  end writeToFile

end RenderNode

object RenderNode:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GskRenderNode])(using Runtime) =
    summon[Runtime].getOrCreate[RenderNode](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new RenderNode(ptr)
    )

  /** Loads data previously created via [method@Gsk.RenderNode.serialize].
    *
    * For a discussion of the supported format, see that function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[function deserialize/<function parameters>/bytes]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))"
  )
  private def deserialize() = ???

end RenderNode
