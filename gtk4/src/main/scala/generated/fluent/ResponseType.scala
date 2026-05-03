package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkResponseType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Predefined values for use as response ids in gtk_dialog_add_button().
  *
  * All predefined values are negative; GTK leaves values of 0 or greater for
  * application-defined response ids.
  */
enum ResponseType(val raw: GtkResponseType):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returned if an action widget has no response id, or if the dialog gets
    * programmatically hidden or destroyed
    */
  case NONE extends ResponseType(GtkResponseType.GTK_RESPONSE_NONE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Generic response id, not used by GTK dialogs
    */
  case REJECT extends ResponseType(GtkResponseType.GTK_RESPONSE_REJECT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Generic response id, not used by GTK dialogs
    */
  case ACCEPT extends ResponseType(GtkResponseType.GTK_RESPONSE_ACCEPT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returned if the dialog is deleted
    */
  case DELETE_EVENT
      extends ResponseType(GtkResponseType.GTK_RESPONSE_DELETE_EVENT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returned by OK buttons in GTK dialogs
    */
  case OK extends ResponseType(GtkResponseType.GTK_RESPONSE_OK)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returned by Cancel buttons in GTK dialogs
    */
  case CANCEL extends ResponseType(GtkResponseType.GTK_RESPONSE_CANCEL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returned by Close buttons in GTK dialogs
    */
  case CLOSE extends ResponseType(GtkResponseType.GTK_RESPONSE_CLOSE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returned by Yes buttons in GTK dialogs
    */
  case YES extends ResponseType(GtkResponseType.GTK_RESPONSE_YES)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returned by No buttons in GTK dialogs
    */
  case NO extends ResponseType(GtkResponseType.GTK_RESPONSE_NO)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returned by Apply buttons in GTK dialogs
    */
  case APPLY extends ResponseType(GtkResponseType.GTK_RESPONSE_APPLY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returned by Help buttons in GTK dialogs
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
