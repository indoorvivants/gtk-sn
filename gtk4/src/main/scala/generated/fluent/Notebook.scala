package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.ListModel
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.NotebookPage
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkNotebook
import sn.gnome.gtk4.internal.GtkPackType
import sn.gnome.gtk4.internal.GtkPositionType

class Notebook(raw: Ptr[GtkNotebook])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def appendPage(child: Widget, tab_label: Widget): Int =
    gtk_notebook_append_page(
      this.raw.asInstanceOf,
      child.getUnsafeRawPointer().asInstanceOf,
      tab_label.getUnsafeRawPointer().asInstanceOf
    )

  def appendPageMenu(
      child: Widget,
      tab_label: Widget,
      menu_label: Widget
  ): Int = gtk_notebook_append_page_menu(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf,
    tab_label.getUnsafeRawPointer().asInstanceOf,
    menu_label.getUnsafeRawPointer().asInstanceOf
  )

  def detachTab(child: Widget): Unit = gtk_notebook_detach_tab(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  def getActionWidget(pack_type: GtkPackType): Widget = new Widget(
    gtk_notebook_get_action_widget(
      this.raw.asInstanceOf,
      pack_type
    ).asInstanceOf
  )

  def getCurrentPage(): Int = gtk_notebook_get_current_page(
    this.raw.asInstanceOf
  )

  def getGroupName()(using Zone): String = fromCString(
    gtk_notebook_get_group_name(this.raw.asInstanceOf).asInstanceOf
  )

  def getMenuLabel(child: Widget): Widget = new Widget(
    gtk_notebook_get_menu_label(
      this.raw.asInstanceOf,
      child.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  def getMenuLabelText(child: Widget)(using Zone): String = fromCString(
    gtk_notebook_get_menu_label_text(
      this.raw.asInstanceOf,
      child.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  def getNPages(): Int = gtk_notebook_get_n_pages(this.raw.asInstanceOf)

  def getNthPage(page_num: Int): Widget = new Widget(
    gtk_notebook_get_nth_page(this.raw.asInstanceOf, page_num).asInstanceOf
  )

  def getPage(child: Widget): NotebookPage = new NotebookPage(
    gtk_notebook_get_page(
      this.raw.asInstanceOf,
      child.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  def getPages(): ListModel = new ListModel.Abstract(
    gtk_notebook_get_pages(this.raw.asInstanceOf).asInstanceOf
  )

  def getScrollable(): Boolean =
    gtk_notebook_get_scrollable(this.raw.asInstanceOf).value.!=(0)

  def getShowBorder(): Boolean =
    gtk_notebook_get_show_border(this.raw.asInstanceOf).value.!=(0)

  def getShowTabs(): Boolean =
    gtk_notebook_get_show_tabs(this.raw.asInstanceOf).value.!=(0)

  def getTabDetachable(child: Widget): Boolean =
    gtk_notebook_get_tab_detachable(
      this.raw.asInstanceOf,
      child.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)

  def getTabLabel(child: Widget): Widget = new Widget(
    gtk_notebook_get_tab_label(
      this.raw.asInstanceOf,
      child.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  def getTabLabelText(child: Widget)(using Zone): String = fromCString(
    gtk_notebook_get_tab_label_text(
      this.raw.asInstanceOf,
      child.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  def getTabPos(): GtkPositionType = gtk_notebook_get_tab_pos(
    this.raw.asInstanceOf
  )

  def getTabReorderable(child: Widget): Boolean =
    gtk_notebook_get_tab_reorderable(
      this.raw.asInstanceOf,
      child.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)

  def insertPage(child: Widget, tab_label: Widget, position: Int): Int =
    gtk_notebook_insert_page(
      this.raw.asInstanceOf,
      child.getUnsafeRawPointer().asInstanceOf,
      tab_label.getUnsafeRawPointer().asInstanceOf,
      position
    )

  def insertPageMenu(
      child: Widget,
      tab_label: Widget,
      menu_label: Widget,
      position: Int
  ): Int = gtk_notebook_insert_page_menu(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf,
    tab_label.getUnsafeRawPointer().asInstanceOf,
    menu_label.getUnsafeRawPointer().asInstanceOf,
    position
  )

  def nextPage(): Unit = gtk_notebook_next_page(this.raw.asInstanceOf)

  def pageNum(child: Widget): Int = gtk_notebook_page_num(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  def popupDisable(): Unit = gtk_notebook_popup_disable(this.raw.asInstanceOf)

  def popupEnable(): Unit = gtk_notebook_popup_enable(this.raw.asInstanceOf)

  def prependPage(child: Widget, tab_label: Widget): Int =
    gtk_notebook_prepend_page(
      this.raw.asInstanceOf,
      child.getUnsafeRawPointer().asInstanceOf,
      tab_label.getUnsafeRawPointer().asInstanceOf
    )

  def prependPageMenu(
      child: Widget,
      tab_label: Widget,
      menu_label: Widget
  ): Int = gtk_notebook_prepend_page_menu(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf,
    tab_label.getUnsafeRawPointer().asInstanceOf,
    menu_label.getUnsafeRawPointer().asInstanceOf
  )

  def prevPage(): Unit = gtk_notebook_prev_page(this.raw.asInstanceOf)

  def removePage(page_num: Int): Unit =
    gtk_notebook_remove_page(this.raw.asInstanceOf, page_num)

  def reorderChild(child: Widget, position: Int): Unit =
    gtk_notebook_reorder_child(
      this.raw.asInstanceOf,
      child.getUnsafeRawPointer().asInstanceOf,
      position
    )

  def setActionWidget(widget: Widget, pack_type: GtkPackType): Unit =
    gtk_notebook_set_action_widget(
      this.raw.asInstanceOf,
      widget.getUnsafeRawPointer().asInstanceOf,
      pack_type
    )

  def setCurrentPage(page_num: Int): Unit =
    gtk_notebook_set_current_page(this.raw.asInstanceOf, page_num)

  def setGroupName(group_name: String | CString)(using Zone): Unit =
    gtk_notebook_set_group_name(
      this.raw.asInstanceOf,
      __sn_extract_string(group_name)
    )

  def setMenuLabel(child: Widget, menu_label: Widget): Unit =
    gtk_notebook_set_menu_label(
      this.raw.asInstanceOf,
      child.getUnsafeRawPointer().asInstanceOf,
      menu_label.getUnsafeRawPointer().asInstanceOf
    )

  def setMenuLabelText(child: Widget, menu_text: String | CString)(using
      Zone
  ): Unit = gtk_notebook_set_menu_label_text(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf,
    __sn_extract_string(menu_text)
  )

  def setScrollable(scrollable: Boolean): Unit = gtk_notebook_set_scrollable(
    this.raw.asInstanceOf,
    gboolean(gint((if scrollable == true then 1 else 0)))
  )

  def setShowBorder(show_border: Boolean): Unit = gtk_notebook_set_show_border(
    this.raw.asInstanceOf,
    gboolean(gint((if show_border == true then 1 else 0)))
  )

  def setShowTabs(show_tabs: Boolean): Unit = gtk_notebook_set_show_tabs(
    this.raw.asInstanceOf,
    gboolean(gint((if show_tabs == true then 1 else 0)))
  )

  def setTabDetachable(child: Widget, detachable: Boolean): Unit =
    gtk_notebook_set_tab_detachable(
      this.raw.asInstanceOf,
      child.getUnsafeRawPointer().asInstanceOf,
      gboolean(gint((if detachable == true then 1 else 0)))
    )

  def setTabLabel(child: Widget, tab_label: Widget): Unit =
    gtk_notebook_set_tab_label(
      this.raw.asInstanceOf,
      child.getUnsafeRawPointer().asInstanceOf,
      tab_label.getUnsafeRawPointer().asInstanceOf
    )

  def setTabLabelText(child: Widget, tab_text: String | CString)(using
      Zone
  ): Unit = gtk_notebook_set_tab_label_text(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf,
    __sn_extract_string(tab_text)
  )

  def setTabPos(pos: GtkPositionType): Unit =
    gtk_notebook_set_tab_pos(this.raw.asInstanceOf, pos)

  def setTabReorderable(child: Widget, reorderable: Boolean): Unit =
    gtk_notebook_set_tab_reorderable(
      this.raw.asInstanceOf,
      child.getUnsafeRawPointer().asInstanceOf,
      gboolean(gint((if reorderable == true then 1 else 0)))
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Notebook

object Notebook:
  def apply(): Notebook = new Notebook(gtk_notebook_new().asInstanceOf)
end Notebook
