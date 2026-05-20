package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkTreeSortableIface

class TreeSortableIface private[gnome] (raw: Ptr[GtkTreeSortableIface]):

  def getUnsafeRawPointer(): Ptr[GtkTreeSortableIface] = this.raw

  @annotation.compileTimeOnly(
    "[field sort_column_changed]: Field is missing <type>"
  )
  private def sortColumnChanged__ = ???
  @annotation.compileTimeOnly(
    "[field get_sort_column_id]: Field is missing <type>"
  )
  private def getSortColumnId__ = ???
  @annotation.compileTimeOnly(
    "[field set_sort_column_id]: Field is missing <type>"
  )
  private def setSortColumnId__ = ???
  @annotation.compileTimeOnly("[field set_sort_func]: Field is missing <type>")
  private def setSortFunc__ = ???
  @annotation.compileTimeOnly(
    "[field set_default_sort_func]: Field is missing <type>"
  )
  private def setDefaultSortFunc__ = ???
  @annotation.compileTimeOnly(
    "[field has_default_sort_func]: Field is missing <type>"
  )
  private def hasDefaultSortFunc__ = ???
end TreeSortableIface

object TreeSortableIface:
  def fromRaw(ptr: Ptr[GtkTreeSortableIface]): TreeSortableIface =
    new TreeSortableIface(ptr)
end TreeSortableIface
