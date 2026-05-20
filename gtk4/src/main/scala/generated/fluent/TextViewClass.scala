package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.WidgetClass
import sn.gnome.gtk4.internal.GtkTextViewClass

class TextViewClass private[gnome] (raw: Ptr[GtkTextViewClass]):

  def getUnsafeRawPointer(): Ptr[GtkTextViewClass] = this.raw

  /** The object class structure needs to be the first
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def parentClass: sn.gnome.gtk4.WidgetClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkWidgetClass]
  @annotation.compileTimeOnly("[field move_cursor]: Field is missing <type>")
  private def moveCursor__ = ???
  @annotation.compileTimeOnly("[field set_anchor]: Field is missing <type>")
  private def setAnchor__ = ???
  @annotation.compileTimeOnly(
    "[field insert_at_cursor]: Field is missing <type>"
  )
  private def insertAtCursor__ = ???
  @annotation.compileTimeOnly(
    "[field delete_from_cursor]: Field is missing <type>"
  )
  private def deleteFromCursor__ = ???
  @annotation.compileTimeOnly("[field backspace]: Field is missing <type>")
  private def backspace__ = ???
  @annotation.compileTimeOnly("[field cut_clipboard]: Field is missing <type>")
  private def cutClipboard__ = ???
  @annotation.compileTimeOnly("[field copy_clipboard]: Field is missing <type>")
  private def copyClipboard__ = ???
  @annotation.compileTimeOnly(
    "[field paste_clipboard]: Field is missing <type>"
  )
  private def pasteClipboard__ = ???
  @annotation.compileTimeOnly(
    "[field toggle_overwrite]: Field is missing <type>"
  )
  private def toggleOverwrite__ = ???
  @annotation.compileTimeOnly("[field create_buffer]: Field is missing <type>")
  private def createBuffer__ = ???
  @annotation.compileTimeOnly("[field snapshot_layer]: Field is missing <type>")
  private def snapshotLayer__ = ???
  @annotation.compileTimeOnly(
    "[field extend_selection]: Field is missing <type>"
  )
  private def extendSelection__ = ???
  @annotation.compileTimeOnly("[field insert_emoji]: Field is missing <type>")
  private def insertEmoji__ = ???

end TextViewClass

object TextViewClass:
  def fromRaw(ptr: Ptr[GtkTextViewClass]): TextViewClass = new TextViewClass(
    ptr
  )
end TextViewClass
