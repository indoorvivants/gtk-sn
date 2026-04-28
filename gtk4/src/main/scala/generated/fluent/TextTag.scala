package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.internal.GtkTextTag

class TextTag(raw: Ptr[GtkTextTag]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def changed(size_changed: Boolean): Unit = gtk_text_tag_changed(
    this.raw.asInstanceOf,
    gboolean(gint((if size_changed == true then 1 else 0)))
  )

  def getPriority(): Int = gtk_text_tag_get_priority(this.raw.asInstanceOf)

  def setPriority(priority: Int): Unit =
    gtk_text_tag_set_priority(this.raw.asInstanceOf, priority)

end TextTag

object TextTag:
  def apply(name: String | CString)(using Zone): TextTag = new TextTag(
    gtk_text_tag_new(__sn_extract_string(name)).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end TextTag
