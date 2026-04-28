package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.ParamSpec
import sn.gnome.gobject.internal.GType
import sn.gnome.gtk4.fluent.Expression
import sn.gnome.gtk4.internal.GtkPropertyExpression

class PropertyExpression(raw: Ptr[GtkPropertyExpression])
    extends Expression(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getExpression(): Expression = new Expression(
    gtk_property_expression_get_expression(this.raw.asInstanceOf).asInstanceOf
  )

  def getPspec(): ParamSpec = new ParamSpec(
    gtk_property_expression_get_pspec(this.raw.asInstanceOf).asInstanceOf
  )

end PropertyExpression

object PropertyExpression:
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
