package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{
  Accessible,
  Buildable,
  ConstraintTarget,
  Orientable,
  Scrollable,
  Widget
}
import sn.gnome.gtk4.internal.GtkListBase

/** `GtkListBase` is the abstract base class for GTK's list widgets.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ListBase private[gnome] (raw: Ptr[GtkListBase])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Orientable,
      Scrollable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end ListBase

object ListBase:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkListBase])(using Runtime) = summon[Runtime]
    .getOrCreate[ListBase](ptr.asInstanceOf[Ptr[Byte]], p => new ListBase(ptr))

end ListBase
