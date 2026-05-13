package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkPolicyType

/** Determines how the size should be computed to achieve the one of the
  * visibility mode for the scrollbars.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum PolicyType(val raw: GtkPolicyType):
  /** The scrollbar is always visible. The view size is independent of the
    * content.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ALWAYS extends PolicyType(GtkPolicyType.GTK_POLICY_ALWAYS)

  /** The scrollbar will appear and disappear as necessary. For example, when
    * all of a `GtkTreeView` can not be seen.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case AUTOMATIC extends PolicyType(GtkPolicyType.GTK_POLICY_AUTOMATIC)

  /** The scrollbar should never appear. In this mode the content determines the
    * size.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NEVER extends PolicyType(GtkPolicyType.GTK_POLICY_NEVER)

  /** Don't show a scrollbar, but don't force the size to follow the content.
    * This can be used e.g. to make multiple scrolled windows share a scrollbar.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
