package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.ListModel
import sn.gnome.glib.internal.GDestroyNotify
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.AssistantPage
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Native
import sn.gnome.gtk4.fluent.Root
import sn.gnome.gtk4.fluent.ShortcutManager
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.fluent.Window
import sn.gnome.gtk4.internal.GtkAssistant
import sn.gnome.gtk4.internal.GtkAssistantPageFunc
import sn.gnome.gtk4.internal.GtkAssistantPageType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkAssistant` is used to represent a complex as a series of steps.
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds a widget to the action area of a `GtkAssistant`.
    */
  def addActionWidget(
      child: Widget /* Some(Ptr[GtkWidget]) */
  ): Unit /* None */ = gtk_assistant_add_action_widget(
    this.raw.asInstanceOf[Ptr[GtkAssistant]],
    child.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Appends a page to the @assistant.
    */
  def appendPage(page: Widget /* Some(Ptr[GtkWidget]) */ ): Int /* None */ =
    gtk_assistant_append_page(
      this.raw.asInstanceOf[Ptr[GtkAssistant]],
      page.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Erases the visited page history.
    *
    * GTK will then hide the back button on the current page, and removes the
    * cancel button from subsequent pages.
    *
    * Use this when the information provided up to the current page is hereafter
    * deemed permanent and cannot be modified or undone. For example, showing a
    * progress page to track a long-running, unreversible operation after the
    * user has clicked apply on a confirmation page.
    */
  def commit(): Unit /* None */ = gtk_assistant_commit(
    this.raw.asInstanceOf[Ptr[GtkAssistant]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the page number of the current page.
    */
  def getCurrentPage(): Int /* None */ = gtk_assistant_get_current_page(
    this.raw.asInstanceOf[Ptr[GtkAssistant]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the number of pages in the @assistant
    */
  def getNPages(): Int /* None */ = gtk_assistant_get_n_pages(
    this.raw.asInstanceOf[Ptr[GtkAssistant]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the child widget contained in page number @page_num.
    */
  def getNthPage(page_num: Int /* Some(CInt) */ ): Widget /* None */ =
    new Widget(
      gtk_assistant_get_nth_page(
        this.raw.asInstanceOf[Ptr[GtkAssistant]],
        page_num
      ).asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the `GtkAssistantPage` object for @child.
    */
  def getPage(
      child: Widget /* Some(Ptr[GtkWidget]) */
  ): AssistantPage /* None */ = new AssistantPage(
    gtk_assistant_get_page(
      this.raw.asInstanceOf[Ptr[GtkAssistant]],
      child.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether @page is complete.
    */
  def getPageComplete(
      page: Widget /* Some(Ptr[GtkWidget]) */
  ): Boolean /* None */ = gtk_assistant_get_page_complete(
    this.raw.asInstanceOf[Ptr[GtkAssistant]],
    page.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the title for @page.
    */
  def getPageTitle(
      page: Widget /* Some(Ptr[GtkWidget]) */
  )(using Zone): String /* None */ = fromCString(
    gtk_assistant_get_page_title(
      this.raw.asInstanceOf[Ptr[GtkAssistant]],
      page.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the page type of @page.
    */
  def getPageType(
      page: Widget /* Some(Ptr[GtkWidget]) */
  ): GtkAssistantPageType /* None */ = gtk_assistant_get_page_type(
    this.raw.asInstanceOf[Ptr[GtkAssistant]],
    page.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets a list model of the assistant pages.
    */
  def getPages(): ListModel /* None */ = new ListModel.Abstract(
    gtk_assistant_get_pages(
      this.raw.asInstanceOf[Ptr[GtkAssistant]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Inserts a page in the @assistant at a given position.
    */
  def insertPage(
      page: Widget /* Some(Ptr[GtkWidget]) */,
      position: Int /* Some(CInt) */
  ): Int /* None */ = gtk_assistant_insert_page(
    this.raw.asInstanceOf[Ptr[GtkAssistant]],
    page.getUnsafeRawPointer().asInstanceOf,
    position
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Navigate to the next page.
    *
    * It is a programming error to call this function when there is no next
    * page.
    *
    * This function is for use when creating pages of the
    * %GTK_ASSISTANT_PAGE_CUSTOM type.
    */
  def nextPage(): Unit /* None */ = gtk_assistant_next_page(
    this.raw.asInstanceOf[Ptr[GtkAssistant]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Prepends a page to the @assistant.
    */
  def prependPage(page: Widget /* Some(Ptr[GtkWidget]) */ ): Int /* None */ =
    gtk_assistant_prepend_page(
      this.raw.asInstanceOf[Ptr[GtkAssistant]],
      page.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Navigate to the previous visited page.
    *
    * It is a programming error to call this function when no previous page is
    * available.
    *
    * This function is for use when creating pages of the
    * %GTK_ASSISTANT_PAGE_CUSTOM type.
    */
  def previousPage(): Unit /* None */ = gtk_assistant_previous_page(
    this.raw.asInstanceOf[Ptr[GtkAssistant]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes a widget from the action area of a `GtkAssistant`.
    */
  def removeActionWidget(
      child: Widget /* Some(Ptr[GtkWidget]) */
  ): Unit /* None */ = gtk_assistant_remove_action_widget(
    this.raw.asInstanceOf[Ptr[GtkAssistant]],
    child.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes the @page_num’s page from @assistant.
    */
  def removePage(page_num: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_assistant_remove_page(
      this.raw.asInstanceOf[Ptr[GtkAssistant]],
      page_num
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Switches the page to @page_num.
    *
    * Note that this will only be necessary in custom buttons, as the @assistant
    * flow can be set with gtk_assistant_set_forward_page_func().
    */
  def setCurrentPage(page_num: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_assistant_set_current_page(
      this.raw.asInstanceOf[Ptr[GtkAssistant]],
      page_num
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the page forwarding function to be @page_func.
    *
    * This function will be used to determine what will be the next page when
    * the user presses the forward button. Setting @page_func to %NULL will make
    * the assistant to use the default forward function, which just goes to the
    * next visible page.
    */
  def setForwardPageFunc(
      page_func: Option[GtkAssistantPageFunc /* Some(GtkAssistantPageFunc) */ ],
      data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ],
      destroy: GDestroyNotify /* Some(_root_.sn.gnome.glib.internal.GDestroyNotify) */
  ): Unit /* None */ = gtk_assistant_set_forward_page_func(
    this.raw.asInstanceOf[Ptr[GtkAssistant]],
    page_func
      .map[GtkAssistantPageFunc](o => o)
      .getOrElse(null.asInstanceOf[GtkAssistantPageFunc]),
    data
      .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
      .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]),
    destroy
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether @page contents are complete.
    *
    * This will make @assistant update the buttons state to be able to continue
    * the task.
    */
  def setPageComplete(
      page: Widget /* Some(Ptr[GtkWidget]) */,
      complete: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_assistant_set_page_complete(
    this.raw.asInstanceOf[Ptr[GtkAssistant]],
    page.getUnsafeRawPointer().asInstanceOf,
    gboolean(gint((if complete == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets a title for @page.
    *
    * The title is displayed in the header area of the assistant when @page is
    * the current page.
    */
  def setPageTitle(
      page: Widget /* Some(Ptr[GtkWidget]) */,
      title: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_assistant_set_page_title(
    this.raw.asInstanceOf[Ptr[GtkAssistant]],
    page.getUnsafeRawPointer().asInstanceOf,
    __sn_extract_string(title)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the page type for @page.
    *
    * The page type determines the page behavior in the @assistant.
    */
  def setPageType(
      page: Widget /* Some(Ptr[GtkWidget]) */,
      `type`: GtkAssistantPageType /* Some(GtkAssistantPageType) */
  ): Unit /* None */ = gtk_assistant_set_page_type(
    this.raw.asInstanceOf[Ptr[GtkAssistant]],
    page.getUnsafeRawPointer().asInstanceOf,
    `type`
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Forces @assistant to recompute the buttons state.
    *
    * GTK automatically takes care of this in most situations, e.g. when the
    * user goes to a different page, or when the visibility or completeness of a
    * page changes.
    *
    * One situation where it can be necessary to call this function is when
    * changing a value on the current page affects the future page flow of the
    * assistant.
    */
  def updateButtonsState(): Unit /* None */ =
    gtk_assistant_update_buttons_state(this.raw.asInstanceOf[Ptr[GtkAssistant]])

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
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkAssistant`.
    */
  def apply(): Assistant = new Assistant(gtk_assistant_new().asInstanceOf)
end Assistant
