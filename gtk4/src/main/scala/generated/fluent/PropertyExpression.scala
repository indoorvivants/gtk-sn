package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.ParamSpec
import sn.gnome.gobject.internal.GType
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.Expression
import sn.gnome.gtk4.internal.GtkPropertyExpression

/** A `GObject` property value in a `GtkExpression`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class PropertyExpression private[gnome] (raw: Ptr[GtkPropertyExpression])
    extends Expression(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the expression specifying the object of a property expression.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getExpression()(using
      Runtime
  ): sn.gnome.gtk4.fluent.Expression /* None */ =
    sn.gnome.gtk4.fluent.Expression.applyUnsafe(
      gtk_property_expression_get_expression(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkExpression]]
      ).asInstanceOf
    )
  end getExpression

  /** Gets the `GParamSpec` specifying the property of a property expression.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPspec()(using Runtime): sn.gnome.gobject.fluent.ParamSpec /* None */ =
    sn.gnome.gobject.fluent.ParamSpec.applyUnsafe(
      gtk_property_expression_get_pspec(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkExpression]]
      ).asInstanceOf
    )
  end getPspec

end PropertyExpression

object PropertyExpression:
  def applyUnsafe(ptr: Ptr[GtkPropertyExpression])(using Runtime) =
    summon[Runtime].getOrCreate[PropertyExpression](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new PropertyExpression(ptr)
    )

  /** Creates an expression that looks up a property.
    *
    * The object to use is found by evaluating the `expression`, or using the
    * `this` argument when `expression` is `NULL`.
    *
    * If the resulting object conforms to `this_type`, its property named
    * `property_name` will be queried. Otherwise, this expression's evaluation
    * will fail.
    *
    * The given `this_type` must have a property with `property_name`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      this_type: GType /* Some(_root_.sn.gnome.gobject.internal.GType) */,
      expression: Option[
        sn.gnome.gtk4.fluent.Expression /* Some(Ptr[GtkExpression]) */
      ],
      property_name: String /* Some(CString) */
  )(using Zone, Runtime): PropertyExpression =
    val raw: Ptr[Byte] = gtk_property_expression_new(
      this_type,
      expression
        .map[Ptr[GtkExpression]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkExpression]]),
      toCString(property_name)
    ).asInstanceOf
    summon[Runtime].getOrCreate[PropertyExpression](
      raw,
      r => PropertyExpression.applyUnsafe(r.asInstanceOf)
    )
  end apply

  /** Creates an expression that looks up a property.
    *
    * The object to use is found by evaluating the `expression`, or using the
    * `this` argument when `expression` is `NULL`.
    *
    * If the resulting object conforms to `this_type`, its property specified by
    * `pspec` will be queried. Otherwise, this expression's evaluation will
    * fail.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def forPspec(
      expression: Option[
        sn.gnome.gtk4.fluent.Expression /* Some(Ptr[GtkExpression]) */
      ],
      pspec: sn.gnome.gobject.fluent.ParamSpec /* Some(Ptr[_root_.sn.gnome.gobject.internal.GParamSpec]) */
  )(using Runtime): PropertyExpression =
    val raw: Ptr[Byte] = gtk_property_expression_new_for_pspec(
      expression
        .map[Ptr[GtkExpression]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkExpression]]),
      pspec.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
    summon[Runtime].getOrCreate[PropertyExpression](
      raw,
      r => PropertyExpression.applyUnsafe(r.asInstanceOf)
    )
  end forPspec
end PropertyExpression
