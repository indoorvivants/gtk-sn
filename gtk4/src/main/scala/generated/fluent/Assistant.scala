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

class Assistant(raw: Ptr[GtkAssistant])
    extends Window(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Native,
      Root,
      ShortcutManager:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def addActionWidget(child: Widget): Unit = gtk_assistant_add_action_widget(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  def appendPage(page: Widget): Int = gtk_assistant_append_page(
    this.raw.asInstanceOf,
    page.getUnsafeRawPointer().asInstanceOf
  )

  def commit(): Unit = gtk_assistant_commit(this.raw.asInstanceOf)

  def getCurrentPage(): Int = gtk_assistant_get_current_page(
    this.raw.asInstanceOf
  )

  def getNPages(): Int = gtk_assistant_get_n_pages(this.raw.asInstanceOf)

  def getNthPage(page_num: Int): Widget = new Widget(
    gtk_assistant_get_nth_page(this.raw.asInstanceOf, page_num).asInstanceOf
  )

  def getPage(child: Widget): AssistantPage = new AssistantPage(
    gtk_assistant_get_page(
      this.raw.asInstanceOf,
      child.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  def getPageComplete(page: Widget): Boolean = gtk_assistant_get_page_complete(
    this.raw.asInstanceOf,
    page.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

  def getPageTitle(page: Widget)(using Zone): String = fromCString(
    gtk_assistant_get_page_title(
      this.raw.asInstanceOf,
      page.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  def getPageType(page: Widget): GtkAssistantPageType =
    gtk_assistant_get_page_type(
      this.raw.asInstanceOf,
      page.getUnsafeRawPointer().asInstanceOf
    )

  def getPages(): ListModel = new ListModel.Abstract(
    gtk_assistant_get_pages(this.raw.asInstanceOf).asInstanceOf
  )

  def insertPage(page: Widget, position: Int): Int = gtk_assistant_insert_page(
    this.raw.asInstanceOf,
    page.getUnsafeRawPointer().asInstanceOf,
    position
  )

  def nextPage(): Unit = gtk_assistant_next_page(this.raw.asInstanceOf)

  def prependPage(page: Widget): Int = gtk_assistant_prepend_page(
    this.raw.asInstanceOf,
    page.getUnsafeRawPointer().asInstanceOf
  )

  def previousPage(): Unit = gtk_assistant_previous_page(this.raw.asInstanceOf)

  def removeActionWidget(child: Widget): Unit =
    gtk_assistant_remove_action_widget(
      this.raw.asInstanceOf,
      child.getUnsafeRawPointer().asInstanceOf
    )

  def removePage(page_num: Int): Unit =
    gtk_assistant_remove_page(this.raw.asInstanceOf, page_num)

  def setCurrentPage(page_num: Int): Unit =
    gtk_assistant_set_current_page(this.raw.asInstanceOf, page_num)

  def setForwardPageFunc(
      page_func: GtkAssistantPageFunc,
      data: Ptr[Byte],
      destroy: GDestroyNotify
  ): Unit = gtk_assistant_set_forward_page_func(
    this.raw.asInstanceOf,
    page_func,
    gpointer(data),
    destroy
  )

  def setPageComplete(page: Widget, complete: Boolean): Unit =
    gtk_assistant_set_page_complete(
      this.raw.asInstanceOf,
      page.getUnsafeRawPointer().asInstanceOf,
      gboolean(gint((if complete == true then 1 else 0)))
    )

  def setPageTitle(page: Widget, title: String | CString)(using Zone): Unit =
    gtk_assistant_set_page_title(
      this.raw.asInstanceOf,
      page.getUnsafeRawPointer().asInstanceOf,
      __sn_extract_string(title)
    )

  def setPageType(page: Widget, `type`: GtkAssistantPageType): Unit =
    gtk_assistant_set_page_type(
      this.raw.asInstanceOf,
      page.getUnsafeRawPointer().asInstanceOf,
      `type`
    )

  def updateButtonsState(): Unit = gtk_assistant_update_buttons_state(
    this.raw.asInstanceOf
  )

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
  def apply(): Assistant = new Assistant(gtk_assistant_new().asInstanceOf)
end Assistant
