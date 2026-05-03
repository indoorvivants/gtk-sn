package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkPolicyType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Determines how the size should be computed to achieve the one of the
  * visibility mode for the scrollbars.
  */
enum PolicyType(val raw: GtkPolicyType):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The scrollbar is always visible. The view size is independent of the
    * content.
    */
  case ALWAYS extends PolicyType(GtkPolicyType.GTK_POLICY_ALWAYS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The scrollbar will appear and disappear as necessary. For example, when
    * all of a `GtkTreeView` can not be seen.
    */
  case AUTOMATIC extends PolicyType(GtkPolicyType.GTK_POLICY_AUTOMATIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The scrollbar should never appear. In this mode the content determines the
    * size.
    */
  case NEVER extends PolicyType(GtkPolicyType.GTK_POLICY_NEVER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Don't show a scrollbar, but don't force the size to follow the content.
    * This can be used e.g. to make multiple scrolled windows share a scrollbar.
    */
  case EXTERNAL extends PolicyType(GtkPolicyType.GTK_POLICY_EXTERNAL)
end PolicyType

object PolicyType:
  def fromRaw(raw: GtkPolicyType): PolicyType =
    raw match
      case GtkPolicyType.GTK_POLICY_ALWAYS    => PolicyType.ALWAYS
      case GtkPolicyType.GTK_POLICY_AUTOMATIC => PolicyType.AUTOMATIC
      case GtkPolicyType.GTK_POLICY_NEVER     => PolicyType.NEVER
      case GtkPolicyType.GTK_POLICY_EXTERNAL  => PolicyType.EXTERNAL
  end fromRaw
end PolicyType
