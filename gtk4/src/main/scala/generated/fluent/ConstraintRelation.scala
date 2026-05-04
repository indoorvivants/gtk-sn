package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkConstraintRelation

/** The relation between two terms of a constraint.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum ConstraintRelation(val raw: GtkConstraintRelation):
  /** Less than, or equal
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LE
      extends ConstraintRelation(
        GtkConstraintRelation.GTK_CONSTRAINT_RELATION_LE
      )

  /** Equal
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case EQ
      extends ConstraintRelation(
        GtkConstraintRelation.GTK_CONSTRAINT_RELATION_EQ
      )

  /** Greater than, or equal
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case GE
      extends ConstraintRelation(
        GtkConstraintRelation.GTK_CONSTRAINT_RELATION_GE
      )
end ConstraintRelation

object ConstraintRelation:
  def fromRaw(raw: GtkConstraintRelation): ConstraintRelation =
    raw match
      case GtkConstraintRelation.GTK_CONSTRAINT_RELATION_LE =>
        ConstraintRelation.LE
      case GtkConstraintRelation.GTK_CONSTRAINT_RELATION_EQ =>
        ConstraintRelation.EQ
      case GtkConstraintRelation.GTK_CONSTRAINT_RELATION_GE =>
        ConstraintRelation.GE
  end fromRaw
end ConstraintRelation
