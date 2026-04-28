package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.internal.GtkTextChildAnchor

class TextChildAnchor(raw: Ptr[GtkTextChildAnchor])
    extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getDeleted(): Boolean =
    gtk_text_child_anchor_get_deleted(this.raw.asInstanceOf).value.!=(0)

  // Method get_widgets contains an OUT parameter, which is not supported yet

end TextChildAnchor

object TextChildAnchor:
  def apply(): TextChildAnchor = new TextChildAnchor(
    gtk_text_child_anchor_new().asInstanceOf
  )
  def withReplacement(
      character: String | CString
  )(using Zone): TextChildAnchor = new TextChildAnchor(
    gtk_text_child_anchor_new_with_replacement(
      __sn_extract_string(character)
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
end TextChildAnchor
