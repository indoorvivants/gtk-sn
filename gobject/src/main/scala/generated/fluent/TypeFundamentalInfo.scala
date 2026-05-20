package sn.gnome.gobject

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.TypeFundamentalFlags
import sn.gnome.gobject.internal.GTypeFundamentalInfo

/** A structure that provides information to the type system which is used
  * specifically for managing fundamental types.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TypeFundamentalInfo private[gnome] (raw: Ptr[GTypeFundamentalInfo]):

  def getUnsafeRawPointer(): Ptr[GTypeFundamentalInfo] = this.raw

  /** #GTypeFundamentalFlags describing the characteristics of the fundamental
    * type
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def typeFlags: sn.gnome.gobject.TypeFundamentalFlags /* None */ =
    (!raw).type_flags.asInstanceOf[GTypeFundamentalFlags]

  /** #GTypeFundamentalFlags describing the characteristics of the fundamental
    * type
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def typeFlags_=(
      value: sn.gnome.gobject.TypeFundamentalFlags /* None */
  ): Unit =
    (!raw).type_flags_=(value.raw.value.asInstanceOf[GTypeFundamentalFlags])
end TypeFundamentalInfo

object TypeFundamentalInfo:
  def fromRaw(ptr: Ptr[GTypeFundamentalInfo]): TypeFundamentalInfo =
    new TypeFundamentalInfo(ptr)
end TypeFundamentalInfo
