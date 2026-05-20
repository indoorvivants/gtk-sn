package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GSettingsClass
import sn.gnome.gobject.ObjectClass

class SettingsClass private[gnome] (raw: Ptr[GSettingsClass]):

  def getUnsafeRawPointer(): Ptr[GSettingsClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
  @annotation.compileTimeOnly(
    "[field writable_changed]: Field is missing <type>"
  )
  private def writableChanged__ = ???
  @annotation.compileTimeOnly("[field changed]: Field is missing <type>")
  private def changed__ = ???
  @annotation.compileTimeOnly(
    "[field writable_change_event]: Field is missing <type>"
  )
  private def writableChangeEvent__ = ???
  @annotation.compileTimeOnly("[field change_event]: Field is missing <type>")
  private def changeEvent__ = ???
  @annotation.compileTimeOnly("[field padding]: key not found: @type")
  private def padding__ = ???
end SettingsClass

object SettingsClass:
  def fromRaw(ptr: Ptr[GSettingsClass]): SettingsClass = new SettingsClass(ptr)
end SettingsClass
