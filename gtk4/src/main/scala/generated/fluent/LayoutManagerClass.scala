package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.internal.GType
import sn.gnome.gtk4.internal.GtkLayoutManagerClass

/** The `GtkLayoutManagerClass` structure contains only private data, and should
  * only be accessed through the provided API, or when subclassing
  * `GtkLayoutManager`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class LayoutManagerClass private[gnome] (raw: Ptr[GtkLayoutManagerClass]):

  def getUnsafeRawPointer(): Ptr[GtkLayoutManagerClass] = this.raw

  @annotation.compileTimeOnly(
    "[field get_request_mode]: Field is missing <type>"
  )
  private def getRequestMode__ = ???
  @annotation.compileTimeOnly("[field measure]: Field is missing <type>")
  private def measure__ = ???
  @annotation.compileTimeOnly("[field allocate]: Field is missing <type>")
  private def allocate__ = ???

  /** the type of `GtkLayoutChild` used by this layout manager
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def layoutChildType: GType /* None */ = (!raw).layout_child_type
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GType]
  @annotation.compileTimeOnly(
    "[field create_layout_child]: Field is missing <type>"
  )
  private def createLayoutChild__ = ???
  @annotation.compileTimeOnly("[field root]: Field is missing <type>")
  private def root__ = ???
  @annotation.compileTimeOnly("[field unroot]: Field is missing <type>")
  private def unroot__ = ???

end LayoutManagerClass

object LayoutManagerClass:
  def fromRaw(ptr: Ptr[GtkLayoutManagerClass]): LayoutManagerClass =
    new LayoutManagerClass(ptr)
end LayoutManagerClass
