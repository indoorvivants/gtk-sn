package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.{Action, ActionGroup, ActionMap}
import sn.gnome.gio.internal.GSimpleActionGroup
import sn.gnome.glib.internal.gchar
import sn.gnome.gobject.fluent.Object

/** #GSimpleActionGroup is a hash table filled with #GAction objects,
  * implementing the #GActionGroup and #GActionMap interfaces.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class SimpleActionGroup(raw: Ptr[GSimpleActionGroup])
    extends Object(raw.asInstanceOf),
      ActionGroup,
      ActionMap:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** A convenience function for creating multiple #GSimpleAction instances and
    * adding them to the action group.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method add_entries/<method parameters>/entries]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(ActionEntry), @type -> DataRecord(GActionEntry)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const GActionEntry*)))"
  )
  private def addEntries__ = ???

  /** Adds an action to the action group.
    *
    * If the action group already contains an action with the same name as
    * @action
    *   then the old action is dropped from the group.
    *
    * The action group takes its own reference on @action.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insert(action: Action /* Some(Ptr[GAction]) */ ): Unit /* None */ =
    g_simple_action_group_insert(
      this.raw.asInstanceOf[Ptr[GSimpleActionGroup]],
      action.getUnsafeRawPointer().asInstanceOf
    )

  /** Looks up the action with the name @action_name in the group.
    *
    * If no such action exists, returns %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def lookup(
      action_name: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Action /* None */ = new Action.Abstract(
    g_simple_action_group_lookup(
      this.raw.asInstanceOf[Ptr[GSimpleActionGroup]],
      __sn_extract_string(action_name).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  /** Removes the named action from the action group.
    *
    * If no action of this name is in the group then nothing happens.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def remove(
      action_name: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Unit /* None */ = g_simple_action_group_remove(
    this.raw.asInstanceOf[Ptr[GSimpleActionGroup]],
    __sn_extract_string(action_name).asInstanceOf[Ptr[gchar]]
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end SimpleActionGroup

object SimpleActionGroup:
  /** Creates a new, empty, #GSimpleActionGroup.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(): SimpleActionGroup = new SimpleActionGroup(
    g_simple_action_group_new().asInstanceOf
  )
end SimpleActionGroup
