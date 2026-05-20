package sn.gnome.gobject

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gchar
import sn.gnome.gobject.internal.GTypeValueTable

/** The #GTypeValueTable provides the functions required by the #GValue
  * implementation, to serve as a container for values of a type.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TypeValueTable private[gnome] (raw: Ptr[GTypeValueTable]):

  def getUnsafeRawPointer(): Ptr[GTypeValueTable] = this.raw

  /** Function to initialize a GValue
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field value_init]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TypeValueInitFunc), @type -> DataRecord(GTypeValueInitFunc)))"
  )
  private def valueInit__ = ???

  /** Function to free a GValue
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field value_free]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TypeValueFreeFunc), @type -> DataRecord(GTypeValueFreeFunc)))"
  )
  private def valueFree__ = ???

  /** Function to copy a GValue
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field value_copy]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TypeValueCopyFunc), @type -> DataRecord(GTypeValueCopyFunc)))"
  )
  private def valueCopy__ = ???

  /** Function to peek the contents of a GValue if they fit into a pointer
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field value_peek_pointer]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TypeValuePeekPointerFunc), @type -> DataRecord(GTypeValuePeekPointerFunc)))"
  )
  private def valuePeekPointer__ = ???

  /** A string format describing how to collect the contents of this value
    * bit-by-bit. Each character in the format represents an argument to be
    * collected, and the characters themselves indicate the type of the
    * argument. Currently supported arguments are:
    *   - `'i'`: Integers, passed as `collect_values[].v_int`
    *   - `'l'`: Longs, passed as `collect_values[].v_long`
    *   - `'d'`: Doubles, passed as `collect_values[].v_double`
    *   - `'p'`: Pointers, passed as `collect_values[].v_pointer`
    * It should be noted that for variable argument list construction, ANSI C
    * promotes every type smaller than an integer to an int, and floats to
    * doubles. So for collection of short int or char, `'i'` needs to be used,
    * and for collection of floats `'d'`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def collectFormat: scala.Predef.String /* None */ =
    (!raw).collect_format.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]

  /** A string format describing how to collect the contents of this value
    * bit-by-bit. Each character in the format represents an argument to be
    * collected, and the characters themselves indicate the type of the
    * argument. Currently supported arguments are:
    *   - `'i'`: Integers, passed as `collect_values[].v_int`
    *   - `'l'`: Longs, passed as `collect_values[].v_long`
    *   - `'d'`: Doubles, passed as `collect_values[].v_double`
    *   - `'p'`: Pointers, passed as `collect_values[].v_pointer`
    * It should be noted that for variable argument list construction, ANSI C
    * promotes every type smaller than an integer to an int, and floats to
    * doubles. So for collection of short int or char, `'i'` needs to be used,
    * and for collection of floats `'d'`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def collectFormat_=(
      value: scala.Predef.String /* None */
  )(using Zone): Unit = (!raw).collect_format_=(
    toCString(value)
      .asInstanceOf[Ptr[gchar]]
      .asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
  )

  /** Function to initialize a GValue from the values collected from variadic
    * arguments
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field collect_value]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TypeValueCollectFunc), @type -> DataRecord(GTypeValueCollectFunc)))"
  )
  private def collectValue__ = ???

  /** Format description of the arguments to collect for @lcopy_value, analogous
    * to @collect_format. Usually, @lcopy_format string consists only of `'p'`s
    * to provide lcopy_value() with pointers to storage locations.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def lcopyFormat: scala.Predef.String /* None */ =
    (!raw).lcopy_format.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]

  /** Format description of the arguments to collect for @lcopy_value, analogous
    * to @collect_format. Usually, @lcopy_format string consists only of `'p'`s
    * to provide lcopy_value() with pointers to storage locations.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def lcopyFormat_=(value: scala.Predef.String /* None */ )(using Zone): Unit =
    (!raw).lcopy_format_=(
      toCString(value)
        .asInstanceOf[Ptr[gchar]]
        .asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
    )

  /** Function to store the contents of a value into the locations collected
    * from variadic arguments
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field lcopy_value]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TypeValueLCopyFunc), @type -> DataRecord(GTypeValueLCopyFunc)))"
  )
  private def lcopyValue__ = ???
end TypeValueTable

object TypeValueTable:
  def fromRaw(ptr: Ptr[GTypeValueTable]): TypeValueTable = new TypeValueTable(
    ptr
  )
end TypeValueTable
