package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.gpointer
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.fluent.Object
import sn.gnome.pango.fluent.Font
import sn.gnome.pango.internal.PangoFontMetrics
import sn.gnome.pango.internal.PangoFontset
import sn.gnome.pango.internal.PangoFontsetForeachFunc

class Fontset(raw: Ptr[PangoFontset]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def foreach(func: PangoFontsetForeachFunc, data: Ptr[Byte]): Unit =
    pango_fontset_foreach(this.raw.asInstanceOf, func, gpointer(data))

  def getFont(wc: UInt): Font = new Font(
    pango_fontset_get_font(this.raw.asInstanceOf, guint(wc)).asInstanceOf
  )

  def getMetrics(): Ptr[PangoFontMetrics] = pango_fontset_get_metrics(
    this.raw.asInstanceOf
  )

end Fontset
