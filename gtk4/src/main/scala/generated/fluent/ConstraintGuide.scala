package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.internal.GtkConstraintGuide
import sn.gnome.gtk4.internal.GtkConstraintStrength

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A `GtkConstraintGuide` is an invisible layout element in a
  * `GtkConstraintLayout`.
  *
  * The `GtkConstraintLayout` treats guides like widgets. They can be used as
  * the source or target of a `GtkConstraint`.
  *
  * Guides have a minimum, maximum and natural size. Depending on the
  * constraints that are applied, they can act like a guideline that widgets can
  * be aligned to, or like *flexible space*.
  *
  * Unlike a `GtkWidget`, a `GtkConstraintGuide` will not be drawn.
  */
class ConstraintGuide(raw: Ptr[GtkConstraintGuide])
    extends Object(raw.asInstanceOf),
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  @annotation.compileTimeOnly(
    "Method get_max_size contains an OUT parameter, which is not supported yet"
  )
  def getMaxSize(using DummyImplicit) = ???

  @annotation.compileTimeOnly(
    "Method get_min_size contains an OUT parameter, which is not supported yet"
  )
  def getMinSize(using DummyImplicit) = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the name set using gtk_constraint_guide_set_name().
    */
  def getName()(using Zone): String = fromCString(
    gtk_constraint_guide_get_name(this.raw.asInstanceOf).asInstanceOf
  )

  @annotation.compileTimeOnly(
    "Method get_nat_size contains an OUT parameter, which is not supported yet"
  )
  def getNatSize(using DummyImplicit) = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the strength set using gtk_constraint_guide_set_strength().
    */
  def getStrength(): GtkConstraintStrength = gtk_constraint_guide_get_strength(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the maximum size of @guide.
    *
    * If @guide is attached to a `GtkConstraintLayout`, the constraints will be
    * updated to reflect the new size.
    */
  def setMaxSize(width: Int, height: Int): Unit =
    gtk_constraint_guide_set_max_size(this.raw.asInstanceOf, width, height)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the minimum size of @guide.
    *
    * If @guide is attached to a `GtkConstraintLayout`, the constraints will be
    * updated to reflect the new size.
    */
  def setMinSize(width: Int, height: Int): Unit =
    gtk_constraint_guide_set_min_size(this.raw.asInstanceOf, width, height)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets a name for the given `GtkConstraintGuide`.
    *
    * The name is useful for debugging purposes.
    */
  def setName(name: String | CString)(using Zone): Unit =
    gtk_constraint_guide_set_name(
      this.raw.asInstanceOf,
      __sn_extract_string(name)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the natural size of @guide.
    *
    * If @guide is attached to a `GtkConstraintLayout`, the constraints will be
    * updated to reflect the new size.
    */
  def setNatSize(width: Int, height: Int): Unit =
    gtk_constraint_guide_set_nat_size(this.raw.asInstanceOf, width, height)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the strength of the constraint on the natural size of the given
    * `GtkConstraintGuide`.
    */
  def setStrength(strength: GtkConstraintStrength): Unit =
    gtk_constraint_guide_set_strength(this.raw.asInstanceOf, strength)

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end ConstraintGuide

object ConstraintGuide:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkConstraintGuide` object.
    */
  def apply(): ConstraintGuide = new ConstraintGuide(
    gtk_constraint_guide_new().asInstanceOf
  )
end ConstraintGuide
