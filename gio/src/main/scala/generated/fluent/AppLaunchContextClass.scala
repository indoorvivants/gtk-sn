package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GAppLaunchContextClass
import sn.gnome.gobject.ObjectClass

class AppLaunchContextClass private[gnome] (raw: Ptr[GAppLaunchContextClass]):

  def getUnsafeRawPointer(): Ptr[GAppLaunchContextClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
  @annotation.compileTimeOnly("[field get_display]: Field is missing <type>")
  private def getDisplay__ = ???
  @annotation.compileTimeOnly(
    "[field get_startup_notify_id]: Field is missing <type>"
  )
  private def getStartupNotifyId__ = ???
  @annotation.compileTimeOnly("[field launch_failed]: Field is missing <type>")
  private def launchFailed__ = ???
  @annotation.compileTimeOnly("[field launched]: Field is missing <type>")
  private def launched__ = ???
  @annotation.compileTimeOnly("[field launch_started]: Field is missing <type>")
  private def launchStarted__ = ???
  @annotation.compileTimeOnly("[field _g_reserved1]: Field is missing <type>")
  private def GReserved1__ = ???
  @annotation.compileTimeOnly("[field _g_reserved2]: Field is missing <type>")
  private def GReserved2__ = ???
  @annotation.compileTimeOnly("[field _g_reserved3]: Field is missing <type>")
  private def GReserved3__ = ???
end AppLaunchContextClass

object AppLaunchContextClass:
  def fromRaw(ptr: Ptr[GAppLaunchContextClass]): AppLaunchContextClass =
    new AppLaunchContextClass(ptr)
end AppLaunchContextClass
