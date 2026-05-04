package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkResponseType

/** Predefined values for use as response ids in gtk_dialog_add_button().
  *
  * All predefined values are negative; GTK leaves values of 0 or greater for
  * application-defined response ids.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum ResponseType(val raw: GtkResponseType):
  /** Returned if an action widget has no response id, or if the dialog gets
    * programmatically hidden or destroyed
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NONE extends ResponseType(GtkResponseType.GTK_RESPONSE_NONE)

  /** Generic response id, not used by GTK dialogs
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case REJECT extends ResponseType(GtkResponseType.GTK_RESPONSE_REJECT)

  /** Generic response id, not used by GTK dialogs
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ACCEPT extends ResponseType(GtkResponseType.GTK_RESPONSE_ACCEPT)

  /** Returned if the dialog is deleted
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DELETE_EVENT
      extends ResponseType(GtkResponseType.GTK_RESPONSE_DELETE_EVENT)

  /** Returned by OK buttons in GTK dialogs
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OK extends ResponseType(GtkResponseType.GTK_RESPONSE_OK)

  /** Returned by Cancel buttons in GTK dialogs
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CANCEL extends ResponseType(GtkResponseType.GTK_RESPONSE_CANCEL)

  /** Returned by Close buttons in GTK dialogs
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CLOSE extends ResponseType(GtkResponseType.GTK_RESPONSE_CLOSE)

  /** Returned by Yes buttons in GTK dialogs
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case YES extends ResponseType(GtkResponseType.GTK_RESPONSE_YES)

  /** Returned by No buttons in GTK dialogs
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NO extends ResponseType(GtkResponseType.GTK_RESPONSE_NO)

  /** Returned by Apply buttons in GTK dialogs
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case APPLY extends ResponseType(GtkResponseType.GTK_RESPONSE_APPLY)

  /** Returned by Help buttons in GTK dialogs
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HELP extends ResponseType(GtkResponseType.GTK_RESPONSE_HELP)
end ResponseType

object ResponseType:
  def fromRaw(raw: GtkResponseType): ResponseType =
    raw match
      case GtkResponseType.GTK_RESPONSE_NONE         => ResponseType.NONE
      case GtkResponseType.GTK_RESPONSE_REJECT       => ResponseType.REJECT
      case GtkResponseType.GTK_RESPONSE_ACCEPT       => ResponseType.ACCEPT
      case GtkResponseType.GTK_RESPONSE_DELETE_EVENT =>
        ResponseType.DELETE_EVENT
      case GtkResponseType.GTK_RESPONSE_OK     => ResponseType.OK
      case GtkResponseType.GTK_RESPONSE_CANCEL => ResponseType.CANCEL
      case GtkResponseType.GTK_RESPONSE_CLOSE  => ResponseType.CLOSE
      case GtkResponseType.GTK_RESPONSE_YES    => ResponseType.YES
      case GtkResponseType.GTK_RESPONSE_NO     => ResponseType.NO
      case GtkResponseType.GTK_RESPONSE_APPLY  => ResponseType.APPLY
      case GtkResponseType.GTK_RESPONSE_HELP   => ResponseType.HELP
  end fromRaw
end ResponseType
