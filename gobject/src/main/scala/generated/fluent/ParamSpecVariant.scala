package sn.gnome.gobject

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ParamSpec
import sn.gnome.gobject.internal.GParamSpecVariant
import sn.gnome.gobject.runtime.*

/** A #GParamSpec derived structure that contains the meta data for #GVariant
  * properties.
  *
  * When comparing values with g_param_values_cmp(), scalar values with the same
  * type will be compared with g_variant_compare(). Other non-%NULL variants
  * will be checked for equality with g_variant_equal(), and their sort order is
  * otherwise undefined. %NULL is ordered before non-%NULL variants. Two %NULL
  * values compare equal.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ParamSpecVariant private[gnome] (raw: Ptr[GParamSpecVariant])
    extends ParamSpec(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end ParamSpecVariant

object ParamSpecVariant:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GParamSpecVariant])(using Runtime) =
    summon[Runtime].getOrCreate[ParamSpecVariant](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ParamSpecVariant(ptr)
    )

end ParamSpecVariant
