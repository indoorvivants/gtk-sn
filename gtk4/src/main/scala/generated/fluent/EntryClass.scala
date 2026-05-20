package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.WidgetClass
import sn.gnome.gtk4.internal.GtkEntryClass

/** Class structure for `GtkEntry`. All virtual functions have a default
  * implementation. Derived classes may set the virtual function pointers for
  * the signal handlers to %NULL, but must keep @get_text_area_size and
  * @get_frame_size
  *   non-%NULL; either use the default implementation, or provide a custom one.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class EntryClass private[gnome] (raw: Ptr[GtkEntryClass]):

  def getUnsafeRawPointer(): Ptr[GtkEntryClass] = this.raw

  /** The parent class.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def parentClass: sn.gnome.gtk4.WidgetClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkWidgetClass]
  @annotation.compileTimeOnly("[field activate]: Field is missing <type>")
  private def activate__ = ???

end EntryClass

object EntryClass:
  def fromRaw(ptr: Ptr[GtkEntryClass]): EntryClass = new EntryClass(ptr)
end EntryClass
