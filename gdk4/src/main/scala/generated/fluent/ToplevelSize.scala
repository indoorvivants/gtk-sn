package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.internal.GdkToplevelSize

/** The `GdkToplevelSize` struct contains information that is useful to compute
  * the size of a toplevel.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ToplevelSize private[gnome] (raw: Ptr[GdkToplevelSize]):

  def getUnsafeRawPointer(): Ptr[GdkToplevelSize] = this.raw

  /** Retrieves the bounds the toplevel is placed within.
    *
    * The bounds represent the largest size a toplevel may have while still
    * being able to fit within some type of boundary. Depending on the backend,
    * this may be equivalent to the dimensions of the work area or the monitor
    * on which the window is being presented on, or something else that limits
    * the way a toplevel can be presented.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_bounds]: Method get_bounds contains an OUT parameter, which is not supported yet"
  )
  private def getBounds__ = ???

  /** Sets the minimum size of the toplevel.
    *
    * The minimum size corresponds to the limitations the toplevel can be shrunk
    * to, without resulting in incorrect painting. A user of a `GdkToplevel`
    * should calculate these given both the existing size, and the bounds
    * retrieved from the `GdkToplevelSize` object.
    *
    * The minimum size should be within the bounds (see
    * [method@Gdk.ToplevelSize.get_bounds]).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMinSize(
      min_width: Int /* Some(CInt) */,
      min_height: Int /* Some(CInt) */
  ): Unit /* None */ =
    gdk_toplevel_size_set_min_size(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkToplevelSize]],
      min_width,
      min_height
    )
  end setMinSize

  /** Sets the shadows size of the toplevel.
    *
    * The shadow width corresponds to the part of the computed surface size that
    * would consist of the shadow margin surrounding the window, would there be
    * any.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setShadowWidth(
      left: Int /* Some(CInt) */,
      right: Int /* Some(CInt) */,
      top: Int /* Some(CInt) */,
      bottom: Int /* Some(CInt) */
  ): Unit /* None */ =
    gdk_toplevel_size_set_shadow_width(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkToplevelSize]],
      left,
      right,
      top,
      bottom
    )
  end setShadowWidth

  /** Sets the size the toplevel prefers to be resized to.
    *
    * The size should be within the bounds (see
    * [method@Gdk.ToplevelSize.get_bounds]). The set size should be considered
    * as a hint, and should not be assumed to be respected by the windowing
    * system, or backend.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSize(
      width: Int /* Some(CInt) */,
      height: Int /* Some(CInt) */
  ): Unit /* None */ =
    gdk_toplevel_size_set_size(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkToplevelSize]],
      width,
      height
    )
  end setSize

end ToplevelSize

object ToplevelSize:
  def fromRaw(ptr: Ptr[GdkToplevelSize]): ToplevelSize = new ToplevelSize(ptr)
end ToplevelSize
