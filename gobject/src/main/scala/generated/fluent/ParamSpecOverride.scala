package sn.gnome.gobject.fluent

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.ParamSpec
import sn.gnome.gobject.internal.GParamSpecOverride
import sn.gnome.gobject.runtime.*

/** A #GParamSpec derived structure that redirects operations to other types of
  * #GParamSpec.
  *
  * All operations other than getting or setting the value are redirected,
  * including accessing the nick and blurb, validating a value, and so forth.
  *
  * See g_param_spec_get_redirect_target() for retrieving the overridden
  * property. #GParamSpecOverride is used in implementing
  * g_object_class_override_property(), and will not be directly useful unless
  * you are implementing a new base type similar to GObject.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ParamSpecOverride private[gnome] (raw: Ptr[GParamSpecOverride])
    extends ParamSpec(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end ParamSpecOverride

object ParamSpecOverride:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GParamSpecOverride])(using Runtime) =
    summon[Runtime].getOrCreate[ParamSpecOverride](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ParamSpecOverride(ptr)
    )

end ParamSpecOverride
