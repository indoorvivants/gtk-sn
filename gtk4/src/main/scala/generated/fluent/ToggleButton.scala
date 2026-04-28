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
import sn.gnome.gtk4.fluent.ToggleButton
import sn.gnome.gtk4.internal.GtkToggleButton

class ToggleButton(raw: Ptr[GtkToggleButton])
    extends Button(raw.asInstanceOf),
      Accessible,
      Actionable,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getActive(): Boolean =
    gtk_toggle_button_get_active(this.raw.asInstanceOf).value.!=(0)

  def setActive(is_active: Boolean): Unit = gtk_toggle_button_set_active(
    this.raw.asInstanceOf,
    gboolean(gint((if is_active == true then 1 else 0)))
  )

  def setGroup(group: ToggleButton): Unit = gtk_toggle_button_set_group(
    this.raw.asInstanceOf,
    group.getUnsafeRawPointer().asInstanceOf
  )

  def toggled(): Unit = gtk_toggle_button_toggled(this.raw.asInstanceOf)

end ToggleButton

object ToggleButton:
  def apply(): ToggleButton = new ToggleButton(
    gtk_toggle_button_new().asInstanceOf
  )
  def withLabel(label: String | CString)(using Zone): ToggleButton =
    new ToggleButton(
      gtk_toggle_button_new_with_label(__sn_extract_string(label)).asInstanceOf
    )
  def withMnemonic(label: String | CString)(using Zone): ToggleButton =
    new ToggleButton(
      gtk_toggle_button_new_with_mnemonic(
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
end ToggleButton
