package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Actionable
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.CheckButton
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkCheckButton

class CheckButton(raw: Ptr[GtkCheckButton])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Actionable,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getActive(): Boolean =
    gtk_check_button_get_active(this.raw.asInstanceOf).value.!=(0)

  def getChild(): Widget = new Widget(
    gtk_check_button_get_child(this.raw.asInstanceOf).asInstanceOf
  )

  def getInconsistent(): Boolean =
    gtk_check_button_get_inconsistent(this.raw.asInstanceOf).value.!=(0)

  def getLabel()(using Zone): String = fromCString(
    gtk_check_button_get_label(this.raw.asInstanceOf).asInstanceOf
  )

  def getUseUnderline(): Boolean =
    gtk_check_button_get_use_underline(this.raw.asInstanceOf).value.!=(0)

  def setActive(setting: Boolean): Unit = gtk_check_button_set_active(
    this.raw.asInstanceOf,
    gboolean(gint((if setting == true then 1 else 0)))
  )

  def setChild(child: Widget): Unit = gtk_check_button_set_child(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  def setGroup(group: CheckButton): Unit = gtk_check_button_set_group(
    this.raw.asInstanceOf,
    group.getUnsafeRawPointer().asInstanceOf
  )

  def setInconsistent(inconsistent: Boolean): Unit =
    gtk_check_button_set_inconsistent(
      this.raw.asInstanceOf,
      gboolean(gint((if inconsistent == true then 1 else 0)))
    )

  def setLabel(label: String | CString)(using Zone): Unit =
    gtk_check_button_set_label(
      this.raw.asInstanceOf,
      __sn_extract_string(label)
    )

  def setUseUnderline(setting: Boolean): Unit =
    gtk_check_button_set_use_underline(
      this.raw.asInstanceOf,
      gboolean(gint((if setting == true then 1 else 0)))
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end CheckButton

object CheckButton:
  def apply(): CheckButton = new CheckButton(
    gtk_check_button_new().asInstanceOf
  )
  def withLabel(label: String | CString)(using Zone): CheckButton =
    new CheckButton(
      gtk_check_button_new_with_label(__sn_extract_string(label)).asInstanceOf
    )
  def withMnemonic(label: String | CString)(using Zone): CheckButton =
    new CheckButton(
      gtk_check_button_new_with_mnemonic(
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
end CheckButton
