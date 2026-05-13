package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}

trait DebugController:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Get the value of #GDebugController:debug-enabled.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDebugEnabled(): Boolean /* None */ =
    g_debug_controller_get_debug_enabled(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDebugController]]
    ).value.!=(0)
  end getDebugEnabled

  /** Set the value of #GDebugController:debug-enabled.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDebugEnabled(
      debug_enabled: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    g_debug_controller_set_debug_enabled(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDebugController]],
      gboolean(gint((if debug_enabled == true then 1 else 0)))
    )
  end setDebugEnabled

end DebugController

object DebugController:
  class Abstract(raw: Ptr[Byte]) extends DebugController:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end DebugController
