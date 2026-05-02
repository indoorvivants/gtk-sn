package sn.gnome.gobject.fluent

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.ParamSpec
import sn.gnome.gobject.internal.GParamSpecVariant

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A #GParamSpec derived structure that contains the meta data for #GVariant
  * properties.
  *
  * When comparing values with g_param_values_cmp(), scalar values with the same
  * type will be compared with g_variant_compare(). Other non-%NULL variants
  * will be checked for equality with g_variant_equal(), and their sort order is
  * otherwise undefined. %NULL is ordered before non-%NULL variants. Two %NULL
  * values compare equal.
  */
class ParamSpecVariant(raw: Ptr[GParamSpecVariant])
    extends ParamSpec(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end ParamSpecVariant
