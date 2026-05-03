package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GMountOperationResult

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * #GMountOperationResult is returned as a result when a request for
  * information is send by the mounting operation.
  */
enum MountOperationResult(val raw: GMountOperationResult):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The request was fulfilled and the user specified data is now available
    */
  case HANDLED
      extends MountOperationResult(
        GMountOperationResult.G_MOUNT_OPERATION_HANDLED
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The user requested the mount operation to be aborted
    */
  case ABORTED
      extends MountOperationResult(
        GMountOperationResult.G_MOUNT_OPERATION_ABORTED
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The request was unhandled (i.e. not implemented)
    */
  case UNHANDLED
      extends MountOperationResult(
        GMountOperationResult.G_MOUNT_OPERATION_UNHANDLED
      )
end MountOperationResult

object MountOperationResult:
  def fromRaw(raw: GMountOperationResult): MountOperationResult =
    raw match
      case GMountOperationResult.G_MOUNT_OPERATION_HANDLED =>
        MountOperationResult.HANDLED
      case GMountOperationResult.G_MOUNT_OPERATION_ABORTED =>
        MountOperationResult.ABORTED
      case GMountOperationResult.G_MOUNT_OPERATION_UNHANDLED =>
        MountOperationResult.UNHANDLED
  end fromRaw
end MountOperationResult
