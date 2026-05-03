package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.cairo.internal.cairo_t
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.GBytes
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.fluent.RenderNodeType
import sn.gnome.gsk4.internal.GskRenderNode

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GskRenderNode` is the basic block in a scene graph to be rendered using
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
  */
class RenderNode(raw: Ptr[GskRenderNode]):

  def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Draw the contents of @node to the given cairo context.
    *
    * Typically, you'll use this function to implement fallback rendering of
    * `GskRenderNode`s on an intermediate Cairo context, instead of using the
    * drawing context associated to a [class@Gdk.Surface]'s rendering buffer.
    *
    * For advanced nodes that cannot be supported using Cairo, in particular for
    * nodes doing 3D operations, this function may fail.
    */
  def draw(
      cr: Ptr[cairo_t] /* Some(Ptr[_root_.sn.gnome.cairo.internal.cairo_t]) */
  ): Unit /* None */ =
    gsk_render_node_draw(this.raw.asInstanceOf[Ptr[GskRenderNode]], cr)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the boundaries of the @node.
    *
    * The node will not draw outside of its boundaries.
    */
  @annotation.compileTimeOnly(
    "Method get_bounds contains an OUT parameter, which is not supported yet"
  )
  private def getBounds__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the type of the @node.
    */
  def getNodeType(): RenderNodeType /* None */ = RenderNodeType.fromRaw(
    gsk_render_node_get_node_type(this.raw.asInstanceOf[Ptr[GskRenderNode]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Acquires a reference on the given `GskRenderNode`.
    */
  def ref(): RenderNode /* None */ = new RenderNode(
    gsk_render_node_ref(this.raw.asInstanceOf[Ptr[GskRenderNode]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Serializes the @node for later deserialization via
    * gsk_render_node_deserialize(). No guarantees are made about the format
    * used other than that the same version of GTK will be able to deserialize
    * the result of a call to gsk_render_node_serialize() and
    * gsk_render_node_deserialize() will correctly reject files it cannot open
    * that were created with previous versions of GTK.
    *
    * The intended use of this functions is testing, benchmarking and debugging.
    * The format is not meant as a permanent storage format.
    */
  def serialize(): Ptr[GBytes] /* None */ = gsk_render_node_serialize(
    this.raw.asInstanceOf[Ptr[GskRenderNode]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Releases a reference on the given `GskRenderNode`.
    *
    * If the reference was the last, the resources associated to the @node are
    * freed.
    */
  def unref(): Unit /* None */ = gsk_render_node_unref(
    this.raw.asInstanceOf[Ptr[GskRenderNode]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This function is equivalent to calling [method@Gsk.RenderNode.serialize]
    * followed by [func@GLib.file_set_contents].
    *
    * See those two functions for details on the arguments.
    *
    * It is mostly intended for use inside a debugger to quickly dump a render
    * node to a file for later inspection.
    */
  def writeToFile(
      filename: String | CString /* Some(CString) */
  )(using Zone): GResult[Boolean /* None */ ] = GResult.wrap(__errorPtr =>
    gsk_render_node_write_to_file(
      this.raw.asInstanceOf[Ptr[GskRenderNode]],
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
