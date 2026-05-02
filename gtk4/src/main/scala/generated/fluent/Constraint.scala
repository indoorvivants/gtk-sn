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

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkConstraint` describes a constraint between attributes of two widgets,
  * expressed as a linear equation.
  *
  * The typical equation for a constraint is:
  *
  * ```
  *   target.target_attr = source.source_attr × multiplier + constant
  * ```
  *
  * Each `GtkConstraint` is part of a system that will be solved by a
  * [class@Gtk.ConstraintLayout] in order to allocate and position each child
  * widget or guide.
  *
  * The source and target, as well as their attributes, of a `GtkConstraint`
  * instance are immutable after creation.
  */
class Constraint(raw: Ptr[GtkConstraint]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the constant factor added to the source attributes' value.
    */
  def getConstant(): Double /* None */ = gtk_constraint_get_constant(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the multiplication factor applied to the source attribute's
    * value.
    */
  def getMultiplier(): Double /* None */ = gtk_constraint_get_multiplier(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The order relation between the terms of the constraint.
    */
  def getRelation(): GtkConstraintRelation /* None */ =
    gtk_constraint_get_relation(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the [iface@Gtk.ConstraintTarget] used as the source for the
    * constraint.
    *
    * If the source is set to `NULL` at creation, the constraint will use the
    * widget using the [class@Gtk.ConstraintLayout] as the source.
    */
  def getSource(): ConstraintTarget /* None */ = new ConstraintTarget.Abstract(
    gtk_constraint_get_source(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the attribute of the source to be read by the constraint.
    */
  def getSourceAttribute(): GtkConstraintAttribute /* None */ =
    gtk_constraint_get_source_attribute(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the strength of the constraint.
    */
  def getStrength(): Int /* None */ = gtk_constraint_get_strength(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the [iface@Gtk.ConstraintTarget] used as the target for the
    * constraint.
    *
    * If the targe is set to `NULL` at creation, the constraint will use the
    * widget using the [class@Gtk.ConstraintLayout] as the target.
    */
  def getTarget(): ConstraintTarget /* None */ = new ConstraintTarget.Abstract(
    gtk_constraint_get_target(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the attribute of the target to be set by the constraint.
    */
  def getTargetAttribute(): GtkConstraintAttribute /* None */ =
    gtk_constraint_get_target_attribute(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks whether the constraint is attached to a
    * [class@Gtk.ConstraintLayout], and it is contributing to the layout.
    */
  def isAttached(): Boolean /* None */ =
    gtk_constraint_is_attached(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks whether the constraint describes a relation between an attribute on
    * the [property@Gtk.Constraint:target] and a constant value.
    */
  def isConstant(): Boolean /* None */ =
    gtk_constraint_is_constant(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks whether the constraint is a required relation for solving the
    * constraint layout.
    */
  def isRequired(): Boolean /* None */ =
    gtk_constraint_is_required(this.raw.asInstanceOf).value.!=(0)

end Constraint

object Constraint:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new constraint representing a relation between a layout
    * attribute on a source and a layout attribute on a target.
    */
  def apply(
      target: Option[
        ConstraintTarget /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ],
      target_attribute: GtkConstraintAttribute /* Some(GtkConstraintAttribute) */,
      relation: GtkConstraintRelation /* Some(GtkConstraintRelation) */,
      source: Option[
        ConstraintTarget /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ],
      source_attribute: GtkConstraintAttribute /* Some(GtkConstraintAttribute) */,
      multiplier: Double /* Some(Double) */,
      constant: Double /* Some(Double) */,
      strength: Int /* Some(CInt) */
  ): Constraint = new Constraint(
    gtk_constraint_new(
      target
        .map[_root_.sn.gnome.glib.internal.gpointer](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]),
      target_attribute,
      relation,
      source
        .map[_root_.sn.gnome.glib.internal.gpointer](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]),
      source_attribute,
      multiplier,
      constant,
      strength
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new constraint representing a relation between a layout
    * attribute on a target and a constant value.
    */
  def constant(
      target: Option[
        ConstraintTarget /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ],
      target_attribute: GtkConstraintAttribute /* Some(GtkConstraintAttribute) */,
      relation: GtkConstraintRelation /* Some(GtkConstraintRelation) */,
      constant: Double /* Some(Double) */,
      strength: Int /* Some(CInt) */
  ): Constraint = new Constraint(
    gtk_constraint_new_constant(
      target
        .map[_root_.sn.gnome.glib.internal.gpointer](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]),
      target_attribute,
      relation,
      constant,
      strength
    ).asInstanceOf
  )
end Constraint
