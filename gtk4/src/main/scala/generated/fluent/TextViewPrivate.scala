package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkTextViewPrivate

class TextViewPrivate private[gnome] (raw: Ptr[GtkTextViewPrivate]):

  def getUnsafeRawPointer(): Ptr[GtkTextViewPrivate] = this.raw
end TextViewPrivate

object TextViewPrivate:
  def fromRaw(ptr: Ptr[GtkTextViewPrivate]): TextViewPrivate =
    new TextViewPrivate(ptr)
end TextViewPrivate
