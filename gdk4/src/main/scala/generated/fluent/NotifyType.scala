package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.GdkNotifyType

/** Specifies the kind of crossing for enter and leave events.
  *
  * See the X11 protocol specification of LeaveNotify for full details of
  * crossing event generation.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum NotifyType(val raw: GdkNotifyType):
  /** the surface is entered from an ancestor or left towards an ancestor.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ANCESTOR extends NotifyType(GdkNotifyType.GDK_NOTIFY_ANCESTOR)

  /** the pointer moves between an ancestor and an inferior of the surface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case VIRTUAL extends NotifyType(GdkNotifyType.GDK_NOTIFY_VIRTUAL)

  /** the surface is entered from an inferior or left towards an inferior.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INFERIOR extends NotifyType(GdkNotifyType.GDK_NOTIFY_INFERIOR)

  /** the surface is entered from or left towards a surface which is neither an
    * ancestor nor an inferior.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NONLINEAR extends NotifyType(GdkNotifyType.GDK_NOTIFY_NONLINEAR)

  /** the pointer moves between two surfaces which are not ancestors of each
    * other and the surface is part of the ancestor chain between one of these
    * surfaces and their least common ancestor.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NONLINEAR_VIRTUAL
      extends NotifyType(GdkNotifyType.GDK_NOTIFY_NONLINEAR_VIRTUAL)

  /** an unknown type of enter/leave event occurred.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNKNOWN extends NotifyType(GdkNotifyType.GDK_NOTIFY_UNKNOWN)
end NotifyType

object NotifyType:
  def fromRaw(raw: GdkNotifyType): NotifyType =
    raw match
      case GdkNotifyType.GDK_NOTIFY_ANCESTOR          => NotifyType.ANCESTOR
      case GdkNotifyType.GDK_NOTIFY_VIRTUAL           => NotifyType.VIRTUAL
      case GdkNotifyType.GDK_NOTIFY_INFERIOR          => NotifyType.INFERIOR
      case GdkNotifyType.GDK_NOTIFY_NONLINEAR         => NotifyType.NONLINEAR
      case GdkNotifyType.GDK_NOTIFY_NONLINEAR_VIRTUAL =>
        NotifyType.NONLINEAR_VIRTUAL
      case GdkNotifyType.GDK_NOTIFY_UNKNOWN => NotifyType.UNKNOWN
  end fromRaw
end NotifyType
