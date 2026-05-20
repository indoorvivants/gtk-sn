package sn.gnome.gobject

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.TypeClass
import sn.gnome.gobject.internal.{GParamSpecClass, GType}

/** The class structure for the GParamSpec type. Normally, GParamSpec classes
  * are filled by g_param_type_register_static().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ParamSpecClass private[gnome] (raw: Ptr[GParamSpecClass]):

  def getUnsafeRawPointer(): Ptr[GParamSpecClass] = this.raw

  /** the parent class
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def gTypeClass: sn.gnome.gobject.TypeClass /* None */ =
    (!raw).g_type_class.asInstanceOf[GTypeClass]

  /** the #GValue type for this parameter
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def valueType: GType /* None */ = (!raw).value_type.asInstanceOf[GType]
  @annotation.compileTimeOnly("[field finalize]: Field is missing <type>")
  private def finalize__ = ???
  @annotation.compileTimeOnly(
    "[field value_set_default]: Field is missing <type>"
  )
  private def valueSetDefault__ = ???
  @annotation.compileTimeOnly("[field value_validate]: Field is missing <type>")
  private def valueValidate__ = ???
  @annotation.compileTimeOnly("[field values_cmp]: Field is missing <type>")
  private def valuesCmp__ = ???
  @annotation.compileTimeOnly("[field value_is_valid]: Field is missing <type>")
  private def valueIsValid__ = ???

end ParamSpecClass

object ParamSpecClass:
  def fromRaw(ptr: Ptr[GParamSpecClass]): ParamSpecClass = new ParamSpecClass(
    ptr
  )
end ParamSpecClass
