package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.WidgetClass
import sn.gnome.gtk4.internal.GtkTreeViewClass

class TreeViewClass private[gnome] (raw: Ptr[GtkTreeViewClass]):

  def getUnsafeRawPointer(): Ptr[GtkTreeViewClass] = this.raw

  def parentClass: sn.gnome.gtk4.WidgetClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkWidgetClass]
  @annotation.compileTimeOnly("[field row_activated]: Field is missing <type>")
  private def rowActivated__ = ???
  @annotation.compileTimeOnly(
    "[field test_expand_row]: Field is missing <type>"
  )
  private def testExpandRow__ = ???
  @annotation.compileTimeOnly(
    "[field test_collapse_row]: Field is missing <type>"
  )
  private def testCollapseRow__ = ???
  @annotation.compileTimeOnly("[field row_expanded]: Field is missing <type>")
  private def rowExpanded__ = ???
  @annotation.compileTimeOnly("[field row_collapsed]: Field is missing <type>")
  private def rowCollapsed__ = ???
  @annotation.compileTimeOnly(
    "[field columns_changed]: Field is missing <type>"
  )
  private def columnsChanged__ = ???
  @annotation.compileTimeOnly("[field cursor_changed]: Field is missing <type>")
  private def cursorChanged__ = ???
  @annotation.compileTimeOnly("[field move_cursor]: Field is missing <type>")
  private def moveCursor__ = ???
  @annotation.compileTimeOnly("[field select_all]: Field is missing <type>")
  private def selectAll__ = ???
  @annotation.compileTimeOnly("[field unselect_all]: Field is missing <type>")
  private def unselectAll__ = ???
  @annotation.compileTimeOnly(
    "[field select_cursor_row]: Field is missing <type>"
  )
  private def selectCursorRow__ = ???
  @annotation.compileTimeOnly(
    "[field toggle_cursor_row]: Field is missing <type>"
  )
  private def toggleCursorRow__ = ???
  @annotation.compileTimeOnly(
    "[field expand_collapse_cursor_row]: Field is missing <type>"
  )
  private def expandCollapseCursorRow__ = ???
  @annotation.compileTimeOnly(
    "[field select_cursor_parent]: Field is missing <type>"
  )
  private def selectCursorParent__ = ???
  @annotation.compileTimeOnly(
    "[field start_interactive_search]: Field is missing <type>"
  )
  private def startInteractiveSearch__ = ???

end TreeViewClass

object TreeViewClass:
  def fromRaw(ptr: Ptr[GtkTreeViewClass]): TreeViewClass = new TreeViewClass(
    ptr
  )
end TreeViewClass
