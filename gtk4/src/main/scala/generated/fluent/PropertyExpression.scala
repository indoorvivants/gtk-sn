package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.ParamSpec
import sn.gnome.gobject.internal.GType
import sn.gnome.gtk4.fluent.Expression
import sn.gnome.gtk4.internal.GtkPropertyExpression

/** A `GObject` property value in a `GtkExpression`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class PropertyExpression(raw: Ptr[GtkPropertyExpression])
    extends Expression(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the expression specifying the object of a property expression.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getExpression(): Expression /* None */ = new Expression(
    gtk_property_expression_get_expression(
      this.raw.asInstanceOf[Ptr[GtkExpression]]
    ).asInstanceOf
  )

  /** Gets the `GParamSpec` specifying the property of a property expression.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPspec(): ParamSpec /* None */ = new ParamSpec(
    gtk_property_expression_get_pspec(
      this.raw.asInstanceOf[Ptr[GtkExpression]]
    ).asInstanceOf
  )

end PropertyExpression

object PropertyExpression:
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
      expression: Option[Expression /* Some(Ptr[GtkExpression]) */ ],
      property_name: String | CString /* Some(CString) */
  )(using Zone): PropertyExpression = new PropertyExpression(
    gtk_property_expression_new(
      this_type,
      expression
        .map[Ptr[GtkExpression]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkExpression]]),
      __sn_extract_string(property_name)
    ).asInstanceOf
  )

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
      expression: Option[Expression /* Some(Ptr[GtkExpression]) */ ],
      pspec: ParamSpec /* Some(Ptr[_root_.sn.gnome.gobject.internal.GParamSpec]) */
  ): PropertyExpression = new PropertyExpression(
    gtk_property_expression_new_for_pspec(
      expression
        .map[Ptr[GtkExpression]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkExpression]]),
      pspec.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end PropertyExpression
