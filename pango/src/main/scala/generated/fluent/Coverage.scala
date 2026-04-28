package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.Object
import sn.gnome.pango.fluent.Coverage
import sn.gnome.pango.internal.PangoCoverage
import sn.gnome.pango.internal.PangoCoverageLevel

class Coverage(raw: Ptr[PangoCoverage]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def copy(): Coverage = new Coverage(
    pango_coverage_copy(this.raw.asInstanceOf).asInstanceOf
  )

  def get(`index_`: Int): PangoCoverageLevel =
    pango_coverage_get(this.raw.asInstanceOf, `index_`)

  def max(other: Coverage): Unit = pango_coverage_max(
    this.raw.asInstanceOf,
    other.getUnsafeRawPointer().asInstanceOf
  )

  override def ref(): Coverage = new Coverage(
    pango_coverage_ref(this.raw.asInstanceOf).asInstanceOf
  )

  def set(`index_`: Int, level: PangoCoverageLevel): Unit =
    pango_coverage_set(this.raw.asInstanceOf, `index_`, level)

  // Method to_bytes contains an array parameter, which is not supported yet

  override def unref(): Unit = pango_coverage_unref(this.raw.asInstanceOf)

end Coverage

object Coverage:
  def apply(): Coverage = new Coverage(pango_coverage_new().asInstanceOf)
end Coverage
