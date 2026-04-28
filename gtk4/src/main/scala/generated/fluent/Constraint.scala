package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.internal.GtkConstraint
import sn.gnome.gtk4.internal.GtkConstraintAttribute
import sn.gnome.gtk4.internal.GtkConstraintRelation

class Constraint(raw: Ptr[GtkConstraint]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getConstant(): Double = gtk_constraint_get_constant(this.raw.asInstanceOf)

  def getMultiplier(): Double = gtk_constraint_get_multiplier(
    this.raw.asInstanceOf
  )

  def getRelation(): GtkConstraintRelation = gtk_constraint_get_relation(
    this.raw.asInstanceOf
  )

  def getSource(): ConstraintTarget = new ConstraintTarget.Abstract(
    gtk_constraint_get_source(this.raw.asInstanceOf).asInstanceOf
  )

  def getSourceAttribute(): GtkConstraintAttribute =
    gtk_constraint_get_source_attribute(this.raw.asInstanceOf)

  def getStrength(): Int = gtk_constraint_get_strength(this.raw.asInstanceOf)

  def getTarget(): ConstraintTarget = new ConstraintTarget.Abstract(
    gtk_constraint_get_target(this.raw.asInstanceOf).asInstanceOf
  )

  def getTargetAttribute(): GtkConstraintAttribute =
    gtk_constraint_get_target_attribute(this.raw.asInstanceOf)

  def isAttached(): Boolean =
    gtk_constraint_is_attached(this.raw.asInstanceOf).value.!=(0)

  def isConstant(): Boolean =
    gtk_constraint_is_constant(this.raw.asInstanceOf).value.!=(0)

  def isRequired(): Boolean =
    gtk_constraint_is_required(this.raw.asInstanceOf).value.!=(0)

end Constraint

object Constraint:
  def apply(
      target: ConstraintTarget,
      target_attribute: GtkConstraintAttribute,
      relation: GtkConstraintRelation,
      source: ConstraintTarget,
      source_attribute: GtkConstraintAttribute,
      multiplier: Double,
      constant: Double,
      strength: Int
  ): Constraint = new Constraint(
    gtk_constraint_new(
      target.getUnsafeRawPointer().asInstanceOf,
      target_attribute,
      relation,
      source.getUnsafeRawPointer().asInstanceOf,
      source_attribute,
      multiplier,
      constant,
      strength
    ).asInstanceOf
  )
  def constant(
      target: ConstraintTarget,
      target_attribute: GtkConstraintAttribute,
      relation: GtkConstraintRelation,
      constant: Double,
      strength: Int
  ): Constraint = new Constraint(
    gtk_constraint_new_constant(
      target.getUnsafeRawPointer().asInstanceOf,
      target_attribute,
      relation,
      constant,
      strength
    ).asInstanceOf
  )
end Constraint
