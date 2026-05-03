package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkConstraintRelation

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The relation between two terms of a constraint.
  */
enum ConstraintRelation(val raw: GtkConstraintRelation):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Less than, or equal
    */
  case LE
      extends ConstraintRelation(
        GtkConstraintRelation.GTK_CONSTRAINT_RELATION_LE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Equal
    */
  case EQ
      extends ConstraintRelation(
        GtkConstraintRelation.GTK_CONSTRAINT_RELATION_EQ
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Greater than, or equal
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
