package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.fluent.Display
import sn.gnome.gdk4.fluent.Event
import sn.gnome.gdk4.internal.GdkKeyMatch
import sn.gnome.glib.internal.GString
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.ShortcutTrigger
import sn.gnome.gtk4.internal.GtkShortcutTrigger

class ShortcutTrigger(raw: Ptr[GtkShortcutTrigger])
    extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def compare(trigger2: ShortcutTrigger): Int = gtk_shortcut_trigger_compare(
    this.raw.asInstanceOf,
    trigger2.getUnsafeRawPointer().asInstanceOf
  )

  def equal(trigger2: ShortcutTrigger): Boolean = gtk_shortcut_trigger_equal(
    this.raw.asInstanceOf,
    trigger2.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

  def hash(): UInt = gtk_shortcut_trigger_hash(this.raw.asInstanceOf).value

  def print(string: Ptr[GString]): Unit =
    gtk_shortcut_trigger_print(this.raw.asInstanceOf, string)

  def printLabel(display: Display, string: Ptr[GString]): Boolean =
    gtk_shortcut_trigger_print_label(
      this.raw.asInstanceOf,
      display.getUnsafeRawPointer().asInstanceOf,
      string
    ).value.!=(0)

  def toLabel(display: Display)(using Zone): String = fromCString(
    gtk_shortcut_trigger_to_label(
      this.raw.asInstanceOf,
      display.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  def toString()(using Zone): String = fromCString(
    gtk_shortcut_trigger_to_string(this.raw.asInstanceOf).asInstanceOf
  )

  def trigger(event: Event, enable_mnemonics: Boolean): GdkKeyMatch =
    gtk_shortcut_trigger_trigger(
      this.raw.asInstanceOf,
      event.getUnsafeRawPointer().asInstanceOf,
      gboolean(gint((if enable_mnemonics == true then 1 else 0)))
    )

end ShortcutTrigger

object ShortcutTrigger:
  def parseString(string: String | CString)(using Zone): ShortcutTrigger =
    new ShortcutTrigger(
      gtk_shortcut_trigger_parse_string(
        __sn_extract_string(string)
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
end ShortcutTrigger
