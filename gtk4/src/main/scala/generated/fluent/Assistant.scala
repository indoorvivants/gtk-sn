package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.Display
import sn.gnome.gio.ListModel
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
  AssistantPage,
  AssistantPageType,
  Buildable,
  ConstraintTarget,
  Native,
  Root,
  ShortcutManager,
  Widget,
  Window
}
import sn.gnome.gtk4.internal.{
  GtkAssistant,
  GtkNative,
  GtkRoot,
  GtkWidget,
  GtkWindow
}
import sn.gnome.runtime.*

/** `GtkAssistant` is used to represent a complex as a series of steps.
  *
  * ![An example GtkAssistant](assistant.png)
  *
  * Each step consists of one or more pages. `GtkAssistant` guides the user
  * through the pages, and controls the page flow to collect the data needed for
  * the operation.
  *
  * `GtkAssistant` handles which buttons to show and to make sensitive based on
  * page sequence knowledge and the [enum@Gtk.AssistantPageType] of each page in
  * addition to state information like the *completed* and *committed* page
  * statuses.
  *
  * If you have a case that doesn’t quite fit in `GtkAssistant`s way of handling
  * buttons, you can use the %GTK_ASSISTANT_PAGE_CUSTOM page type and handle
  * buttons yourself.
  *
  * `GtkAssistant` maintains a `GtkAssistantPage` object for each added child,
  * which holds additional per-child properties. You obtain the
  * `GtkAssistantPage` for a child with [method@Gtk.Assistant.get_page].
  *
  * # GtkAssistant as GtkBuildable
  *
  * The `GtkAssistant` implementation of the `GtkBuildable` interface exposes
  * the @action_area as internal children with the name “action_area”.
  *
  * To add pages to an assistant in `GtkBuilder`, simply add it as a child to
  * the `GtkAssistant` object. If you need to set per-object properties, create
  * a `GtkAssistantPage` object explicitly, and set the child widget as a
  * property on it.
  *
  * # CSS nodes
  *
  * `GtkAssistant` has a single CSS node with the name window and style class
  * .assistant.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Assistant private[gnome] (raw: Ptr[GtkAssistant])
    extends Window(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Native,
      Root,
      ShortcutManager:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Adds a widget to the action area of a `GtkAssistant`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addActionWidget(
      child: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */
  )(using Runtime): Unit /* None */ =
    gtk_assistant_add_action_widget(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAssistant]],
      child.getUnsafeRawPointer().asInstanceOf
    )
  end addActionWidget

  /** Appends a page to the @assistant.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def appendPage(
      page: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */
  )(using Runtime): Int /* None */ =
    gtk_assistant_append_page(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAssistant]],
      page.getUnsafeRawPointer().asInstanceOf
    )
  end appendPage

  /** Erases the visited page history.
    *
    * GTK will then hide the back button on the current page, and removes the
    * cancel button from subsequent pages.
    *
    * Use this when the information provided up to the current page is hereafter
    * deemed permanent and cannot be modified or undone. For example, showing a
    * progress page to track a long-running, unreversible operation after the
    * user has clicked apply on a confirmation page.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def commit(): Unit /* None */ =
    gtk_assistant_commit(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAssistant]]
    )
  end commit

  /** Returns the page number of the current page.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCurrentPage(): Int /* None */ =
    gtk_assistant_get_current_page(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAssistant]]
    )
  end getCurrentPage

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

  /** Returns the number of pages in the @assistant
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNPages(): Int /* None */ =
    gtk_assistant_get_n_pages(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAssistant]]
    )
  end getNPages

  /** Returns the child widget contained in page number @page_num.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNthPage(
      page_num: Int /* Some(CInt) */
  )(using Runtime): sn.gnome.gtk4.Widget /* None */ =
    sn.gnome.gtk4.Widget.applyUnsafe(
      gtk_assistant_get_nth_page(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAssistant]],
        page_num
      ).asInstanceOf
    )
  end getNthPage

  /** Returns the `GtkAssistantPage` object for @child.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPage(
      child: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */
  )(using Runtime): sn.gnome.gtk4.AssistantPage /* None */ =
    sn.gnome.gtk4.AssistantPage.applyUnsafe(
      gtk_assistant_get_page(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAssistant]],
        child.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )
  end getPage

  /** Gets whether @page is complete.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPageComplete(
      page: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */
  )(using Runtime): Boolean /* None */ =
    gtk_assistant_get_page_complete(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAssistant]],
      page.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end getPageComplete

  /** Gets the title for @page.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPageTitle(
      page: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */
  )(using Zone, Runtime): String /* None */ =
    fromCString(
      gtk_assistant_get_page_title(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAssistant]],
        page.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )
  end getPageTitle

  /** Gets the page type of @page.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPageType(
      page: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */
  )(using Runtime): AssistantPageType /* None */ =
    AssistantPageType.fromRaw(
      gtk_assistant_get_page_type(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAssistant]],
        page.getUnsafeRawPointer().asInstanceOf
      )
    )
  end getPageType

  /** Gets a list model of the assistant pages.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPages(): ListModel /* None */ =
    new ListModel.Abstract(
      gtk_assistant_get_pages(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAssistant]]
      ).asInstanceOf
    )
  end getPages

  /** Inserts a page in the @assistant at a given position.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insertPage(
      page: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */,
      position: Int /* Some(CInt) */
  )(using Runtime): Int /* None */ =
    gtk_assistant_insert_page(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAssistant]],
      page.getUnsafeRawPointer().asInstanceOf,
      position
    )
  end insertPage

  /** Navigate to the next page.
    *
    * It is a programming error to call this function when there is no next
    * page.
    *
    * This function is for use when creating pages of the
    * %GTK_ASSISTANT_PAGE_CUSTOM type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def nextPage(): Unit /* None */ =
    gtk_assistant_next_page(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAssistant]]
    )
  end nextPage

  /** Prepends a page to the @assistant.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def prependPage(
      page: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */
  )(using Runtime): Int /* None */ =
    gtk_assistant_prepend_page(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAssistant]],
      page.getUnsafeRawPointer().asInstanceOf
    )
  end prependPage

  /** Navigate to the previous visited page.
    *
    * It is a programming error to call this function when no previous page is
    * available.
    *
    * This function is for use when creating pages of the
    * %GTK_ASSISTANT_PAGE_CUSTOM type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def previousPage(): Unit /* None */ =
    gtk_assistant_previous_page(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAssistant]]
    )
  end previousPage

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

  /** Removes a widget from the action area of a `GtkAssistant`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeActionWidget(
      child: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */
  )(using Runtime): Unit /* None */ =
    gtk_assistant_remove_action_widget(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAssistant]],
      child.getUnsafeRawPointer().asInstanceOf
    )
  end removeActionWidget

  /** Removes the @page_num’s page from @assistant.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removePage(page_num: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_assistant_remove_page(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAssistant]],
      page_num
    )
  end removePage

  /** Switches the page to @page_num.
    *
    * Note that this will only be necessary in custom buttons, as the @assistant
    * flow can be set with gtk_assistant_set_forward_page_func().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setCurrentPage(page_num: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_assistant_set_current_page(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAssistant]],
      page_num
    )
  end setCurrentPage

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

  /** Sets the page forwarding function to be @page_func.
    *
    * This function will be used to determine what will be the next page when
    * the user presses the forward button. Setting @page_func to %NULL will make
    * the assistant to use the default forward function, which just goes to the
    * next visible page.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_forward_page_func/<method parameters>/page_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AssistantPageFunc), @type -> DataRecord(GtkAssistantPageFunc)))"
  )
  private def setForwardPageFunc__ = ???

  /** Sets whether @page contents are complete.
    *
    * This will make @assistant update the buttons state to be able to continue
    * the task.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPageComplete(
      page: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */,
      complete: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  )(using Runtime): Unit /* None */ =
    gtk_assistant_set_page_complete(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAssistant]],
      page.getUnsafeRawPointer().asInstanceOf,
      gboolean(gint((if complete == true then 1 else 0)))
    )
  end setPageComplete

  /** Sets a title for @page.
    *
    * The title is displayed in the header area of the assistant when @page is
    * the current page.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPageTitle(
      page: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */,
      title: String /* Some(CString) */
  )(using Zone, Runtime): Unit /* None */ =
    gtk_assistant_set_page_title(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAssistant]],
      page.getUnsafeRawPointer().asInstanceOf,
      toCString(title)
    )
  end setPageTitle

  /** Sets the page type for @page.
    *
    * The page type determines the page behavior in the @assistant.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPageType(
      page: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */,
      `type`: AssistantPageType /* Some(GtkAssistantPageType) */
  )(using Runtime): Unit /* None */ =
    gtk_assistant_set_page_type(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAssistant]],
      page.getUnsafeRawPointer().asInstanceOf,
      `type`.raw
    )
  end setPageType

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

  /** Forces @assistant to recompute the buttons state.
    *
    * GTK automatically takes care of this in most situations, e.g. when the
    * user goes to a different page, or when the visibility or completeness of a
    * page changes.
    *
    * One situation where it can be necessary to call this function is when
    * changing a value on the current page affects the future page flow of the
    * assistant.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def updateButtonsState(): Unit /* None */ =
    gtk_assistant_update_buttons_state(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAssistant]]
    )
  end updateButtonsState

  /** Emitted when the apply button is clicked.
    *
    * The default behavior of the `GtkAssistant` is to switch to the page after
    * the current page, unless the current page is the last one.
    *
    * A handler for the ::apply signal should carry out the actions for which
    * the wizard has collected data. If the action takes a long time to
    * complete, you might consider putting a page of type
    * %GTK_ASSISTANT_PAGE_PROGRESS after the confirmation page and handle this
    * operation within the [signal@Gtk.Assistant::prepare] signal of the
    * progress page.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onApply(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkAssistant],
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
    val signal = c"apply"
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
  end onApply

  /** Emitted when then the cancel button is clicked.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onCancel(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkAssistant],
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
    val signal = c"cancel"
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
  end onCancel

  /** Emitted either when the close button of a summary page is clicked, or when
    * the apply button in the last page in the flow (of type
    * %GTK_ASSISTANT_PAGE_CONFIRM) is clicked.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onClose(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkAssistant],
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

  /** The action signal for the Escape binding.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onEscape(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkAssistant],
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
    val signal = c"escape"
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
  end onEscape

  /** Emitted when a new page is set as the assistant's current page, before
    * making the new page visible.
    *
    * A handler for this signal can do any preparations which are necessary
    * before showing @page.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onPrepare(handler: ((page: Widget)) => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, (page: Widget), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkAssistant],
          page: Ptr[GtkWidget] /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(
          (page = sr.runtime.get[Widget](page.asInstanceOf[Ptr[Byte]]))
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
    val signal = c"prepare"
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
  end onPrepare
end Assistant

object Assistant:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkAssistant])(using Runtime) =
    summon[Runtime].getOrCreate[Assistant](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new Assistant(ptr)
    )

  /** Creates a new `GtkAssistant`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): Assistant =
    val raw: Ptr[Byte] = gtk_assistant_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[Assistant](raw, r => Assistant.applyUnsafe(r.asInstanceOf))
  end apply
end Assistant
