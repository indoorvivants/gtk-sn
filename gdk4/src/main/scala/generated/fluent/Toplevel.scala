package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.fluent.{
  Device,
  Event,
  Surface,
  SurfaceEdge,
  TitlebarGesture,
  ToplevelState
}
import sn.gnome.glib.internal.{gboolean, gint, guint32}
import sn.gnome.gobject.runtime.*

trait Toplevel:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Begins an interactive move operation.
    *
    * You might use this function to implement draggable titlebars.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def beginMove(
      device: sn.gnome.gdk4.fluent.Device /* Some(Ptr[GdkDevice]) */,
      button: Int /* Some(CInt) */,
      x: Double /* Some(Double) */,
      y: Double /* Some(Double) */,
      timestamp: UInt /* Some(_root_.sn.gnome.glib.internal.guint32) */
  )(using Runtime): Unit /* None */ =
    gdk_toplevel_begin_move(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkToplevel]],
      device.getUnsafeRawPointer().asInstanceOf,
      button,
      x,
      y,
      guint32(timestamp)
    )
  end beginMove

  /** Begins an interactive resize operation.
    *
    * You might use this function to implement a “window resize grip.”
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def beginResize(
      edge: SurfaceEdge /* Some(GdkSurfaceEdge) */,
      device: Option[sn.gnome.gdk4.fluent.Device /* Some(Ptr[GdkDevice]) */ ],
      button: Int /* Some(CInt) */,
      x: Double /* Some(Double) */,
      y: Double /* Some(Double) */,
      timestamp: UInt /* Some(_root_.sn.gnome.glib.internal.guint32) */
  )(using Runtime): Unit /* None */ =
    gdk_toplevel_begin_resize(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkToplevel]],
      edge.raw,
      device
        .map[Ptr[GdkDevice]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GdkDevice]]),
      button,
      x,
      y,
      guint32(timestamp)
    )
  end beginResize

  /** Sets keyboard focus to @surface.
    *
    * In most cases, [method@Gtk.Window.present_with_time] should be used on a
    * [class@Gtk.Window], rather than calling this function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def focus(
      timestamp: UInt /* Some(_root_.sn.gnome.glib.internal.guint32) */
  ): Unit /* None */ =
    gdk_toplevel_focus(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkToplevel]],
      guint32(timestamp)
    )
  end focus

  /** Gets the bitwise or of the currently active surface state flags, from the
    * `GdkToplevelState` enumeration.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getState(): ToplevelState /* None */ =
    ToplevelState.fromRaw(
      gdk_toplevel_get_state(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkToplevel]]
      )
    )
  end getState

  /** Requests that the @toplevel inhibit the system shortcuts.
    *
    * This is asking the desktop environment/windowing system to let all
    * keyboard events reach the surface, as long as it is focused, instead of
    * triggering system actions.
    *
    * If granted, the rerouting remains active until the default shortcuts
    * processing is restored with
    * [method@Gdk.Toplevel.restore_system_shortcuts], or the request is revoked
    * by the desktop environment, windowing system or the user.
    *
    * A typical use case for this API is remote desktop or virtual machine
    * viewers which need to inhibit the default system keyboard shortcuts so
    * that the remote session or virtual host gets those instead of the local
    * environment.
    *
    * The windowing system or desktop environment may ask the user to grant or
    * deny the request or even choose to ignore the request entirely.
    *
    * The caller can be notified whenever the request is granted or revoked by
    * listening to the [property@Gdk.Toplevel:shortcuts-inhibited] property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def inhibitSystemShortcuts(
      event: Option[sn.gnome.gdk4.fluent.Event /* Some(Ptr[GdkEvent]) */ ]
  )(using Runtime): Unit /* None */ =
    gdk_toplevel_inhibit_system_shortcuts(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkToplevel]],
      event
        .map[Ptr[GdkEvent]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GdkEvent]])
    )
  end inhibitSystemShortcuts

  /** Asks to lower the @toplevel below other windows.
    *
    * The windowing system may choose to ignore the request.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def lower(): Boolean /* None */ =
    gdk_toplevel_lower(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkToplevel]]
    ).value.!=(0)
  end lower

  /** Asks to minimize the @toplevel.
    *
    * The windowing system may choose to ignore the request.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def minimize(): Boolean /* None */ =
    gdk_toplevel_minimize(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkToplevel]]
    ).value.!=(0)
  end minimize

  /** Present @toplevel after having processed the `GdkToplevelLayout` rules.
    *
    * If the toplevel was previously not showing, it will be showed, otherwise
    * it will change layout according to @layout.
    *
    * GDK may emit the [signal@Gdk.Toplevel::compute-size] signal to let the
    * user of this toplevel compute the preferred size of the toplevel surface.
    *
    * Presenting is asynchronous and the specified layout parameters are not
    * guaranteed to be respected.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method present/<method parameters>/layout]: Cannot render type Type(List(),ListMap(@name -> DataRecord(ToplevelLayout), @type -> DataRecord(GdkToplevelLayout*)))"
  )
  private def present__ = ???

  /** Restore default system keyboard shortcuts which were previously inhibited.
    *
    * This undoes the effect of [method@Gdk.Toplevel.inhibit_system_shortcuts].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def restoreSystemShortcuts(): Unit /* None */ =
    gdk_toplevel_restore_system_shortcuts(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkToplevel]]
    )
  end restoreSystemShortcuts

  /** Sets the toplevel to be decorated.
    *
    * Setting @decorated to %FALSE hints the desktop environment that the
    * surface has its own, client-side decorations and does not need to have
    * window decorations added.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDecorated(
      decorated: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gdk_toplevel_set_decorated(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkToplevel]],
      gboolean(gint((if decorated == true then 1 else 0)))
    )
  end setDecorated

  /** Sets the toplevel to be deletable.
    *
    * Setting @deletable to %TRUE hints the desktop environment that it should
    * offer the user a way to close the surface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDeletable(
      deletable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gdk_toplevel_set_deletable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkToplevel]],
      gboolean(gint((if deletable == true then 1 else 0)))
    )
  end setDeletable

  /** Sets a list of icons for the surface.
    *
    * One of these will be used to represent the surface in iconic form. The
    * icon may be shown in window lists or task bars. Which icon size is shown
    * depends on the window manager. The window manager can scale the icon but
    * setting several size icons can give better image quality.
    *
    * Note that some platforms don't support surface icons.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_icon_list/<method parameters>/surfaces]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Texture))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  private def setIconList__ = ???

  /** Sets the toplevel to be modal.
    *
    * The application can use this hint to tell the window manager that a
    * certain surface has modal behaviour. The window manager can use this
    * information to handle modal surfaces in a special way.
    *
    * You should only use this on surfaces for which you have previously called
    * [method@Gdk.Toplevel.set_transient_for].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setModal(
      modal: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gdk_toplevel_set_modal(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkToplevel]],
      gboolean(gint((if modal == true then 1 else 0)))
    )
  end setModal

  /** Sets the startup notification ID.
    *
    * When using GTK, typically you should use
    * [method@Gtk.Window.set_startup_id] instead of this low-level function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setStartupId(
      startup_id: String /* Some(CString) */
  )(using Zone): Unit /* None */ =
    gdk_toplevel_set_startup_id(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkToplevel]],
      toCString(startup_id)
    )
  end setStartupId

  /** Sets the title of a toplevel surface.
    *
    * The title maybe be displayed in the titlebar, in lists of windows, etc.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTitle(
      title: String /* Some(CString) */
  )(using Zone): Unit /* None */ =
    gdk_toplevel_set_title(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkToplevel]],
      toCString(title)
    )
  end setTitle

  /** Sets a transient-for parent.
    *
    * Indicates to the window manager that @surface is a transient dialog
    * associated with the application surface @parent. This allows the window
    * manager to do things like center @surface on @parent and keep @surface
    * above @parent.
    *
    * See [method@Gtk.Window.set_transient_for] if you’re using
    * [class@Gtk.Window] or [class@Gtk.Dialog].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTransientFor(
      parent: sn.gnome.gdk4.fluent.Surface /* Some(Ptr[GdkSurface]) */
  )(using Runtime): Unit /* None */ =
    gdk_toplevel_set_transient_for(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkToplevel]],
      parent.getUnsafeRawPointer().asInstanceOf
    )
  end setTransientFor

  /** Asks the windowing system to show the window menu.
    *
    * The window menu is the menu shown when right-clicking the titlebar on
    * traditional windows managed by the window manager. This is useful for
    * windows using client-side decorations, activating it with a right-click on
    * the window decorations.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def showWindowMenu(
      event: sn.gnome.gdk4.fluent.Event /* Some(Ptr[GdkEvent]) */
  )(using Runtime): Boolean /* None */ =
    gdk_toplevel_show_window_menu(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkToplevel]],
      event.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end showWindowMenu

  /** Returns whether the desktop environment supports tiled window states.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def supportsEdgeConstraints(): Boolean /* None */ =
    gdk_toplevel_supports_edge_constraints(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkToplevel]]
    ).value.!=(0)
  end supportsEdgeConstraints

  def titlebarGesture(
      gesture: TitlebarGesture /* Some(GdkTitlebarGesture) */
  ): Boolean /* None */ =
    gdk_toplevel_titlebar_gesture(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkToplevel]],
      gesture.raw
    ).value.!=(0)
  end titlebarGesture

end Toplevel

object Toplevel:
  class Abstract(raw: Ptr[Byte]) extends Toplevel:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end Toplevel
