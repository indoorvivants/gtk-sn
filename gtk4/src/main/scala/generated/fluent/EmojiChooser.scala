package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Native
import sn.gnome.gtk4.fluent.Popover
import sn.gnome.gtk4.fluent.ShortcutManager
import sn.gnome.gtk4.internal.GtkEmojiChooser

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The `GtkEmojiChooser` is used by text widgets such as `GtkEntry` or
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
  */
class EmojiChooser(raw: Ptr[GtkEmojiChooser])
    extends Popover(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Native,
      ShortcutManager:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end EmojiChooser

object EmojiChooser:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkEmojiChooser`.
    */
  def apply(): EmojiChooser = new EmojiChooser(
    gtk_emoji_chooser_new().asInstanceOf
  )
end EmojiChooser
