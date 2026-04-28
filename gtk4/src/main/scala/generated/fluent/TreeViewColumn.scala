package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.GDestroyNotify
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.InitiallyUnowned
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.CellArea
import sn.gnome.gtk4.fluent.CellLayout
import sn.gnome.gtk4.fluent.CellRenderer
import sn.gnome.gtk4.fluent.TreeModel
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkSortType
import sn.gnome.gtk4.internal.GtkTreeCellDataFunc
import sn.gnome.gtk4.internal.GtkTreeIter
import sn.gnome.gtk4.internal.GtkTreeViewColumn
import sn.gnome.gtk4.internal.GtkTreeViewColumnSizing

class TreeViewColumn(raw: Ptr[GtkTreeViewColumn])
    extends InitiallyUnowned(raw.asInstanceOf),
      Buildable,
      CellLayout:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def addAttribute(
      cell_renderer: CellRenderer,
      attribute: String | CString,
      column: Int
  )(using Zone): Unit = gtk_tree_view_column_add_attribute(
    this.raw.asInstanceOf,
    cell_renderer.getUnsafeRawPointer().asInstanceOf,
    __sn_extract_string(attribute),
    column
  )

  // Method cell_get_position contains an OUT parameter, which is not supported yet

  // Method cell_get_size contains an OUT parameter, which is not supported yet

  def cellIsVisible(): Boolean =
    gtk_tree_view_column_cell_is_visible(this.raw.asInstanceOf).value.!=(0)

  def cellSetCellData(
      tree_model: TreeModel,
      iter: Ptr[GtkTreeIter],
      is_expander: Boolean,
      is_expanded: Boolean
  ): Unit = gtk_tree_view_column_cell_set_cell_data(
    this.raw.asInstanceOf,
    tree_model.getUnsafeRawPointer().asInstanceOf,
    iter,
    gboolean(gint((if is_expander == true then 1 else 0))),
    gboolean(gint((if is_expanded == true then 1 else 0)))
  )

  def clear(): Unit = gtk_tree_view_column_clear(this.raw.asInstanceOf)

  def clearAttributes(cell_renderer: CellRenderer): Unit =
    gtk_tree_view_column_clear_attributes(
      this.raw.asInstanceOf,
      cell_renderer.getUnsafeRawPointer().asInstanceOf
    )

  def clicked(): Unit = gtk_tree_view_column_clicked(this.raw.asInstanceOf)

  def focusCell(cell: CellRenderer): Unit = gtk_tree_view_column_focus_cell(
    this.raw.asInstanceOf,
    cell.getUnsafeRawPointer().asInstanceOf
  )

  def getAlignment(): Float = gtk_tree_view_column_get_alignment(
    this.raw.asInstanceOf
  )

  def getButton(): Widget = new Widget(
    gtk_tree_view_column_get_button(this.raw.asInstanceOf).asInstanceOf
  )

  def getClickable(): Boolean =
    gtk_tree_view_column_get_clickable(this.raw.asInstanceOf).value.!=(0)

  def getExpand(): Boolean =
    gtk_tree_view_column_get_expand(this.raw.asInstanceOf).value.!=(0)

  def getFixedWidth(): Int = gtk_tree_view_column_get_fixed_width(
    this.raw.asInstanceOf
  )

  def getMaxWidth(): Int = gtk_tree_view_column_get_max_width(
    this.raw.asInstanceOf
  )

  def getMinWidth(): Int = gtk_tree_view_column_get_min_width(
    this.raw.asInstanceOf
  )

  def getReorderable(): Boolean =
    gtk_tree_view_column_get_reorderable(this.raw.asInstanceOf).value.!=(0)

  def getResizable(): Boolean =
    gtk_tree_view_column_get_resizable(this.raw.asInstanceOf).value.!=(0)

  def getSizing(): GtkTreeViewColumnSizing = gtk_tree_view_column_get_sizing(
    this.raw.asInstanceOf
  )

  def getSortColumnId(): Int = gtk_tree_view_column_get_sort_column_id(
    this.raw.asInstanceOf
  )

  def getSortIndicator(): Boolean =
    gtk_tree_view_column_get_sort_indicator(this.raw.asInstanceOf).value.!=(0)

  def getSortOrder(): GtkSortType = gtk_tree_view_column_get_sort_order(
    this.raw.asInstanceOf
  )

  def getSpacing(): Int = gtk_tree_view_column_get_spacing(
    this.raw.asInstanceOf
  )

  def getTitle()(using Zone): String = fromCString(
    gtk_tree_view_column_get_title(this.raw.asInstanceOf).asInstanceOf
  )

  def getTreeView(): Widget = new Widget(
    gtk_tree_view_column_get_tree_view(this.raw.asInstanceOf).asInstanceOf
  )

  def getVisible(): Boolean =
    gtk_tree_view_column_get_visible(this.raw.asInstanceOf).value.!=(0)

  def getWidget(): Widget = new Widget(
    gtk_tree_view_column_get_widget(this.raw.asInstanceOf).asInstanceOf
  )

  def getWidth(): Int = gtk_tree_view_column_get_width(this.raw.asInstanceOf)

  def getXOffset(): Int = gtk_tree_view_column_get_x_offset(
    this.raw.asInstanceOf
  )

  def packEnd(cell: CellRenderer, expand: Boolean): Unit =
    gtk_tree_view_column_pack_end(
      this.raw.asInstanceOf,
      cell.getUnsafeRawPointer().asInstanceOf,
      gboolean(gint((if expand == true then 1 else 0)))
    )

  def packStart(cell: CellRenderer, expand: Boolean): Unit =
    gtk_tree_view_column_pack_start(
      this.raw.asInstanceOf,
      cell.getUnsafeRawPointer().asInstanceOf,
      gboolean(gint((if expand == true then 1 else 0)))
    )

  def queueResize(): Unit = gtk_tree_view_column_queue_resize(
    this.raw.asInstanceOf
  )

  def setAlignment(xalign: Float): Unit = gtk_tree_view_column_set_alignment(
    this.raw.asInstanceOf,
    xalign.asInstanceOf
  )

  inline def setAttributes(cell_renderer: CellRenderer, args: Any*): Unit =
    gtk_tree_view_column_set_attributes(
      this.raw.asInstanceOf,
      cell_renderer.getUnsafeRawPointer().asInstanceOf,
      args*
    )

  def setCellDataFunc(
      cell_renderer: CellRenderer,
      func: GtkTreeCellDataFunc,
      func_data: Ptr[Byte],
      destroy: GDestroyNotify
  ): Unit = gtk_tree_view_column_set_cell_data_func(
    this.raw.asInstanceOf,
    cell_renderer.getUnsafeRawPointer().asInstanceOf,
    func,
    gpointer(func_data),
    destroy
  )

  def setClickable(clickable: Boolean): Unit =
    gtk_tree_view_column_set_clickable(
      this.raw.asInstanceOf,
      gboolean(gint((if clickable == true then 1 else 0)))
    )

  def setExpand(expand: Boolean): Unit = gtk_tree_view_column_set_expand(
    this.raw.asInstanceOf,
    gboolean(gint((if expand == true then 1 else 0)))
  )

  def setFixedWidth(fixed_width: Int): Unit =
    gtk_tree_view_column_set_fixed_width(this.raw.asInstanceOf, fixed_width)

  def setMaxWidth(max_width: Int): Unit =
    gtk_tree_view_column_set_max_width(this.raw.asInstanceOf, max_width)

  def setMinWidth(min_width: Int): Unit =
    gtk_tree_view_column_set_min_width(this.raw.asInstanceOf, min_width)

  def setReorderable(reorderable: Boolean): Unit =
    gtk_tree_view_column_set_reorderable(
      this.raw.asInstanceOf,
      gboolean(gint((if reorderable == true then 1 else 0)))
    )

  def setResizable(resizable: Boolean): Unit =
    gtk_tree_view_column_set_resizable(
      this.raw.asInstanceOf,
      gboolean(gint((if resizable == true then 1 else 0)))
    )

  def setSizing(`type`: GtkTreeViewColumnSizing): Unit =
    gtk_tree_view_column_set_sizing(this.raw.asInstanceOf, `type`)

  def setSortColumnId(sort_column_id: Int): Unit =
    gtk_tree_view_column_set_sort_column_id(
      this.raw.asInstanceOf,
      sort_column_id
    )

  def setSortIndicator(setting: Boolean): Unit =
    gtk_tree_view_column_set_sort_indicator(
      this.raw.asInstanceOf,
      gboolean(gint((if setting == true then 1 else 0)))
    )

  def setSortOrder(order: GtkSortType): Unit =
    gtk_tree_view_column_set_sort_order(this.raw.asInstanceOf, order)

  def setSpacing(spacing: Int): Unit =
    gtk_tree_view_column_set_spacing(this.raw.asInstanceOf, spacing)

  def setTitle(title: String | CString)(using Zone): Unit =
    gtk_tree_view_column_set_title(
      this.raw.asInstanceOf,
      __sn_extract_string(title)
    )

  def setVisible(visible: Boolean): Unit = gtk_tree_view_column_set_visible(
    this.raw.asInstanceOf,
    gboolean(gint((if visible == true then 1 else 0)))
  )

  def setWidget(widget: Widget): Unit = gtk_tree_view_column_set_widget(
    this.raw.asInstanceOf,
    widget.getUnsafeRawPointer().asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end TreeViewColumn

object TreeViewColumn:
  def apply(): TreeViewColumn = new TreeViewColumn(
    gtk_tree_view_column_new().asInstanceOf
  )
  def withArea(area: CellArea): TreeViewColumn = new TreeViewColumn(
    gtk_tree_view_column_new_with_area(
      area.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
  inline def withAttributes(
      title: String | CString,
      cell: CellRenderer,
      args: Any*
  )(using Zone): TreeViewColumn = new TreeViewColumn(
    gtk_tree_view_column_new_with_attributes(
      __sn_extract_string(title),
      cell.getUnsafeRawPointer().asInstanceOf,
      args*
    ).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end TreeViewColumn
