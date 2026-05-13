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
  Buildable,
  ConstraintTarget,
  DirectionType,
  Notebook,
  NotebookPage,
  NotebookTab,
  PackType,
  PositionType,
  Widget
}
import sn.gnome.gtk4.internal.{
  GtkDirectionType,
  GtkNotebook,
  GtkNotebookTab,
  GtkWidget
}
import sn.gnome.runtime.*

/** `GtkNotebook` is a container whose children are pages switched between using
  * tabs.
  *
  * ![An example GtkNotebook](notebook.png)
  *
  * There are many configuration options for `GtkNotebook`. Among other things,
  * you can choose on which edge the tabs appear (see
  * [method@Gtk.Notebook.set_tab_pos]), whether, if there are too many tabs to
  * fit the notebook should be made bigger or scrolling arrows added (see
  * [method@Gtk.Notebook.set_scrollable]), and whether there will be a popup
  * menu allowing the users to switch pages. (see
  * [method@Gtk.Notebook.popup_enable]).
  *
  * # GtkNotebook as GtkBuildable
  *
  * The `GtkNotebook` implementation of the `GtkBuildable` interface supports
  * placing children into tabs by specifying “tab” as the “type” attribute of a
  * `<child>` element. Note that the content of the tab must be created before
  * the tab can be filled. A tab child can be specified without specifying a
  * `<child>` type attribute.
  *
  * To add a child widget in the notebooks action area, specify "action-start"
  * or “action-end” as the “type” attribute of the `<child>` element.
  *
  * An example of a UI definition fragment with `GtkNotebook`:
  *
  * ```xml
  * <object class="GtkNotebook">
  *   <child>
  *     <object class="GtkLabel" id="notebook-content">
  *       <property name="label">Content</property>
  *     </object>
  *   </child>
  *   <child type="tab">
  *     <object class="GtkLabel" id="notebook-tab">
  *       <property name="label">Tab</property>
  *     </object>
  *   </child>
  * </object>
  * ```
  *
  * # CSS nodes
  *
  * ```
  * notebook
  * ├── header.top
  * │   ├── [<action widget>]
  * │   ├── tabs
  * │   │   ├── [arrow]
  * │   │   ├── tab
  * │   │   │   ╰── <tab label>
  * ┊   ┊   ┊
  * │   │   ├── tab[.reorderable-page]
  * │   │   │   ╰── <tab label>
  * │   │   ╰── [arrow]
  * │   ╰── [<action widget>]
  * │
  * ╰── stack
  *     ├── <child>
  *     ┊
  *     ╰── <child>
  * ```
  *
  * `GtkNotebook` has a main CSS node with name `notebook`, a subnode with name
  * `header` and below that a subnode with name `tabs` which contains one
  * subnode per tab with name `tab`.
  *
  * If action widgets are present, their CSS nodes are placed next to the `tabs`
  * node. If the notebook is scrollable, CSS nodes with name `arrow` are placed
  * as first and last child of the `tabs` node.
  *
  * The main node gets the `.frame` style class when the notebook has a border
  * (see [method@Gtk.Notebook.set_show_border]).
  *
  * The header node gets one of the style class `.top`, `.bottom`, `.left` or
  * `.right`, depending on where the tabs are placed. For reorderable pages, the
  * tab node gets the `.reorderable-page` class.
  *
  * A `tab` node gets the `.dnd` style class while it is moved with
  * drag-and-drop.
  *
  * The nodes are always arranged from left-to-right, regardless of text
  * direction.
  *
  * # Accessibility
  *
  * `GtkNotebook` uses the following roles:
  *
  *   - %GTK_ACCESSIBLE_ROLE_GROUP for the notebook widget
  *   - %GTK_ACCESSIBLE_ROLE_TAB_LIST for the list of tabs
  *   - %GTK_ACCESSIBLE_ROLE_TAB role for each tab
  *   - %GTK_ACCESSIBLE_ROLE_TAB_PANEL for each page
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Notebook private[gnome] (raw: Ptr[GtkNotebook])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Appends a page to @notebook.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def appendPage(
      child: sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */,
      tab_label: Option[sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */ ]
  )(using Runtime): Int /* None */ =
    gtk_notebook_append_page(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNotebook]],
      child.getUnsafeRawPointer().asInstanceOf,
      tab_label
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
    )
  end appendPage

  /** Appends a page to @notebook, specifying the widget to use as the label in
    * the popup menu.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def appendPageMenu(
      child: sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */,
      tab_label: Option[
        sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */
      ],
      menu_label: Option[
        sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */
      ]
  )(using Runtime): Int /* None */ =
    gtk_notebook_append_page_menu(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNotebook]],
      child.getUnsafeRawPointer().asInstanceOf,
      tab_label
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]]),
      menu_label
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
    )
  end appendPageMenu

  /** Removes the child from the notebook.
    *
    * This function is very similar to [method@Gtk.Notebook.remove_page], but
    * additionally informs the notebook that the removal is happening as part of
    * a tab DND operation, which should not be cancelled.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def detachTab(
      child: sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */
  )(using Runtime): Unit /* None */ =
    gtk_notebook_detach_tab(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNotebook]],
      child.getUnsafeRawPointer().asInstanceOf
    )
  end detachTab

  /** Gets one of the action widgets.
    *
    * See [method@Gtk.Notebook.set_action_widget].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getActionWidget(
      pack_type: PackType /* Some(GtkPackType) */
  )(using Runtime): sn.gnome.gtk4.fluent.Widget /* None */ =
    sn.gnome.gtk4.fluent.Widget.applyUnsafe(
      gtk_notebook_get_action_widget(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNotebook]],
        pack_type.raw
      ).asInstanceOf
    )
  end getActionWidget

  /** Returns the page number of the current page.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCurrentPage(): Int /* None */ =
    gtk_notebook_get_current_page(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNotebook]]
    )
  end getCurrentPage

  /** Gets the current group name for @notebook.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getGroupName()(using Zone): String /* None */ =
    fromCString(
      gtk_notebook_get_group_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNotebook]]
      ).asInstanceOf
    )
  end getGroupName

  /** Retrieves the menu label widget of the page containing @child.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMenuLabel(
      child: sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */
  )(using Runtime): sn.gnome.gtk4.fluent.Widget /* None */ =
    sn.gnome.gtk4.fluent.Widget.applyUnsafe(
      gtk_notebook_get_menu_label(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNotebook]],
        child.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )
  end getMenuLabel

  /** Retrieves the text of the menu label for the page containing
    * @child.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMenuLabelText(
      child: sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */
  )(using Zone, Runtime): String /* None */ =
    fromCString(
      gtk_notebook_get_menu_label_text(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNotebook]],
        child.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )
  end getMenuLabelText

  /** Gets the number of pages in a notebook.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNPages(): Int /* None */ =
    gtk_notebook_get_n_pages(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNotebook]]
    )
  end getNPages

  /** Returns the child widget contained in page number @page_num.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNthPage(
      page_num: Int /* Some(CInt) */
  )(using Runtime): sn.gnome.gtk4.fluent.Widget /* None */ =
    sn.gnome.gtk4.fluent.Widget.applyUnsafe(
      gtk_notebook_get_nth_page(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNotebook]],
        page_num
      ).asInstanceOf
    )
  end getNthPage

  /** Returns the `GtkNotebookPage` for @child.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPage(
      child: sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */
  )(using Runtime): sn.gnome.gtk4.fluent.NotebookPage /* None */ =
    sn.gnome.gtk4.fluent.NotebookPage.applyUnsafe(
      gtk_notebook_get_page(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNotebook]],
        child.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )
  end getPage

  /** Returns a `GListModel` that contains the pages of the notebook.
    *
    * This can be used to keep an up-to-date view. The model also implements
    * [iface@Gtk.SelectionModel] and can be used to track and modify the visible
    * page.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPages(): ListModel /* None */ =
    new ListModel.Abstract(
      gtk_notebook_get_pages(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNotebook]]
      ).asInstanceOf
    )
  end getPages

  /** Returns whether the tab label area has arrows for scrolling.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getScrollable(): Boolean /* None */ =
    gtk_notebook_get_scrollable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNotebook]]
    ).value.!=(0)
  end getScrollable

  /** Returns whether a bevel will be drawn around the notebook pages.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getShowBorder(): Boolean /* None */ =
    gtk_notebook_get_show_border(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNotebook]]
    ).value.!=(0)
  end getShowBorder

  /** Returns whether the tabs of the notebook are shown.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getShowTabs(): Boolean /* None */ =
    gtk_notebook_get_show_tabs(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNotebook]]
    ).value.!=(0)
  end getShowTabs

  /** Returns whether the tab contents can be detached from @notebook.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTabDetachable(
      child: sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */
  )(using Runtime): Boolean /* None */ =
    gtk_notebook_get_tab_detachable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNotebook]],
      child.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end getTabDetachable

  /** Returns the tab label widget for the page @child.
    *
    * %NULL is returned if @child is not in @notebook or if no tab label has
    * specifically been set for @child.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTabLabel(
      child: sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */
  )(using Runtime): sn.gnome.gtk4.fluent.Widget /* None */ =
    sn.gnome.gtk4.fluent.Widget.applyUnsafe(
      gtk_notebook_get_tab_label(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNotebook]],
        child.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )
  end getTabLabel

  /** Retrieves the text of the tab label for the page containing
    * @child.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTabLabelText(
      child: sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */
  )(using Zone, Runtime): String /* None */ =
    fromCString(
      gtk_notebook_get_tab_label_text(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNotebook]],
        child.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )
  end getTabLabelText

  /** Gets the edge at which the tabs are drawn.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTabPos(): PositionType /* None */ =
    PositionType.fromRaw(
      gtk_notebook_get_tab_pos(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNotebook]]
      )
    )
  end getTabPos

  /** Gets whether the tab can be reordered via drag and drop or not.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTabReorderable(
      child: sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */
  )(using Runtime): Boolean /* None */ =
    gtk_notebook_get_tab_reorderable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNotebook]],
      child.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end getTabReorderable

  /** Insert a page into @notebook at the given position.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insertPage(
      child: sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */,
      tab_label: Option[
        sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */
      ],
      position: Int /* Some(CInt) */
  )(using Runtime): Int /* None */ =
    gtk_notebook_insert_page(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNotebook]],
      child.getUnsafeRawPointer().asInstanceOf,
      tab_label
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]]),
      position
    )
  end insertPage

  /** Insert a page into @notebook at the given position, specifying the widget
    * to use as the label in the popup menu.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insertPageMenu(
      child: sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */,
      tab_label: Option[
        sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */
      ],
      menu_label: Option[
        sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */
      ],
      position: Int /* Some(CInt) */
  )(using Runtime): Int /* None */ =
    gtk_notebook_insert_page_menu(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNotebook]],
      child.getUnsafeRawPointer().asInstanceOf,
      tab_label
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]]),
      menu_label
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]]),
      position
    )
  end insertPageMenu

  /** Switches to the next page.
    *
    * Nothing happens if the current page is the last page.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def nextPage(): Unit /* None */ =
    gtk_notebook_next_page(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNotebook]]
    )
  end nextPage

  /** Finds the index of the page which contains the given child widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def pageNum(
      child: sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */
  )(using Runtime): Int /* None */ =
    gtk_notebook_page_num(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNotebook]],
      child.getUnsafeRawPointer().asInstanceOf
    )
  end pageNum

  /** Disables the popup menu.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def popupDisable(): Unit /* None */ =
    gtk_notebook_popup_disable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNotebook]]
    )
  end popupDisable

  /** Enables the popup menu.
    *
    * If the user clicks with the right mouse button on the tab labels, a menu
    * with all the pages will be popped up.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def popupEnable(): Unit /* None */ =
    gtk_notebook_popup_enable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNotebook]]
    )
  end popupEnable

  /** Prepends a page to @notebook.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def prependPage(
      child: sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */,
      tab_label: Option[sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */ ]
  )(using Runtime): Int /* None */ =
    gtk_notebook_prepend_page(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNotebook]],
      child.getUnsafeRawPointer().asInstanceOf,
      tab_label
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
    )
  end prependPage

  /** Prepends a page to @notebook, specifying the widget to use as the label in
    * the popup menu.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def prependPageMenu(
      child: sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */,
      tab_label: Option[
        sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */
      ],
      menu_label: Option[
        sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */
      ]
  )(using Runtime): Int /* None */ =
    gtk_notebook_prepend_page_menu(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNotebook]],
      child.getUnsafeRawPointer().asInstanceOf,
      tab_label
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]]),
      menu_label
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
    )
  end prependPageMenu

  /** Switches to the previous page.
    *
    * Nothing happens if the current page is the first page.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def prevPage(): Unit /* None */ =
    gtk_notebook_prev_page(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNotebook]]
    )
  end prevPage

  /** Removes a page from the notebook given its index in the notebook.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removePage(page_num: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_notebook_remove_page(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNotebook]],
      page_num
    )
  end removePage

  /** Reorders the page containing @child, so that it appears in position
    * @position.
    *
    * If @position is greater than or equal to the number of children in the
    * list or negative, @child will be moved to the end of the list.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def reorderChild(
      child: sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */,
      position: Int /* Some(CInt) */
  )(using Runtime): Unit /* None */ =
    gtk_notebook_reorder_child(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNotebook]],
      child.getUnsafeRawPointer().asInstanceOf,
      position
    )
  end reorderChild

  /** Sets @widget as one of the action widgets.
    *
    * Depending on the pack type the widget will be placed before or after the
    * tabs. You can use a `GtkBox` if you need to pack more than one widget on
    * the same side.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setActionWidget(
      widget: sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */,
      pack_type: PackType /* Some(GtkPackType) */
  )(using Runtime): Unit /* None */ =
    gtk_notebook_set_action_widget(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNotebook]],
      widget.getUnsafeRawPointer().asInstanceOf,
      pack_type.raw
    )
  end setActionWidget

  /** Switches to the page number @page_num.
    *
    * Note that due to historical reasons, GtkNotebook refuses to switch to a
    * page unless the child widget is visible. Therefore, it is recommended to
    * show child widgets before adding them to a notebook.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setCurrentPage(page_num: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_notebook_set_current_page(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNotebook]],
      page_num
    )
  end setCurrentPage

  /** Sets a group name for @notebook.
    *
    * Notebooks with the same name will be able to exchange tabs via drag and
    * drop. A notebook with a %NULL group name will not be able to exchange tabs
    * with any other notebook.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setGroupName(
      group_name: Option[String /* Some(CString) */ ]
  )(using Zone): Unit /* None */ =
    gtk_notebook_set_group_name(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNotebook]],
      group_name
        .map[CString](o => toCString(o))
        .getOrElse(null.asInstanceOf[CString])
    )
  end setGroupName

  /** Changes the menu label for the page containing @child.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMenuLabel(
      child: sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */,
      menu_label: Option[
        sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */
      ]
  )(using Runtime): Unit /* None */ =
    gtk_notebook_set_menu_label(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNotebook]],
      child.getUnsafeRawPointer().asInstanceOf,
      menu_label
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
    )
  end setMenuLabel

  /** Creates a new label and sets it as the menu label of @child.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMenuLabelText(
      child: sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */,
      menu_text: String /* Some(CString) */
  )(using Zone, Runtime): Unit /* None */ =
    gtk_notebook_set_menu_label_text(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNotebook]],
      child.getUnsafeRawPointer().asInstanceOf,
      toCString(menu_text)
    )
  end setMenuLabelText

  /** Sets whether the tab label area will have arrows for scrolling if there
    * are too many tabs to fit in the area.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setScrollable(
      scrollable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_notebook_set_scrollable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNotebook]],
      gboolean(gint((if scrollable == true then 1 else 0)))
    )
  end setScrollable

  /** Sets whether a bevel will be drawn around the notebook pages.
    *
    * This only has a visual effect when the tabs are not shown.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setShowBorder(
      show_border: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_notebook_set_show_border(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNotebook]],
      gboolean(gint((if show_border == true then 1 else 0)))
    )
  end setShowBorder

  /** Sets whether to show the tabs for the notebook or not.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setShowTabs(
      show_tabs: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_notebook_set_show_tabs(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNotebook]],
      gboolean(gint((if show_tabs == true then 1 else 0)))
    )
  end setShowTabs

  /** Sets whether the tab can be detached from @notebook to another notebook or
    * widget.
    *
    * Note that two notebooks must share a common group identifier (see
    * [method@Gtk.Notebook.set_group_name]) to allow automatic tabs interchange
    * between them.
    *
    * If you want a widget to interact with a notebook through DnD (i.e.: accept
    * dragged tabs from it) it must be set as a drop destination and accept the
    * target “GTK_NOTEBOOK_TAB”. The notebook will fill the selection with a
    * GtkWidget** pointing to the child widget that corresponds to the dropped
    * tab.
    *
    * Note that you should use [method@Gtk.Notebook.detach_tab] instead of
    * [method@Gtk.Notebook.remove_page] if you want to remove the tab from the
    * source notebook as part of accepting a drop. Otherwise, the source
    * notebook will think that the dragged tab was removed from underneath the
    * ongoing drag operation, and will initiate a drag cancel animation.
    *
    * ```c
    * static void
    * on_drag_data_received (GtkWidget        *widget,
    *                        GdkDrop          *drop,
    *                        GtkSelectionData *data,
    *                        guint             time,
    *                        gpointer          user_data)
    * {
    *   GtkDrag *drag;
    *   GtkWidget *notebook;
    *   GtkWidget **child;
    *
    *   drag = gtk_drop_get_drag (drop);
    *   notebook = g_object_get_data (drag, "gtk-notebook-drag-origin");
    *   child = (void*) gtk_selection_data_get_data (data);
    *
    *   // process_widget (*child);
    *
    *   gtk_notebook_detach_tab (GTK_NOTEBOOK (notebook), *child);
    * }
    * ```
    *
    * If you want a notebook to accept drags from other widgets, you will have
    * to set your own DnD code to do it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTabDetachable(
      child: sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */,
      detachable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  )(using Runtime): Unit /* None */ =
    gtk_notebook_set_tab_detachable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNotebook]],
      child.getUnsafeRawPointer().asInstanceOf,
      gboolean(gint((if detachable == true then 1 else 0)))
    )
  end setTabDetachable

  /** Changes the tab label for @child.
    *
    * If %NULL is specified for @tab_label, then the page will have the label
    * “page N”.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTabLabel(
      child: sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */,
      tab_label: Option[sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */ ]
  )(using Runtime): Unit /* None */ =
    gtk_notebook_set_tab_label(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNotebook]],
      child.getUnsafeRawPointer().asInstanceOf,
      tab_label
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
    )
  end setTabLabel

  /** Creates a new label and sets it as the tab label for the page containing @child.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTabLabelText(
      child: sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */,
      tab_text: String /* Some(CString) */
  )(using Zone, Runtime): Unit /* None */ =
    gtk_notebook_set_tab_label_text(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNotebook]],
      child.getUnsafeRawPointer().asInstanceOf,
      toCString(tab_text)
    )
  end setTabLabelText

  /** Sets the edge at which the tabs are drawn.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTabPos(
      pos: PositionType /* Some(GtkPositionType) */
  ): Unit /* None */ =
    gtk_notebook_set_tab_pos(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNotebook]],
      pos.raw
    )
  end setTabPos

  /** Sets whether the notebook tab can be reordered via drag and drop or not.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTabReorderable(
      child: sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */,
      reorderable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  )(using Runtime): Unit /* None */ =
    gtk_notebook_set_tab_reorderable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNotebook]],
      child.getUnsafeRawPointer().asInstanceOf,
      gboolean(gint((if reorderable == true then 1 else 0)))
    )
  end setTabReorderable

  def onChangeCurrentPage(handler: ((`object`: Int)) => Boolean)(using
      Runtime
  ) =
    type SignalRegType = SignalRegistration[this.type, (`object`: Int), Boolean]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkNotebook],
          `object`: Int /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((`object` = `object`))
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
    val signal = c"change-current-page"
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
  end onChangeCurrentPage

  /** The ::create-window signal is emitted when a detachable tab is dropped on
    * the root window.
    *
    * A handler for this signal can create a window containing a notebook where
    * the tab will be attached. It is also responsible for moving/resizing the
    * window and adding the necessary properties to the notebook (e.g. the
    * `GtkNotebook`:group-name ).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onCreateWindow(handler: ((page: Widget)) => Notebook)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, (page: Widget), Notebook]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkNotebook],
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
    val signal = c"create-window"
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
  end onCreateWindow
  def onFocusTab(handler: ((`object`: NotebookTab)) => Boolean)(using Runtime) =
    type SignalRegType =
      SignalRegistration[this.type, (`object`: NotebookTab), Boolean]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkNotebook],
          `object`: GtkNotebookTab /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((`object` = NotebookTab.fromRaw(`object`)))
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
    val signal = c"focus-tab"
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
  end onFocusTab
  def onMoveFocusOut(handler: ((`object`: DirectionType)) => Unit)(using
      Runtime
  ) =
    type SignalRegType =
      SignalRegistration[this.type, (`object`: DirectionType), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkNotebook],
          `object`: GtkDirectionType /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((`object` = DirectionType.fromRaw(`object`)))
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

  /** the ::page-added signal is emitted in the notebook right after a page is
    * added to the notebook.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal page-added]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(guint), @type -> DataRecord(guint)))"
  )
  private def onPageAdded = ???

  /** the ::page-removed signal is emitted in the notebook right after a page is
    * removed from the notebook.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal page-removed]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(guint), @type -> DataRecord(guint)))"
  )
  private def onPageRemoved = ???

  /** the ::page-reordered signal is emitted in the notebook right after a page
    * has been reordered.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal page-reordered]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(guint), @type -> DataRecord(guint)))"
  )
  private def onPageReordered = ???

  def onReorderTab(
      handler: ((`object`: DirectionType, p0: Boolean)) => Boolean
  )(using Runtime) =
    type SignalRegType = SignalRegistration[
      this.type,
      (`object`: DirectionType, p0: Boolean),
      Boolean
    ]
    val c_handler = CFuncPtr4.fromScalaFunction {
      (
          self: Ptr[GtkNotebook],
          `object`: GtkDirectionType /* param */,
          p0: Boolean /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((`object` = DirectionType.fromRaw(`object`), p0 = p0))
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
    val signal = c"reorder-tab"
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
  end onReorderTab
  def onSelectPage(handler: ((`object`: Boolean)) => Boolean)(using Runtime) =
    type SignalRegType =
      SignalRegistration[this.type, (`object`: Boolean), Boolean]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkNotebook],
          `object`: Boolean /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((`object` = `object`))
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
    val signal = c"select-page"
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
  end onSelectPage

  /** Emitted when the user or a function changes the current page.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal switch-page]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(guint), @type -> DataRecord(guint)))"
  )
  private def onSwitchPage = ???

end Notebook

object Notebook:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkNotebook])(using Runtime) = summon[Runtime]
    .getOrCreate[Notebook](ptr.asInstanceOf[Ptr[Byte]], p => new Notebook(ptr))

  /** Creates a new `GtkNotebook` widget with no pages.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): Notebook =
    val raw: Ptr[Byte] = gtk_notebook_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[Notebook](raw, r => Notebook.applyUnsafe(r.asInstanceOf))
  end apply
end Notebook
