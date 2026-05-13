package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.Widget
import sn.gnome.gtk4.internal.GtkAssistantPage

/** `GtkAssistantPage` is an auxiliary object used by `GtkAssistant.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class AssistantPage private[gnome] (raw: Ptr[GtkAssistantPage])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Returns the child to which @page belongs.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChild()(using Runtime): sn.gnome.gtk4.Widget /* None */ =
    sn.gnome.gtk4.Widget.applyUnsafe(
      gtk_assistant_page_get_child(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAssistantPage]]
      ).asInstanceOf
    )
  end getChild

end AssistantPage

object AssistantPage:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkAssistantPage])(using Runtime) =
    summon[Runtime].getOrCreate[AssistantPage](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new AssistantPage(ptr)
    )

end AssistantPage
