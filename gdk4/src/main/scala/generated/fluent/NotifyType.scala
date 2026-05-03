package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.GdkNotifyType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Specifies the kind of crossing for enter and leave events.
  *
  * See the X11 protocol specification of LeaveNotify for full details of
  * crossing event generation.
  */
enum NotifyType(val raw: GdkNotifyType):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the surface is entered from an ancestor or left towards an ancestor.
    */
  case ANCESTOR extends NotifyType(GdkNotifyType.GDK_NOTIFY_ANCESTOR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the pointer moves between an ancestor and an inferior of the surface.
    */
  case VIRTUAL extends NotifyType(GdkNotifyType.GDK_NOTIFY_VIRTUAL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the surface is entered from an inferior or left towards an inferior.
    */
  case INFERIOR extends NotifyType(GdkNotifyType.GDK_NOTIFY_INFERIOR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the surface is entered from or left towards a surface which is neither an
    * ancestor nor an inferior.
    */
  case NONLINEAR extends NotifyType(GdkNotifyType.GDK_NOTIFY_NONLINEAR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the pointer moves between two surfaces which are not ancestors of each
    * other and the surface is part of the ancestor chain between one of these
    * surfaces and their least common ancestor.
    */
  case NONLINEAR_VIRTUAL
      extends NotifyType(GdkNotifyType.GDK_NOTIFY_NONLINEAR_VIRTUAL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * an unknown type of enter/leave event occurred.
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
