package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Actionable
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkButton

class Button(raw: Ptr[GtkButton])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Actionable,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getCanShrink(): Boolean =
    gtk_button_get_can_shrink(this.raw.asInstanceOf).value.!=(0)

  def getChild(): Widget = new Widget(
    gtk_button_get_child(this.raw.asInstanceOf).asInstanceOf
  )

  def getHasFrame(): Boolean =
    gtk_button_get_has_frame(this.raw.asInstanceOf).value.!=(0)

  def getIconName()(using Zone): String = fromCString(
    gtk_button_get_icon_name(this.raw.asInstanceOf).asInstanceOf
  )

  def getLabel()(using Zone): String = fromCString(
    gtk_button_get_label(this.raw.asInstanceOf).asInstanceOf
  )

  def getUseUnderline(): Boolean =
    gtk_button_get_use_underline(this.raw.asInstanceOf).value.!=(0)

  def setCanShrink(can_shrink: Boolean): Unit = gtk_button_set_can_shrink(
    this.raw.asInstanceOf,
    gboolean(gint((if can_shrink == true then 1 else 0)))
  )

  def setChild(child: Widget): Unit = gtk_button_set_child(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  def setHasFrame(has_frame: Boolean): Unit = gtk_button_set_has_frame(
    this.raw.asInstanceOf,
    gboolean(gint((if has_frame == true then 1 else 0)))
  )

  def setIconName(icon_name: String | CString)(using Zone): Unit =
    gtk_button_set_icon_name(
      this.raw.asInstanceOf,
      __sn_extract_string(icon_name)
    )

  def setLabel(label: String | CString)(using Zone): Unit =
    gtk_button_set_label(this.raw.asInstanceOf, __sn_extract_string(label))

  def setUseUnderline(use_underline: Boolean): Unit =
    gtk_button_set_use_underline(
      this.raw.asInstanceOf,
      gboolean(gint((if use_underline == true then 1 else 0)))
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Button

object Button:
  def apply(): Button = new Button(gtk_button_new().asInstanceOf)
  def fromIconName(icon_name: String | CString)(using Zone): Button =
    new Button(
      gtk_button_new_from_icon_name(__sn_extract_string(icon_name)).asInstanceOf
    )
  def withLabel(label: String | CString)(using Zone): Button = new Button(
    gtk_button_new_with_label(__sn_extract_string(label)).asInstanceOf
  )
  def withMnemonic(label: String | CString)(using Zone): Button = new Button(
    gtk_button_new_with_mnemonic(__sn_extract_string(label)).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Button
