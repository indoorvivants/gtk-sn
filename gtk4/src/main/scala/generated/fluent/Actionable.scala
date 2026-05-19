package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

trait Actionable:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Gets the action name for @actionable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getActionName()(using Zone): String /* None */ =
    fromCString(
      gtk_actionable_get_action_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkActionable]]
      ).asInstanceOf
    )
  end getActionName

  /** Gets the current target value of @actionable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_action_target_value/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def getActionTargetValue__ = ???

  /** Specifies the name of the action with which this widget should be
    * associated.
    *
    * If @action_name is %NULL then the widget will be unassociated from any
    * previous action.
    *
    * Usually this function is used when the widget is located (or will be
    * located) within the hierarchy of a `GtkApplicationWindow`.
    *
    * Names are of the form “win.save” or “app.quit” for actions on the
    * containing [class@ApplicationWindow] or its associated
    * [class@Application], respectively. This is the same form used for actions
    * in the [class@Gio.Menu] associated with the window.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setActionName(
      action_name: Option[String /* Some(CString) */ ]
  )(using Zone): Unit /* None */ =
    gtk_actionable_set_action_name(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkActionable]],
      action_name
        .map[CString](o => toCString(o))
        .getOrElse(null.asInstanceOf[CString])
    )
  end setActionName

  /** Sets the target of an actionable widget.
    *
    * This is a convenience function that calls [ctor@GLib.Variant.new] for
    * @format_string
    *   and uses the result to call
    *   [method@Gtk.Actionable.set_action_target_value].
    *
    * If you are setting a string-valued target and want to set the action name
    * at the same time, you can use
    * [method@Gtk.Actionable.set_detailed_action_name].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_action_target/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def setActionTarget__ = ???

  /** Sets the target value of an actionable widget.
    *
    * If @target_value is %NULL then the target value is unset.
    *
    * The target value has two purposes. First, it is used as the parameter to
    * activation of the action associated with the `GtkActionable` widget.
    * Second, it is used to determine if the widget should be rendered as
    * “active” — the widget is active if the state is equal to the given target.
    *
    * Consider the example of associating a set of buttons with a
    * [iface@Gio.Action] with string state in a typical “radio button”
    * situation. Each button will be associated with the same action, but with a
    * different target value for that action. Clicking on a particular button
    * will activate the action with the target of that button, which will
    * typically cause the action’s state to change to that value. Since the
    * action’s state is now equal to the target value of the button, the button
    * will now be rendered as active (and the other buttons, with different
    * targets, rendered inactive).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_action_target_value/<method parameters>/target_value]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def setActionTargetValue__ = ???

  /** Sets the action-name and associated string target value of an actionable
    * widget.
    *
    * @detailed_action_name
    *   is a string in the format accepted by
    *   [func@Gio.Action.parse_detailed_name].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDetailedActionName(
      detailed_action_name: String /* Some(CString) */
  )(using Zone): Unit /* None */ =
    gtk_actionable_set_detailed_action_name(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkActionable]],
      toCString(detailed_action_name)
    )
  end setDetailedActionName

end Actionable

object Actionable:
  class Abstract(raw: Ptr[Byte]) extends Actionable:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end Actionable
