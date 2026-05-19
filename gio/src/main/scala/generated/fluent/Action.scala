package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gchar, gint}

trait Action:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Activates the action.
    *
    * @parameter
    *   must be the correct type of parameter for the action (ie: the parameter
    *   type given at construction time). If the parameter type was %NULL then @parameter
    *   must also be %NULL.
    *
    * If the @parameter GVariant is floating, it is consumed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method activate/<method parameters>/parameter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def activate__ = ???

  /** Request for the state of @action to be changed to @value.
    *
    * The action must be stateful and @value must be of the correct type. See
    * g_action_get_state_type().
    *
    * This call merely requests a change. The action may refuse to change its
    * state or may change its state to something other than @value. See
    * g_action_get_state_hint().
    *
    * If the @value GVariant is floating, it is consumed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method change_state/<method parameters>/value]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def changeState__ = ???

  /** Checks if @action is currently enabled.
    *
    * An action must be enabled in order to be activated or in order to have its
    * state changed from outside callers.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getEnabled(): Boolean /* None */ =
    g_action_get_enabled(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GAction]]
    ).value.!=(0)
  end getEnabled

  /** Queries the name of @action.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getName(): String /* None */ =
    fromCString(
      g_action_get_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GAction]]
      ).asInstanceOf
    )
  end getName

  /** Queries the type of the parameter that must be given when activating
    * @action.
    *
    * When activating the action using g_action_activate(), the #GVariant given
    * to that function must be of the type returned by this function.
    *
    * In the case that this function returns %NULL, you must not give any
    * #GVariant, but %NULL instead.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_parameter_type/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.VariantType), @type -> DataRecord(const GVariantType*)))"
  )
  private def getParameterType__ = ???

  /** Queries the current state of @action.
    *
    * If the action is not stateful then %NULL will be returned. If the action
    * is stateful then the type of the return value is the type given by
    * g_action_get_state_type().
    *
    * The return value (if non-%NULL) should be freed with g_variant_unref()
    * when it is no longer required.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_state/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def getState__ = ???

  /** Requests a hint about the valid range of values for the state of
    * @action.
    *
    * If %NULL is returned it either means that the action is not stateful or
    * that there is no hint about the valid range of values for the state of the
    * action.
    *
    * If a #GVariant array is returned then each item in the array is a possible
    * value for the state. If a #GVariant pair (ie: two-tuple) is returned then
    * the tuple specifies the inclusive lower and upper bound of valid values
    * for the state.
    *
    * In any case, the information is merely a hint. It may be possible to have
    * a state value outside of the hinted range and setting a value within the
    * range may fail.
    *
    * The return value (if non-%NULL) should be freed with g_variant_unref()
    * when it is no longer required.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_state_hint/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def getStateHint__ = ???

  /** Queries the type of the state of @action.
    *
    * If the action is stateful (e.g. created with
    * g_simple_action_new_stateful()) then this function returns the
    * #GVariantType of the state. This is the type of the initial value given as
    * the state. All calls to g_action_change_state() must give a #GVariant of
    * this type and g_action_get_state() will return a #GVariant of the same
    * type.
    *
    * If the action is not stateful (e.g. created with g_simple_action_new())
    * then this function will return %NULL. In that case, g_action_get_state()
    * will return %NULL and you must not call g_action_change_state().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_state_type/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.VariantType), @type -> DataRecord(const GVariantType*)))"
  )
  private def getStateType__ = ???

end Action

object Action:
  class Abstract(raw: Ptr[Byte]) extends Action:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end Action
