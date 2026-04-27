package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.internal.GMountOperation
import sn.gnome.gio.internal.GMountOperationResult
import sn.gnome.gio.internal.GPasswordSave
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.fluent.Object

class MountOperation(raw: Ptr[GMountOperation])
    extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getAnonymous(): Boolean =
    g_mount_operation_get_anonymous(this.raw.asInstanceOf).value.!=(0)

  def getChoice(): Int = g_mount_operation_get_choice(this.raw.asInstanceOf)

  def getDomain()(using Zone): String = fromCString(
    g_mount_operation_get_domain(this.raw.asInstanceOf).asInstanceOf
  )

  def getIsTcryptHiddenVolume(): Boolean =
    g_mount_operation_get_is_tcrypt_hidden_volume(this.raw.asInstanceOf).value
      .!=(0)

  def getIsTcryptSystemVolume(): Boolean =
    g_mount_operation_get_is_tcrypt_system_volume(this.raw.asInstanceOf).value
      .!=(0)

  def getPassword()(using Zone): String = fromCString(
    g_mount_operation_get_password(this.raw.asInstanceOf).asInstanceOf
  )

  def getPasswordSave(): GPasswordSave = g_mount_operation_get_password_save(
    this.raw.asInstanceOf
  )

  def getPim(): UInt = g_mount_operation_get_pim(this.raw.asInstanceOf).value

  def getUsername()(using Zone): String = fromCString(
    g_mount_operation_get_username(this.raw.asInstanceOf).asInstanceOf
  )

  def reply(result: GMountOperationResult): Unit =
    g_mount_operation_reply(this.raw.asInstanceOf, result)

  def setAnonymous(anonymous: Boolean): Unit = g_mount_operation_set_anonymous(
    this.raw.asInstanceOf,
    gboolean(gint((if anonymous == true then 1 else 0)))
  )

  def setChoice(choice: Int): Unit =
    g_mount_operation_set_choice(this.raw.asInstanceOf, choice)

  def setDomain(domain: String | CString)(using Zone): Unit =
    g_mount_operation_set_domain(
      this.raw.asInstanceOf,
      __sn_extract_string(domain)
    )

  def setIsTcryptHiddenVolume(hidden_volume: Boolean): Unit =
    g_mount_operation_set_is_tcrypt_hidden_volume(
      this.raw.asInstanceOf,
      gboolean(gint((if hidden_volume == true then 1 else 0)))
    )

  def setIsTcryptSystemVolume(system_volume: Boolean): Unit =
    g_mount_operation_set_is_tcrypt_system_volume(
      this.raw.asInstanceOf,
      gboolean(gint((if system_volume == true then 1 else 0)))
    )

  def setPassword(password: String | CString)(using Zone): Unit =
    g_mount_operation_set_password(
      this.raw.asInstanceOf,
      __sn_extract_string(password)
    )

  def setPasswordSave(save: GPasswordSave): Unit =
    g_mount_operation_set_password_save(this.raw.asInstanceOf, save)

  def setPim(pim: UInt): Unit =
    g_mount_operation_set_pim(this.raw.asInstanceOf, guint(pim))

  def setUsername(username: String | CString)(using Zone): Unit =
    g_mount_operation_set_username(
      this.raw.asInstanceOf,
      __sn_extract_string(username)
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end MountOperation

object MountOperation:
  def apply(): MountOperation = new MountOperation(
    g_mount_operation_new().asInstanceOf
  )
end MountOperation
