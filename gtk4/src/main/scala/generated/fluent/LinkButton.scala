package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Actionable
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.Button
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.internal.GtkLinkButton

class LinkButton(raw: Ptr[GtkLinkButton])
    extends Button(raw.asInstanceOf),
      Accessible,
      Actionable,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getUri()(using Zone): String = fromCString(
    gtk_link_button_get_uri(this.raw.asInstanceOf).asInstanceOf
  )

  def getVisited(): Boolean =
    gtk_link_button_get_visited(this.raw.asInstanceOf).value.!=(0)

  def setUri(uri: String | CString)(using Zone): Unit =
    gtk_link_button_set_uri(this.raw.asInstanceOf, __sn_extract_string(uri))

  def setVisited(visited: Boolean): Unit = gtk_link_button_set_visited(
    this.raw.asInstanceOf,
    gboolean(gint((if visited == true then 1 else 0)))
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end LinkButton

object LinkButton:
  def apply(uri: String | CString)(using Zone): LinkButton = new LinkButton(
    gtk_link_button_new(__sn_extract_string(uri)).asInstanceOf
  )
  def withLabel(uri: String | CString, label: String | CString)(using
      Zone
  ): LinkButton = new LinkButton(
    gtk_link_button_new_with_label(
      __sn_extract_string(uri),
      __sn_extract_string(label)
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
end LinkButton
