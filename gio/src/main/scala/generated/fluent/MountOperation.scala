package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.{
  AskPasswordFlags,
  MountOperationResult,
  PasswordSave
}
import sn.gnome.gio.internal.{
  GAskPasswordFlags,
  GMountOperation,
  GMountOperationResult
}
import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer, guint}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*

/** #GMountOperation provides a mechanism for interacting with the user. It can
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class MountOperation(raw: Ptr[GMountOperation])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Check to see whether the mount operation is being used for an anonymous
    * user.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAnonymous(): Boolean /* None */ = g_mount_operation_get_anonymous(
    this.raw.asInstanceOf[Ptr[GMountOperation]]
  ).value.!=(0)

  /** Gets a choice from the mount operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChoice(): Int /* None */ = g_mount_operation_get_choice(
    this.raw.asInstanceOf[Ptr[GMountOperation]]
  )

  /** Gets the domain of the mount operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDomain()(using Zone): String /* None */ = fromCString(
    g_mount_operation_get_domain(
      this.raw.asInstanceOf[Ptr[GMountOperation]]
    ).asInstanceOf
  )

  /** Check to see whether the mount operation is being used for a TCRYPT hidden
    * volume.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIsTcryptHiddenVolume(): Boolean /* None */ =
    g_mount_operation_get_is_tcrypt_hidden_volume(
      this.raw.asInstanceOf[Ptr[GMountOperation]]
    ).value.!=(0)

  /** Check to see whether the mount operation is being used for a TCRYPT system
    * volume.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIsTcryptSystemVolume(): Boolean /* None */ =
    g_mount_operation_get_is_tcrypt_system_volume(
      this.raw.asInstanceOf[Ptr[GMountOperation]]
    ).value.!=(0)

  /** Gets a password from the mount operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPassword()(using Zone): String /* None */ = fromCString(
    g_mount_operation_get_password(
      this.raw.asInstanceOf[Ptr[GMountOperation]]
    ).asInstanceOf
  )

  /** Gets the state of saving passwords for the mount operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPasswordSave(): PasswordSave /* None */ = PasswordSave.fromRaw(
    g_mount_operation_get_password_save(
      this.raw.asInstanceOf[Ptr[GMountOperation]]
    )
  )

  /** Gets a PIM from the mount operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPim(): UInt /* None */ = g_mount_operation_get_pim(
    this.raw.asInstanceOf[Ptr[GMountOperation]]
  ).value

  /** Get the user name from the mount operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUsername()(using Zone): String /* None */ = fromCString(
    g_mount_operation_get_username(
      this.raw.asInstanceOf[Ptr[GMountOperation]]
    ).asInstanceOf
  )

  /** Emits the #GMountOperation::reply signal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def reply(
      result: MountOperationResult /* Some(GMountOperationResult) */
  ): Unit /* None */ = g_mount_operation_reply(
    this.raw.asInstanceOf[Ptr[GMountOperation]],
    result.raw
  )

  /** Sets the mount operation to use an anonymous user if @anonymous is %TRUE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAnonymous(
      anonymous: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = g_mount_operation_set_anonymous(
    this.raw.asInstanceOf[Ptr[GMountOperation]],
    gboolean(gint((if anonymous == true then 1 else 0)))
  )

  /** Sets a default choice for the mount operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setChoice(choice: Int /* Some(CInt) */ ): Unit /* None */ =
    g_mount_operation_set_choice(
      this.raw.asInstanceOf[Ptr[GMountOperation]],
      choice
    )

  /** Sets the mount operation's domain.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDomain(
      domain: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = g_mount_operation_set_domain(
    this.raw.asInstanceOf[Ptr[GMountOperation]],
    domain
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** Sets the mount operation to use a hidden volume if @hidden_volume is
    * %TRUE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setIsTcryptHiddenVolume(
      hidden_volume: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = g_mount_operation_set_is_tcrypt_hidden_volume(
    this.raw.asInstanceOf[Ptr[GMountOperation]],
    gboolean(gint((if hidden_volume == true then 1 else 0)))
  )

  /** Sets the mount operation to use a system volume if @system_volume is
    * %TRUE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setIsTcryptSystemVolume(
      system_volume: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = g_mount_operation_set_is_tcrypt_system_volume(
    this.raw.asInstanceOf[Ptr[GMountOperation]],
    gboolean(gint((if system_volume == true then 1 else 0)))
  )

  /** Sets the mount operation's password to @password.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPassword(
      password: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = g_mount_operation_set_password(
    this.raw.asInstanceOf[Ptr[GMountOperation]],
    password
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** Sets the state of saving passwords for the mount operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPasswordSave(
      save: PasswordSave /* Some(GPasswordSave) */
  ): Unit /* None */ = g_mount_operation_set_password_save(
    this.raw.asInstanceOf[Ptr[GMountOperation]],
    save.raw
  )

  /** Sets the mount operation's PIM to @pim.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPim(
      pim: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ = g_mount_operation_set_pim(
    this.raw.asInstanceOf[Ptr[GMountOperation]],
    guint(pim)
  )

  /** Sets the user name within @op to @username.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setUsername(
      username: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = g_mount_operation_set_username(
    this.raw.asInstanceOf[Ptr[GMountOperation]],
    username
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** Emitted by the backend when e.g. a device becomes unavailable while a
    * mount operation is in progress.
    *
    * Implementations of GMountOperation should handle this signal by dismissing
    * open password dialogs.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onAborted(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GMountOperation],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"aborted"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onAborted

  /** Emitted when a mount operation asks the user for a password.
    *
    * If the message contains a line break, the first line should be presented
    * as a heading. For example, it may be used as the primary text in a
    * #GtkMessageDialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onAskPassword(
      handler: (
          (
              message: String,
              defaultUser: String,
              defaultDomain: String,
              flags: AskPasswordFlags
          )
      ) => Unit
  )(using Runtime) =
    type SignalRegType = SignalRegistration[
      this.type,
      (
          message: String,
          defaultUser: String,
          defaultDomain: String,
          flags: AskPasswordFlags
      ),
      Unit
    ]
    val c_handler = CFuncPtr6.fromScalaFunction {
      (
          self: Ptr[GMountOperation],
          message: CString /* param */,
          defaultUser: CString /* param */,
          defaultDomain: CString /* param */,
          flags: GAskPasswordFlags /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(
          (
            message = fromCString(message),
            defaultUser = fromCString(defaultUser),
            defaultDomain = fromCString(defaultDomain),
            flags = AskPasswordFlags.fromRaw(flags)
          )
        )
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"ask-password"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onAskPassword

  /** Emitted when asking the user a question and gives a list of choices for
    * the user to choose from.
    *
    * If the message contains a line break, the first line should be presented
    * as a heading. For example, it may be used as the primary text in a
    * #GtkMessageDialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal ask-question]: Array signal parameters not supported yet"
  )
  private def onAskQuestion = ???

  /** Emitted when the user has replied to the mount operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onReply(handler: ((result: MountOperationResult)) => Unit)(using
      Runtime
  ) =
    type SignalRegType =
      SignalRegistration[this.type, (result: MountOperationResult), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GMountOperation],
          result: GMountOperationResult /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((result = MountOperationResult.fromRaw(result)))
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"reply"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onReply

  /** Emitted when one or more processes are blocking an operation e.g.
    * unmounting/ejecting a #GMount or stopping a #GDrive.
    *
    * Note that this signal may be emitted several times to update the list of
    * blocking processes as processes close files. The application should only
    * respond with g_mount_operation_reply() to the latest signal (setting
    * #GMountOperation:choice to the choice the user made).
    *
    * If the message contains a line break, the first line should be presented
    * as a heading. For example, it may be used as the primary text in a
    * #GtkMessageDialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal show-processes]: Array signal parameters not supported yet"
  )
  private def onShowProcesses = ???

  /** Emitted when an unmount operation has been busy for more than some time
    * (typically 1.5 seconds).
    *
    * When unmounting or ejecting a volume, the kernel might need to flush
    * pending data in its buffers to the volume stable storage, and this
    * operation can take a considerable amount of time. This signal may be
    * emitted several times as long as the unmount operation is outstanding, and
    * then one last time when the operation is completed, with @bytes_left set
    * to zero.
    *
    * Implementations of GMountOperation should handle this signal by showing an
    * UI notification, and then dismiss it, or show another notification of
    * completion, when @bytes_left reaches zero.
    *
    * If the message contains a line break, the first line should be presented
    * as a heading. For example, it may be used as the primary text in a
    * #GtkMessageDialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal show-unmount-progress]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gint64), @type -> DataRecord(gint64)))"
  )
  private def onShowUnmountProgress = ???

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
  /** Creates a new mount operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(): MountOperation = new MountOperation(
    g_mount_operation_new().asInstanceOf
  )
end MountOperation
