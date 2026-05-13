package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.{Display, Event, KeyMatch}
import sn.gnome.glib.internal.{gboolean, gint, guint}
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.ShortcutTrigger
import sn.gnome.gtk4.internal.GtkShortcutTrigger

/** `GtkShortcutTrigger` tracks how a `GtkShortcut` should be activated.
  *
  * To find out if a `GtkShortcutTrigger` triggers, you can call
  * [method@Gtk.ShortcutTrigger.trigger] on a `GdkEvent`.
  *
  * `GtkShortcutTriggers` contain functions that allow easy presentation to end
  * users as well as being printed for debugging.
  *
  * All `GtkShortcutTriggers` are immutable, you can only specify their
  * properties during construction. If you want to change a trigger, you have to
  * replace it with a new one.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ShortcutTrigger private[gnome] (raw: Ptr[GtkShortcutTrigger])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** The types of @trigger1 and @trigger2 are `gconstpointer` only to allow use
    * of this function as a `GCompareFunc`.
    *
    * They must each be a `GtkShortcutTrigger`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def compare(
      trigger2: sn.gnome.gtk4.ShortcutTrigger /* Some(_root_.sn.gnome.glib.internal.gconstpointer) */
  )(using Runtime): Int /* None */ =
    gtk_shortcut_trigger_compare(
      this
        .getUnsafeRawPointer()
        .asInstanceOf[_root_.sn.gnome.glib.internal.gconstpointer],
      trigger2.getUnsafeRawPointer().asInstanceOf
    )
  end compare

  /** Checks if @trigger1 and @trigger2 trigger under the same conditions.
    *
    * The types of @one and @two are `gconstpointer` only to allow use of this
    * function with `GHashTable`. They must each be a `GtkShortcutTrigger`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def equal(
      trigger2: sn.gnome.gtk4.ShortcutTrigger /* Some(_root_.sn.gnome.glib.internal.gconstpointer) */
  )(using Runtime): Boolean /* None */ =
    gtk_shortcut_trigger_equal(
      this
        .getUnsafeRawPointer()
        .asInstanceOf[_root_.sn.gnome.glib.internal.gconstpointer],
      trigger2.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end equal

  /** Generates a hash value for a `GtkShortcutTrigger`.
    *
    * The output of this function is guaranteed to be the same for a given value
    * only per-process. It may change between different processor architectures
    * or even different versions of GTK. Do not use this function as a basis for
    * building protocols or file formats.
    *
    * The types of @trigger is `gconstpointer` only to allow use of this
    * function with `GHashTable`. They must each be a `GtkShortcutTrigger`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hash(): UInt /* None */ =
    gtk_shortcut_trigger_hash(
      this
        .getUnsafeRawPointer()
        .asInstanceOf[_root_.sn.gnome.glib.internal.gconstpointer]
    ).value
  end hash

  /** Prints the given trigger into a string for the developer. This is meant
    * for debugging and logging.
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

  /** Prints the given trigger into a string.
    *
    * This function is returning a translated string for presentation to end
    * users for example in menu items or in help texts.
    *
    * The @display in use may influence the resulting string in various forms,
    * such as resolving hardware keycodes or by causing display-specific
    * modifier names.
    *
    * The form of the representation may change at any time and is not
    * guaranteed to stay identical.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method print_label/<method parameters>/string]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.String), @type -> DataRecord(GString*)))"
  )
  private def printLabel__ = ???

  /** Gets textual representation for the given trigger.
    *
    * This function is returning a translated string for presentation to end
    * users for example in menu items or in help texts.
    *
    * The @display in use may influence the resulting string in various forms,
    * such as resolving hardware keycodes or by causing display-specific
    * modifier names.
    *
    * The form of the representation may change at any time and is not
    * guaranteed to stay identical.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def toLabel(
      display: sn.gnome.gdk4.Display /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkDisplay]) */
  )(using Zone, Runtime): String /* None */ =
    fromCString(
      gtk_shortcut_trigger_to_label(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkShortcutTrigger]],
        display.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )
  end toLabel

  /** Prints the given trigger into a human-readable string.
    *
    * This is a small wrapper around [method@Gtk.ShortcutTrigger.print] to help
    * when debugging.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def toString()(using Zone): String /* None */ =
    fromCString(
      gtk_shortcut_trigger_to_string(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkShortcutTrigger]]
      ).asInstanceOf
    )
  end toString

  /** Checks if the given @event triggers @self.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def trigger(
      event: sn.gnome.gdk4.Event /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkEvent]) */,
      enable_mnemonics: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  )(using Runtime): KeyMatch /* None */ =
    KeyMatch.fromRaw(
      gtk_shortcut_trigger_trigger(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkShortcutTrigger]],
        event.getUnsafeRawPointer().asInstanceOf,
        gboolean(gint((if enable_mnemonics == true then 1 else 0)))
      )
    )
  end trigger

end ShortcutTrigger

object ShortcutTrigger:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkShortcutTrigger])(using Runtime) =
    summon[Runtime].getOrCreate[ShortcutTrigger](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ShortcutTrigger(ptr)
    )

  /** Tries to parse the given string into a trigger.
    *
    * On success, the parsed trigger is returned. When parsing failed, %NULL is
    * returned.
    *
    * The accepted strings are:
    *
    *   - `never`, for `GtkNeverTrigger`
    *   - a string parsed by gtk_accelerator_parse(), for a `GtkKeyvalTrigger`,
    *     e.g. `<Control>C`
    *   - underscore, followed by a single character, for `GtkMnemonicTrigger`,
    *     e.g. `_l`
    *   - two valid trigger strings, separated by a `|` character, for a
    *     `GtkAlternativeTrigger`: `<Control>q|<Control>w`
    *
    * Note that you will have to escape the `<` and `>` characters when
    * specifying triggers in XML files, such as GtkBuilder ui files. Use `&lt;`
    * instead of `<` and `&gt;` instead of `>`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def parseString(
      string: String /* Some(CString) */
  )(using Zone, Runtime): ShortcutTrigger =
    val raw: Ptr[Byte] = gtk_shortcut_trigger_parse_string(
      toCString(string)
    ).asInstanceOf
    summon[Runtime].getOrCreate[ShortcutTrigger](
      raw,
      r => ShortcutTrigger.applyUnsafe(r.asInstanceOf)
    )
  end parseString
end ShortcutTrigger
