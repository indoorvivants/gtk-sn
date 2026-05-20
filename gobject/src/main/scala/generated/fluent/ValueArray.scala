package sn.gnome.gobject

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.{Value, ValueArray}
import sn.gnome.gobject.internal.GValueArray
import sn.gnome.runtime.*

/** A #GValueArray contains an array of #GValue elements.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ValueArray private[gnome] (raw: Ptr[GValueArray]):

  def getUnsafeRawPointer(): Ptr[GValueArray] = this.raw

  /** number of values contained in the array
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def nValues: UInt /* None */ =
    (!raw).n_values.asInstanceOf[_root_.sn.gnome.glib.internal.guint]

  /** number of values contained in the array
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def nValues_=(value: UInt /* None */ ): Unit = (!raw).n_values_=(
    guint(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint]
  )

  /** array of values
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def values(using Runtime): sn.gnome.gobject.Value /* None */ =
    (!raw).values.asInstanceOf[Ptr[GValue]]

  /** array of values
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def values_=(value: sn.gnome.gobject.Value /* None */ )(using Runtime): Unit =
    (!raw).values_=(
      value.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[GValue]]
    )

  /** Insert a copy of @value as last element of @value_array. If @value is
    * %NULL, an uninitialized value is appended.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def append(
      value: Option[sn.gnome.gobject.Value /* Some(Ptr[GValue]) */ ]
  )(using Runtime): sn.gnome.gobject.ValueArray /* None */ =
    sn.gnome.gobject.ValueArray.fromRaw(
      g_value_array_append(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GValueArray]],
        value
          .map[Ptr[GValue]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GValue]])
      )
    )
  end append

  /** Construct an exact copy of a #GValueArray by duplicating all its contents.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copy(): sn.gnome.gobject.ValueArray /* None */ =
    sn.gnome.gobject.ValueArray.fromRaw(
      g_value_array_copy(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GValueArray]]
      )
    )
  end copy

  /** Free a #GValueArray including its contents.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def free(): Unit /* None */ =
    g_value_array_free(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GValueArray]]
    )
  end free

  /** Return a pointer to the value at @index_ containd in @value_array.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNth(
      `index_`: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  )(using Runtime): sn.gnome.gobject.Value /* None */ =
    sn.gnome.gobject.Value.fromRaw(
      g_value_array_get_nth(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GValueArray]],
        guint(`index_`)
      )
    )
  end getNth

  /** Insert a copy of @value at specified position into @value_array. If @value
    * is %NULL, an uninitialized value is inserted.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insert(
      `index_`: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      value: Option[sn.gnome.gobject.Value /* Some(Ptr[GValue]) */ ]
  )(using Runtime): sn.gnome.gobject.ValueArray /* None */ =
    sn.gnome.gobject.ValueArray.fromRaw(
      g_value_array_insert(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GValueArray]],
        guint(`index_`),
        value
          .map[Ptr[GValue]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GValue]])
      )
    )
  end insert

  /** Insert a copy of @value as first element of @value_array. If @value is
    * %NULL, an uninitialized value is prepended.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def prepend(
      value: Option[sn.gnome.gobject.Value /* Some(Ptr[GValue]) */ ]
  )(using Runtime): sn.gnome.gobject.ValueArray /* None */ =
    sn.gnome.gobject.ValueArray.fromRaw(
      g_value_array_prepend(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GValueArray]],
        value
          .map[Ptr[GValue]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GValue]])
      )
    )
  end prepend

  /** Remove the value at position @index_ from @value_array.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def remove(
      `index_`: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): sn.gnome.gobject.ValueArray /* None */ =
    sn.gnome.gobject.ValueArray.fromRaw(
      g_value_array_remove(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GValueArray]],
        guint(`index_`)
      )
    )
  end remove

  /** Sort @value_array using @compare_func to compare the elements according to
    * the semantics of #GCompareFunc.
    *
    * The current implementation uses the same sorting algorithm as standard C
    * qsort() function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method sort/<method parameters>/compare_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.CompareFunc), @type -> DataRecord(GCompareFunc)))"
  )
  private def sort__ = ???

  /** Sort @value_array using @compare_func to compare the elements according to
    * the semantics of #GCompareDataFunc.
    *
    * The current implementation uses the same sorting algorithm as standard C
    * qsort() function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method sort_with_data/<method parameters>/compare_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.CompareDataFunc), @type -> DataRecord(GCompareDataFunc)))"
  )
  private def sortWithData__ = ???

end ValueArray

object ValueArray:
  def fromRaw(ptr: Ptr[GValueArray]): ValueArray = new ValueArray(ptr)
end ValueArray
