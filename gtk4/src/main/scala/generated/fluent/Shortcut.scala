package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.GVariant
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.ShortcutAction
import sn.gnome.gtk4.fluent.ShortcutTrigger
import sn.gnome.gtk4.internal.GtkShortcut

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A `GtkShortcut` describes a keyboard shortcut.
  *
  * It contains a description of how to trigger the shortcut via a
  * [class@Gtk.ShortcutTrigger] and a way to activate the shortcut on a widget
  * via a [class@Gtk.ShortcutAction].
  *
  * The actual work is usually done via [class@Gtk.ShortcutController], which
  * decides if and when to activate a shortcut. Using that controller directly
  * however is rarely necessary as various higher level convenience APIs exist
  * on `GtkWidget`s that make it easier to use shortcuts in GTK.
  *
  * `GtkShortcut` does provide functionality to make it easy for users to work
  * with shortcuts, either by providing informational strings for display
  * purposes or by allowing shortcuts to be configured.
  */
class Shortcut(raw: Ptr[GtkShortcut]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the action that is activated by this shortcut.
    */
  def getAction(): ShortcutAction = new ShortcutAction(
    gtk_shortcut_get_action(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the arguments that are passed when activating the shortcut.
    */
  def getArguments(): Ptr[GVariant] = gtk_shortcut_get_arguments(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the trigger used to trigger @self.
    */
  def getTrigger(): ShortcutTrigger = new ShortcutTrigger(
    gtk_shortcut_get_trigger(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the new action for @self to be @action.
    */
  def setAction(action: ShortcutAction): Unit = gtk_shortcut_set_action(
    this.raw.asInstanceOf,
    action.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the arguments to pass when activating the shortcut.
    */
  def setArguments(args: Ptr[GVariant]): Unit =
    gtk_shortcut_set_arguments(this.raw.asInstanceOf, args)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the new trigger for @self to be @trigger.
    */
  def setTrigger(trigger: ShortcutTrigger): Unit = gtk_shortcut_set_trigger(
    this.raw.asInstanceOf,
    trigger.getUnsafeRawPointer().asInstanceOf
  )

end Shortcut

object Shortcut:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkShortcut` that is triggered by
    * @trigger
    *   and then activates @action.
    */
  def apply(trigger: ShortcutTrigger, action: ShortcutAction): Shortcut =
    new Shortcut(
      gtk_shortcut_new(
        trigger.getUnsafeRawPointer().asInstanceOf,
        action.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkShortcut` that is triggered by @trigger and then
    * activates
    * @action
    *   with arguments given by @format_string.
    */
  inline def withArguments(
      trigger: ShortcutTrigger,
      action: ShortcutAction,
      format_string: String | CString,
      args: Any*
  )(using Zone): Shortcut = new Shortcut(
    gtk_shortcut_new_with_arguments(
      trigger.getUnsafeRawPointer().asInstanceOf,
      action.getUnsafeRawPointer().asInstanceOf,
      __sn_extract_string(format_string),
      args*
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
end Shortcut
