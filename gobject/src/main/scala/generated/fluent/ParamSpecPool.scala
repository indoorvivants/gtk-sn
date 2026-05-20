package sn.gnome.gobject

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.List
import sn.gnome.glib.internal.{gboolean, gchar, gint}
import sn.gnome.gobject.ParamSpec
import sn.gnome.gobject.internal.{GParamSpecPool, GType}
import sn.gnome.gobject.runtime.*

/** A #GParamSpecPool maintains a collection of #GParamSpecs which can be
  * quickly accessed by owner and name.
  *
  * The implementation of the #GObject property system uses such a pool to store
  * the #GParamSpecs of the properties all object types.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ParamSpecPool private[gnome] (raw: Ptr[GParamSpecPool]):

  def getUnsafeRawPointer(): Ptr[GParamSpecPool] = this.raw

  /** Inserts a #GParamSpec in the pool.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insert(
      pspec: sn.gnome.gobject.ParamSpec /* Some(Ptr[GParamSpec]) */,
      owner_type: GType /* Some(GType) */
  )(using Runtime): Unit /* None */ =
    g_param_spec_pool_insert(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GParamSpecPool]],
      pspec.getUnsafeRawPointer().asInstanceOf,
      owner_type
    )
  end insert

  /** Gets an array of all #GParamSpecs owned by @owner_type in the pool.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method list]: Method list contains an OUT parameter, which is not supported yet"
  )
  private def list__ = ???

  /** Gets an #GList of all #GParamSpecs owned by @owner_type in the pool.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def listOwned(
      owner_type: GType /* Some(GType) */
  ): sn.gnome.glib.List /* None */ =
    sn.gnome.glib.List.fromRaw(
      g_param_spec_pool_list_owned(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GParamSpecPool]],
        owner_type
      )
    )
  end listOwned

  /** Looks up a #GParamSpec in the pool.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def lookup(
      param_name: scala.Predef.String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      owner_type: GType /* Some(GType) */,
      walk_ancestors: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  )(using Zone, Runtime): sn.gnome.gobject.ParamSpec /* None */ =
    sn.gnome.gobject.ParamSpec.applyUnsafe(
      g_param_spec_pool_lookup(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GParamSpecPool]],
        toCString(param_name).asInstanceOf[Ptr[gchar]],
        owner_type,
        gboolean(gint((if walk_ancestors == true then 1 else 0)))
      ).asInstanceOf
    )
  end lookup

  /** Removes a #GParamSpec from the pool.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def remove(
      pspec: sn.gnome.gobject.ParamSpec /* Some(Ptr[GParamSpec]) */
  )(using Runtime): Unit /* None */ =
    g_param_spec_pool_remove(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GParamSpecPool]],
      pspec.getUnsafeRawPointer().asInstanceOf
    )
  end remove

end ParamSpecPool

object ParamSpecPool:
  def fromRaw(ptr: Ptr[GParamSpecPool]): ParamSpecPool = new ParamSpecPool(ptr)
end ParamSpecPool
