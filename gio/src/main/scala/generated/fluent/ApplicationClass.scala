package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GApplicationClass

/** Virtual function table for #GApplication.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ApplicationClass private[gnome] (raw: Ptr[GApplicationClass]):

  def getUnsafeRawPointer(): Ptr[GApplicationClass] = this.raw

  @annotation.compileTimeOnly("[field startup]: Field is missing <type>")
  private def startup__ = ???
  @annotation.compileTimeOnly("[field activate]: Field is missing <type>")
  private def activate__ = ???
  @annotation.compileTimeOnly("[field open]: Field is missing <type>")
  private def open__ = ???
  @annotation.compileTimeOnly("[field command_line]: Field is missing <type>")
  private def commandLine__ = ???
  @annotation.compileTimeOnly(
    "[field local_command_line]: Field is missing <type>"
  )
  private def localCommandLine__ = ???
  @annotation.compileTimeOnly("[field before_emit]: Field is missing <type>")
  private def beforeEmit__ = ???
  @annotation.compileTimeOnly("[field after_emit]: Field is missing <type>")
  private def afterEmit__ = ???
  @annotation.compileTimeOnly(
    "[field add_platform_data]: Field is missing <type>"
  )
  private def addPlatformData__ = ???
  @annotation.compileTimeOnly("[field quit_mainloop]: Field is missing <type>")
  private def quitMainloop__ = ???
  @annotation.compileTimeOnly("[field run_mainloop]: Field is missing <type>")
  private def runMainloop__ = ???
  @annotation.compileTimeOnly("[field shutdown]: Field is missing <type>")
  private def shutdown__ = ???
  @annotation.compileTimeOnly("[field dbus_register]: Field is missing <type>")
  private def dbusRegister__ = ???
  @annotation.compileTimeOnly(
    "[field dbus_unregister]: Field is missing <type>"
  )
  private def dbusUnregister__ = ???
  @annotation.compileTimeOnly(
    "[field handle_local_options]: Field is missing <type>"
  )
  private def handleLocalOptions__ = ???
  @annotation.compileTimeOnly("[field name_lost]: Field is missing <type>")
  private def nameLost__ = ???

end ApplicationClass

object ApplicationClass:
  def fromRaw(ptr: Ptr[GApplicationClass]): ApplicationClass =
    new ApplicationClass(ptr)
end ApplicationClass
