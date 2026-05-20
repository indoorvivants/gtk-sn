package sn.gnome.harfbuzz

import _root_.sn.gnome.harfbuzz.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.harfbuzz.internal.hb_shape_plan_t

/** Data type for holding a shaping plan.
  *
  * Shape plans contain information about how HarfBuzz will shape a particular
  * text segment, based on the segment's properties and the capabilities in the
  * font face in use.
  *
  * Shape plans can be queried about how shaping will perform, given a set of
  * specific input parameters (script, language, direction, features, etc.).
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class shape_plan_t private[gnome] (raw: Ptr[hb_shape_plan_t]):

  def getUnsafeRawPointer(): Ptr[hb_shape_plan_t] = this.raw
end shape_plan_t

object shape_plan_t:
  def fromRaw(ptr: Ptr[hb_shape_plan_t]): shape_plan_t = new shape_plan_t(ptr)
end shape_plan_t
