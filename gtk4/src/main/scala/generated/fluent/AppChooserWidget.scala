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

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkAppChooserWidget` is a widget for selecting applications.
  *
  * It is the main building block for [class@Gtk.AppChooserDialog]. Most
  * applications only need to use the latter; but you can use this widget as
  * part of a larger widget if you have special needs.
  *
  * `GtkAppChooserWidget` offers detailed control over what applications are
  * shown, using the [property@Gtk.AppChooserWidget:show-default],
  * [property@Gtk.AppChooserWidget:show-recommended],
  * [property@Gtk.AppChooserWidget:show-fallback],
  * [property@Gtk.AppChooserWidget:show-other] and
  * [property@Gtk.AppChooserWidget:show-all] properties. See the
  * [iface@Gtk.AppChooser] documentation for more information about these groups
  * of applications.
  *
  * To keep track of the selected application, use the
  * [signal@Gtk.AppChooserWidget::application-selected] and
  * [signal@Gtk.AppChooserWidget::application-activated] signals.
  *
  * ## CSS nodes
  *
  * `GtkAppChooserWidget` has a single CSS node with name appchooser.
  */
class AppChooserWidget(raw: Ptr[GtkAppChooserWidget])
    extends Widget(raw.asInstanceOf),
      Accessible,
      AppChooser,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the text that is shown if there are not applications that can
    * handle the content type.
    */
  def getDefaultText()(using Zone): String /* None */ = fromCString(
    gtk_app_chooser_widget_get_default_text(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether the app chooser should show all applications in a flat list.
    */
  def getShowAll(): Boolean /* None */ =
    gtk_app_chooser_widget_get_show_all(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether the app chooser should show the default handler for the
    * content type in a separate section.
    */
  def getShowDefault(): Boolean /* None */ =
    gtk_app_chooser_widget_get_show_default(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether the app chooser should show related applications for the
    * content type in a separate section.
    */
  def getShowFallback(): Boolean /* None */ =
    gtk_app_chooser_widget_get_show_fallback(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether the app chooser should show applications which are unrelated
    * to the content type.
    */
  def getShowOther(): Boolean /* None */ =
    gtk_app_chooser_widget_get_show_other(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether the app chooser should show recommended applications for the
    * content type in a separate section.
    */
  def getShowRecommended(): Boolean /* None */ =
    gtk_app_chooser_widget_get_show_recommended(this.raw.asInstanceOf).value
      .!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the text that is shown if there are not applications that can handle
    * the content type.
    */
  def setDefaultText(
      text: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_app_chooser_widget_set_default_text(
    this.raw.asInstanceOf,
    __sn_extract_string(text)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the app chooser should show all applications in a flat list.
    */
  def setShowAll(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_app_chooser_widget_set_show_all(
    this.raw.asInstanceOf,
    gboolean(gint((if setting == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the app chooser should show the default handler for the
    * content type in a separate section.
    */
  def setShowDefault(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_app_chooser_widget_set_show_default(
    this.raw.asInstanceOf,
    gboolean(gint((if setting == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the app chooser should show related applications for the
    * content type in a separate section.
    */
  def setShowFallback(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_app_chooser_widget_set_show_fallback(
    this.raw.asInstanceOf,
    gboolean(gint((if setting == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the app chooser should show applications which are unrelated
    * to the content type.
    */
  def setShowOther(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_app_chooser_widget_set_show_other(
    this.raw.asInstanceOf,
    gboolean(gint((if setting == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the app chooser should show recommended applications for the
    * content type in a separate section.
    */
  def setShowRecommended(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_app_chooser_widget_set_show_recommended(
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
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkAppChooserWidget` for applications that can handle
    * content of the given type.
    */
  def apply(
      content_type: String | CString /* Some(CString) */
  )(using Zone): AppChooserWidget = new AppChooserWidget(
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
