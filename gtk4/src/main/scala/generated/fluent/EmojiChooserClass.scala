package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkEmojiChooserClass

class EmojiChooserClass private[gnome] (raw: Ptr[GtkEmojiChooserClass]):

  def getUnsafeRawPointer(): Ptr[GtkEmojiChooserClass] = this.raw
end EmojiChooserClass

object EmojiChooserClass:
  def fromRaw(ptr: Ptr[GtkEmojiChooserClass]): EmojiChooserClass =
    new EmojiChooserClass(ptr)
end EmojiChooserClass
