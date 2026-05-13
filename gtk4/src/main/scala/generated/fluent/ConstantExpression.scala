package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.internal.GType
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.Expression
import sn.gnome.gtk4.internal.GtkConstantExpression

/** A constant value in a `GtkExpression`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ConstantExpression private[gnome] (raw: Ptr[GtkConstantExpression])
    extends Expression(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the value that a constant expression evaluates to.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_value/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GObject.Value), @type -> DataRecord(const GValue*)))"
  )
  private def getValue__ = ???

end ConstantExpression

object ConstantExpression:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkConstantExpression])(using Runtime) =
    summon[Runtime].getOrCreate[ConstantExpression](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ConstantExpression(ptr)
    )

  /** Creates a `GtkExpression` that evaluates to the object given by the
    * arguments.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  inline def apply(
      value_type: GType /* Some(_root_.sn.gnome.gobject.internal.GType) */,
      args: Any*
  )(using Runtime): ConstantExpression =
    val raw: Ptr[Byte] =
      gtk_constant_expression_new(value_type, args*).asInstanceOf
    summon[Runtime].getOrCreate[ConstantExpression](
      raw,
      r => ConstantExpression.applyUnsafe(r.asInstanceOf)
    )
  end apply

  /** Creates an expression that always evaluates to the given `value`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[constructor new_for_value/value]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GObject.Value), @type -> DataRecord(const GValue*)))"
  )
  private def forValue() = ???

end ConstantExpression
