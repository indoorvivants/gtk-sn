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

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * #GMountOperation provides a mechanism for interacting with the user. It can
  * be used for authenticating mountable operations, such as loop mounting
  * files, hard drive partitions or server locations. It can also be used to ask
  * the user questions or show a list of applications preventing unmount or
  * eject operations from completing.
  *
  * Note that #GMountOperation is used for more than just #GMount objects – for
  * example it is also used in g_drive_start() and g_drive_stop().
  *
  * Users should instantiate a subclass of this that implements all the various
  * callbacks to show the required dialogs, such as #GtkMountOperation. If no
  * user interaction is desired (for example when automounting filesystems at
  * login time), usually %NULL can be passed, see each method taking a
  * #GMountOperation for details.
  *
  * The term ‘TCRYPT’ is used to mean ‘compatible with TrueCrypt and VeraCrypt’.
  * [TrueCrypt](https://en.wikipedia.org/wiki/TrueCrypt) is a discontinued
  * system for encrypting file containers, partitions or whole disks, typically
  * used with Windows. [VeraCrypt](https://www.veracrypt.fr/) is a maintained
  * fork of TrueCrypt with various improvements and auditing fixes.
  */
class MountOperation(raw: Ptr[GMountOperation])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Check to see whether the mount operation is being used for an anonymous
    * user.
    */
  def getAnonymous(): Boolean /* None */ = g_mount_operation_get_anonymous(
    this.raw.asInstanceOf[Ptr[GMountOperation]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets a choice from the mount operation.
    */
  def getChoice(): Int /* None */ = g_mount_operation_get_choice(
    this.raw.asInstanceOf[Ptr[GMountOperation]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the domain of the mount operation.
    */
  def getDomain()(using Zone): String /* None */ = fromCString(
    g_mount_operation_get_domain(
      this.raw.asInstanceOf[Ptr[GMountOperation]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Check to see whether the mount operation is being used for a TCRYPT hidden
    * volume.
    */
  def getIsTcryptHiddenVolume(): Boolean /* None */ =
    g_mount_operation_get_is_tcrypt_hidden_volume(
      this.raw.asInstanceOf[Ptr[GMountOperation]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Check to see whether the mount operation is being used for a TCRYPT system
    * volume.
    */
  def getIsTcryptSystemVolume(): Boolean /* None */ =
    g_mount_operation_get_is_tcrypt_system_volume(
      this.raw.asInstanceOf[Ptr[GMountOperation]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets a password from the mount operation.
    */
  def getPassword()(using Zone): String /* None */ = fromCString(
    g_mount_operation_get_password(
      this.raw.asInstanceOf[Ptr[GMountOperation]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the state of saving passwords for the mount operation.
    */
  def getPasswordSave(): GPasswordSave /* None */ =
    g_mount_operation_get_password_save(
      this.raw.asInstanceOf[Ptr[GMountOperation]]
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets a PIM from the mount operation.
    */
  def getPim(): UInt /* None */ = g_mount_operation_get_pim(
    this.raw.asInstanceOf[Ptr[GMountOperation]]
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Get the user name from the mount operation.
    */
  def getUsername()(using Zone): String /* None */ = fromCString(
    g_mount_operation_get_username(
      this.raw.asInstanceOf[Ptr[GMountOperation]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Emits the #GMountOperation::reply signal.
    */
  def reply(
      result: GMountOperationResult /* Some(GMountOperationResult) */
  ): Unit /* None */ =
    g_mount_operation_reply(this.raw.asInstanceOf[Ptr[GMountOperation]], result)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the mount operation to use an anonymous user if @anonymous is %TRUE.
    */
  def setAnonymous(
      anonymous: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = g_mount_operation_set_anonymous(
    this.raw.asInstanceOf[Ptr[GMountOperation]],
    gboolean(gint((if anonymous == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets a default choice for the mount operation.
    */
  def setChoice(choice: Int /* Some(CInt) */ ): Unit /* None */ =
    g_mount_operation_set_choice(
      this.raw.asInstanceOf[Ptr[GMountOperation]],
      choice
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the mount operation's domain.
    */
  def setDomain(
      domain: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = g_mount_operation_set_domain(
    this.raw.asInstanceOf[Ptr[GMountOperation]],
    domain
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the mount operation to use a hidden volume if @hidden_volume is
    * %TRUE.
    */
  def setIsTcryptHiddenVolume(
      hidden_volume: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = g_mount_operation_set_is_tcrypt_hidden_volume(
    this.raw.asInstanceOf[Ptr[GMountOperation]],
    gboolean(gint((if hidden_volume == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the mount operation to use a system volume if @system_volume is
    * %TRUE.
    */
  def setIsTcryptSystemVolume(
      system_volume: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = g_mount_operation_set_is_tcrypt_system_volume(
    this.raw.asInstanceOf[Ptr[GMountOperation]],
    gboolean(gint((if system_volume == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the mount operation's password to @password.
    */
  def setPassword(
      password: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = g_mount_operation_set_password(
    this.raw.asInstanceOf[Ptr[GMountOperation]],
    password
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the state of saving passwords for the mount operation.
    */
  def setPasswordSave(
      save: GPasswordSave /* Some(GPasswordSave) */
  ): Unit /* None */ = g_mount_operation_set_password_save(
    this.raw.asInstanceOf[Ptr[GMountOperation]],
    save
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the mount operation's PIM to @pim.
    */
  def setPim(
      pim: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ = g_mount_operation_set_pim(
    this.raw.asInstanceOf[Ptr[GMountOperation]],
    guint(pim)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the user name within @op to @username.
    */
  def setUsername(
      username: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = g_mount_operation_set_username(
    this.raw.asInstanceOf[Ptr[GMountOperation]],
    username
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
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
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new mount operation.
    */
  def apply(): MountOperation = new MountOperation(
    g_mount_operation_new().asInstanceOf
  )
end MountOperation
