package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GListModelInterface
import sn.gnome.gobject.TypeInterface

/** The virtual function table for #GListModel.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ListModelInterface private[gnome] (raw: Ptr[GListModelInterface]):

  def getUnsafeRawPointer(): Ptr[GListModelInterface] = this.raw

  /** parent #GTypeInterface
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def gIface: sn.gnome.gobject.TypeInterface /* None */ =
    (!raw).g_iface.asInstanceOf[_root_.sn.gnome.gobject.internal.GTypeInterface]
  @annotation.compileTimeOnly("[field get_item_type]: Field is missing <type>")
  private def getItemType__ = ???
  @annotation.compileTimeOnly("[field get_n_items]: Field is missing <type>")
  private def getNItems__ = ???
  @annotation.compileTimeOnly("[field get_item]: Field is missing <type>")
  private def getItem__ = ???
end ListModelInterface

object ListModelInterface:
  def fromRaw(ptr: Ptr[GListModelInterface]): ListModelInterface =
    new ListModelInterface(ptr)
end ListModelInterface
