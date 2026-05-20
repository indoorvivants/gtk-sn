package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GIOModuleClass

class IOModuleClass private[gnome] (raw: Ptr[GIOModuleClass]):

  def getUnsafeRawPointer(): Ptr[GIOModuleClass] = this.raw
end IOModuleClass

object IOModuleClass:
  def fromRaw(ptr: Ptr[GIOModuleClass]): IOModuleClass = new IOModuleClass(ptr)
end IOModuleClass
