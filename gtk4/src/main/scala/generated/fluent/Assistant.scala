package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.ListModel
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
import sn.gnome.gtk4.internal.{GtkAssistant, GtkWidget}
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
class Assistant(raw: Ptr[GtkAssistant])
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
      child: Widget /* Some(Ptr[GtkWidget]) */
  ): Unit /* None */ = gtk_assistant_add_action_widget(
    this.raw.asInstanceOf[Ptr[GtkAssistant]],
    child.getUnsafeRawPointer().asInstanceOf
  )

  /** Appends a page to the @assistant.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def appendPage(page: Widget /* Some(Ptr[GtkWidget]) */ ): Int /* None */ =
    gtk_assistant_append_page(
      this.raw.asInstanceOf[Ptr[GtkAssistant]],
      page.getUnsafeRawPointer().asInstanceOf
    )

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
  def commit(): Unit /* None */ = gtk_assistant_commit(
    this.raw.asInstanceOf[Ptr[GtkAssistant]]
  )

  /** Returns the page number of the current page.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCurrentPage(): Int /* None */ = gtk_assistant_get_current_page(
    this.raw.asInstanceOf[Ptr[GtkAssistant]]
  )

  /** Returns the number of pages in the @assistant
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNPages(): Int /* None */ = gtk_assistant_get_n_pages(
    this.raw.asInstanceOf[Ptr[GtkAssistant]]
  )

  /** Returns the child widget contained in page number @page_num.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNthPage(page_num: Int /* Some(CInt) */ ): Widget /* None */ =
    new Widget(
      gtk_assistant_get_nth_page(
        this.raw.asInstanceOf[Ptr[GtkAssistant]],
        page_num
      ).asInstanceOf
    )

  /** Returns the `GtkAssistantPage` object for @child.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPage(
      child: Widget /* Some(Ptr[GtkWidget]) */
  ): AssistantPage /* None */ = new AssistantPage(
    gtk_assistant_get_page(
      this.raw.asInstanceOf[Ptr[GtkAssistant]],
      child.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  /** Gets whether @page is complete.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPageComplete(
      page: Widget /* Some(Ptr[GtkWidget]) */
  ): Boolean /* None */ = gtk_assistant_get_page_complete(
    this.raw.asInstanceOf[Ptr[GtkAssistant]],
    page.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

  /** Gets the title for @page.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPageTitle(
      page: Widget /* Some(Ptr[GtkWidget]) */
  )(using Zone): String /* None */ = fromCString(
    gtk_assistant_get_page_title(
      this.raw.asInstanceOf[Ptr[GtkAssistant]],
      page.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  /** Gets the page type of @page.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPageType(
      page: Widget /* Some(Ptr[GtkWidget]) */
  ): AssistantPageType /* None */ = AssistantPageType.fromRaw(
    gtk_assistant_get_page_type(
      this.raw.asInstanceOf[Ptr[GtkAssistant]],
      page.getUnsafeRawPointer().asInstanceOf
    )
  )

  /** Gets a list model of the assistant pages.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPages(): ListModel /* None */ = new ListModel.Abstract(
    gtk_assistant_get_pages(
      this.raw.asInstanceOf[Ptr[GtkAssistant]]
    ).asInstanceOf
  )

  /** Inserts a page in the @assistant at a given position.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insertPage(
      page: Widget /* Some(Ptr[GtkWidget]) */,
      position: Int /* Some(CInt) */
  ): Int /* None */ = gtk_assistant_insert_page(
    this.raw.asInstanceOf[Ptr[GtkAssistant]],
    page.getUnsafeRawPointer().asInstanceOf,
    position
  )

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
  def nextPage(): Unit /* None */ = gtk_assistant_next_page(
    this.raw.asInstanceOf[Ptr[GtkAssistant]]
  )

  /** Prepends a page to the @assistant.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def prependPage(page: Widget /* Some(Ptr[GtkWidget]) */ ): Int /* None */ =
    gtk_assistant_prepend_page(
      this.raw.asInstanceOf[Ptr[GtkAssistant]],
      page.getUnsafeRawPointer().asInstanceOf
    )

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
  def previousPage(): Unit /* None */ = gtk_assistant_previous_page(
    this.raw.asInstanceOf[Ptr[GtkAssistant]]
  )

  /** Removes a widget from the action area of a `GtkAssistant`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeActionWidget(
      child: Widget /* Some(Ptr[GtkWidget]) */
  ): Unit /* None */ = gtk_assistant_remove_action_widget(
    this.raw.asInstanceOf[Ptr[GtkAssistant]],
    child.getUnsafeRawPointer().asInstanceOf
  )

  /** Removes the @page_num’s page from @assistant.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removePage(page_num: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_assistant_remove_page(
      this.raw.asInstanceOf[Ptr[GtkAssistant]],
      page_num
    )

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
      this.raw.asInstanceOf[Ptr[GtkAssistant]],
      page_num
    )

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
      page: Widget /* Some(Ptr[GtkWidget]) */,
      complete: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_assistant_set_page_complete(
    this.raw.asInstanceOf[Ptr[GtkAssistant]],
    page.getUnsafeRawPointer().asInstanceOf,
    gboolean(gint((if complete == true then 1 else 0)))
  )

  /** Sets a title for @page.
    *
    * The title is displayed in the header area of the assistant when @page is
    * the current page.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPageTitle(
      page: Widget /* Some(Ptr[GtkWidget]) */,
      title: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_assistant_set_page_title(
    this.raw.asInstanceOf[Ptr[GtkAssistant]],
    page.getUnsafeRawPointer().asInstanceOf,
    __sn_extract_string(title)
  )

  /** Sets the page type for @page.
    *
    * The page type determines the page behavior in the @assistant.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPageType(
      page: Widget /* Some(Ptr[GtkWidget]) */,
      `type`: AssistantPageType /* Some(GtkAssistantPageType) */
  ): Unit /* None */ = gtk_assistant_set_page_type(
    this.raw.asInstanceOf[Ptr[GtkAssistant]],
    page.getUnsafeRawPointer().asInstanceOf,
    `type`.raw
  )

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
    gtk_assistant_update_buttons_state(this.raw.asInstanceOf[Ptr[GtkAssistant]])

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

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Assistant

object Assistant:
  /** Creates a new `GtkAssistant`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): Assistant =
    val raw: Ptr[Byte] = gtk_assistant_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[Assistant](raw, r => new Assistant(r.asInstanceOf))
  end apply
end Assistant
