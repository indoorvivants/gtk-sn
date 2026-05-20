package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GActionEntry
import sn.gnome.glib.internal.gchar

/** This struct defines a single action. It is for use with
  * g_action_map_add_action_entries().
  *
  * The order of the items in the structure are intended to reflect frequency of
  * use. It is permissible to use an incomplete initialiser in order to leave
  * some of the later values as %NULL. All values after @name are optional.
  * Additional optional fields may be added in the future.
  *
  * See g_action_map_add_action_entries() for an example.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ActionEntry private[gnome] (raw: Ptr[GActionEntry]):

  def getUnsafeRawPointer(): Ptr[GActionEntry] = this.raw

  /** the name of the action
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def name: scala.Predef.String /* None */ =
    (!raw).name.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]

  /** the name of the action
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def name_=(value: scala.Predef.String /* None */ )(using Zone): Unit =
    (!raw).name_=(
      toCString(value)
        .asInstanceOf[Ptr[gchar]]
        .asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
    )
  @annotation.compileTimeOnly("[field activate]: Field is missing <type>")
  private def activate__ = ???

  /** the type of the parameter that must be passed to the activate function for
    * this action, given as a single GVariant type string (or %NULL for no
    * parameter)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def parameterType: scala.Predef.String /* None */ =
    (!raw).parameter_type.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]

  /** the type of the parameter that must be passed to the activate function for
    * this action, given as a single GVariant type string (or %NULL for no
    * parameter)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def parameterType_=(
      value: scala.Predef.String /* None */
  )(using Zone): Unit = (!raw).parameter_type_=(
    toCString(value)
      .asInstanceOf[Ptr[gchar]]
      .asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
  )

  /** the initial state for this action, given in [GVariant text
    * format][gvariant-text]. The state is parsed with no extra type
    * information, so type tags must be added to the string if they are
    * necessary. Stateless actions should give %NULL here.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def state: scala.Predef.String /* None */ =
    (!raw).state.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]

  /** the initial state for this action, given in [GVariant text
    * format][gvariant-text]. The state is parsed with no extra type
    * information, so type tags must be added to the string if they are
    * necessary. Stateless actions should give %NULL here.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def state_=(value: scala.Predef.String /* None */ )(using Zone): Unit =
    (!raw).state_=(
      toCString(value)
        .asInstanceOf[Ptr[gchar]]
        .asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
    )
  @annotation.compileTimeOnly("[field change_state]: Field is missing <type>")
  private def changeState__ = ???

end ActionEntry

object ActionEntry:
  def fromRaw(ptr: Ptr[GActionEntry]): ActionEntry = new ActionEntry(ptr)
end ActionEntry
