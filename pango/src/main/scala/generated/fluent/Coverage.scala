package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.Object
import sn.gnome.pango.fluent.Coverage
import sn.gnome.pango.fluent.CoverageLevel
import sn.gnome.pango.internal.PangoCoverage

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A `PangoCoverage` structure is a map from Unicode characters to
  * [enum@Pango.CoverageLevel] values.
  *
  * It is often necessary in Pango to determine if a particular font can
  * represent a particular character, and also how well it can represent that
  * character. The `PangoCoverage` is a data structure that is used to represent
  * that information. It is an opaque structure with no public fields.
  */
class Coverage(raw: Ptr[PangoCoverage]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Copy an existing `PangoCoverage`.
    */
  def copy(): Coverage /* None */ = new Coverage(
    pango_coverage_copy(this.raw.asInstanceOf[Ptr[PangoCoverage]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Determine whether a particular index is covered by @coverage.
    */
  def get(`index_`: Int /* Some(CInt) */ ): CoverageLevel /* None */ =
    CoverageLevel.fromRaw(
      pango_coverage_get(this.raw.asInstanceOf[Ptr[PangoCoverage]], `index_`)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Set the coverage for each index in @coverage to be the max (better) value
    * of the current coverage for the index and the coverage for the
    * corresponding index in @other.
    */
  def max(other: Coverage /* Some(Ptr[PangoCoverage]) */ ): Unit /* None */ =
    pango_coverage_max(
      this.raw.asInstanceOf[Ptr[PangoCoverage]],
      other.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Increase the reference count on the `PangoCoverage` by one.
    */
  override def ref(): Coverage /* None */ = new Coverage(
    pango_coverage_ref(this.raw.asInstanceOf[Ptr[PangoCoverage]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Modify a particular index within @coverage
    */
  def set(
      `index_`: Int /* Some(CInt) */,
      level: CoverageLevel /* Some(PangoCoverageLevel) */
  ): Unit /* None */ = pango_coverage_set(
    this.raw.asInstanceOf[Ptr[PangoCoverage]],
    `index_`,
    level.raw
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Convert a `PangoCoverage` structure into a flat binary format.
    */
  @annotation.compileTimeOnly(
    "Method to_bytes contains an OUT parameter, which is not supported yet"
  )
  private def toBytes__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Decrease the reference count on the `PangoCoverage` by one.
    *
    * If the result is zero, free the coverage and all associated memory.
    */
  override def unref(): Unit /* None */ = pango_coverage_unref(
    this.raw.asInstanceOf[Ptr[PangoCoverage]]
  )

end Coverage

object Coverage:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Create a new `PangoCoverage`
    */
  def apply(): Coverage = new Coverage(pango_coverage_new().asInstanceOf)
end Coverage
