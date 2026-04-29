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

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The `GtkAppChooserButton` lets the user select an application.
  *
  * ![An example GtkAppChooserButton](appchooserbutton.png)
  *
  * Initially, a `GtkAppChooserButton` selects the first application in its
  * list, which will either be the most-recently used application or, if
  * [property@Gtk.AppChooserButton:show-default-item] is %TRUE, the default
  * application.
  *
  * The list of applications shown in a `GtkAppChooserButton` includes the
  * recommended applications for the given content type. When
  * [property@Gtk.AppChooserButton:show-default-item] is set, the default
  * application is also included. To let the user chooser other applications,
  * you can set the [property@Gtk.AppChooserButton:show-dialog-item] property,
  * which allows to open a full [class@Gtk.AppChooserDialog].
  *
  * It is possible to add custom items to the list, using
  * [method@Gtk.AppChooserButton.append_custom_item]. These items cause the
  * [signal@Gtk.AppChooserButton::custom-item-activated] signal to be emitted
  * when they are selected.
  *
  * To track changes in the selected application, use the
  * [signal@Gtk.AppChooserButton::changed] signal.
  *
  * ## CSS nodes
  *
  * `GtkAppChooserButton` has a single CSS node with the name
  * “appchooserbutton”.
  */
class AppChooserButton(raw: Ptr[GtkAppChooserButton])
    extends Widget(raw.asInstanceOf),
      Accessible,
      AppChooser,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Appends a custom item to the list of applications that is shown in the
    * popup.
    *
    * The item name must be unique per-widget. Clients can use the provided name
    * as a detail for the [signal@Gtk.AppChooserButton::custom-item-activated]
    * signal, to add a callback for the activation of a particular custom item
    * in the list.
    *
    * See also [method@Gtk.AppChooserButton.append_separator].
    */
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Appends a separator to the list of applications that is shown in the
    * popup.
    */
  def appendSeparator(): Unit = gtk_app_chooser_button_append_separator(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the text to display at the top of the dialog.
    */
  def getHeading()(using Zone): String = fromCString(
    gtk_app_chooser_button_get_heading(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether the dialog is modal.
    */
  def getModal(): Boolean =
    gtk_app_chooser_button_get_modal(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the dropdown menu should show the default application at
    * the top.
    */
  def getShowDefaultItem(): Boolean =
    gtk_app_chooser_button_get_show_default_item(this.raw.asInstanceOf).value
      .!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the dropdown menu shows an item for a
    * `GtkAppChooserDialog`.
    */
  def getShowDialogItem(): Boolean =
    gtk_app_chooser_button_get_show_dialog_item(this.raw.asInstanceOf).value
      .!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Selects a custom item.
    *
    * See [method@Gtk.AppChooserButton.append_custom_item].
    *
    * Use [method@Gtk.AppChooser.refresh] to bring the selection to its initial
    * state.
    */
  def setActiveCustomItem(name: String | CString)(using Zone): Unit =
    gtk_app_chooser_button_set_active_custom_item(
      this.raw.asInstanceOf,
      __sn_extract_string(name)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the text to display at the top of the dialog.
    *
    * If the heading is not set, the dialog displays a default text.
    */
  def setHeading(heading: String | CString)(using Zone): Unit =
    gtk_app_chooser_button_set_heading(
      this.raw.asInstanceOf,
      __sn_extract_string(heading)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the dialog should be modal.
    */
  def setModal(modal: Boolean): Unit = gtk_app_chooser_button_set_modal(
    this.raw.asInstanceOf,
    gboolean(gint((if modal == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the dropdown menu of this button should show the default
    * application for the given content type at top.
    */
  def setShowDefaultItem(setting: Boolean): Unit =
    gtk_app_chooser_button_set_show_default_item(
      this.raw.asInstanceOf,
      gboolean(gint((if setting == true then 1 else 0)))
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the dropdown menu of this button should show an entry to
    * trigger a `GtkAppChooserDialog`.
    */
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
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkAppChooserButton` for applications that can handle
    * content of the given type.
    */
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
