package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GMountOperationResult

/** #GMountOperationResult is returned as a result when a request for
  * information is send by the mounting operation.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum MountOperationResult(val raw: GMountOperationResult):
  /** The request was fulfilled and the user specified data is now available
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HANDLED
      extends MountOperationResult(
        GMountOperationResult.G_MOUNT_OPERATION_HANDLED
      )

  /** The user requested the mount operation to be aborted
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ABORTED
      extends MountOperationResult(
        GMountOperationResult.G_MOUNT_OPERATION_ABORTED
      )

  /** The request was unhandled (i.e. not implemented)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
