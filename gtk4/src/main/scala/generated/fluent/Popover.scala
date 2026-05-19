package sn.gnome.gtk4

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
import sn.gnome.gtk4.{
  Accessible,
  Buildable,
  ConstraintTarget,
  Native,
  PositionType,
  ShortcutManager,
  Widget
}
import sn.gnome.gtk4.internal.{GtkPopover, GtkWidget}
import sn.gnome.runtime.*

/** `GtkPopover` is a bubble-like context popup.
  *
  * ![An example GtkPopover](popover.png)
  *
  * It is primarily meant to provide context-dependent information or options.
  * Popovers are attached to a parent widget. By default, they point to the
  * whole widget area, although this behavior can be changed with
  * [method@Gtk.Popover.set_pointing_to].
  *
  * The position of a popover relative to the widget it is attached to can also
  * be changed with [method@Gtk.Popover.set_position]
  *
  * By default, `GtkPopover` performs a grab, in order to ensure input events
  * get redirected to it while it is shown, and also so the popover is dismissed
  * in the expected situations (clicks outside the popover, or the Escape key
  * being pressed). If no such modal behavior is desired on a popover,
  * [method@Gtk.Popover.set_autohide] may be called on it to tweak its behavior.
  *
  * ## GtkPopover as menu replacement
  *
  * `GtkPopover` is often used to replace menus. The best was to do this is to
  * use the [class@Gtk.PopoverMenu] subclass which supports being populated from
  * a `GMenuModel` with [ctor@Gtk.PopoverMenu.new_from_model].
  *
  * ```xml
  * <section>
  *   <attribute name="display-hint">horizontal-buttons</attribute>
  *   <item>
  *     <attribute name="label">Cut</attribute>
  *     <attribute name="action">app.cut</attribute>
  *     <attribute name="verb-icon">edit-cut-symbolic</attribute>
  *   </item>
  *   <item>
  *     <attribute name="label">Copy</attribute>
  *     <attribute name="action">app.copy</attribute>
  *     <attribute name="verb-icon">edit-copy-symbolic</attribute>
  *   </item>
  *   <item>
  *     <attribute name="label">Paste</attribute>
  *     <attribute name="action">app.paste</attribute>
  *     <attribute name="verb-icon">edit-paste-symbolic</attribute>
  *   </item>
  * </section>
  * ```
  *
  * # CSS nodes
  *
  * ```
  * popover.background[.menu]
  * ├── arrow
  * ╰── contents
  *     ╰── <child>
  * ```
  *
  * `GtkPopover` has a main node with name `popover`, an arrow with name
  * `arrow`, and another node for the content named `contents`. The `popover`
  * node always gets the `.background` style class. It also gets the `.menu`
  * style class if the popover is menu-like, e.g. is a [class@Gtk.PopoverMenu].
  *
  * Particular uses of `GtkPopover`, such as touch selection popups or
  * magnifiers in `GtkEntry` or `GtkTextView` get style classes like
  * `.touch-selection` or `.magnifier` to differentiate from plain popovers.
  *
  * When styling a popover directly, the `popover` node should usually not have
  * any background. The visible part of the popover can have a shadow. To
  * specify it in CSS, set the box-shadow of the `contents` node.
  *
  * Note that, in order to accomplish appropriate arrow visuals, `GtkPopover`
  * uses custom drawing for the `arrow` node. This makes it possible for the
  * arrow to change its shape dynamically, but it also limits the possibilities
  * of styling it using CSS. In particular, the `arrow` gets drawn over the
  * `content` node's border and shadow, so they look like one shape, which means
  * that the border width of the `content` node and the `arrow` node should be
  * the same. The arrow also does not support any border shape other than solid,
  * no border-radius, only one border width (border-bottom-width is used) and no
  * box-shadow.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Popover private[gnome] (raw: Ptr[GtkPopover])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Native,
      ShortcutManager:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Returns whether the popover is modal.
    *
    * See [method@Gtk.Popover.set_autohide] for the implications of this.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAutohide(): Boolean /* None */ =
    gtk_popover_get_autohide(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPopover]]
    ).value.!=(0)
  end getAutohide

  /** Returns whether the popover will close after a modal child is closed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCascadePopdown(): Boolean /* None */ =
    gtk_popover_get_cascade_popdown(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPopover]]
    ).value.!=(0)
  end getCascadePopdown

  /** Gets the child widget of @popover.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChild()(using Runtime): sn.gnome.gtk4.Widget /* None */ =
    sn.gnome.gtk4.Widget.applyUnsafe(
      gtk_popover_get_child(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPopover]]
      ).asInstanceOf
    )
  end getChild

  /** Gets whether this popover is showing an arrow pointing at the widget that
    * it is relative to.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHasArrow(): Boolean /* None */ =
    gtk_popover_get_has_arrow(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPopover]]
    ).value.!=(0)
  end getHasArrow

  /** Gets whether mnemonics are visible.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMnemonicsVisible(): Boolean /* None */ =
    gtk_popover_get_mnemonics_visible(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPopover]]
    ).value.!=(0)
  end getMnemonicsVisible

  /** Gets the offset previous set with [method@Gtk.Popover.set_offset()].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_offset]: Method get_offset contains an OUT parameter, which is not supported yet"
  )
  private def getOffset__ = ???

  /** Gets the rectangle that the popover points to.
    *
    * If a rectangle to point to has been set, this function will return %TRUE
    * and fill in @rect with such rectangle, otherwise it will return %FALSE and
    * fill in @rect with the parent widget coordinates.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_pointing_to]: Method get_pointing_to contains an OUT parameter, which is not supported yet"
  )
  private def getPointingTo__ = ???

  /** Returns the preferred position of @popover.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPosition(): PositionType /* None */ =
    PositionType.fromRaw(
      gtk_popover_get_position(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPopover]]
      )
    )
  end getPosition

  /** Pops @popover down.
    *
    * This may have the side-effect of closing a parent popover as well. See
    * [property@Gtk.Popover:cascade-popdown].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def popdown(): Unit /* None */ =
    gtk_popover_popdown(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPopover]]
    )
  end popdown

  /** Pops @popover up.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def popup(): Unit /* None */ =
    gtk_popover_popup(this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPopover]])
  end popup

  /** Allocate a size for the `GtkPopover`.
    *
    * This function needs to be called in size-allocate by widgets who have a
    * `GtkPopover` as child. When using a layout manager, this is happening
    * automatically.
    *
    * To make a popover appear on screen, use [method@Gtk.Popover.popup].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def present(): Unit /* None */ =
    gtk_popover_present(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPopover]]
    )
  end present

  /** Creates the GDK resources associated with a widget.
    *
    * Normally realization happens implicitly; if you show a widget and all its
    * parent containers, then the widget will be realized and mapped
    * automatically.
    *
    * Realizing a widget requires all the widget’s parent widgets to be
    * realized; calling this function realizes the widget’s parents in addition
    * to @widget itself. If a widget is not yet inside a toplevel window when
    * you realize it, bad things will happen.
    *
    * This function is primarily used in widget implementations, and isn’t very
    * useful otherwise. Many times when you think you might need it, a better
    * approach is to connect to a signal that will be called after the widget is
    * realized automatically, such as [signal@Gtk.Widget::realize].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def realize(): Unit /* None */ =
    gtk_widget_realize(this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]])
  end realize

  /** Sets whether @popover is modal.
    *
    * A modal popover will grab the keyboard focus on it when being displayed.
    * Focus will wrap around within the popover. Clicking outside the popover
    * area or pressing Esc will dismiss the popover.
    *
    * Called this function on an already showing popup with a new autohide value
    * different from the current one, will cause the popup to be hidden.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAutohide(
      autohide: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_popover_set_autohide(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPopover]],
      gboolean(gint((if autohide == true then 1 else 0)))
    )
  end setAutohide

  /** If @cascade_popdown is %TRUE, the popover will be closed when a child
    * modal popover is closed.
    *
    * If %FALSE, @popover will stay visible.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setCascadePopdown(
      cascade_popdown: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_popover_set_cascade_popdown(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPopover]],
      gboolean(gint((if cascade_popdown == true then 1 else 0)))
    )
  end setCascadePopdown

  /** Sets the child widget of @popover.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setChild(child: Option[sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */ ])(
      using Runtime
  ): Unit /* None */ =
    gtk_popover_set_child(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPopover]],
      child
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
    )
  end setChild

  /** Sets the default widget of a `GtkPopover`.
    *
    * The default widget is the widget that’s activated when the user presses
    * Enter in a dialog (for example). This function sets or unsets the default
    * widget for a `GtkPopover`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDefaultWidget(
      widget: Option[sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */ ]
  )(using Runtime): Unit /* None */ =
    gtk_popover_set_default_widget(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPopover]],
      widget
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
    )
  end setDefaultWidget

  /** Sets whether this popover should draw an arrow pointing at the widget it
    * is relative to.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setHasArrow(
      has_arrow: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_popover_set_has_arrow(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPopover]],
      gboolean(gint((if has_arrow == true then 1 else 0)))
    )
  end setHasArrow

  /** Sets whether mnemonics should be visible.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMnemonicsVisible(
      mnemonics_visible: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_popover_set_mnemonics_visible(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPopover]],
      gboolean(gint((if mnemonics_visible == true then 1 else 0)))
    )
  end setMnemonicsVisible

  /** Sets the offset to use when calculating the position of the popover.
    *
    * These values are used when preparing the [struct@Gdk.PopupLayout] for
    * positioning the popover.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setOffset(
      x_offset: Int /* Some(CInt) */,
      y_offset: Int /* Some(CInt) */
  ): Unit /* None */ =
    gtk_popover_set_offset(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPopover]],
      x_offset,
      y_offset
    )
  end setOffset

  /** Sets the rectangle that @popover points to.
    *
    * This is in the coordinate space of the @popover parent.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_pointing_to/<method parameters>/rect]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gdk.Rectangle), @type -> DataRecord(const GdkRectangle*)))"
  )
  private def setPointingTo__ = ???

  /** Sets the preferred position for @popover to appear.
    *
    * If the @popover is currently visible, it will be immediately updated.
    *
    * This preference will be respected where possible, although on lack of
    * space (eg. if close to the window edges), the `GtkPopover` may choose to
    * appear on the opposite side.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPosition(
      position: PositionType /* Some(GtkPositionType) */
  ): Unit /* None */ =
    gtk_popover_set_position(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPopover]],
      position.raw
    )
  end setPosition

  /** Causes a widget to be unrealized (frees all GDK resources associated with
    * the widget).
    *
    * This function is only useful in widget implementations.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def unrealize(): Unit /* None */ =
    gtk_widget_unrealize(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
    )
  end unrealize

  /** Emitted whend the user activates the default widget.
    *
    * This is a [keybinding signal](class.SignalAction.html).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onActivateDefault(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkPopover],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"activate-default"
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
  end onActivateDefault

  /** Emitted when the popover is closed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onClosed(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkPopover],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"closed"
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
  end onClosed
end Popover

object Popover:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkPopover])(using Runtime) = summon[Runtime]
    .getOrCreate[Popover](ptr.asInstanceOf[Ptr[Byte]], p => new Popover(ptr))

  /** Creates a new `GtkPopover`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): Popover =
    val raw: Ptr[Byte] = gtk_popover_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[Popover](raw, r => Popover.applyUnsafe(r.asInstanceOf))
  end apply
end Popover
