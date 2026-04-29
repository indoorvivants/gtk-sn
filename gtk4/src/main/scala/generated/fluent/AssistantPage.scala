package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkAssistantPage

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkAssistantPage` is an auxiliary object used by `GtkAssistant.
  */
class AssistantPage(raw: Ptr[GtkAssistantPage])
    extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the child to which @page belongs.
    */
  def getChild(): Widget = new Widget(
    gtk_assistant_page_get_child(this.raw.asInstanceOf).asInstanceOf
  )

end AssistantPage
