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
  AccessibleRange,
  Buildable,
  ConstraintTarget,
  Orientable,
  Orientation,
  ScrollType,
  Widget
}
import sn.gnome.gtk4.internal.{GtkPaned, GtkScrollType}
import sn.gnome.runtime.*

/** A widget with two panes, arranged either horizontally or vertically.
  *
  * ![An example GtkPaned](panes.png)
  *
  * The division between the two panes is adjustable by the user by dragging a
  * handle.
  *
  * Child widgets are added to the panes of the widget with
  * [method@Gtk.Paned.set_start_child] and [method@Gtk.Paned.set_end_child]. The
  * division between the two children is set by default from the size requests
  * of the children, but it can be adjusted by the user.
  *
  * A paned widget draws a separator between the two child widgets and a small
  * handle that the user can drag to adjust the division. It does not draw any
  * relief around the children or around the separator. (The space in which the
  * separator is called the gutter.) Often, it is useful to put each child
  * inside a [class@Gtk.Frame] so that the gutter appears as a ridge. No
  * separator is drawn if one of the children is missing.
  *
  * Each child has two options that can be set, "resize" and "shrink". If
  * "resize" is true then, when the `GtkPaned` is resized, that child will
  * expand or shrink along with the paned widget. If "shrink" is true, then that
  * child can be made smaller than its requisition by the user. Setting "shrink"
  * to false allows the application to set a minimum size. If "resize" is false
  * for both children, then this is treated as if "resize" is true for both
  * children.
  *
  * The application can set the position of the slider as if it were set by the
  * user, by calling [method@Gtk.Paned.set_position].
  *
  * # CSS nodes
  *
  * ```
  * paned
  * ├── <child>
  * ├── separator[.wide]
  * ╰── <child>
  * ```
  *
  * `GtkPaned` has a main CSS node with name paned, and a subnode for the
  * separator with name separator. The subnode gets a .wide style class when the
  * paned is supposed to be wide.
  *
  * In horizontal orientation, the nodes are arranged based on the text
  * direction, so in left-to-right mode, :first-child will select the leftmost
  * child, while it will select the rightmost child in RTL layouts.
  *
  * ## Creating a paned widget with minimum sizes.
  *
  * ```c
  * GtkWidget *hpaned = gtk_paned_new (GTK_ORIENTATION_HORIZONTAL);
  * GtkWidget *frame1 = gtk_frame_new (NULL);
  * GtkWidget *frame2 = gtk_frame_new (NULL);
  *
  * gtk_widget_set_size_request (hpaned, 200, -1);
  *
  * gtk_paned_set_start_child (GTK_PANED (hpaned), frame1);
  * gtk_paned_set_resize_start_child (GTK_PANED (hpaned), TRUE);
  * gtk_paned_set_shrink_start_child (GTK_PANED (hpaned), FALSE);
  * gtk_widget_set_size_request (frame1, 50, -1);
  *
  * gtk_paned_set_end_child (GTK_PANED (hpaned), frame2);
  * gtk_paned_set_resize_end_child (GTK_PANED (hpaned), FALSE);
  * gtk_paned_set_shrink_end_child (GTK_PANED (hpaned), FALSE);
  * gtk_widget_set_size_request (frame2, 50, -1);
  * ```
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Paned private[gnome] (raw: Ptr[GtkPaned])
    extends Widget(raw.asInstanceOf),
      Accessible,
      AccessibleRange,
      Buildable,
      ConstraintTarget,
      Orientable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Retrieves the end child of the given `GtkPaned`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getEndChild()(using Runtime): sn.gnome.gtk4.fluent.Widget /* None */ =
    sn.gnome.gtk4.fluent.Widget.applyUnsafe(
      gtk_paned_get_end_child(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPaned]]
      ).asInstanceOf
    )
  end getEndChild

  /** Obtains the position of the divider between the two panes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPosition(): Int /* None */ =
    gtk_paned_get_position(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPaned]]
    )
  end getPosition

  /** Returns whether the [property@Gtk.Paned:end-child] can be resized.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getResizeEndChild(): Boolean /* None */ =
    gtk_paned_get_resize_end_child(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPaned]]
    ).value.!=(0)
  end getResizeEndChild

  /** Returns whether the [property@Gtk.Paned:start-child] can be resized.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getResizeStartChild(): Boolean /* None */ =
    gtk_paned_get_resize_start_child(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPaned]]
    ).value.!=(0)
  end getResizeStartChild

  /** Returns whether the [property@Gtk.Paned:end-child] can shrink.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getShrinkEndChild(): Boolean /* None */ =
    gtk_paned_get_shrink_end_child(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPaned]]
    ).value.!=(0)
  end getShrinkEndChild

  /** Returns whether the [property@Gtk.Paned:start-child] can shrink.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getShrinkStartChild(): Boolean /* None */ =
    gtk_paned_get_shrink_start_child(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPaned]]
    ).value.!=(0)
  end getShrinkStartChild

  /** Retrieves the start child of the given `GtkPaned`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getStartChild()(using Runtime): sn.gnome.gtk4.fluent.Widget /* None */ =
    sn.gnome.gtk4.fluent.Widget.applyUnsafe(
      gtk_paned_get_start_child(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPaned]]
      ).asInstanceOf
    )
  end getStartChild

  /** Gets whether the separator should be wide.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getWideHandle(): Boolean /* None */ =
    gtk_paned_get_wide_handle(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPaned]]
    ).value.!=(0)
  end getWideHandle

  /** Sets the end child of @paned to @child.
    *
    * If @child is `NULL`, the existing child will be removed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setEndChild(
      child: Option[sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */ ]
  )(using Runtime): Unit /* None */ =
    gtk_paned_set_end_child(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPaned]],
      child
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
    )
  end setEndChild

  /** Sets the position of the divider between the two panes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPosition(position: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_paned_set_position(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPaned]],
      position
    )
  end setPosition

  /** Sets whether the [property@Gtk.Paned:end-child] can be resized.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setResizeEndChild(
      resize: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_paned_set_resize_end_child(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPaned]],
      gboolean(gint((if resize == true then 1 else 0)))
    )
  end setResizeEndChild

  /** Sets whether the [property@Gtk.Paned:start-child] can be resized.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setResizeStartChild(
      resize: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_paned_set_resize_start_child(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPaned]],
      gboolean(gint((if resize == true then 1 else 0)))
    )
  end setResizeStartChild

  /** Sets whether the [property@Gtk.Paned:end-child] can shrink.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setShrinkEndChild(
      resize: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_paned_set_shrink_end_child(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPaned]],
      gboolean(gint((if resize == true then 1 else 0)))
    )
  end setShrinkEndChild

  /** Sets whether the [property@Gtk.Paned:start-child] can shrink.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setShrinkStartChild(
      resize: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_paned_set_shrink_start_child(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPaned]],
      gboolean(gint((if resize == true then 1 else 0)))
    )
  end setShrinkStartChild

  /** Sets the start child of @paned to @child.
    *
    * If @child is `NULL`, the existing child will be removed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setStartChild(
      child: Option[sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */ ]
  )(using Runtime): Unit /* None */ =
    gtk_paned_set_start_child(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPaned]],
      child
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
    )
  end setStartChild

  /** Sets whether the separator should be wide.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setWideHandle(
      wide: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_paned_set_wide_handle(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPaned]],
      gboolean(gint((if wide == true then 1 else 0)))
    )
  end setWideHandle

  /** Emitted to accept the current position of the handle when moving it using
    * key bindings.
    *
    * This is a [keybinding signal](class.SignalAction.html).
    *
    * The default binding for this signal is <kbd>Return</kbd> or
    * <kbd>Space</kbd>.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onAcceptPosition(handler: => Boolean)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Boolean]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkPaned],
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
    val signal = c"accept-position"
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
  end onAcceptPosition

  /** Emitted to cancel moving the position of the handle using key bindings.
    *
    * The position of the handle will be reset to the value prior to moving it.
    *
    * This is a [keybinding signal](class.SignalAction.html).
    *
    * The default binding for this signal is <kbd>Escape</kbd>.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onCancelPosition(handler: => Boolean)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Boolean]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkPaned],
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
    val signal = c"cancel-position"
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
  end onCancelPosition

  /** Emitted to cycle the focus between the children of the paned.
    *
    * This is a [keybinding signal](class.SignalAction.html).
    *
    * The default binding is <kbd>F6</kbd>.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onCycleChildFocus(handler: ((reversed: Boolean)) => Boolean)(using
      Runtime
  ) =
    type SignalRegType =
      SignalRegistration[this.type, (reversed: Boolean), Boolean]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkPaned],
          reversed: Boolean /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((reversed = reversed))
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
    val signal = c"cycle-child-focus"
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
  end onCycleChildFocus

  /** Emitted to cycle whether the paned should grab focus to allow the user to
    * change position of the handle by using key bindings.
    *
    * This is a [keybinding signal](class.SignalAction.html).
    *
    * The default binding for this signal is <kbd>F8</kbd>.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onCycleHandleFocus(handler: ((reversed: Boolean)) => Boolean)(using
      Runtime
  ) =
    type SignalRegType =
      SignalRegistration[this.type, (reversed: Boolean), Boolean]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkPaned],
          reversed: Boolean /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((reversed = reversed))
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
    val signal = c"cycle-handle-focus"
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
  end onCycleHandleFocus

  /** Emitted to move the handle with key bindings.
    *
    * This is a [keybinding signal](class.SignalAction.html).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onMoveHandle(handler: ((scrollType: ScrollType)) => Boolean)(using
      Runtime
  ) =
    type SignalRegType =
      SignalRegistration[this.type, (scrollType: ScrollType), Boolean]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkPaned],
          scrollType: GtkScrollType /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((scrollType = ScrollType.fromRaw(scrollType)))
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
    val signal = c"move-handle"
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
  end onMoveHandle

  /** Emitted to accept the current position of the handle and then move focus
    * to the next widget in the focus chain.
    *
    * This is a [keybinding signal](class.SignalAction.html).
    *
    * The default binding is <kbd>Tab</kbd>.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onToggleHandleFocus(handler: => Boolean)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Boolean]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkPaned],
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
    val signal = c"toggle-handle-focus"
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
  end onToggleHandleFocus
end Paned

object Paned:
  def applyUnsafe(ptr: Ptr[GtkPaned])(using Runtime) = summon[Runtime]
    .getOrCreate[Paned](ptr.asInstanceOf[Ptr[Byte]], p => new Paned(ptr))

  /** Creates a new `GtkPaned` widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(orientation: Orientation /* Some(GtkOrientation) */ )(using
      Runtime
  ): Paned =
    val raw: Ptr[Byte] = gtk_paned_new(orientation.raw).asInstanceOf
    summon[Runtime]
      .getOrCreate[Paned](raw, r => Paned.applyUnsafe(r.asInstanceOf))
  end apply
end Paned
