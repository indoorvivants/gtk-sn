package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.{Monitor, ToplevelLayout}
import sn.gnome.gdk4.internal.GdkToplevelLayout
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.runtime.*

/** The `GdkToplevelLayout` struct contains information that is necessary to
  * present a sovereign window on screen.
  *
  * The `GdkToplevelLayout` struct is necessary for using
  * [method@Gdk.Toplevel.present].
  *
  * Toplevel surfaces are sovereign windows that can be presented to the user in
  * various states (maximized, on all workspaces, etc).
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ToplevelLayout private[gnome] (raw: Ptr[GdkToplevelLayout]):

  def getUnsafeRawPointer(): Ptr[GdkToplevelLayout] = this.raw

  /** Create a new `GdkToplevelLayout` and copy the contents of @layout into it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copy(): sn.gnome.gdk4.ToplevelLayout /* None */ =
    sn.gnome.gdk4.ToplevelLayout.fromRaw(
      gdk_toplevel_layout_copy(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkToplevelLayout]]
      )
    )
  end copy

  /** Check whether @layout and @other has identical layout properties.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def equal(
      other: sn.gnome.gdk4.ToplevelLayout /* Some(Ptr[GdkToplevelLayout]) */
  ): Boolean /* None */ =
    gdk_toplevel_layout_equal(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkToplevelLayout]],
      other.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end equal

  /** If the layout specifies whether to the toplevel should go fullscreen, the
    * value pointed to by @fullscreen is set to %TRUE if it should go
    * fullscreen, or %FALSE, if it should go unfullscreen.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_fullscreen]: Method get_fullscreen contains an OUT parameter, which is not supported yet"
  )
  private def getFullscreen__ = ???

  /** Returns the monitor that the layout is fullscreening the surface on.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFullscreenMonitor()(using Runtime): sn.gnome.gdk4.Monitor /* None */ =
    sn.gnome.gdk4.Monitor.applyUnsafe(
      gdk_toplevel_layout_get_fullscreen_monitor(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkToplevelLayout]]
      ).asInstanceOf
    )
  end getFullscreenMonitor

  /** If the layout specifies whether to the toplevel should go maximized, the
    * value pointed to by @maximized is set to %TRUE if it should go fullscreen,
    * or %FALSE, if it should go unmaximized.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_maximized]: Method get_maximized contains an OUT parameter, which is not supported yet"
  )
  private def getMaximized__ = ???

  /** Returns whether the layout should allow the user to resize the surface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getResizable(): Boolean /* None */ =
    gdk_toplevel_layout_get_resizable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkToplevelLayout]]
    ).value.!=(0)
  end getResizable

  /** Increases the reference count of @layout.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref(): sn.gnome.gdk4.ToplevelLayout /* None */ =
    sn.gnome.gdk4.ToplevelLayout.fromRaw(
      gdk_toplevel_layout_ref(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkToplevelLayout]]
      )
    )
  end ref

  /** Sets whether the layout should cause the surface to be fullscreen when
    * presented.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFullscreen(
      fullscreen: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */,
      monitor: Option[sn.gnome.gdk4.Monitor /* Some(Ptr[GdkMonitor]) */ ]
  )(using Runtime): Unit /* None */ =
    gdk_toplevel_layout_set_fullscreen(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkToplevelLayout]],
      gboolean(gint((if fullscreen == true then 1 else 0))),
      monitor
        .map[Ptr[GdkMonitor]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GdkMonitor]])
    )
  end setFullscreen

  /** Sets whether the layout should cause the surface to be maximized when
    * presented.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMaximized(
      maximized: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gdk_toplevel_layout_set_maximized(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkToplevelLayout]],
      gboolean(gint((if maximized == true then 1 else 0)))
    )
  end setMaximized

  /** Sets whether the layout should allow the user to resize the surface after
    * it has been presented.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setResizable(
      resizable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gdk_toplevel_layout_set_resizable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkToplevelLayout]],
      gboolean(gint((if resizable == true then 1 else 0)))
    )
  end setResizable

  /** Decreases the reference count of @layout.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    gdk_toplevel_layout_unref(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkToplevelLayout]]
    )
  end unref

end ToplevelLayout

object ToplevelLayout:
  def fromRaw(ptr: Ptr[GdkToplevelLayout]): ToplevelLayout = new ToplevelLayout(
    ptr
  )
end ToplevelLayout
