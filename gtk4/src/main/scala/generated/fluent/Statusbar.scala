package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.guint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkStatusbar

class Statusbar(raw: Ptr[GtkStatusbar])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getContextId(context_description: String | CString)(using Zone): UInt =
    gtk_statusbar_get_context_id(
      this.raw.asInstanceOf,
      __sn_extract_string(context_description)
    ).value

  def pop(context_id: UInt): Unit =
    gtk_statusbar_pop(this.raw.asInstanceOf, guint(context_id))

  def push(context_id: UInt, text: String | CString)(using Zone): UInt =
    gtk_statusbar_push(
      this.raw.asInstanceOf,
      guint(context_id),
      __sn_extract_string(text)
    ).value

  def remove(context_id: UInt, message_id: UInt): Unit = gtk_statusbar_remove(
    this.raw.asInstanceOf,
    guint(context_id),
    guint(message_id)
  )

  def removeAll(context_id: UInt): Unit =
    gtk_statusbar_remove_all(this.raw.asInstanceOf, guint(context_id))

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Statusbar

object Statusbar:
  def apply(): Statusbar = new Statusbar(gtk_statusbar_new().asInstanceOf)
end Statusbar
