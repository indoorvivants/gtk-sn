package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GMenuAttributeIter
import sn.gnome.glib.internal.GVariant
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object

class MenuAttributeIter(raw: Ptr[GMenuAttributeIter])
    extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getName()(using Zone): String = fromCString(
    g_menu_attribute_iter_get_name(this.raw.asInstanceOf).asInstanceOf
  )

  // Method get_next contains an OUT parameter, which is not supported yet

  def getValue(): Ptr[GVariant] = g_menu_attribute_iter_get_value(
    this.raw.asInstanceOf
  )

  def next(): Boolean =
    g_menu_attribute_iter_next(this.raw.asInstanceOf).value.!=(0)

end MenuAttributeIter
