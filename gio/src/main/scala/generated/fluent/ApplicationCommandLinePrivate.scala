package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GApplicationCommandLinePrivate

class ApplicationCommandLinePrivate private[gnome] (
    raw: Ptr[GApplicationCommandLinePrivate]
):

  def getUnsafeRawPointer(): Ptr[GApplicationCommandLinePrivate] = this.raw
end ApplicationCommandLinePrivate

object ApplicationCommandLinePrivate:
  def fromRaw(
      ptr: Ptr[GApplicationCommandLinePrivate]
  ): ApplicationCommandLinePrivate = new ApplicationCommandLinePrivate(ptr)
end ApplicationCommandLinePrivate
