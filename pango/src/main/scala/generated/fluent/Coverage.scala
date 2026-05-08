package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.pango.fluent.{Coverage, CoverageLevel}
import sn.gnome.pango.internal.PangoCoverage

/** A `PangoCoverage` structure is a map from Unicode characters to
  * [enum@Pango.CoverageLevel] values.
  *
  * It is often necessary in Pango to determine if a particular font can
  * represent a particular character, and also how well it can represent that
  * character. The `PangoCoverage` is a data structure that is used to represent
  * that information. It is an opaque structure with no public fields.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Coverage(raw: Ptr[PangoCoverage]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Copy an existing `PangoCoverage`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copy(): Coverage /* None */ = new Coverage(
    pango_coverage_copy(this.raw.asInstanceOf[Ptr[PangoCoverage]]).asInstanceOf
  )

  /** Determine whether a particular index is covered by @coverage.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def get(`index_`: Int /* Some(CInt) */ ): CoverageLevel /* None */ =
    CoverageLevel.fromRaw(
      pango_coverage_get(this.raw.asInstanceOf[Ptr[PangoCoverage]], `index_`)
    )

  /** Set the coverage for each index in @coverage to be the max (better) value
    * of the current coverage for the index and the coverage for the
    * corresponding index in @other.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def max(other: Coverage /* Some(Ptr[PangoCoverage]) */ ): Unit /* None */ =
    pango_coverage_max(
      this.raw.asInstanceOf[Ptr[PangoCoverage]],
      other.getUnsafeRawPointer().asInstanceOf
    )

  /** Increase the reference count on the `PangoCoverage` by one.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def ref(): Coverage /* None */ = new Coverage(
    pango_coverage_ref(this.raw.asInstanceOf[Ptr[PangoCoverage]]).asInstanceOf
  )

  /** Modify a particular index within @coverage
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def set(
      `index_`: Int /* Some(CInt) */,
      level: CoverageLevel /* Some(PangoCoverageLevel) */
  ): Unit /* None */ = pango_coverage_set(
    this.raw.asInstanceOf[Ptr[PangoCoverage]],
    `index_`,
    level.raw
  )

  /** Convert a `PangoCoverage` structure into a flat binary format.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method to_bytes]: Method to_bytes contains an OUT parameter, which is not supported yet"
  )
  private def toBytes__ = ???

  /** Decrease the reference count on the `PangoCoverage` by one.
    *
    * If the result is zero, free the coverage and all associated memory.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def unref(): Unit /* None */ = pango_coverage_unref(
    this.raw.asInstanceOf[Ptr[PangoCoverage]]
  )

end Coverage

object Coverage:
  /** Create a new `PangoCoverage`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): Coverage =
    val raw: Ptr[Byte] = pango_coverage_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[Coverage](raw, r => new Coverage(r.asInstanceOf))
  end apply

  /** Convert data generated from [method@Pango.Coverage.to_bytes] back to a
    * `PangoCoverage`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[<function parameters>/bytes]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(guchar*)))"
  )
  private def fromBytes() = ???

end Coverage
