package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.MenuModel
import sn.gnome.gio.internal.GMenuLinkIter
import sn.gnome.glib.internal.{gboolean, gchar, gint}
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*

/** #GMenuLinkIter is an opaque structure type. You must access it using the
  * functions below.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class MenuLinkIter private[gnome] (raw: Ptr[GMenuLinkIter])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the name of the link at the current iterator position.
    *
    * The iterator is not advanced.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getName()(using Zone): String /* None */ =
    fromCString(
      g_menu_link_iter_get_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GMenuLinkIter]]
      ).asInstanceOf
    )
  end getName

  /** This function combines g_menu_link_iter_next() with
    * g_menu_link_iter_get_name() and g_menu_link_iter_get_value().
    *
    * First the iterator is advanced to the next (possibly first) link. If that
    * fails, then %FALSE is returned and there are no other effects.
    *
    * If successful, @out_link and @value are set to the name and #GMenuModel of
    * the link that has just been advanced to. At this point,
    * g_menu_link_iter_get_name() and g_menu_link_iter_get_value() will return
    * the same values again.
    *
    * The value returned in @out_link remains valid for as long as the iterator
    * remains at the current position. The value returned in @value must be
    * unreffed using g_object_unref() when it is no longer in use.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_next]: Method get_next contains an OUT parameter, which is not supported yet"
  )
  private def getNext__ = ???

  /** Gets the linked #GMenuModel at the current iterator position.
    *
    * The iterator is not advanced.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getValue()(using Runtime): sn.gnome.gio.MenuModel /* None */ =
    sn.gnome.gio.MenuModel.applyUnsafe(
      g_menu_link_iter_get_value(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GMenuLinkIter]]
      ).asInstanceOf
    )
  end getValue

  /** Attempts to advance the iterator to the next (possibly first) link.
    *
    * %TRUE is returned on success, or %FALSE if there are no more links.
    *
    * You must call this function when you first acquire the iterator to advance
    * it to the first link (and determine if the first link exists at all).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def next(): Boolean /* None */ =
    g_menu_link_iter_next(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GMenuLinkIter]]
    ).value.!=(0)
  end next

end MenuLinkIter

object MenuLinkIter:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GMenuLinkIter])(using Runtime) =
    summon[Runtime].getOrCreate[MenuLinkIter](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new MenuLinkIter(ptr)
    )

end MenuLinkIter
