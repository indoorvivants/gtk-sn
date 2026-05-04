package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.internal.GtkShortcutAction

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkShortcutAction` encodes an action that can be triggered by a keyboard
  * shortcut.
  *
  * `GtkShortcutActions` contain functions that allow easy presentation to end
  * users as well as being printed for debugging.
  *
  * All `GtkShortcutActions` are immutable, you can only specify their
  * properties during construction. If you want to change a action, you have to
  * replace it with a new one. If you need to pass arguments to an action, these
  * are specified by the higher-level `GtkShortcut` object.
  *
  * To activate a `GtkShortcutAction` manually,
  * [method@Gtk.ShortcutAction.activate] can be called.
  *
  * GTK provides various actions:
  *
  *   - [class@Gtk.MnemonicAction]: a shortcut action that calls
  *     gtk_widget_mnemonic_activate()
  *   - [class@Gtk.CallbackAction]: a shortcut action that invokes a given
  *     callback
  *   - [class@Gtk.SignalAction]: a shortcut action that emits a given signal
  *   - [class@Gtk.ActivateAction]: a shortcut action that calls
  *     gtk_widget_activate()
  *   - [class@Gtk.NamedAction]: a shortcut action that calls
  *     gtk_widget_activate_action()
  *   - [class@Gtk.NothingAction]: a shortcut action that does nothing
  */
class ShortcutAction(raw: Ptr[GtkShortcutAction])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Activates the action on the @widget with the given @args.
    *
    * Note that some actions ignore the passed in @flags, @widget or @args.
    *
    * Activation of an action can fail for various reasons. If the action is not
    * supported by the @widget, if the @args don't match the action or if the
    * activation otherwise had no effect, %FALSE will be returned.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  def activate__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Prints the given action into a string for the developer.
    *
    * This is meant for debugging and logging.
    *
    * The form of the representation may change at any time and is not
    * guaranteed to stay identical.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.String), @type -> DataRecord(GString*)))"
  )
  def print__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Prints the given action into a human-readable string.
    *
    * This is a small wrapper around [method@Gtk.ShortcutAction.print] to help
    * when debugging.
    */
  def toString()(using Zone): String /* None */ = fromCString(
    gtk_shortcut_action_to_string(
      this.raw.asInstanceOf[Ptr[GtkShortcutAction]]
    ).asInstanceOf
  )

end ShortcutAction

object ShortcutAction:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tries to parse the given string into an action.
    *
    * On success, the parsed action is returned. When parsing failed, %NULL is
    * returned.
    *
    * The accepted strings are:
    *
    *   - `nothing`, for `GtkNothingAction`
    *   - `activate`, for `GtkActivateAction`
    *   - `mnemonic-activate`, for `GtkMnemonicAction`
    *   - `action(NAME)`, for a `GtkNamedAction` for the action named `NAME`
    *   - `signal(NAME)`, for a `GtkSignalAction` for the signal `NAME`
    */
  def parseString(
      string: String | CString /* Some(CString) */
  )(using Zone): ShortcutAction = new ShortcutAction(
    gtk_shortcut_action_parse_string(__sn_extract_string(string)).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end ShortcutAction
