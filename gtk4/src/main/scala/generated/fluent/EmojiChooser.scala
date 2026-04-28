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
  def apply(): EmojiChooser = new EmojiChooser(
    gtk_emoji_chooser_new().asInstanceOf
  )
end EmojiChooser
