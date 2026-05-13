package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.Display
import sn.gnome.glib.internal.{gchar, gpointer}
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
  Root,
  ShortcutManager,
  ShortcutsSection,
  Widget,
  Window
}
import sn.gnome.gtk4.internal.{
  GtkNative,
  GtkRoot,
  GtkShortcutsWindow,
  GtkWindow
}
import sn.gnome.runtime.*

/** A `GtkShortcutsWindow` shows information about the keyboard shortcuts and
  * gestures of an application.
  *
  * The shortcuts can be grouped, and you can have multiple sections in this
  * window, corresponding to the major modes of your application.
  *
  * Additionally, the shortcuts can be filtered by the current view, to avoid
  * showing information that is not relevant in the current application context.
  *
  * The recommended way to construct a `GtkShortcutsWindow` is with
  * [class@Gtk.Builder], by using the `<child>` tag to populate a
  * `GtkShortcutsWindow` with one or more [class@Gtk.ShortcutsSection] objects,
  * which contain one or more [class@Gtk.ShortcutsGroup] instances, which, in
  * turn, contain [class@Gtk.ShortcutsShortcut] instances.
  *
  * If you need to add a section programmatically, use
  * [method@Gtk.ShortcutsWindow.add_section] instead of
  * [method@Gtk.Window.set_child], as the shortcuts window manages its children
  * directly.
  *
  * # A simple example:
  *
  * ![](gedit-shortcuts.png)
  *
  * This example has as single section. As you can see, the shortcut groups are
  * arranged in columns, and spread across several pages if there are too many
  * to find on a single page.
  *
  * The .ui file for this example can be found
  * [here](https://gitlab.gnome.org/GNOME/gtk/tree/main/demos/gtk-demo/shortcuts-gedit.ui).
  *
  * # An example with multiple views:
  *
  * ![](clocks-shortcuts.png)
  *
  * This example shows a `GtkShortcutsWindow` that has been configured to show
  * only the shortcuts relevant to the "stopwatch" view.
  *
  * The .ui file for this example can be found
  * [here](https://gitlab.gnome.org/GNOME/gtk/tree/main/demos/gtk-demo/shortcuts-clocks.ui).
  *
  * # An example with multiple sections:
  *
  * ![](builder-shortcuts.png)
  *
  * This example shows a `GtkShortcutsWindow` with two sections, "Editor
  * Shortcuts" and "Terminal Shortcuts".
  *
  * The .ui file for this example can be found
  * [here](https://gitlab.gnome.org/GNOME/gtk/tree/main/demos/gtk-demo/shortcuts-builder.ui).
  *
  * ## CSS nodes
  *
  * `GtkShortcutsWindow` has a single CSS node with the name `window` and style
  * class `.shortcuts`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ShortcutsWindow private[gnome] (raw: Ptr[GtkShortcutsWindow])
    extends Window(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Native,
      Root,
      ShortcutManager:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Adds a section to the shortcuts window.
    *
    * This is the programmatic equivalent to using [class@Gtk.Builder] and a
    * `<child>` tag to add the child.
    *
    * Using [method@Gtk.Window.set_child] is not appropriate as the shortcuts
    * window manages its children internally.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addSection(
      section: sn.gnome.gtk4.ShortcutsSection /* Some(Ptr[GtkShortcutsSection]) */
  )(using Runtime): Unit /* None */ =
    gtk_shortcuts_window_add_section(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkShortcutsWindow]],
      section.getUnsafeRawPointer().asInstanceOf
    )
  end addSection

  /** Returns the display that this `GtkRoot` is on.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def getDisplay()(using Runtime): sn.gnome.gdk4.Display /* None */ =
    sn.gnome.gdk4.Display.applyUnsafe(
      gtk_root_get_display(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkRoot]]
      ).asInstanceOf
    )
  end getDisplay

  /** Retrieves the current focused widget within the window.
    *
    * Note that this is the widget that would have the focus if the toplevel
    * window focused; if the toplevel window is not focused then
    * `gtk_widget_has_focus (widget)` will not be %TRUE for the widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def getFocus()(using Runtime): sn.gnome.gtk4.Widget /* None */ =
    sn.gnome.gtk4.Widget.applyUnsafe(
      gtk_window_get_focus(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWindow]]
      ).asInstanceOf
    )
  end getFocus

  /** Realizes a `GtkNative`.
    *
    * This should only be used by subclasses.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def realize(): Unit /* None */ =
    gtk_native_realize(this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNative]])
  end realize

  /** Sets the focus widget.
    *
    * If @focus is not the current focus widget, and is focusable, sets it as
    * the focus widget for the window. If @focus is %NULL, unsets the focus
    * widget for this window. To set the focus to a particular widget in the
    * toplevel, it is usually more convenient to use
    * [method@Gtk.Widget.grab_focus] instead of this function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def setFocus(
      focus: Option[sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */ ]
  )(using Runtime): Unit /* None */ =
    gtk_window_set_focus(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWindow]],
      focus
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
    )
  end setFocus

  /** Unrealizes a `GtkNative`.
    *
    * This should only be used by subclasses.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def unrealize(): Unit /* None */ =
    gtk_native_unrealize(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNative]]
    )
  end unrealize

  /** Emitted when the user uses a keybinding to close the window.
    *
    * This is a [keybinding signal](class.SignalAction.html).
    *
    * The default binding for this signal is the Escape key.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onClose(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkShortcutsWindow],
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
    val signal = c"close"
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
  end onClose

  /** Emitted when the user uses a keybinding to start a search.
    *
    * This is a [keybinding signal](class.SignalAction.html).
    *
    * The default binding for this signal is Control-F.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onSearch(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkShortcutsWindow],
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
    val signal = c"search"
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
  end onSearch
end ShortcutsWindow

object ShortcutsWindow:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkShortcutsWindow])(using Runtime) =
    summon[Runtime].getOrCreate[ShortcutsWindow](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ShortcutsWindow(ptr)
    )

end ShortcutsWindow
