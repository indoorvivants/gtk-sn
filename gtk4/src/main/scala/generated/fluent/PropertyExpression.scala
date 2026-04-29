package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.ParamSpec
import sn.gnome.gobject.internal.GType
import sn.gnome.gtk4.fluent.Expression
import sn.gnome.gtk4.internal.GtkPropertyExpression

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A `GObject` property value in a `GtkExpression`.
  */
class PropertyExpression(raw: Ptr[GtkPropertyExpression])
    extends Expression(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the expression specifying the object of a property expression.
    */
  def getExpression(): Expression = new Expression(
    gtk_property_expression_get_expression(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the `GParamSpec` specifying the property of a property expression.
    */
  def getPspec(): ParamSpec = new ParamSpec(
    gtk_property_expression_get_pspec(this.raw.asInstanceOf).asInstanceOf
  )

end PropertyExpression

object PropertyExpression:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates an expression that looks up a property.
    *
    * The object to use is found by evaluating the `expression`, or using the
    * `this` argument when `expression` is `NULL`.
    *
    * If the resulting object conforms to `this_type`, its property named
    * `property_name` will be queried. Otherwise, this expression's evaluation
    * will fail.
    *
    * The given `this_type` must have a property with `property_name`.
    */
  def apply(
      this_type: GType,
      expression: Expression,
      property_name: String | CString
  )(using Zone): PropertyExpression = new PropertyExpression(
    gtk_property_expression_new(
      this_type,
      expression.getUnsafeRawPointer().asInstanceOf,
      __sn_extract_string(property_name)
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates an expression that looks up a property.
    *
    * The object to use is found by evaluating the `expression`, or using the
    * `this` argument when `expression` is `NULL`.
    *
    * If the resulting object conforms to `this_type`, its property specified by
    * `pspec` will be queried. Otherwise, this expression's evaluation will
    * fail.
    */
  def forPspec(expression: Expression, pspec: ParamSpec): PropertyExpression =
    new PropertyExpression(
      gtk_property_expression_new_for_pspec(
        expression.getUnsafeRawPointer().asInstanceOf,
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
