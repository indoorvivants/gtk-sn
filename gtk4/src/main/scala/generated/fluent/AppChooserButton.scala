package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.Icon
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.AppChooser
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkAppChooserButton

class AppChooserButton(raw: Ptr[GtkAppChooserButton])
    extends Widget(raw.asInstanceOf),
      Accessible,
      AppChooser,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def appendCustomItem(
      name: String | CString,
      label: String | CString,
      icon: Icon
  )(using Zone): Unit = gtk_app_chooser_button_append_custom_item(
    this.raw.asInstanceOf,
    __sn_extract_string(name),
    __sn_extract_string(label),
    icon.getUnsafeRawPointer().asInstanceOf
  )

  def appendSeparator(): Unit = gtk_app_chooser_button_append_separator(
    this.raw.asInstanceOf
  )

  def getHeading()(using Zone): String = fromCString(
    gtk_app_chooser_button_get_heading(this.raw.asInstanceOf).asInstanceOf
  )

  def getModal(): Boolean =
    gtk_app_chooser_button_get_modal(this.raw.asInstanceOf).value.!=(0)

  def getShowDefaultItem(): Boolean =
    gtk_app_chooser_button_get_show_default_item(this.raw.asInstanceOf).value
      .!=(0)

  def getShowDialogItem(): Boolean =
    gtk_app_chooser_button_get_show_dialog_item(this.raw.asInstanceOf).value
      .!=(0)

  def setActiveCustomItem(name: String | CString)(using Zone): Unit =
    gtk_app_chooser_button_set_active_custom_item(
      this.raw.asInstanceOf,
      __sn_extract_string(name)
    )

  def setHeading(heading: String | CString)(using Zone): Unit =
    gtk_app_chooser_button_set_heading(
      this.raw.asInstanceOf,
      __sn_extract_string(heading)
    )

  def setModal(modal: Boolean): Unit = gtk_app_chooser_button_set_modal(
    this.raw.asInstanceOf,
    gboolean(gint((if modal == true then 1 else 0)))
  )

  def setShowDefaultItem(setting: Boolean): Unit =
    gtk_app_chooser_button_set_show_default_item(
      this.raw.asInstanceOf,
      gboolean(gint((if setting == true then 1 else 0)))
    )

  def setShowDialogItem(setting: Boolean): Unit =
    gtk_app_chooser_button_set_show_dialog_item(
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
end AppChooserButton

object AppChooserButton:
  def apply(content_type: String | CString)(using Zone): AppChooserButton =
    new AppChooserButton(
      gtk_app_chooser_button_new(__sn_extract_string(content_type)).asInstanceOf
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end AppChooserButton
