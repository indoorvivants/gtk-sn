package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.MenuModel
import sn.gnome.gio.internal.GMenuLinkIter
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * #GMenuLinkIter is an opaque structure type. You must access it using the
  * functions below.
  */
class MenuLinkIter(raw: Ptr[GMenuLinkIter]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the name of the link at the current iterator position.
    *
    * The iterator is not advanced.
    */
  def getName()(using Zone): String /* None */ = fromCString(
    g_menu_link_iter_get_name(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This function combines g_menu_link_iter_next() with
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
    */
  @annotation.compileTimeOnly(
    "Method get_next contains an OUT parameter, which is not supported yet"
  )
  private def getNext__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the linked #GMenuModel at the current iterator position.
    *
    * The iterator is not advanced.
    */
  def getValue(): MenuModel /* None */ = new MenuModel(
    g_menu_link_iter_get_value(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Attempts to advance the iterator to the next (possibly first) link.
    *
    * %TRUE is returned on success, or %FALSE if there are no more links.
    *
    * You must call this function when you first acquire the iterator to advance
    * it to the first link (and determine if the first link exists at all).
    */
  def next(): Boolean /* None */ =
    g_menu_link_iter_next(this.raw.asInstanceOf).value.!=(0)

end MenuLinkIter
