package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ObjectClass
import sn.gnome.gtk4.internal.GtkPrintOperationClass

class PrintOperationClass private[gnome] (raw: Ptr[GtkPrintOperationClass]):

  def getUnsafeRawPointer(): Ptr[GtkPrintOperationClass] = this.raw

  /** The parent class.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
  @annotation.compileTimeOnly("[field done]: Field is missing <type>")
  private def done__ = ???
  @annotation.compileTimeOnly("[field begin_print]: Field is missing <type>")
  private def beginPrint__ = ???
  @annotation.compileTimeOnly("[field paginate]: Field is missing <type>")
  private def paginate__ = ???
  @annotation.compileTimeOnly(
    "[field request_page_setup]: Field is missing <type>"
  )
  private def requestPageSetup__ = ???
  @annotation.compileTimeOnly("[field draw_page]: Field is missing <type>")
  private def drawPage__ = ???
  @annotation.compileTimeOnly("[field end_print]: Field is missing <type>")
  private def endPrint__ = ???
  @annotation.compileTimeOnly("[field status_changed]: Field is missing <type>")
  private def statusChanged__ = ???
  @annotation.compileTimeOnly(
    "[field create_custom_widget]: Field is missing <type>"
  )
  private def createCustomWidget__ = ???
  @annotation.compileTimeOnly(
    "[field custom_widget_apply]: Field is missing <type>"
  )
  private def customWidgetApply__ = ???
  @annotation.compileTimeOnly("[field preview]: Field is missing <type>")
  private def preview__ = ???
  @annotation.compileTimeOnly(
    "[field update_custom_widget]: Field is missing <type>"
  )
  private def updateCustomWidget__ = ???

end PrintOperationClass

object PrintOperationClass:
  def fromRaw(ptr: Ptr[GtkPrintOperationClass]): PrintOperationClass =
    new PrintOperationClass(ptr)
end PrintOperationClass
