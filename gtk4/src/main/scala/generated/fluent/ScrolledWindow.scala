package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer}
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{
  Accessible,
  Adjustment,
  Buildable,
  ConstraintTarget,
  CornerType,
  DirectionType,
  PolicyType,
  PositionType,
  ScrollType,
  Widget
}
import sn.gnome.gtk4.internal.{
  GtkDirectionType,
  GtkPositionType,
  GtkScrollType,
  GtkScrolledWindow
}
import sn.gnome.runtime.*

/** `GtkScrolledWindow` is a container that makes its child scrollable.
  *
  * It does so using either internally added scrollbars or externally associated
  * adjustments, and optionally draws a frame around the child.
  *
  * Widgets with native scrolling support, i.e. those whose classes implement
  * the [iface@Gtk.Scrollable] interface, are added directly. For other types of
  * widget, the class [class@Gtk.Viewport] acts as an adaptor, giving
  * scrollability to other widgets. [method@Gtk.ScrolledWindow.set_child]
  * intelligently accounts for whether or not the added child is a
  * `GtkScrollable`. If it isn’t, then it wraps the child in a `GtkViewport`.
  * Therefore, you can just add any child widget and not worry about the
  * details.
  *
  * If [method@Gtk.ScrolledWindow.set_child] has added a `GtkViewport` for you,
  * it will be automatically removed when you unset the child. Unless
  * [property@Gtk.ScrolledWindow:hscrollbar-policy] and
  * [property@Gtk.ScrolledWindow:vscrollbar-policy] are %GTK_POLICY_NEVER or
  * %GTK_POLICY_EXTERNAL, `GtkScrolledWindow` adds internal `GtkScrollbar`
  * widgets around its child. The scroll position of the child, and if
  * applicable the scrollbars, is controlled by the
  * [property@Gtk.ScrolledWindow:hadjustment] and
  * [property@Gtk.ScrolledWindow:vadjustment] that are associated with the
  * `GtkScrolledWindow`. See the docs on [class@Gtk.Scrollbar] for the details,
  * but note that the “step_increment” and “page_increment” fields are only
  * effective if the policy causes scrollbars to be present.
  *
  * If a `GtkScrolledWindow` doesn’t behave quite as you would like, or doesn’t
  * have exactly the right layout, it’s very possible to set up your own
  * scrolling with `GtkScrollbar` and for example a `GtkGrid`.
  *
  * # Touch support
  *
  * `GtkScrolledWindow` has built-in support for touch devices. When a
  * touchscreen is used, swiping will move the scrolled window, and will expose
  * 'kinetic' behavior. This can be turned off with the
  * [property@Gtk.ScrolledWindow:kinetic-scrolling] property if it is undesired.
  *
  * `GtkScrolledWindow` also displays visual 'overshoot' indication when the
  * content is pulled beyond the end, and this situation can be captured with
  * the [signal@Gtk.ScrolledWindow::edge-overshot] signal.
  *
  * If no mouse device is present, the scrollbars will overlaid as narrow,
  * auto-hiding indicators over the content. If traditional scrollbars are
  * desired although no mouse is present, this behaviour can be turned off with
  * the [property@Gtk.ScrolledWindow:overlay-scrolling] property.
  *
  * # CSS nodes
  *
  * `GtkScrolledWindow` has a main CSS node with name scrolledwindow. It gets a
  * .frame style class added when [property@Gtk.ScrolledWindow:has-frame] is
  * %TRUE.
  *
  * It uses subnodes with names overshoot and undershoot to draw the overflow
  * and underflow indications. These nodes get the .left, .right, .top or
  * .bottom style class added depending on where the indication is drawn.
  *
  * `GtkScrolledWindow` also sets the positional style classes (.left, .right,
  * .top, .bottom) and style classes related to overlay scrolling
  * (.overlay-indicator, .dragging, .hovering) on its scrollbars.
  *
  * If both scrollbars are visible, the area where they meet is drawn with a
  * subnode named junction.
  *
  * # Accessibility
  *
  * Until GTK 4.10, `GtkScrolledWindow` used the `GTK_ACCESSIBLE_ROLE_GROUP`
  * role.
  *
  * Starting from GTK 4.12, `GtkScrolledWindow` uses the
  * `GTK_ACCESSIBLE_ROLE_GENERIC` role.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ScrolledWindow private[gnome] (raw: Ptr[GtkScrolledWindow])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the child widget of @scrolled_window.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChild()(using Runtime): sn.gnome.gtk4.fluent.Widget /* None */ =
    sn.gnome.gtk4.fluent.Widget.applyUnsafe(
      gtk_scrolled_window_get_child(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScrolledWindow]]
      ).asInstanceOf
    )
  end getChild

  /** Returns the horizontal scrollbar’s adjustment.
    *
    * This is the adjustment used to connect the horizontal scrollbar to the
    * child widget’s horizontal scroll functionality.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHadjustment()(using
      Runtime
  ): sn.gnome.gtk4.fluent.Adjustment /* None */ =
    sn.gnome.gtk4.fluent.Adjustment.applyUnsafe(
      gtk_scrolled_window_get_hadjustment(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScrolledWindow]]
      ).asInstanceOf
    )
  end getHadjustment

  /** Gets whether the scrolled window draws a frame.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHasFrame(): Boolean /* None */ =
    gtk_scrolled_window_get_has_frame(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScrolledWindow]]
    ).value.!=(0)
  end getHasFrame

  /** Returns the horizontal scrollbar of @scrolled_window.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHscrollbar()(using Runtime): sn.gnome.gtk4.fluent.Widget /* None */ =
    sn.gnome.gtk4.fluent.Widget.applyUnsafe(
      gtk_scrolled_window_get_hscrollbar(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScrolledWindow]]
      ).asInstanceOf
    )
  end getHscrollbar

  /** Returns the specified kinetic scrolling behavior.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getKineticScrolling(): Boolean /* None */ =
    gtk_scrolled_window_get_kinetic_scrolling(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScrolledWindow]]
    ).value.!=(0)
  end getKineticScrolling

  /** Returns the maximum content height set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMaxContentHeight(): Int /* None */ =
    gtk_scrolled_window_get_max_content_height(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScrolledWindow]]
    )
  end getMaxContentHeight

  /** Returns the maximum content width set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMaxContentWidth(): Int /* None */ =
    gtk_scrolled_window_get_max_content_width(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScrolledWindow]]
    )
  end getMaxContentWidth

  /** Gets the minimal content height of @scrolled_window.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMinContentHeight(): Int /* None */ =
    gtk_scrolled_window_get_min_content_height(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScrolledWindow]]
    )
  end getMinContentHeight

  /** Gets the minimum content width of @scrolled_window.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMinContentWidth(): Int /* None */ =
    gtk_scrolled_window_get_min_content_width(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScrolledWindow]]
    )
  end getMinContentWidth

  /** Returns whether overlay scrolling is enabled for this scrolled window.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getOverlayScrolling(): Boolean /* None */ =
    gtk_scrolled_window_get_overlay_scrolling(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScrolledWindow]]
    ).value.!=(0)
  end getOverlayScrolling

  /** Gets the placement of the contents with respect to the scrollbars.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPlacement(): CornerType /* None */ =
    CornerType.fromRaw(
      gtk_scrolled_window_get_placement(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScrolledWindow]]
      )
    )
  end getPlacement

  /** Retrieves the current policy values for the horizontal and vertical
    * scrollbars.
    *
    * See [method@Gtk.ScrolledWindow.set_policy].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_policy]: Method get_policy contains an OUT parameter, which is not supported yet"
  )
  private def getPolicy__ = ???

  /** Reports whether the natural height of the child will be calculated and
    * propagated through the scrolled window’s requested natural height.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPropagateNaturalHeight(): Boolean /* None */ =
    gtk_scrolled_window_get_propagate_natural_height(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScrolledWindow]]
    ).value.!=(0)
  end getPropagateNaturalHeight

  /** Reports whether the natural width of the child will be calculated and
    * propagated through the scrolled window’s requested natural width.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPropagateNaturalWidth(): Boolean /* None */ =
    gtk_scrolled_window_get_propagate_natural_width(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScrolledWindow]]
    ).value.!=(0)
  end getPropagateNaturalWidth

  /** Returns the vertical scrollbar’s adjustment.
    *
    * This is the adjustment used to connect the vertical scrollbar to the child
    * widget’s vertical scroll functionality.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getVadjustment()(using
      Runtime
  ): sn.gnome.gtk4.fluent.Adjustment /* None */ =
    sn.gnome.gtk4.fluent.Adjustment.applyUnsafe(
      gtk_scrolled_window_get_vadjustment(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScrolledWindow]]
      ).asInstanceOf
    )
  end getVadjustment

  /** Returns the vertical scrollbar of @scrolled_window.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getVscrollbar()(using Runtime): sn.gnome.gtk4.fluent.Widget /* None */ =
    sn.gnome.gtk4.fluent.Widget.applyUnsafe(
      gtk_scrolled_window_get_vscrollbar(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScrolledWindow]]
      ).asInstanceOf
    )
  end getVscrollbar

  /** Sets the child widget of @scrolled_window.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setChild(
      child: Option[sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */ ]
  )(using Runtime): Unit /* None */ =
    gtk_scrolled_window_set_child(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScrolledWindow]],
      child
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
    )
  end setChild

  /** Sets the `GtkAdjustment` for the horizontal scrollbar.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setHadjustment(
      hadjustment: Option[
        sn.gnome.gtk4.fluent.Adjustment /* Some(Ptr[GtkAdjustment]) */
      ]
  )(using Runtime): Unit /* None */ =
    gtk_scrolled_window_set_hadjustment(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScrolledWindow]],
      hadjustment
        .map[Ptr[GtkAdjustment]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkAdjustment]])
    )
  end setHadjustment

  /** Changes the frame drawn around the contents of @scrolled_window.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setHasFrame(
      has_frame: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_scrolled_window_set_has_frame(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScrolledWindow]],
      gboolean(gint((if has_frame == true then 1 else 0)))
    )
  end setHasFrame

  /** Turns kinetic scrolling on or off.
    *
    * Kinetic scrolling only applies to devices with source
    * %GDK_SOURCE_TOUCHSCREEN.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setKineticScrolling(
      kinetic_scrolling: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_scrolled_window_set_kinetic_scrolling(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScrolledWindow]],
      gboolean(gint((if kinetic_scrolling == true then 1 else 0)))
    )
  end setKineticScrolling

  /** Sets the maximum height that @scrolled_window should keep visible.
    *
    * The @scrolled_window will grow up to this height before it starts
    * scrolling the content.
    *
    * It is a programming error to set the maximum content height to a value
    * smaller than [property@Gtk.ScrolledWindow:min-content-height].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMaxContentHeight(height: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_scrolled_window_set_max_content_height(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScrolledWindow]],
      height
    )
  end setMaxContentHeight

  /** Sets the maximum width that @scrolled_window should keep visible.
    *
    * The @scrolled_window will grow up to this width before it starts scrolling
    * the content.
    *
    * It is a programming error to set the maximum content width to a value
    * smaller than [property@Gtk.ScrolledWindow:min-content-width].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMaxContentWidth(width: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_scrolled_window_set_max_content_width(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScrolledWindow]],
      width
    )
  end setMaxContentWidth

  /** Sets the minimum height that @scrolled_window should keep visible.
    *
    * Note that this can and (usually will) be smaller than the minimum size of
    * the content.
    *
    * It is a programming error to set the minimum content height to a value
    * greater than [property@Gtk.ScrolledWindow:max-content-height].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMinContentHeight(height: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_scrolled_window_set_min_content_height(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScrolledWindow]],
      height
    )
  end setMinContentHeight

  /** Sets the minimum width that @scrolled_window should keep visible.
    *
    * Note that this can and (usually will) be smaller than the minimum size of
    * the content.
    *
    * It is a programming error to set the minimum content width to a value
    * greater than [property@Gtk.ScrolledWindow:max-content-width].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMinContentWidth(width: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_scrolled_window_set_min_content_width(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScrolledWindow]],
      width
    )
  end setMinContentWidth

  /** Enables or disables overlay scrolling for this scrolled window.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setOverlayScrolling(
      overlay_scrolling: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_scrolled_window_set_overlay_scrolling(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScrolledWindow]],
      gboolean(gint((if overlay_scrolling == true then 1 else 0)))
    )
  end setOverlayScrolling

  /** Sets the placement of the contents with respect to the scrollbars for the
    * scrolled window.
    *
    * The default is %GTK_CORNER_TOP_LEFT, meaning the child is in the top left,
    * with the scrollbars underneath and to the right. Other values in
    * [enum@Gtk.CornerType] are %GTK_CORNER_TOP_RIGHT, %GTK_CORNER_BOTTOM_LEFT,
    * and %GTK_CORNER_BOTTOM_RIGHT.
    *
    * See also [method@Gtk.ScrolledWindow.get_placement] and
    * [method@Gtk.ScrolledWindow.unset_placement].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPlacement(
      window_placement: CornerType /* Some(GtkCornerType) */
  ): Unit /* None */ =
    gtk_scrolled_window_set_placement(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScrolledWindow]],
      window_placement.raw
    )
  end setPlacement

  /** Sets the scrollbar policy for the horizontal and vertical scrollbars.
    *
    * The policy determines when the scrollbar should appear; it is a value from
    * the [enum@Gtk.PolicyType] enumeration. If %GTK_POLICY_ALWAYS, the
    * scrollbar is always present; if %GTK_POLICY_NEVER, the scrollbar is never
    * present; if %GTK_POLICY_AUTOMATIC, the scrollbar is present only if needed
    * (that is, if the slider part of the bar would be smaller than the trough —
    * the display is larger than the page size).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPolicy(
      hscrollbar_policy: PolicyType /* Some(GtkPolicyType) */,
      vscrollbar_policy: PolicyType /* Some(GtkPolicyType) */
  ): Unit /* None */ =
    gtk_scrolled_window_set_policy(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScrolledWindow]],
      hscrollbar_policy.raw,
      vscrollbar_policy.raw
    )
  end setPolicy

  /** Sets whether the natural height of the child should be calculated and
    * propagated through the scrolled window’s requested natural height.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPropagateNaturalHeight(
      propagate: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_scrolled_window_set_propagate_natural_height(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScrolledWindow]],
      gboolean(gint((if propagate == true then 1 else 0)))
    )
  end setPropagateNaturalHeight

  /** Sets whether the natural width of the child should be calculated and
    * propagated through the scrolled window’s requested natural width.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPropagateNaturalWidth(
      propagate: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_scrolled_window_set_propagate_natural_width(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScrolledWindow]],
      gboolean(gint((if propagate == true then 1 else 0)))
    )
  end setPropagateNaturalWidth

  /** Sets the `GtkAdjustment` for the vertical scrollbar.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setVadjustment(
      vadjustment: Option[
        sn.gnome.gtk4.fluent.Adjustment /* Some(Ptr[GtkAdjustment]) */
      ]
  )(using Runtime): Unit /* None */ =
    gtk_scrolled_window_set_vadjustment(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScrolledWindow]],
      vadjustment
        .map[Ptr[GtkAdjustment]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkAdjustment]])
    )
  end setVadjustment

  /** Unsets the placement of the contents with respect to the scrollbars.
    *
    * If no window placement is set for a scrolled window, it defaults to
    * %GTK_CORNER_TOP_LEFT.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unsetPlacement(): Unit /* None */ =
    gtk_scrolled_window_unset_placement(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScrolledWindow]]
    )
  end unsetPlacement

  /** Emitted whenever user initiated scrolling makes the scrolled window firmly
    * surpass the limits defined by the adjustment in that orientation.
    *
    * A similar behavior without edge resistance is provided by the
    * [signal@Gtk.ScrolledWindow::edge-reached] signal.
    *
    * Note: The @pos argument is LTR/RTL aware, so callers should be aware too
    * if intending to provide behavior on horizontal edges.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onEdgeOvershot(handler: ((pos: PositionType)) => Unit)(using Runtime) =
    type SignalRegType =
      SignalRegistration[this.type, (pos: PositionType), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkScrolledWindow],
          pos: GtkPositionType /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((pos = PositionType.fromRaw(pos)))
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"edge-overshot"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onEdgeOvershot

  /** Emitted whenever user-initiated scrolling makes the scrolled window
    * exactly reach the lower or upper limits defined by the adjustment in that
    * orientation.
    *
    * A similar behavior with edge resistance is provided by the
    * [signal@Gtk.ScrolledWindow::edge-overshot] signal.
    *
    * Note: The @pos argument is LTR/RTL aware, so callers should be aware too
    * if intending to provide behavior on horizontal edges.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onEdgeReached(handler: ((pos: PositionType)) => Unit)(using Runtime) =
    type SignalRegType =
      SignalRegistration[this.type, (pos: PositionType), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkScrolledWindow],
          pos: GtkPositionType /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((pos = PositionType.fromRaw(pos)))
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"edge-reached"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onEdgeReached

  /** Emitted when focus is moved away from the scrolled window by a keybinding.
    *
    * This is a [keybinding signal](class.SignalAction.html).
    *
    * The default bindings for this signal are `Ctrl + Tab` to move forward and
    * `Ctrl + Shift + Tab` to move backward.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onMoveFocusOut(handler: ((directionType: DirectionType)) => Unit)(using
      Runtime
  ) =
    type SignalRegType =
      SignalRegistration[this.type, (directionType: DirectionType), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkScrolledWindow],
          directionType: GtkDirectionType /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((directionType = DirectionType.fromRaw(directionType)))
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"move-focus-out"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onMoveFocusOut

  /** Emitted when a keybinding that scrolls is pressed.
    *
    * This is a [keybinding signal](class.SignalAction.html).
    *
    * The horizontal or vertical adjustment is updated which triggers a signal
    * that the scrolled window’s child may listen to and scroll itself.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onScrollChild(
      handler: ((scroll: ScrollType, horizontal: Boolean)) => Boolean
  )(using Runtime) =
    type SignalRegType = SignalRegistration[
      this.type,
      (scroll: ScrollType, horizontal: Boolean),
      Boolean
    ]
    val c_handler = CFuncPtr4.fromScalaFunction {
      (
          self: Ptr[GtkScrolledWindow],
          scroll: GtkScrollType /* param */,
          horizontal: Boolean /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(
          (scroll = ScrollType.fromRaw(scroll), horizontal = horizontal)
        )
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"scroll-child"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onScrollChild
end ScrolledWindow

object ScrolledWindow:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkScrolledWindow])(using Runtime) =
    summon[Runtime].getOrCreate[ScrolledWindow](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ScrolledWindow(ptr)
    )

  /** Creates a new scrolled window.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): ScrolledWindow =
    val raw: Ptr[Byte] = gtk_scrolled_window_new().asInstanceOf
    summon[Runtime].getOrCreate[ScrolledWindow](
      raw,
      r => ScrolledWindow.applyUnsafe(r.asInstanceOf)
    )
  end apply
end ScrolledWindow
