package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.ListModel
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.Constraint
import sn.gnome.gtk4.fluent.ConstraintGuide
import sn.gnome.gtk4.fluent.LayoutManager
import sn.gnome.gtk4.internal.GtkConstraintLayout

class ConstraintLayout(raw: Ptr[GtkConstraintLayout])
    extends LayoutManager(raw.asInstanceOf),
      Buildable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def addConstraint(constraint: Constraint): Unit =
    gtk_constraint_layout_add_constraint(
      this.raw.asInstanceOf,
      constraint.getUnsafeRawPointer().asInstanceOf
    )

  // Method add_constraints_from_description contains an array parameter, which is not supported yet

  // Method add_constraints_from_descriptionv contains an array parameter, which is not supported yet

  def addGuide(guide: ConstraintGuide): Unit = gtk_constraint_layout_add_guide(
    this.raw.asInstanceOf,
    guide.getUnsafeRawPointer().asInstanceOf
  )

  def observeConstraints(): ListModel = new ListModel.Abstract(
    gtk_constraint_layout_observe_constraints(
      this.raw.asInstanceOf
    ).asInstanceOf
  )

  def observeGuides(): ListModel = new ListModel.Abstract(
    gtk_constraint_layout_observe_guides(this.raw.asInstanceOf).asInstanceOf
  )

  def removeAllConstraints(): Unit =
    gtk_constraint_layout_remove_all_constraints(this.raw.asInstanceOf)

  def removeConstraint(constraint: Constraint): Unit =
    gtk_constraint_layout_remove_constraint(
      this.raw.asInstanceOf,
      constraint.getUnsafeRawPointer().asInstanceOf
    )

  def removeGuide(guide: ConstraintGuide): Unit =
    gtk_constraint_layout_remove_guide(
      this.raw.asInstanceOf,
      guide.getUnsafeRawPointer().asInstanceOf
    )

end ConstraintLayout

object ConstraintLayout:
  def apply(): ConstraintLayout = new ConstraintLayout(
    gtk_constraint_layout_new().asInstanceOf
  )
end ConstraintLayout
