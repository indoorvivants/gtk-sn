package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

trait RemoteActionGroup:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Activates the remote action.
    *
    * This is the same as g_action_group_activate_action() except that it allows
    * for provision of "platform data" to be sent along with the activation
    * request. This typically contains details such as the user interaction
    * timestamp or startup notification information.
    *
    * @platform_data
    *   must be non-%NULL and must have the type %G_VARIANT_TYPE_VARDICT. If it
    *   is floating, it will be consumed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method activate_action_full/<method parameters>/parameter]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def activateActionFull__ = ???

  /** Changes the state of a remote action.
    *
    * This is the same as g_action_group_change_action_state() except that it
    * allows for provision of "platform data" to be sent along with the state
    * change request. This typically contains details such as the user
    * interaction timestamp or startup notification information.
    *
    * @platform_data
    *   must be non-%NULL and must have the type %G_VARIANT_TYPE_VARDICT. If it
    *   is floating, it will be consumed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method change_action_state_full/<method parameters>/value]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def changeActionStateFull__ = ???

end RemoteActionGroup

object RemoteActionGroup:
  class Abstract(raw: Ptr[Byte]) extends RemoteActionGroup:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end RemoteActionGroup
