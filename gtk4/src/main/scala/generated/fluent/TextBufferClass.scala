package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ObjectClass
import sn.gnome.gtk4.internal.GtkTextBufferClass

/** The class structure for `GtkTextBuffer`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TextBufferClass private[gnome] (raw: Ptr[GtkTextBufferClass]):

  def getUnsafeRawPointer(): Ptr[GtkTextBufferClass] = this.raw

  /** The object class structure needs to be the first.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
  @annotation.compileTimeOnly("[field insert_text]: Field is missing <type>")
  private def insertText__ = ???
  @annotation.compileTimeOnly(
    "[field insert_paintable]: Field is missing <type>"
  )
  private def insertPaintable__ = ???
  @annotation.compileTimeOnly(
    "[field insert_child_anchor]: Field is missing <type>"
  )
  private def insertChildAnchor__ = ???
  @annotation.compileTimeOnly("[field delete_range]: Field is missing <type>")
  private def deleteRange__ = ???
  @annotation.compileTimeOnly("[field changed]: Field is missing <type>")
  private def changed__ = ???
  @annotation.compileTimeOnly(
    "[field modified_changed]: Field is missing <type>"
  )
  private def modifiedChanged__ = ???
  @annotation.compileTimeOnly("[field mark_set]: Field is missing <type>")
  private def markSet__ = ???
  @annotation.compileTimeOnly("[field mark_deleted]: Field is missing <type>")
  private def markDeleted__ = ???
  @annotation.compileTimeOnly("[field apply_tag]: Field is missing <type>")
  private def applyTag__ = ???
  @annotation.compileTimeOnly("[field remove_tag]: Field is missing <type>")
  private def removeTag__ = ???
  @annotation.compileTimeOnly(
    "[field begin_user_action]: Field is missing <type>"
  )
  private def beginUserAction__ = ???
  @annotation.compileTimeOnly(
    "[field end_user_action]: Field is missing <type>"
  )
  private def endUserAction__ = ???
  @annotation.compileTimeOnly("[field paste_done]: Field is missing <type>")
  private def pasteDone__ = ???
  @annotation.compileTimeOnly("[field undo]: Field is missing <type>")
  private def undo__ = ???
  @annotation.compileTimeOnly("[field redo]: Field is missing <type>")
  private def redo__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved1]: Field is missing <type>")
  private def GtkReserved1__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved2]: Field is missing <type>")
  private def GtkReserved2__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved3]: Field is missing <type>")
  private def GtkReserved3__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved4]: Field is missing <type>")
  private def GtkReserved4__ = ???
end TextBufferClass

object TextBufferClass:
  def fromRaw(ptr: Ptr[GtkTextBufferClass]): TextBufferClass =
    new TextBufferClass(ptr)
end TextBufferClass
