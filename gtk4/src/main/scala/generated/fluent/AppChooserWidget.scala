package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.AppChooser
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkAppChooserWidget

class AppChooserWidget(raw: Ptr[GtkAppChooserWidget])
    extends Widget(raw.asInstanceOf),
      Accessible,
      AppChooser,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getDefaultText()(using Zone): String = fromCString(
    gtk_app_chooser_widget_get_default_text(this.raw.asInstanceOf).asInstanceOf
  )

  def getShowAll(): Boolean =
    gtk_app_chooser_widget_get_show_all(this.raw.asInstanceOf).value.!=(0)

  def getShowDefault(): Boolean =
    gtk_app_chooser_widget_get_show_default(this.raw.asInstanceOf).value.!=(0)

  def getShowFallback(): Boolean =
    gtk_app_chooser_widget_get_show_fallback(this.raw.asInstanceOf).value.!=(0)

  def getShowOther(): Boolean =
    gtk_app_chooser_widget_get_show_other(this.raw.asInstanceOf).value.!=(0)

  def getShowRecommended(): Boolean =
    gtk_app_chooser_widget_get_show_recommended(this.raw.asInstanceOf).value
      .!=(0)

  def setDefaultText(text: String | CString)(using Zone): Unit =
    gtk_app_chooser_widget_set_default_text(
      this.raw.asInstanceOf,
      __sn_extract_string(text)
    )

  def setShowAll(setting: Boolean): Unit = gtk_app_chooser_widget_set_show_all(
    this.raw.asInstanceOf,
    gboolean(gint((if setting == true then 1 else 0)))
  )

  def setShowDefault(setting: Boolean): Unit =
    gtk_app_chooser_widget_set_show_default(
      this.raw.asInstanceOf,
      gboolean(gint((if setting == true then 1 else 0)))
    )

  def setShowFallback(setting: Boolean): Unit =
    gtk_app_chooser_widget_set_show_fallback(
      this.raw.asInstanceOf,
      gboolean(gint((if setting == true then 1 else 0)))
    )

  def setShowOther(setting: Boolean): Unit =
    gtk_app_chooser_widget_set_show_other(
      this.raw.asInstanceOf,
      gboolean(gint((if setting == true then 1 else 0)))
    )

  def setShowRecommended(setting: Boolean): Unit =
    gtk_app_chooser_widget_set_show_recommended(
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
end AppChooserWidget

object AppChooserWidget:
  def apply(content_type: String | CString)(using Zone): AppChooserWidget =
    new AppChooserWidget(
      gtk_app_chooser_widget_new(__sn_extract_string(content_type)).asInstanceOf
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end AppChooserWidget
