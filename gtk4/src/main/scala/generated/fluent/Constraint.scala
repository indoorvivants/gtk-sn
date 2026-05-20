package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{ConstraintAttribute, ConstraintRelation, ConstraintTarget}
import sn.gnome.gtk4.internal.GtkConstraint

/** `GtkConstraint` describes a constraint between attributes of two widgets,
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Constraint private[gnome] (raw: Ptr[GtkConstraint])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Retrieves the constant factor added to the source attributes' value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getConstant(): Double /* None */ =
    gtk_constraint_get_constant(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkConstraint]]
    )
  end getConstant

  /** Retrieves the multiplication factor applied to the source attribute's
    * value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMultiplier(): Double /* None */ =
    gtk_constraint_get_multiplier(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkConstraint]]
    )
  end getMultiplier

  /** The order relation between the terms of the constraint.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRelation(): sn.gnome.gtk4.ConstraintRelation /* None */ =
    sn.gnome.gtk4.ConstraintRelation.fromRaw(
      gtk_constraint_get_relation(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkConstraint]]
      )
    )
  end getRelation

  /** Retrieves the [iface@Gtk.ConstraintTarget] used as the source for the
    * constraint.
    *
    * If the source is set to `NULL` at creation, the constraint will use the
    * widget using the [class@Gtk.ConstraintLayout] as the source.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSource(): sn.gnome.gtk4.ConstraintTarget /* None */ =
    new ConstraintTarget.Abstract(
      gtk_constraint_get_source(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkConstraint]]
      ).asInstanceOf
    )
  end getSource

  /** Retrieves the attribute of the source to be read by the constraint.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSourceAttribute(): sn.gnome.gtk4.ConstraintAttribute /* None */ =
    sn.gnome.gtk4.ConstraintAttribute.fromRaw(
      gtk_constraint_get_source_attribute(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkConstraint]]
      )
    )
  end getSourceAttribute

  /** Retrieves the strength of the constraint.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getStrength(): Int /* None */ =
    gtk_constraint_get_strength(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkConstraint]]
    )
  end getStrength

  /** Retrieves the [iface@Gtk.ConstraintTarget] used as the target for the
    * constraint.
    *
    * If the targe is set to `NULL` at creation, the constraint will use the
    * widget using the [class@Gtk.ConstraintLayout] as the target.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTarget(): sn.gnome.gtk4.ConstraintTarget /* None */ =
    new ConstraintTarget.Abstract(
      gtk_constraint_get_target(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkConstraint]]
      ).asInstanceOf
    )
  end getTarget

  /** Retrieves the attribute of the target to be set by the constraint.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTargetAttribute(): sn.gnome.gtk4.ConstraintAttribute /* None */ =
    sn.gnome.gtk4.ConstraintAttribute.fromRaw(
      gtk_constraint_get_target_attribute(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkConstraint]]
      )
    )
  end getTargetAttribute

  /** Checks whether the constraint is attached to a
    * [class@Gtk.ConstraintLayout], and it is contributing to the layout.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isAttached(): Boolean /* None */ =
    gtk_constraint_is_attached(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkConstraint]]
    ).value.!=(0)
  end isAttached

  /** Checks whether the constraint describes a relation between an attribute on
    * the [property@Gtk.Constraint:target] and a constant value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isConstant(): Boolean /* None */ =
    gtk_constraint_is_constant(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkConstraint]]
    ).value.!=(0)
  end isConstant

  /** Checks whether the constraint is a required relation for solving the
    * constraint layout.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isRequired(): Boolean /* None */ =
    gtk_constraint_is_required(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkConstraint]]
    ).value.!=(0)
  end isRequired

end Constraint

object Constraint:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkConstraint])(using Runtime) =
    summon[Runtime].getOrCreate[Constraint](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new Constraint(ptr)
    )

  /** Creates a new constraint representing a relation between a layout
    * attribute on a source and a layout attribute on a target.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      target: Option[
        sn.gnome.gtk4.ConstraintTarget /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ],
      target_attribute: sn.gnome.gtk4.ConstraintAttribute /* Some(GtkConstraintAttribute) */,
      relation: sn.gnome.gtk4.ConstraintRelation /* Some(GtkConstraintRelation) */,
      source: Option[
        sn.gnome.gtk4.ConstraintTarget /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ],
      source_attribute: sn.gnome.gtk4.ConstraintAttribute /* Some(GtkConstraintAttribute) */,
      multiplier: Double /* Some(Double) */,
      constant: Double /* Some(Double) */,
      strength: Int /* Some(CInt) */
  )(using Runtime): Constraint =
    val raw: Ptr[Byte] = gtk_constraint_new(
      target
        .map[_root_.sn.gnome.glib.internal.gpointer](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]),
      target_attribute.raw,
      relation.raw,
      source
        .map[_root_.sn.gnome.glib.internal.gpointer](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]),
      source_attribute.raw,
      multiplier,
      constant,
      strength
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[Constraint](raw, r => Constraint.applyUnsafe(r.asInstanceOf))
  end apply

  /** Creates a new constraint representing a relation between a layout
    * attribute on a target and a constant value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def constant(
      target: Option[
        sn.gnome.gtk4.ConstraintTarget /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ],
      target_attribute: sn.gnome.gtk4.ConstraintAttribute /* Some(GtkConstraintAttribute) */,
      relation: sn.gnome.gtk4.ConstraintRelation /* Some(GtkConstraintRelation) */,
      constant: Double /* Some(Double) */,
      strength: Int /* Some(CInt) */
  )(using Runtime): Constraint =
    val raw: Ptr[Byte] = gtk_constraint_new_constant(
      target
        .map[_root_.sn.gnome.glib.internal.gpointer](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]),
      target_attribute.raw,
      relation.raw,
      constant,
      strength
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[Constraint](raw, r => Constraint.applyUnsafe(r.asInstanceOf))
  end constant
end Constraint
