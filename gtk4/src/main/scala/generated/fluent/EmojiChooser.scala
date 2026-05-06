package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gchar, gpointer}
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{
  Accessible,
  Buildable,
  ConstraintTarget,
  Native,
  Popover,
  ShortcutManager
}
import sn.gnome.gtk4.internal.GtkEmojiChooser

/** The `GtkEmojiChooser` is used by text widgets such as `GtkEntry` or
  * `GtkTextView` to let users insert Emoji characters.
  *
  * ![An example GtkEmojiChooser](emojichooser.png)
  *
  * `GtkEmojiChooser` emits the [signal@Gtk.EmojiChooser::emoji-picked] signal
  * when an Emoji is selected.
  *
  * # CSS nodes
  *
  * ```
  * popover
  * ├── box.emoji-searchbar
  * │   ╰── entry.search
  * ╰── box.emoji-toolbar
  *     ├── button.image-button.emoji-section
  *     ├── ...
  *     ╰── button.image-button.emoji-section
  * ```
  *
  * Every `GtkEmojiChooser` consists of a main node called popover. The contents
  * of the popover are largely implementation defined and supposed to inherit
  * general styles. The top searchbar used to search emoji and gets the
  * .emoji-searchbar style class itself. The bottom toolbar used to switch
  * between different emoji categories consists of buttons with the
  * .emoji-section style class and gets the .emoji-toolbar style class itself.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class EmojiChooser(raw: Ptr[GtkEmojiChooser])
    extends Popover(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Native,
      ShortcutManager:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Emitted when the user selects an Emoji.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onEmojiPicked(handler: ((text: String)) => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, (text: String), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkEmojiChooser],
          text: CString /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((text = fromCString(text)))
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"emoji-picked"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onEmojiPicked
end EmojiChooser

object EmojiChooser:
  /** Creates a new `GtkEmojiChooser`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(): EmojiChooser = new EmojiChooser(
    gtk_emoji_chooser_new().asInstanceOf
  )
end EmojiChooser
