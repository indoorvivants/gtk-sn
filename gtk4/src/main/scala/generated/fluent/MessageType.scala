package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkMessageType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The type of message being displayed in a [class@MessageDialog].
  */
enum MessageType(val raw: GtkMessageType):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Informational message
    */
  case INFO extends MessageType(GtkMessageType.GTK_MESSAGE_INFO)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Non-fatal warning message
    */
  case WARNING extends MessageType(GtkMessageType.GTK_MESSAGE_WARNING)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Question requiring a choice
    */
  case QUESTION extends MessageType(GtkMessageType.GTK_MESSAGE_QUESTION)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fatal error message
    */
  case ERROR extends MessageType(GtkMessageType.GTK_MESSAGE_ERROR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * None of the above
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
