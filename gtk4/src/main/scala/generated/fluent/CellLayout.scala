package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{CellArea, CellRenderer}

trait CellLayout:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Adds an attribute mapping to the list in @cell_layout.
    *
    * The @column is the column of the model to get a value from, and the
    * @attribute
    *   is the property on @cell to be set from that value. So for example if
    *   column 2 of the model contains strings, you could have the “text”
    *   attribute of a `GtkCellRendererText` get its values from column 2. In
    *   this context "attribute" and "property" are used interchangeably.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addAttribute(
      cell: sn.gnome.gtk4.CellRenderer /* Some(Ptr[GtkCellRenderer]) */,
      attribute: String /* Some(CString) */,
      column: Int /* Some(CInt) */
  )(using Zone, Runtime): Unit /* None */ =
    gtk_cell_layout_add_attribute(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkCellLayout]],
      cell.getUnsafeRawPointer().asInstanceOf,
      toCString(attribute),
      column
    )
  end addAttribute

  /** Unsets all the mappings on all renderers on @cell_layout and removes all
    * renderers from @cell_layout.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def clear(): Unit /* None */ =
    gtk_cell_layout_clear(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkCellLayout]]
    )
  end clear

  /** Clears all existing attributes previously set with
    * gtk_cell_layout_set_attributes().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def clearAttributes(
      cell: sn.gnome.gtk4.CellRenderer /* Some(Ptr[GtkCellRenderer]) */
  )(using Runtime): Unit /* None */ =
    gtk_cell_layout_clear_attributes(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkCellLayout]],
      cell.getUnsafeRawPointer().asInstanceOf
    )
  end clearAttributes

  /** Returns the underlying `GtkCellArea` which might be @cell_layout if called
    * on a `GtkCellArea` or might be %NULL if no `GtkCellArea` is used by @cell_layout.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getArea()(using Runtime): sn.gnome.gtk4.CellArea /* None */ =
    sn.gnome.gtk4.CellArea.applyUnsafe(
      gtk_cell_layout_get_area(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkCellLayout]]
      ).asInstanceOf
    )
  end getArea

  /** Returns the cell renderers which have been added to @cell_layout.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_cells/return type]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(CellRenderer))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  private def getCells__ = ???

  /** Adds the @cell to the end of @cell_layout. If @expand is %FALSE, then the
    * @cell
    *   is allocated no more space than it needs. Any unused space is divided
    *   evenly between cells for which @expand is %TRUE.
    *
    * Note that reusing the same cell renderer is not supported.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def packEnd(
      cell: sn.gnome.gtk4.CellRenderer /* Some(Ptr[GtkCellRenderer]) */,
      expand: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  )(using Runtime): Unit /* None */ =
    gtk_cell_layout_pack_end(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkCellLayout]],
      cell.getUnsafeRawPointer().asInstanceOf,
      gboolean(gint((if expand == true then 1 else 0)))
    )
  end packEnd

  /** Packs the @cell into the beginning of @cell_layout. If @expand is %FALSE,
    * then the @cell is allocated no more space than it needs. Any unused space
    * is divided evenly between cells for which @expand is %TRUE.
    *
    * Note that reusing the same cell renderer is not supported.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def packStart(
      cell: sn.gnome.gtk4.CellRenderer /* Some(Ptr[GtkCellRenderer]) */,
      expand: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  )(using Runtime): Unit /* None */ =
    gtk_cell_layout_pack_start(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkCellLayout]],
      cell.getUnsafeRawPointer().asInstanceOf,
      gboolean(gint((if expand == true then 1 else 0)))
    )
  end packStart

  /** Re-inserts @cell at @position.
    *
    * Note that @cell has already to be packed into @cell_layout for this to
    * function properly.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def reorder(
      cell: sn.gnome.gtk4.CellRenderer /* Some(Ptr[GtkCellRenderer]) */,
      position: Int /* Some(CInt) */
  )(using Runtime): Unit /* None */ =
    gtk_cell_layout_reorder(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkCellLayout]],
      cell.getUnsafeRawPointer().asInstanceOf,
      position
    )
  end reorder

  /** Sets the attributes in the parameter list as the attributes of @cell_layout.
    *
    * See [method@Gtk.CellLayout.add_attribute] for more details.
    *
    * The attributes should be in attribute/column order, as in
    * gtk_cell_layout_add_attribute(). All existing attributes are removed, and
    * replaced with the new attributes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_attributes/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def setAttributes__ = ???

  /** Sets the `GtkCellLayout`DataFunc to use for @cell_layout.
    *
    * This function is used instead of the standard attributes mapping for
    * setting the column value, and should set the value of @cell_layout’s cell
    * renderer(s) as appropriate.
    *
    * @func
    *   may be %NULL to remove a previously set function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_cell_data_func/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(CellLayoutDataFunc), @type -> DataRecord(GtkCellLayoutDataFunc)))"
  )
  private def setCellDataFunc__ = ???

end CellLayout

object CellLayout:
  class Abstract(raw: Ptr[Byte]) extends CellLayout:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end CellLayout
