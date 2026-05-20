package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkTextTagPrivate

class TextTagPrivate private[gnome] (raw: Ptr[GtkTextTagPrivate]):

  def getUnsafeRawPointer(): Ptr[GtkTextTagPrivate] = this.raw
end TextTagPrivate

object TextTagPrivate:
  def fromRaw(ptr: Ptr[GtkTextTagPrivate]): TextTagPrivate = new TextTagPrivate(
    ptr
  )
end TextTagPrivate
