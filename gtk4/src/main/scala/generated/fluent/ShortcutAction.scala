package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.internal.GtkShortcutAction

/** `GtkShortcutAction` encodes an action that can be triggered by a keyboard
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ShortcutAction(raw: Ptr[GtkShortcutAction])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Activates the action on the @widget with the given @args.
    *
    * Note that some actions ignore the passed in @flags, @widget or @args.
    *
    * Activation of an action can fail for various reasons. If the action is not
    * supported by the @widget, if the @args don't match the action or if the
    * activation otherwise had no effect, %FALSE will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method activate/<method parameters>/args]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def activate__ = ???

  /** Prints the given action into a string for the developer.
    *
    * This is meant for debugging and logging.
    *
    * The form of the representation may change at any time and is not
    * guaranteed to stay identical.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method print/<method parameters>/string]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.String), @type -> DataRecord(GString*)))"
  )
  private def print__ = ???

  /** Prints the given action into a human-readable string.
    *
    * This is a small wrapper around [method@Gtk.ShortcutAction.print] to help
    * when debugging.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def toString()(using Zone): String /* None */ = fromCString(
    gtk_shortcut_action_to_string(
      this.raw.asInstanceOf[Ptr[GtkShortcutAction]]
    ).asInstanceOf
  )

end ShortcutAction

object ShortcutAction:
  /** Tries to parse the given string into an action.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def parseString(string: String | CString /* Some(CString) */ )(using
      Zone
  )(using Runtime): ShortcutAction =
    val raw: Ptr[Byte] = gtk_shortcut_action_parse_string(
      __sn_extract_string(string)
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[ShortcutAction](raw, r => new ShortcutAction(r.asInstanceOf))
  end parseString

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end ShortcutAction
