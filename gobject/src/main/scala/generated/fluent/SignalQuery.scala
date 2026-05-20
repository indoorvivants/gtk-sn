package sn.gnome.gobject

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.{gchar, guint}
import sn.gnome.gobject.SignalFlags
import sn.gnome.gobject.internal.{GSignalQuery, GType}

/** A structure holding in-depth information for a specific signal.
  *
  * See also: g_signal_query()
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class SignalQuery private[gnome] (raw: Ptr[GSignalQuery]):

  def getUnsafeRawPointer(): Ptr[GSignalQuery] = this.raw

  /** The signal id of the signal being queried, or 0 if the signal to be
    * queried was unknown.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def signalId: UInt /* None */ =
    (!raw).signal_id.asInstanceOf[_root_.sn.gnome.glib.internal.guint]

  /** The signal id of the signal being queried, or 0 if the signal to be
    * queried was unknown.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def signalId_=(value: UInt /* None */ ): Unit = (!raw).signal_id_=(
    guint(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint]
  )

  /** The signal name.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def signalName: scala.Predef.String /* None */ =
    (!raw).signal_name.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]

  /** The signal name.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def signalName_=(value: scala.Predef.String /* None */ )(using Zone): Unit =
    (!raw).signal_name_=(
      toCString(value)
        .asInstanceOf[Ptr[gchar]]
        .asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
    )

  /** The interface/instance type that this signal can be emitted for.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def itype: GType /* None */ = (!raw).itype.asInstanceOf[GType]

  /** The interface/instance type that this signal can be emitted for.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def itype_=(value: GType /* None */ ): Unit =
    (!raw).itype_=(value.asInstanceOf[GType])

  /** The signal flags as passed in to g_signal_new().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def signalFlags: sn.gnome.gobject.SignalFlags /* None */ =
    (!raw).signal_flags.asInstanceOf[GSignalFlags]

  /** The signal flags as passed in to g_signal_new().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def signalFlags_=(value: sn.gnome.gobject.SignalFlags /* None */ ): Unit =
    (!raw).signal_flags_=(value.raw.value.asInstanceOf[GSignalFlags])

  /** The return type for user callbacks.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def returnType: GType /* None */ = (!raw).return_type.asInstanceOf[GType]

  /** The return type for user callbacks.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def returnType_=(value: GType /* None */ ): Unit =
    (!raw).return_type_=(value.asInstanceOf[GType])

  /** The number of parameters that user callbacks take.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def nParams: UInt /* None */ =
    (!raw).n_params.asInstanceOf[_root_.sn.gnome.glib.internal.guint]

  /** The number of parameters that user callbacks take.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def nParams_=(value: UInt /* None */ ): Unit = (!raw).n_params_=(
    guint(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint]
  )

  /**  The individual parameter types for
    *   user callbacks, note that the effective callback signature is:
    *   |[<!-- language="C" -->
    *   @return_type callback (#gpointer     data1,
    *   [param_types param_names,]
    *   gpointer     data2);
    *   ]|
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field param_types]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(GType), @type -> DataRecord(GType)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(5), @type -> DataRecord(const GType*)))"
  )
  private def paramTypes__ = ???
end SignalQuery

object SignalQuery:
  def fromRaw(ptr: Ptr[GSignalQuery]): SignalQuery = new SignalQuery(ptr)
end SignalQuery
