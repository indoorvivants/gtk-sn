package sn.gnome.graphene.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * graphene_ray_intersection_kind_t: _RAY_INTERSECTION_KIND_NONE: No intersection _RAY_INTERSECTION_KIND_ENTER: The ray is entering the intersected object _RAY_INTERSECTION_KIND_LEAVE: The ray is leaving the intersected object
*/
opaque type graphene_ray_intersection_kind_t = CUnsignedInt
object graphene_ray_intersection_kind_t extends _BindgenEnumCUnsignedInt[graphene_ray_intersection_kind_t]:
  given _tag: Tag[graphene_ray_intersection_kind_t] = Tag.UInt
  inline def define(inline a: Long): graphene_ray_intersection_kind_t = a.toUInt
  val GRAPHENE_RAY_INTERSECTION_KIND_NONE = define(0)
  val GRAPHENE_RAY_INTERSECTION_KIND_ENTER = define(1)
  val GRAPHENE_RAY_INTERSECTION_KIND_LEAVE = define(2)
  def getName(value: graphene_ray_intersection_kind_t): Option[String] =
    value match
      case `GRAPHENE_RAY_INTERSECTION_KIND_NONE` => Some("GRAPHENE_RAY_INTERSECTION_KIND_NONE")
      case `GRAPHENE_RAY_INTERSECTION_KIND_ENTER` => Some("GRAPHENE_RAY_INTERSECTION_KIND_ENTER")
      case `GRAPHENE_RAY_INTERSECTION_KIND_LEAVE` => Some("GRAPHENE_RAY_INTERSECTION_KIND_LEAVE")
      case _ => _root_.scala.None
  extension (a: graphene_ray_intersection_kind_t)
    inline def &(b: graphene_ray_intersection_kind_t): graphene_ray_intersection_kind_t = a & b
    inline def |(b: graphene_ray_intersection_kind_t): graphene_ray_intersection_kind_t = a | b
    inline def is(b: graphene_ray_intersection_kind_t): Boolean = (a & b) == b