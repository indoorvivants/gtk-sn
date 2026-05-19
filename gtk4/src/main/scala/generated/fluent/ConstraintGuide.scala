package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{ConstraintStrength, ConstraintTarget}
import sn.gnome.gtk4.internal.GtkConstraintGuide

/** A `GtkConstraintGuide` is an invisible layout element in a
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ConstraintGuide private[gnome] (raw: Ptr[GtkConstraintGuide])
    extends Object(raw.asInstanceOf),
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the maximum size of @guide.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_max_size]: Method get_max_size contains an OUT parameter, which is not supported yet"
  )
  private def getMaxSize__ = ???

  /** Gets the minimum size of @guide.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_min_size]: Method get_min_size contains an OUT parameter, which is not supported yet"
  )
  private def getMinSize__ = ???

  /** Retrieves the name set using gtk_constraint_guide_set_name().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getName(): String /* None */ =
    fromCString(
      gtk_constraint_guide_get_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkConstraintGuide]]
      ).asInstanceOf
    )
  end getName

  /** Gets the natural size of @guide.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_nat_size]: Method get_nat_size contains an OUT parameter, which is not supported yet"
  )
  private def getNatSize__ = ???

  /** Retrieves the strength set using gtk_constraint_guide_set_strength().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getStrength(): ConstraintStrength /* None */ =
    ConstraintStrength.fromRaw(
      gtk_constraint_guide_get_strength(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkConstraintGuide]]
      )
    )
  end getStrength

  /** Sets the maximum size of @guide.
    *
    * If @guide is attached to a `GtkConstraintLayout`, the constraints will be
    * updated to reflect the new size.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMaxSize(
      width: Int /* Some(CInt) */,
      height: Int /* Some(CInt) */
  ): Unit /* None */ =
    gtk_constraint_guide_set_max_size(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkConstraintGuide]],
      width,
      height
    )
  end setMaxSize

  /** Sets the minimum size of @guide.
    *
    * If @guide is attached to a `GtkConstraintLayout`, the constraints will be
    * updated to reflect the new size.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMinSize(
      width: Int /* Some(CInt) */,
      height: Int /* Some(CInt) */
  ): Unit /* None */ =
    gtk_constraint_guide_set_min_size(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkConstraintGuide]],
      width,
      height
    )
  end setMinSize

  /** Sets a name for the given `GtkConstraintGuide`.
    *
    * The name is useful for debugging purposes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setName(name: Option[String /* Some(CString) */ ])(using
      Runtime
  ): Unit /* None */ =
    gtk_constraint_guide_set_name(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkConstraintGuide]],
      name
        .map[CString](o => summon[Runtime].inZone(toCString(o)))
        .getOrElse(null.asInstanceOf[CString])
    )
  end setName

  /** Sets the natural size of @guide.
    *
    * If @guide is attached to a `GtkConstraintLayout`, the constraints will be
    * updated to reflect the new size.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setNatSize(
      width: Int /* Some(CInt) */,
      height: Int /* Some(CInt) */
  ): Unit /* None */ =
    gtk_constraint_guide_set_nat_size(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkConstraintGuide]],
      width,
      height
    )
  end setNatSize

  /** Sets the strength of the constraint on the natural size of the given
    * `GtkConstraintGuide`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setStrength(
      strength: ConstraintStrength /* Some(GtkConstraintStrength) */
  ): Unit /* None */ =
    gtk_constraint_guide_set_strength(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkConstraintGuide]],
      strength.raw
    )
  end setStrength

end ConstraintGuide

object ConstraintGuide:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkConstraintGuide])(using Runtime) =
    summon[Runtime].getOrCreate[ConstraintGuide](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ConstraintGuide(ptr)
    )

  /** Creates a new `GtkConstraintGuide` object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): ConstraintGuide =
    val raw: Ptr[Byte] = gtk_constraint_guide_new().asInstanceOf
    summon[Runtime].getOrCreate[ConstraintGuide](
      raw,
      r => ConstraintGuide.applyUnsafe(r.asInstanceOf)
    )
  end apply
end ConstraintGuide
