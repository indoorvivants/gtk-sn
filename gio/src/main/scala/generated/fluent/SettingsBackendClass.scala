package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GSettingsBackendClass

/** Class structure for #GSettingsBackend.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class SettingsBackendClass private[gnome] (raw: Ptr[GSettingsBackendClass]):

  def getUnsafeRawPointer(): Ptr[GSettingsBackendClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ =
    sn.gnome.gobject.ObjectClass.fromRaw((!raw).parent_class)
  @annotation.compileTimeOnly("[field read]: Field is missing <type>")
  private def read__ = ???
  @annotation.compileTimeOnly("[field get_writable]: Field is missing <type>")
  private def getWritable__ = ???
  @annotation.compileTimeOnly("[field write]: Field is missing <type>")
  private def write__ = ???
  @annotation.compileTimeOnly("[field write_tree]: Field is missing <type>")
  private def writeTree__ = ???
  @annotation.compileTimeOnly("[field reset]: Field is missing <type>")
  private def reset__ = ???
  @annotation.compileTimeOnly("[field subscribe]: Field is missing <type>")
  private def subscribe__ = ???
  @annotation.compileTimeOnly("[field unsubscribe]: Field is missing <type>")
  private def unsubscribe__ = ???
  @annotation.compileTimeOnly("[field sync]: Field is missing <type>")
  private def sync__ = ???
  @annotation.compileTimeOnly("[field get_permission]: Field is missing <type>")
  private def getPermission__ = ???
  @annotation.compileTimeOnly(
    "[field read_user_value]: Field is missing <type>"
  )
  private def readUserValue__ = ???
end SettingsBackendClass
object SettingsBackendClass:
  def fromRaw(ptr: Ptr[GSettingsBackendClass]): SettingsBackendClass =
    new SettingsBackendClass(ptr)
end SettingsBackendClass
