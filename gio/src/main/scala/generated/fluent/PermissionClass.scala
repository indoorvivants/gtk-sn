package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GPermissionClass
import sn.gnome.gobject.ObjectClass

class PermissionClass private[gnome] (raw: Ptr[GPermissionClass]):

  def getUnsafeRawPointer(): Ptr[GPermissionClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
  @annotation.compileTimeOnly("[field acquire]: Field is missing <type>")
  private def acquire__ = ???
  @annotation.compileTimeOnly("[field acquire_async]: Field is missing <type>")
  private def acquireAsync__ = ???
  @annotation.compileTimeOnly("[field acquire_finish]: Field is missing <type>")
  private def acquireFinish__ = ???
  @annotation.compileTimeOnly("[field release]: Field is missing <type>")
  private def release__ = ???
  @annotation.compileTimeOnly("[field release_async]: Field is missing <type>")
  private def releaseAsync__ = ???
  @annotation.compileTimeOnly("[field release_finish]: Field is missing <type>")
  private def releaseFinish__ = ???
  @annotation.compileTimeOnly("[field reserved]: key not found: @type")
  private def reserved__ = ???
end PermissionClass

object PermissionClass:
  def fromRaw(ptr: Ptr[GPermissionClass]): PermissionClass =
    new PermissionClass(ptr)
end PermissionClass
