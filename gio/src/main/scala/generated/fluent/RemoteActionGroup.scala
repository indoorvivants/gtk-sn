package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.Variant
import sn.gnome.glib.internal.gchar
import sn.gnome.gobject.runtime.*

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
  def activateActionFull(
      action_name: scala.Predef.String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      parameter: Option[
        sn.gnome.glib.Variant /* Some(Ptr[_root_.sn.gnome.glib.internal.GVariant]) */
      ],
      platform_data: sn.gnome.glib.Variant /* Some(Ptr[_root_.sn.gnome.glib.internal.GVariant]) */
  )(using Runtime): Unit /* None */ =
    g_remote_action_group_activate_action_full(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GRemoteActionGroup]],
      summon[Runtime].inZone(toCString(action_name)).asInstanceOf[Ptr[gchar]],
      parameter
        .map[Ptr[_root_.sn.gnome.glib.internal.GVariant]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.GVariant]]
        ),
      platform_data.getUnsafeRawPointer().asInstanceOf
    )
  end activateActionFull

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
  def changeActionStateFull(
      action_name: scala.Predef.String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      value: sn.gnome.glib.Variant /* Some(Ptr[_root_.sn.gnome.glib.internal.GVariant]) */,
      platform_data: sn.gnome.glib.Variant /* Some(Ptr[_root_.sn.gnome.glib.internal.GVariant]) */
  )(using Runtime): Unit /* None */ =
    g_remote_action_group_change_action_state_full(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GRemoteActionGroup]],
      summon[Runtime].inZone(toCString(action_name)).asInstanceOf[Ptr[gchar]],
      value.getUnsafeRawPointer().asInstanceOf,
      platform_data.getUnsafeRawPointer().asInstanceOf
    )
  end changeActionStateFull

end RemoteActionGroup

object RemoteActionGroup:
  class Abstract(raw: Ptr[Byte]) extends RemoteActionGroup:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end RemoteActionGroup
