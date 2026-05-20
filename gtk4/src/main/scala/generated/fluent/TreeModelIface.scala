package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkTreeModelIface

class TreeModelIface private[gnome] (raw: Ptr[GtkTreeModelIface]):

  def getUnsafeRawPointer(): Ptr[GtkTreeModelIface] = this.raw

  @annotation.compileTimeOnly("[field row_changed]: Field is missing <type>")
  private def rowChanged__ = ???
  @annotation.compileTimeOnly("[field row_inserted]: Field is missing <type>")
  private def rowInserted__ = ???
  @annotation.compileTimeOnly(
    "[field row_has_child_toggled]: Field is missing <type>"
  )
  private def rowHasChildToggled__ = ???
  @annotation.compileTimeOnly("[field row_deleted]: Field is missing <type>")
  private def rowDeleted__ = ???
  @annotation.compileTimeOnly("[field rows_reordered]: Field is missing <type>")
  private def rowsReordered__ = ???
  @annotation.compileTimeOnly("[field get_flags]: Field is missing <type>")
  private def getFlags__ = ???
  @annotation.compileTimeOnly("[field get_n_columns]: Field is missing <type>")
  private def getNColumns__ = ???
  @annotation.compileTimeOnly(
    "[field get_column_type]: Field is missing <type>"
  )
  private def getColumnType__ = ???
  @annotation.compileTimeOnly("[field get_iter]: Field is missing <type>")
  private def getIter__ = ???
  @annotation.compileTimeOnly("[field get_path]: Field is missing <type>")
  private def getPath__ = ???
  @annotation.compileTimeOnly("[field get_value]: Field is missing <type>")
  private def getValue__ = ???
  @annotation.compileTimeOnly("[field iter_next]: Field is missing <type>")
  private def iterNext__ = ???
  @annotation.compileTimeOnly("[field iter_previous]: Field is missing <type>")
  private def iterPrevious__ = ???
  @annotation.compileTimeOnly("[field iter_children]: Field is missing <type>")
  private def iterChildren__ = ???
  @annotation.compileTimeOnly("[field iter_has_child]: Field is missing <type>")
  private def iterHasChild__ = ???
  @annotation.compileTimeOnly(
    "[field iter_n_children]: Field is missing <type>"
  )
  private def iterNChildren__ = ???
  @annotation.compileTimeOnly("[field iter_nth_child]: Field is missing <type>")
  private def iterNthChild__ = ???
  @annotation.compileTimeOnly("[field iter_parent]: Field is missing <type>")
  private def iterParent__ = ???
  @annotation.compileTimeOnly("[field ref_node]: Field is missing <type>")
  private def refNode__ = ???
  @annotation.compileTimeOnly("[field unref_node]: Field is missing <type>")
  private def unrefNode__ = ???
end TreeModelIface

object TreeModelIface:
  def fromRaw(ptr: Ptr[GtkTreeModelIface]): TreeModelIface = new TreeModelIface(
    ptr
  )
end TreeModelIface
