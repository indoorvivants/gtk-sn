package sn.gnome.gobject

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.{gconstpointer, guint16}
import sn.gnome.gobject.TypeValueTable
import sn.gnome.gobject.internal.GTypeInfo

/** This structure is used to provide the type system with the information
  * required to initialize and destruct (finalize) a type's class and its
  * instances.
  *
  * The initialized structure is passed to the g_type_register_static() function
  * (or is copied into the provided #GTypeInfo structure in the
  * g_type_plugin_complete_type_info()). The type system will perform a deep
  * copy of this structure, so its memory does not need to be persistent across
  * invocation of g_type_register_static().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TypeInfo private[gnome] (raw: Ptr[GTypeInfo]):

  def getUnsafeRawPointer(): Ptr[GTypeInfo] = this.raw

  /** Size of the class structure (required for interface, classed and
    * instantiatable types)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def classSize: UShort /* None */ =
    (!raw).class_size.asInstanceOf[_root_.sn.gnome.glib.internal.guint16]

  /** Size of the class structure (required for interface, classed and
    * instantiatable types)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def classSize_=(value: UShort /* None */ ): Unit = (!raw).class_size_=(
    guint16(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint16]
  )

  /** Location of the base initialization function (optional)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field base_init]: Cannot render type Type(List(),ListMap(@name -> DataRecord(BaseInitFunc), @type -> DataRecord(GBaseInitFunc)))"
  )
  private def baseInit__ = ???

  /** Location of the base finalization function (optional)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field base_finalize]: Cannot render type Type(List(),ListMap(@name -> DataRecord(BaseFinalizeFunc), @type -> DataRecord(GBaseFinalizeFunc)))"
  )
  private def baseFinalize__ = ???

  /** Location of the class initialization function for classed and
    * instantiatable types. Location of the default vtable inititalization
    * function for interface types. (optional) This function is used both to
    * fill in virtual functions in the class or default vtable, and to do
    * type-specific setup such as registering signals and object properties.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field class_init]: Cannot render type Type(List(),ListMap(@name -> DataRecord(ClassInitFunc), @type -> DataRecord(GClassInitFunc)))"
  )
  private def classInit__ = ???

  /** Location of the class finalization function for classed and instantiatable
    * types. Location of the default vtable finalization function for interface
    * types. (optional)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field class_finalize]: Cannot render type Type(List(),ListMap(@name -> DataRecord(ClassFinalizeFunc), @type -> DataRecord(GClassFinalizeFunc)))"
  )
  private def classFinalize__ = ???

  /** User-supplied data passed to the class init/finalize functions
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def classData: Ptr[Byte] /* None */ =
    (!raw).class_data.asInstanceOf[_root_.sn.gnome.glib.internal.gconstpointer]

  /** User-supplied data passed to the class init/finalize functions
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def classData_=(value: Ptr[Byte] /* None */ ): Unit = (!raw).class_data_=(
    gconstpointer(value)
      .asInstanceOf[_root_.sn.gnome.glib.internal.gconstpointer]
  )

  /** Size of the instance (object) structure (required for instantiatable types
    * only)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def instanceSize: UShort /* None */ =
    (!raw).instance_size.asInstanceOf[_root_.sn.gnome.glib.internal.guint16]

  /** Size of the instance (object) structure (required for instantiatable types
    * only)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def instanceSize_=(value: UShort /* None */ ): Unit = (!raw).instance_size_=(
    guint16(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint16]
  )

  /** Prior to GLib 2.10, it specified the number of pre-allocated (cached)
    * instances to reserve memory for (0 indicates no caching). Since GLib 2.10
    * this field is ignored.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def nPreallocs: UShort /* None */ =
    (!raw).n_preallocs.asInstanceOf[_root_.sn.gnome.glib.internal.guint16]

  /** Prior to GLib 2.10, it specified the number of pre-allocated (cached)
    * instances to reserve memory for (0 indicates no caching). Since GLib 2.10
    * this field is ignored.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def nPreallocs_=(value: UShort /* None */ ): Unit = (!raw).n_preallocs_=(
    guint16(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint16]
  )

  /** Location of the instance initialization function (optional, for
    * instantiatable types only)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field instance_init]: Cannot render type Type(List(),ListMap(@name -> DataRecord(InstanceInitFunc), @type -> DataRecord(GInstanceInitFunc)))"
  )
  private def instanceInit__ = ???

  /** A #GTypeValueTable function table for generic handling of GValues of this
    * type (usually only useful for fundamental types)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def valueTable: sn.gnome.gobject.TypeValueTable /* None */ =
    (!raw).value_table.asInstanceOf[Ptr[GTypeValueTable]]

  /** A #GTypeValueTable function table for generic handling of GValues of this
    * type (usually only useful for fundamental types)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def valueTable_=(value: sn.gnome.gobject.TypeValueTable /* None */ ): Unit =
    (!raw).value_table_=(
      value
        .getUnsafeRawPointer()
        .asInstanceOf
        .asInstanceOf[Ptr[GTypeValueTable]]
    )
end TypeInfo

object TypeInfo:
  def fromRaw(ptr: Ptr[GTypeInfo]): TypeInfo = new TypeInfo(ptr)
end TypeInfo
