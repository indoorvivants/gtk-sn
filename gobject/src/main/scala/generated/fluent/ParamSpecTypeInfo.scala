package sn.gnome.gobject

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.guint16
import sn.gnome.gobject.internal.{GParamSpecTypeInfo, GType}

/** This structure is used to provide the type system with the information
  * required to initialize and destruct (finalize) a parameter's class and
  * instances thereof.
  *
  * The initialized structure is passed to the g_param_type_register_static()
  * The type system will perform a deep copy of this structure, so its memory
  * does not need to be persistent across invocation of
  * g_param_type_register_static().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ParamSpecTypeInfo private[gnome] (raw: Ptr[GParamSpecTypeInfo]):

  def getUnsafeRawPointer(): Ptr[GParamSpecTypeInfo] = this.raw

  /** Size of the instance (object) structure.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def instanceSize: UShort /* None */ =
    (!raw).instance_size.asInstanceOf[_root_.sn.gnome.glib.internal.guint16]

  /** Size of the instance (object) structure.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def instanceSize_=(value: UShort /* None */ ): Unit = (!raw).instance_size_=(
    guint16(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint16]
  )

  /** Prior to GLib 2.10, it specified the number of pre-allocated (cached)
    * instances to reserve memory for (0 indicates no caching). Since GLib 2.10,
    * it is ignored, since instances are allocated with the [slice
    * allocator][glib-Memory-Slices] now.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def nPreallocs: UShort /* None */ =
    (!raw).n_preallocs.asInstanceOf[_root_.sn.gnome.glib.internal.guint16]

  /** Prior to GLib 2.10, it specified the number of pre-allocated (cached)
    * instances to reserve memory for (0 indicates no caching). Since GLib 2.10,
    * it is ignored, since instances are allocated with the [slice
    * allocator][glib-Memory-Slices] now.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def nPreallocs_=(value: UShort /* None */ ): Unit = (!raw).n_preallocs_=(
    guint16(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint16]
  )
  @annotation.compileTimeOnly("[field instance_init]: Field is missing <type>")
  private def instanceInit__ = ???

  /** The #GType of values conforming to this #GParamSpec
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def valueType: GType /* None */ = (!raw).value_type.asInstanceOf[GType]

  /** The #GType of values conforming to this #GParamSpec
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def valueType_=(value: GType /* None */ ): Unit =
    (!raw).value_type_=(value.asInstanceOf[GType])
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
end ParamSpecTypeInfo

object ParamSpecTypeInfo:
  def fromRaw(ptr: Ptr[GParamSpecTypeInfo]): ParamSpecTypeInfo =
    new ParamSpecTypeInfo(ptr)
end ParamSpecTypeInfo
