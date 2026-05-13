package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.{gchar, gpointer, guint}
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{
  Accessible,
  Buildable,
  ConstraintTarget,
  Editable,
  Widget
}
import sn.gnome.gtk4.internal.GtkSearchEntry
import sn.gnome.runtime.*

/** `GtkSearchEntry` is an entry widget that has been tailored for use as a
  * search entry.
  *
  * The main API for interacting with a `GtkSearchEntry` as entry is the
  * `GtkEditable` interface.
  *
  * ![An example GtkSearchEntry](search-entry.png)
  *
  * It will show an inactive symbolic “find” icon when the search entry is
  * empty, and a symbolic “clear” icon when there is text. Clicking on the
  * “clear” icon will empty the search entry.
  *
  * To make filtering appear more reactive, it is a good idea to not react to
  * every change in the entry text immediately, but only after a short delay. To
  * support this, `GtkSearchEntry` emits the
  * [signal@Gtk.SearchEntry::search-changed] signal which can be used instead of
  * the [signal@Gtk.Editable::changed] signal.
  *
  * The [signal@Gtk.SearchEntry::previous-match],
  * [signal@Gtk.SearchEntry::next-match] and
  * [signal@Gtk.SearchEntry::stop-search] signals can be used to implement
  * moving between search results and ending the search.
  *
  * Often, `GtkSearchEntry` will be fed events by means of being placed inside a
  * [class@Gtk.SearchBar]. If that is not the case, you can use
  * [method@Gtk.SearchEntry.set_key_capture_widget] to let it capture key input
  * from another widget.
  *
  * `GtkSearchEntry` provides only minimal API and should be used with the
  * [iface@Gtk.Editable] API.
  *
  * ## CSS Nodes
  *
  * ```
  * entry.search
  * ╰── text
  * ```
  *
  * `GtkSearchEntry` has a single CSS node with name entry that carries a
  * `.search` style class, and the text node is a child of that.
  *
  * ## Accessibility
  *
  * `GtkSearchEntry` uses the %GTK_ACCESSIBLE_ROLE_SEARCH_BOX role.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class SearchEntry private[gnome] (raw: Ptr[GtkSearchEntry])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Editable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the widget that @entry is capturing key events from.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getKeyCaptureWidget()(using
      Runtime
  ): sn.gnome.gtk4.fluent.Widget /* None */ =
    sn.gnome.gtk4.fluent.Widget.applyUnsafe(
      gtk_search_entry_get_key_capture_widget(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSearchEntry]]
      ).asInstanceOf
    )
  end getKeyCaptureWidget

  /** Gets the placeholder text associated with @entry.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPlaceholderText()(using Zone): String /* None */ =
    fromCString(
      gtk_search_entry_get_placeholder_text(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSearchEntry]]
      ).asInstanceOf
    )
  end getPlaceholderText

  /** Get the delay to be used between the last keypress and the
    * [signal@Gtk.SearchEntry::search-changed] signal being emitted.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSearchDelay(): UInt /* None */ =
    gtk_search_entry_get_search_delay(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSearchEntry]]
    ).value
  end getSearchDelay

  /** Sets @widget as the widget that @entry will capture key events from.
    *
    * Key events are consumed by the search entry to start or continue a search.
    *
    * If the entry is part of a `GtkSearchBar`, it is preferable to call
    * [method@Gtk.SearchBar.set_key_capture_widget] instead, which will reveal
    * the entry in addition to triggering the search entry.
    *
    * Note that despite the name of this function, the events are only
    * 'captured' in the bubble phase, which means that editable child widgets of @widget
    * will receive text input before it gets captured. If that is not desired,
    * you can capture and forward the events yourself with
    * [method@Gtk.EventControllerKey.forward].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setKeyCaptureWidget(
      widget: Option[sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */ ]
  )(using Runtime): Unit /* None */ =
    gtk_search_entry_set_key_capture_widget(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSearchEntry]],
      widget
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
    )
  end setKeyCaptureWidget

  /** Sets the placeholder text associated with @entry.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPlaceholderText(
      text: Option[String /* Some(CString) */ ]
  )(using Zone): Unit /* None */ =
    gtk_search_entry_set_placeholder_text(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSearchEntry]],
      text.map[CString](o => toCString(o)).getOrElse(null.asInstanceOf[CString])
    )
  end setPlaceholderText

  /** Set the delay to be used between the last keypress and the
    * [signal@Gtk.SearchEntry::search-changed] signal being emitted.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSearchDelay(
      delay: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    gtk_search_entry_set_search_delay(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSearchEntry]],
      guint(delay)
    )
  end setSearchDelay

  /** Emitted when the entry is activated.
    *
    * The keybindings for this signal are all forms of the Enter key.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onActivate(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkSearchEntry],
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
    val signal = c"activate"
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
  end onActivate

  /** Emitted when the user initiates a move to the next match for the current
    * search string.
    *
    * This is a [keybinding signal](class.SignalAction.html).
    *
    * Applications should connect to it, to implement moving between matches.
    *
    * The default bindings for this signal is Ctrl-g.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onNextMatch(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkSearchEntry],
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
    val signal = c"next-match"
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
  end onNextMatch

  /** Emitted when the user initiates a move to the previous match for the
    * current search string.
    *
    * This is a [keybinding signal](class.SignalAction.html).
    *
    * Applications should connect to it, to implement moving between matches.
    *
    * The default bindings for this signal is Ctrl-Shift-g.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onPreviousMatch(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkSearchEntry],
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
    val signal = c"previous-match"
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
  end onPreviousMatch

  /** Emitted with a delay. The length of the delay can be changed with the
    * [property@Gtk.SearchEntry:search-delay] property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onSearchChanged(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkSearchEntry],
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
    val signal = c"search-changed"
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
  end onSearchChanged

  /** Emitted when the user initiated a search on the entry.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onSearchStarted(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkSearchEntry],
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
    val signal = c"search-started"
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
  end onSearchStarted

  /** Emitted when the user stops a search via keyboard input.
    *
    * This is a [keybinding signal](class.SignalAction.html).
    *
    * Applications should connect to it, to implement hiding the search entry in
    * this case.
    *
    * The default bindings for this signal is Escape.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onStopSearch(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkSearchEntry],
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
    val signal = c"stop-search"
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
  end onStopSearch
end SearchEntry

object SearchEntry:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkSearchEntry])(using Runtime) =
    summon[Runtime].getOrCreate[SearchEntry](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new SearchEntry(ptr)
    )

  /** Creates a `GtkSearchEntry`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): SearchEntry =
    val raw: Ptr[Byte] = gtk_search_entry_new().asInstanceOf
    summon[Runtime].getOrCreate[SearchEntry](
      raw,
      r => SearchEntry.applyUnsafe(r.asInstanceOf)
    )
  end apply
end SearchEntry
