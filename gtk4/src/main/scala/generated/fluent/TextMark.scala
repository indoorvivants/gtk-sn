package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.TextBuffer
import sn.gnome.gtk4.internal.GtkTextMark

class TextMark(raw: Ptr[GtkTextMark]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getBuffer(): TextBuffer = new TextBuffer(
    gtk_text_mark_get_buffer(this.raw.asInstanceOf).asInstanceOf
  )

  def getDeleted(): Boolean =
    gtk_text_mark_get_deleted(this.raw.asInstanceOf).value.!=(0)

  def getLeftGravity(): Boolean =
    gtk_text_mark_get_left_gravity(this.raw.asInstanceOf).value.!=(0)

  def getName()(using Zone): String = fromCString(
    gtk_text_mark_get_name(this.raw.asInstanceOf).asInstanceOf
  )

  def getVisible(): Boolean =
    gtk_text_mark_get_visible(this.raw.asInstanceOf).value.!=(0)

  def setVisible(setting: Boolean): Unit = gtk_text_mark_set_visible(
    this.raw.asInstanceOf,
    gboolean(gint((if setting == true then 1 else 0)))
  )

end TextMark

object TextMark:
  def apply(name: String | CString, left_gravity: Boolean)(using
      Zone
  ): TextMark = new TextMark(
    gtk_text_mark_new(
      __sn_extract_string(name),
      gboolean(gint((if left_gravity == true then 1 else 0)))
    ).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end TextMark
