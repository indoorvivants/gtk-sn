package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkConstraintStrength

/** The strength of a constraint, expressed as a symbolic constant.
  *
  * The strength of a [class@Constraint] can be expressed with any positive
  * integer; the values of this enumeration can be used for readability.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum ConstraintStrength(val raw: GtkConstraintStrength):
  /** The constraint is required towards solving the layout
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case REQUIRED
      extends ConstraintStrength(
        GtkConstraintStrength.GTK_CONSTRAINT_STRENGTH_REQUIRED
      )

  /** A strong constraint
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case STRONG
      extends ConstraintStrength(
        GtkConstraintStrength.GTK_CONSTRAINT_STRENGTH_STRONG
      )

  /** A medium constraint
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MEDIUM
      extends ConstraintStrength(
        GtkConstraintStrength.GTK_CONSTRAINT_STRENGTH_MEDIUM
      )

  /** A weak constraint
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case WEAK
      extends ConstraintStrength(
        GtkConstraintStrength.GTK_CONSTRAINT_STRENGTH_WEAK
      )
end ConstraintStrength

object ConstraintStrength:
  def fromRaw(raw: GtkConstraintStrength): ConstraintStrength =
    raw match
      case GtkConstraintStrength.GTK_CONSTRAINT_STRENGTH_REQUIRED =>
        ConstraintStrength.REQUIRED
      case GtkConstraintStrength.GTK_CONSTRAINT_STRENGTH_STRONG =>
        ConstraintStrength.STRONG
      case GtkConstraintStrength.GTK_CONSTRAINT_STRENGTH_MEDIUM =>
        ConstraintStrength.MEDIUM
      case GtkConstraintStrength.GTK_CONSTRAINT_STRENGTH_WEAK =>
        ConstraintStrength.WEAK
  end fromRaw
end ConstraintStrength
