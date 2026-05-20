package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.WidgetClass
import sn.gnome.gtk4.internal.GtkComboBoxClass

class ComboBoxClass private[gnome] (raw: Ptr[GtkComboBoxClass]):

  def getUnsafeRawPointer(): Ptr[GtkComboBoxClass] = this.raw

  /** The parent class.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def parentClass: sn.gnome.gtk4.WidgetClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkWidgetClass]
  @annotation.compileTimeOnly("[field changed]: Field is missing <type>")
  private def changed__ = ???
  @annotation.compileTimeOnly(
    "[field format_entry_text]: Field is missing <type>"
  )
  private def formatEntryText__ = ???
  @annotation.compileTimeOnly("[field activate]: Field is missing <type>")
  private def activate__ = ???

end ComboBoxClass

object ComboBoxClass:
  def fromRaw(ptr: Ptr[GtkComboBoxClass]): ComboBoxClass = new ComboBoxClass(
    ptr
  )
end ComboBoxClass
