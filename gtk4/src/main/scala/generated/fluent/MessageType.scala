package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkMessageType

/** The type of message being displayed in a [class@MessageDialog].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum MessageType(val raw: GtkMessageType):
  /** Informational message
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INFO extends MessageType(GtkMessageType.GTK_MESSAGE_INFO)

  /** Non-fatal warning message
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case WARNING extends MessageType(GtkMessageType.GTK_MESSAGE_WARNING)

  /** Question requiring a choice
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case QUESTION extends MessageType(GtkMessageType.GTK_MESSAGE_QUESTION)

  /** Fatal error message
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ERROR extends MessageType(GtkMessageType.GTK_MESSAGE_ERROR)

  /** None of the above
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OTHER extends MessageType(GtkMessageType.GTK_MESSAGE_OTHER)
end MessageType

object MessageType:
  def fromRaw(raw: GtkMessageType): MessageType =
    raw match
      case GtkMessageType.GTK_MESSAGE_INFO     => MessageType.INFO
      case GtkMessageType.GTK_MESSAGE_WARNING  => MessageType.WARNING
      case GtkMessageType.GTK_MESSAGE_QUESTION => MessageType.QUESTION
      case GtkMessageType.GTK_MESSAGE_ERROR    => MessageType.ERROR
      case GtkMessageType.GTK_MESSAGE_OTHER    => MessageType.OTHER
  end fromRaw
end MessageType
