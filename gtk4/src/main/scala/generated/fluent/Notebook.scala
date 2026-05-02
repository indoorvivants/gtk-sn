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

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkNotebook` is a container whose children are pages switched between using
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
  */
class Notebook(raw: Ptr[GtkNotebook])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Appends a page to @notebook.
    */
  def appendPage(
      child: Widget /* Some(Ptr[GtkWidget]) */,
      tab_label: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Int /* None */ = gtk_notebook_append_page(
    this.raw.asInstanceOf[Ptr[GtkNotebook]],
    child.getUnsafeRawPointer().asInstanceOf,
    tab_label
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Appends a page to @notebook, specifying the widget to use as the label in
    * the popup menu.
    */
  def appendPageMenu(
      child: Widget /* Some(Ptr[GtkWidget]) */,
      tab_label: Option[Widget /* Some(Ptr[GtkWidget]) */ ],
      menu_label: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Int /* None */ = gtk_notebook_append_page_menu(
    this.raw.asInstanceOf[Ptr[GtkNotebook]],
    child.getUnsafeRawPointer().asInstanceOf,
    tab_label
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]]),
    menu_label
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes the child from the notebook.
    *
    * This function is very similar to [method@Gtk.Notebook.remove_page], but
    * additionally informs the notebook that the removal is happening as part of
    * a tab DND operation, which should not be cancelled.
    */
  def detachTab(child: Widget /* Some(Ptr[GtkWidget]) */ ): Unit /* None */ =
    gtk_notebook_detach_tab(
      this.raw.asInstanceOf[Ptr[GtkNotebook]],
      child.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets one of the action widgets.
    *
    * See [method@Gtk.Notebook.set_action_widget].
    */
  def getActionWidget(
      pack_type: GtkPackType /* Some(GtkPackType) */
  ): Widget /* None */ = new Widget(
    gtk_notebook_get_action_widget(
      this.raw.asInstanceOf[Ptr[GtkNotebook]],
      pack_type
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the page number of the current page.
    */
  def getCurrentPage(): Int /* None */ = gtk_notebook_get_current_page(
    this.raw.asInstanceOf[Ptr[GtkNotebook]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the current group name for @notebook.
    */
  def getGroupName()(using Zone): String /* None */ = fromCString(
    gtk_notebook_get_group_name(
      this.raw.asInstanceOf[Ptr[GtkNotebook]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the menu label widget of the page containing @child.
    */
  def getMenuLabel(
      child: Widget /* Some(Ptr[GtkWidget]) */
  ): Widget /* None */ = new Widget(
    gtk_notebook_get_menu_label(
      this.raw.asInstanceOf[Ptr[GtkNotebook]],
      child.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the text of the menu label for the page containing
    * @child.
    */
  def getMenuLabelText(
      child: Widget /* Some(Ptr[GtkWidget]) */
  )(using Zone): String /* None */ = fromCString(
    gtk_notebook_get_menu_label_text(
      this.raw.asInstanceOf[Ptr[GtkNotebook]],
      child.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the number of pages in a notebook.
    */
  def getNPages(): Int /* None */ = gtk_notebook_get_n_pages(
    this.raw.asInstanceOf[Ptr[GtkNotebook]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the child widget contained in page number @page_num.
    */
  def getNthPage(page_num: Int /* Some(CInt) */ ): Widget /* None */ =
    new Widget(
      gtk_notebook_get_nth_page(
        this.raw.asInstanceOf[Ptr[GtkNotebook]],
        page_num
      ).asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the `GtkNotebookPage` for @child.
    */
  def getPage(
      child: Widget /* Some(Ptr[GtkWidget]) */
  ): NotebookPage /* None */ = new NotebookPage(
    gtk_notebook_get_page(
      this.raw.asInstanceOf[Ptr[GtkNotebook]],
      child.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns a `GListModel` that contains the pages of the notebook.
    *
    * This can be used to keep an up-to-date view. The model also implements
    * [iface@Gtk.SelectionModel] and can be used to track and modify the visible
    * page.
    */
  def getPages(): ListModel /* None */ = new ListModel.Abstract(
    gtk_notebook_get_pages(this.raw.asInstanceOf[Ptr[GtkNotebook]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the tab label area has arrows for scrolling.
    */
  def getScrollable(): Boolean /* None */ = gtk_notebook_get_scrollable(
    this.raw.asInstanceOf[Ptr[GtkNotebook]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether a bevel will be drawn around the notebook pages.
    */
  def getShowBorder(): Boolean /* None */ = gtk_notebook_get_show_border(
    this.raw.asInstanceOf[Ptr[GtkNotebook]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the tabs of the notebook are shown.
    */
  def getShowTabs(): Boolean /* None */ = gtk_notebook_get_show_tabs(
    this.raw.asInstanceOf[Ptr[GtkNotebook]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the tab contents can be detached from @notebook.
    */
  def getTabDetachable(
      child: Widget /* Some(Ptr[GtkWidget]) */
  ): Boolean /* None */ = gtk_notebook_get_tab_detachable(
    this.raw.asInstanceOf[Ptr[GtkNotebook]],
    child.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the tab label widget for the page @child.
    *
    * %NULL is returned if @child is not in @notebook or if no tab label has
    * specifically been set for @child.
    */
  def getTabLabel(
      child: Widget /* Some(Ptr[GtkWidget]) */
  ): Widget /* None */ = new Widget(
    gtk_notebook_get_tab_label(
      this.raw.asInstanceOf[Ptr[GtkNotebook]],
      child.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the text of the tab label for the page containing
    * @child.
    */
  def getTabLabelText(
      child: Widget /* Some(Ptr[GtkWidget]) */
  )(using Zone): String /* None */ = fromCString(
    gtk_notebook_get_tab_label_text(
      this.raw.asInstanceOf[Ptr[GtkNotebook]],
      child.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the edge at which the tabs are drawn.
    */
  def getTabPos(): GtkPositionType /* None */ = gtk_notebook_get_tab_pos(
    this.raw.asInstanceOf[Ptr[GtkNotebook]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether the tab can be reordered via drag and drop or not.
    */
  def getTabReorderable(
      child: Widget /* Some(Ptr[GtkWidget]) */
  ): Boolean /* None */ = gtk_notebook_get_tab_reorderable(
    this.raw.asInstanceOf[Ptr[GtkNotebook]],
    child.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Insert a page into @notebook at the given position.
    */
  def insertPage(
      child: Widget /* Some(Ptr[GtkWidget]) */,
      tab_label: Option[Widget /* Some(Ptr[GtkWidget]) */ ],
      position: Int /* Some(CInt) */
  ): Int /* None */ = gtk_notebook_insert_page(
    this.raw.asInstanceOf[Ptr[GtkNotebook]],
    child.getUnsafeRawPointer().asInstanceOf,
    tab_label
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]]),
    position
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Insert a page into @notebook at the given position, specifying the widget
    * to use as the label in the popup menu.
    */
  def insertPageMenu(
      child: Widget /* Some(Ptr[GtkWidget]) */,
      tab_label: Option[Widget /* Some(Ptr[GtkWidget]) */ ],
      menu_label: Option[Widget /* Some(Ptr[GtkWidget]) */ ],
      position: Int /* Some(CInt) */
  ): Int /* None */ = gtk_notebook_insert_page_menu(
    this.raw.asInstanceOf[Ptr[GtkNotebook]],
    child.getUnsafeRawPointer().asInstanceOf,
    tab_label
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]]),
    menu_label
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]]),
    position
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Switches to the next page.
    *
    * Nothing happens if the current page is the last page.
    */
  def nextPage(): Unit /* None */ = gtk_notebook_next_page(
    this.raw.asInstanceOf[Ptr[GtkNotebook]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finds the index of the page which contains the given child widget.
    */
  def pageNum(child: Widget /* Some(Ptr[GtkWidget]) */ ): Int /* None */ =
    gtk_notebook_page_num(
      this.raw.asInstanceOf[Ptr[GtkNotebook]],
      child.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Disables the popup menu.
    */
  def popupDisable(): Unit /* None */ = gtk_notebook_popup_disable(
    this.raw.asInstanceOf[Ptr[GtkNotebook]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Enables the popup menu.
    *
    * If the user clicks with the right mouse button on the tab labels, a menu
    * with all the pages will be popped up.
    */
  def popupEnable(): Unit /* None */ = gtk_notebook_popup_enable(
    this.raw.asInstanceOf[Ptr[GtkNotebook]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Prepends a page to @notebook.
    */
  def prependPage(
      child: Widget /* Some(Ptr[GtkWidget]) */,
      tab_label: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Int /* None */ = gtk_notebook_prepend_page(
    this.raw.asInstanceOf[Ptr[GtkNotebook]],
    child.getUnsafeRawPointer().asInstanceOf,
    tab_label
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Prepends a page to @notebook, specifying the widget to use as the label in
    * the popup menu.
    */
  def prependPageMenu(
      child: Widget /* Some(Ptr[GtkWidget]) */,
      tab_label: Option[Widget /* Some(Ptr[GtkWidget]) */ ],
      menu_label: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Int /* None */ = gtk_notebook_prepend_page_menu(
    this.raw.asInstanceOf[Ptr[GtkNotebook]],
    child.getUnsafeRawPointer().asInstanceOf,
    tab_label
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]]),
    menu_label
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Switches to the previous page.
    *
    * Nothing happens if the current page is the first page.
    */
  def prevPage(): Unit /* None */ = gtk_notebook_prev_page(
    this.raw.asInstanceOf[Ptr[GtkNotebook]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes a page from the notebook given its index in the notebook.
    */
  def removePage(page_num: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_notebook_remove_page(this.raw.asInstanceOf[Ptr[GtkNotebook]], page_num)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Reorders the page containing @child, so that it appears in position
    * @position.
    *
    * If @position is greater than or equal to the number of children in the
    * list or negative, @child will be moved to the end of the list.
    */
  def reorderChild(
      child: Widget /* Some(Ptr[GtkWidget]) */,
      position: Int /* Some(CInt) */
  ): Unit /* None */ = gtk_notebook_reorder_child(
    this.raw.asInstanceOf[Ptr[GtkNotebook]],
    child.getUnsafeRawPointer().asInstanceOf,
    position
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets @widget as one of the action widgets.
    *
    * Depending on the pack type the widget will be placed before or after the
    * tabs. You can use a `GtkBox` if you need to pack more than one widget on
    * the same side.
    */
  def setActionWidget(
      widget: Widget /* Some(Ptr[GtkWidget]) */,
      pack_type: GtkPackType /* Some(GtkPackType) */
  ): Unit /* None */ = gtk_notebook_set_action_widget(
    this.raw.asInstanceOf[Ptr[GtkNotebook]],
    widget.getUnsafeRawPointer().asInstanceOf,
    pack_type
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Switches to the page number @page_num.
    *
    * Note that due to historical reasons, GtkNotebook refuses to switch to a
    * page unless the child widget is visible. Therefore, it is recommended to
    * show child widgets before adding them to a notebook.
    */
  def setCurrentPage(page_num: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_notebook_set_current_page(
      this.raw.asInstanceOf[Ptr[GtkNotebook]],
      page_num
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets a group name for @notebook.
    *
    * Notebooks with the same name will be able to exchange tabs via drag and
    * drop. A notebook with a %NULL group name will not be able to exchange tabs
    * with any other notebook.
    */
  def setGroupName(
      group_name: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_notebook_set_group_name(
    this.raw.asInstanceOf[Ptr[GtkNotebook]],
    group_name
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Changes the menu label for the page containing @child.
    */
  def setMenuLabel(
      child: Widget /* Some(Ptr[GtkWidget]) */,
      menu_label: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Unit /* None */ = gtk_notebook_set_menu_label(
    this.raw.asInstanceOf[Ptr[GtkNotebook]],
    child.getUnsafeRawPointer().asInstanceOf,
    menu_label
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new label and sets it as the menu label of @child.
    */
  def setMenuLabelText(
      child: Widget /* Some(Ptr[GtkWidget]) */,
      menu_text: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_notebook_set_menu_label_text(
    this.raw.asInstanceOf[Ptr[GtkNotebook]],
    child.getUnsafeRawPointer().asInstanceOf,
    __sn_extract_string(menu_text)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the tab label area will have arrows for scrolling if there
    * are too many tabs to fit in the area.
    */
  def setScrollable(
      scrollable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_notebook_set_scrollable(
    this.raw.asInstanceOf[Ptr[GtkNotebook]],
    gboolean(gint((if scrollable == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether a bevel will be drawn around the notebook pages.
    *
    * This only has a visual effect when the tabs are not shown.
    */
  def setShowBorder(
      show_border: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_notebook_set_show_border(
    this.raw.asInstanceOf[Ptr[GtkNotebook]],
    gboolean(gint((if show_border == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether to show the tabs for the notebook or not.
    */
  def setShowTabs(
      show_tabs: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_notebook_set_show_tabs(
    this.raw.asInstanceOf[Ptr[GtkNotebook]],
    gboolean(gint((if show_tabs == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the tab can be detached from @notebook to another notebook or
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
    */
  def setTabDetachable(
      child: Widget /* Some(Ptr[GtkWidget]) */,
      detachable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_notebook_set_tab_detachable(
    this.raw.asInstanceOf[Ptr[GtkNotebook]],
    child.getUnsafeRawPointer().asInstanceOf,
    gboolean(gint((if detachable == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Changes the tab label for @child.
    *
    * If %NULL is specified for @tab_label, then the page will have the label
    * “page N”.
    */
  def setTabLabel(
      child: Widget /* Some(Ptr[GtkWidget]) */,
      tab_label: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Unit /* None */ = gtk_notebook_set_tab_label(
    this.raw.asInstanceOf[Ptr[GtkNotebook]],
    child.getUnsafeRawPointer().asInstanceOf,
    tab_label
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new label and sets it as the tab label for the page containing @child.
    */
  def setTabLabelText(
      child: Widget /* Some(Ptr[GtkWidget]) */,
      tab_text: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_notebook_set_tab_label_text(
    this.raw.asInstanceOf[Ptr[GtkNotebook]],
    child.getUnsafeRawPointer().asInstanceOf,
    __sn_extract_string(tab_text)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the edge at which the tabs are drawn.
    */
  def setTabPos(
      pos: GtkPositionType /* Some(GtkPositionType) */
  ): Unit /* None */ =
    gtk_notebook_set_tab_pos(this.raw.asInstanceOf[Ptr[GtkNotebook]], pos)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the notebook tab can be reordered via drag and drop or not.
    */
  def setTabReorderable(
      child: Widget /* Some(Ptr[GtkWidget]) */,
      reorderable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_notebook_set_tab_reorderable(
    this.raw.asInstanceOf[Ptr[GtkNotebook]],
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
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkNotebook` widget with no pages.
    */
  def apply(): Notebook = new Notebook(gtk_notebook_new().asInstanceOf)
end Notebook
