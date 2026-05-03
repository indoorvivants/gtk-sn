package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkConstraintStrength

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The strength of a constraint, expressed as a symbolic constant.
  *
  * The strength of a [class@Constraint] can be expressed with any positive
  * integer; the values of this enumeration can be used for readability.
  */
enum ConstraintStrength(val raw: GtkConstraintStrength):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The constraint is required towards solving the layout
    */
  case REQUIRED
      extends ConstraintStrength(
        GtkConstraintStrength.GTK_CONSTRAINT_STRENGTH_REQUIRED
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A strong constraint
    */
  case STRONG
      extends ConstraintStrength(
        GtkConstraintStrength.GTK_CONSTRAINT_STRENGTH_STRONG
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A medium constraint
    */
  case MEDIUM
      extends ConstraintStrength(
        GtkConstraintStrength.GTK_CONSTRAINT_STRENGTH_MEDIUM
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A weak constraint
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
